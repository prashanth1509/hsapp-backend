package com.evo.backend.entities;

import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by prashanth.a on 25/04/15.
 */
public class Room {

    @Id
    public String id;

    public AttributeCollection attributes;

    public List<Message> messages;

    public List<User> users;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AttributeCollection getAttributes() {
        return attributes;
    }

    public void setAttributes(AttributeCollection attributes) {
        this.attributes = attributes;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
