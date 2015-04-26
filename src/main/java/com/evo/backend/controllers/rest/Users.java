package com.evo.backend.controllers.rest;

import com.evo.backend.datastores.RoomRepository;
import com.evo.backend.entities.Room;
import com.evo.backend.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by prashanth.a on 25/04/15.
 */
@RestController
public class Users {


    @Autowired
    private RoomRepository roomRepository;

    @RequestMapping(value = "/api/users", method = RequestMethod.GET)
    public Object getUsers(
        @RequestParam(value = "rid", required = true) String rid
    ){
        Room room = roomRepository.findById(rid);
        Map<String, Object> response= new HashMap();
        response.put("users", room.getUsers());
        return response;
    }

    @RequestMapping(value = "/api/users/add", method = RequestMethod.GET)
    public Object addUser(
            @RequestParam(value = "rid", required = true) String rid,
            @RequestParam(value = "user_name", required = true) String uname
    ){
        
        Room room = roomRepository.findById(rid);
        List<User> users = room.getUsers();

        for(User user : users){
            if(user.getId().equals(uname)){
                return true;
            }
        }

        User newUser = new User();
        newUser.setId(uname);
        newUser.setName(uname);

        users.add(newUser);

        room.setUsers(users);

        roomRepository.save(room);
        return true;

    }

}
