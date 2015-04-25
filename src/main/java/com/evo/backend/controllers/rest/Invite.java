package com.evo.backend.controllers.rest;

import com.evo.backend.datastores.RoomRepository;
import com.evo.backend.entities.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by prashanth.a on 25/04/15.
 */
@RestController
public class Invite {

    @Autowired
    private RoomRepository roomRepository;

    @RequestMapping("/api/deleteAll")
    public Object destroyer(){
        roomRepository.deleteAll();
        return null;
    }

    @RequestMapping(value = "/api/invite", method = RequestMethod.GET)
    public Object getUsers(
            @RequestParam(value = "rid", required = true) String rid
    ) {
        try{
            Room room = roomRepository.findById(rid);
            return !room.getId().isEmpty();
        }
        catch(Exception e){
        }
        return false;
    }

}