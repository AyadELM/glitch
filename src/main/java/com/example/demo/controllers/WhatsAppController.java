package com.example.demo.controllers;

import com.example.demo.dto.WhatsAppMessage;
import com.example.demo.services.WebSocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhook")
public class WhatsAppController {

    @Autowired
    private WebSocketService webSocketService;
    @PostMapping("/message")
    public ResponseEntity<String> receiveMessage(@RequestBody WhatsAppMessage message) {
        webSocketService.broadcastMessage("Hello there !");
        return ResponseEntity.ok("Message received successfully");
    }
    @GetMapping("/hello")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Hello, world !");
    }
}
