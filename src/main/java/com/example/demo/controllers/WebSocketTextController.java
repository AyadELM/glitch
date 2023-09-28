package com.example.demo.controllers;

import com.example.demo.dto.WhatsAppBusinessAccountDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebSocketTextController {

    // Define your verify token
    private static final String VERIFY_TOKEN = "HAPPY";
    @Autowired
    SimpMessagingTemplate template;

    @PostMapping("/webhook")
    public ResponseEntity<Void> sendMessage(@RequestBody WhatsAppBusinessAccountDTO whatsAppBusinessAccountDTO) {
        template.convertAndSend("/topic/message", whatsAppBusinessAccountDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @SendTo("/topic/message")
    public WhatsAppBusinessAccountDTO broadcastMessage(@Payload WhatsAppBusinessAccountDTO textMessageDTO) {
        return textMessageDTO;
    }

    @GetMapping("/webhook")
    public ResponseEntity<String> verifyWebhook(
        @RequestParam("hub.mode") String mode,
        @RequestParam("hub.verify_token") String token,
        @RequestParam("hub.challenge") String challenge) {

        // Check if mode and token are present
        if (mode != null && token != null) {
            // Check the mode and token sent are correct
            if (mode.equals("subscribe") && token.equals(VERIFY_TOKEN)) {
                // Respond with 200 OK and challenge token from the request
                System.out.println("WEBHOOK_VERIFIED");
                return ResponseEntity.ok(challenge);
            } else {
                // Respond with '403 Forbidden' if verify tokens do not match
                return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
            }
        }

        // Respond with '400 Bad Request' if mode or token are missing
        return ResponseEntity.badRequest().build();
    }
}
