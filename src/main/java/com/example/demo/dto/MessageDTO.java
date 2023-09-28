package com.example.demo.dto;

import com.example.demo.dto.WhatsAppBusinessAccountDTO;

public class MessageDTO {
    private String from;
    private String id;
    private String timestamp;
    private TextDTO text;
    private String type;

    // Getters and setters for from, id, timestamp, text, and type
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public TextDTO getText() {
        return text;
    }

    public void setText(TextDTO text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
