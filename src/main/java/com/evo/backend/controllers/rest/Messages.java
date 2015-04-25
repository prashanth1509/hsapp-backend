package com.evo.backend.controllers.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import com.evo.backend.entities.Message;

/**
 * Created by prashanth.a on 25/04/15.
 */
@RestController
@RequestMapping("/")
public class Messages {

    @RequestMapping(value = "/api/content", method = RequestMethod.GET)
    public Object getContent(
            @RequestParam(value = "rid", required = true) String rid,
            @RequestParam(value = "timestamp", required = false) String fromTime
    ){
        Message msg = new Message();

        List<Message> msgs = new ArrayList<Message>();
        msgs.add(msg);

        return msgs;
    }

    @RequestMapping(value = "/api/content/add", method = RequestMethod.GET)
    public Object postContent(
            @RequestParam(value = "rid", required = true) String rid,
            @RequestParam(value = "user_id", required = true) String uid,
            @RequestParam(value = "user_name", required = true) String uname,
            @RequestParam(value = "attribute_id", required = true) String aid,
            @RequestParam(value = "vote", required = false) String vote,
            @RequestParam(value = "text", required = false) String text
    ){
        return true;
    }


}
