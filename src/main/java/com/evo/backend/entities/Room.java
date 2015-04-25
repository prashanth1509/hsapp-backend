package com.evo.backend.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by prashanth.a on 25/04/15.
 */
@Document(collection = "rooms")
public class Room {

    @Id
    public String id;

    public AttributeCollection attributes;

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

}
