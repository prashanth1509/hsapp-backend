package com.evo.backend.controllers.page;

import com.evo.backend.entities.*;
import com.evo.backend.utils.UIUtils;
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
public class Index {
    @RequestMapping("/")
    public String IndexPage(
            @RequestParam(value = "pid", required = true) String pid,
            @RequestParam(value = "username", required = true) String uid,
            Map<String, Object>model
    ){

        //check if room id exists or branch out

        //get all attributes for this pid and populate db.
        //add current user to users

        //Create myself
        User me = new User();
        me.setId("id_" + uid);
        me.setName(uid);

        //I'm one of the user
        List<User> users = new ArrayList<User>();
        users.add(me);

        //All attributes
        AttributeCollection attributes = new AttributeCollection();

        //All messages
        List<Message> messages = new ArrayList();

        Room room  = new Room();
        room.setAttributes(attributes);
        room.setUsers(users);
        room.setMessages(messages);

        model.put("room", room);
        model.put("currentUser", me);
        model.put("attributes", attributes);
        model.put("users", users);
        model.put("messages", messages);

        model.put("modelJSON", UIUtils.getJSONString(model));

        return "index";
    }

}
