package com.evo.backend.controllers.page;

import com.evo.backend.entities.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by prashanth.a on 25/04/15.
 */
@Controller
public class RoomManagement {
    @RequestMapping("/")
    public String IndexPage(
            @RequestParam(value = "pid", required = true) String pid,
            @RequestParam(value = "username", required = true) String uid,
            Map<String, Object>model
    ){

        //check if room id exists or branch out

        //get all attributes for this pid and populate db.
        //add current user to users

        User me = new User();
        me.setId("id_" + uid);
        me.setName(uid);
        List<User> users = new ArrayList<User>();
        users.add(me);

        Attribute att = new Attribute();
        att.setId("att1");
        AttributeCollection atts = new AttributeCollection();
        atts.addAttribute(att);

        List<Message> messages = new ArrayList<Message>();

        Room room  = new Room();
        room.setAttributes(atts);
        room.setUsers(users);
        room.setMessages(messages);

        model.put("room", room);
        model.put("currentUser", me);
        model.put("attributes", atts);
        model.put("users", users);
        model.put("messages", messages);

        return "index";
    }

}
