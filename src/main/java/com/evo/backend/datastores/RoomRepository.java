package com.evo.backend.datastores;

import com.evo.backend.entities.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by prashanth.a on 25/04/15.
 */

public interface RoomRepository extends MongoRepository<Room, String> {
    public Room findById(String id);
    public Room findByPid(String pid);
}
