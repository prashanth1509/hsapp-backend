package com.evo.backend.controllers.rest;

import com.evo.backend.entities.User;
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
@RequestMapping("/")
public class Users {

    @RequestMapping(value = "/api/users", method = RequestMethod.GET)
    public Object getUsers(
        @RequestParam(value = "rid", required = true) String rid
    ){
        User user = new User();

        List<User> users = new ArrayList();
        users.add(user);

        return user;
    }

    @RequestMapping(value = "/api/users/add", method = RequestMethod.GET)
    public Object addUser(
            @RequestParam(value = "rid", required = true) String rid,
            @RequestParam(value = "user_id", required = true) String uid,
            @RequestParam(value = "user_name", required = true) String uname
    ){
        return true;
    }

}
