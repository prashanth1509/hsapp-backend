package com.evo.backend.entities;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by prashanth.a on 25/04/15.
 */
public class Attribute {
    public String id, type, text, votes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getVotes() {
        return votes;
    }

    public void setVotes(String votes) {
        this.votes = votes;
    }
}
