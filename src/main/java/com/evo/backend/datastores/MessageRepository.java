package com.evo.backend.datastores;

import com.evo.backend.entities.Message;
import com.evo.backend.entities.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by prashanth.a on 25/04/15.
 */
public interface MessageRepository extends MongoRepository<Message, String> {
    public Message findById(String id);
    public List<Message> findByRidOrderByTime(String rid);
}

