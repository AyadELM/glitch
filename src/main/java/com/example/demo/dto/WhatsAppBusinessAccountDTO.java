package com.example.demo.dto;

import java.util.List;

public class WhatsAppBusinessAccountDTO {
    private String object;
    private List<EntryDTO> entry;

    // Getters and setters for object and entry
    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public List<EntryDTO> getEntry() {
        return entry;
    }

    public void setEntry(List<EntryDTO> entry) {
        this.entry = entry;
    }

    public class EntryDTO {
        private String id;
        private List<ChangeDTO> changes;

        // Getters and setters for id and changes
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<ChangeDTO> getChanges() {
            return changes;
        }

        public void setChanges(List<ChangeDTO> changes) {
            this.changes = changes;
        }
    }

    public class ChangeDTO {
        private ValueDTO value;
        private String field;

        // Getters and setters for value and field
        public ValueDTO getValue() {
            return value;
        }

        public void setValue(ValueDTO value) {
            this.value = value;
        }

        public String getField() {
            return field;
        }

        public void setField(String field) {
            this.field = field;
        }
    }

    public class ValueDTO {
        private String messaging_product;
        private MetadataDTO metadata;
        private List<ContactDTO> contacts;
        private List<MessageDTO> messages;

        // Getters and setters for messaging_product, metadata, contacts, and messages
        public String getMessaging_product() {
            return messaging_product;
        }

        public void setMessaging_product(String messaging_product) {
            this.messaging_product = messaging_product;
        }

        public MetadataDTO getMetadata() {
            return metadata;
        }

        public void setMetadata(MetadataDTO metadata) {
            this.metadata = metadata;
        }

        public List<ContactDTO> getContacts() {
            return contacts;
        }

        public void setContacts(List<ContactDTO> contacts) {
            this.contacts = contacts;
        }

        public List<MessageDTO> getMessages() {
            return messages;
        }

        public void setMessages(List<MessageDTO> messages) {
            this.messages = messages;
        }
    }

    public class MetadataDTO {
        private String display_phone_number;
        private String phone_number_id;

        // Getters and setters for display_phone_number and phone_number_id
        public String getDisplay_phone_number() {
            return display_phone_number;
        }

        public void setDisplay_phone_number(String display_phone_number) {
            this.display_phone_number = display_phone_number;
        }

        public String getPhone_number_id() {
            return phone_number_id;
        }

        public void setPhone_number_id(String phone_number_id) {
            this.phone_number_id = phone_number_id;
        }
    }

    public class ContactDTO {
        private ProfileDTO profile;
        private String wa_id;

        // Getters and setters for profile and wa_id
        public ProfileDTO getProfile() {
            return profile;
        }

        public void setProfile(ProfileDTO profile) {
            this.profile = profile;
        }

        public String getWa_id() {
            return wa_id;
        }

        public void setWa_id(String wa_id) {
            this.wa_id = wa_id;
        }
    }

    public class ProfileDTO {
        private String name;

        // Getter and setter for name
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

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

    public class TextDTO {
        private String body;

        // Getter and setter for body
        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }
    }
}
