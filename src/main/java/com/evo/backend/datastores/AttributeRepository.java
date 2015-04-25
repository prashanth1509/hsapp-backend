
package com.evo.backend.datastores;

import com.evo.backend.entities.AttributeCollection;
import com.evo.backend.entities.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by prashanth.a on 25/04/15.
 */

public interface AttributeRepository extends MongoRepository<AttributeCollection, String> {
    public AttributeCollection findById(String id);
}

