package com.evo.backend.controllers.rest;

import com.evo.backend.datastores.RoomRepository;
import com.evo.backend.entities.Attribute;
import com.evo.backend.entities.AttributeCollection;
import com.evo.backend.entities.Room;
import com.evo.backend.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prashanth.a on 25/04/15.
 */
@RestController
public class Attributes {

    @Autowired
    private RoomRepository roomRepository;

    @RequestMapping(value = "/api/attributes", method = RequestMethod.GET)
    public Object getAttributes(
            @RequestParam(value = "rid", required = true) String rid
    ){

        Room room = roomRepository.findById(rid);

        AttributeCollection roomAttributes = room.getAttributes();

        return roomAttributes;

    }

}
