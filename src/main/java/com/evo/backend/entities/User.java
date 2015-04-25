package com.evo.backend.entities;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.beans.Transient;
import java.util.HashMap;
import java.util.Map;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;

/**
 * Created by prashanth.a on 25/04/15.
 */
@Document(collection = "users")
public class User {

    public String name;
    public String id;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
