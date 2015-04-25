package com.evo.backend.controllers.rest;

import com.evo.backend.datastores.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
public class Messages {


    @Autowired
    private MessageRepository messageRepository;

    @RequestMapping(value = "/api/content", method = RequestMethod.GET)
    public Object getContent(
            @RequestParam(value = "rid", required = true) String rid,
            @RequestParam(value = "timestamp", required = false) int fromTime
    ){
        List<Message> messages = messageRepository.findByRidOrderByTime(rid);
        if(fromTime>0){
            List<Message> filteredMessages = new ArrayList<Message>();
            for(Message msg: messages){
                if(msg.getTime() > fromTime){
                    filteredMessages.add(msg);
                }
            }
            return filteredMessages;
        }
        return messages;
    }

    @RequestMapping(value = "/api/content/add", method = RequestMethod.GET)
    public Object postContent(
            @RequestParam(value = "rid", required = true) String rid,
            @RequestParam(value = "user_name", required = true) String uname,
            @RequestParam(value = "attribute_id", required = false) String aid,
            @RequestParam(value = "vote", required = false) String vote,
            @RequestParam(value = "text", required = false) String text,
            @RequestParam(value = "type", required = false) String type
    ){
        Message msg = new Message();

        msg.setRid(rid);
        msg.setText(text);
        msg.setAuthor(uname);
        msg.setTime((int)System.currentTimeMillis()/1000);
        msg.setAttribute(aid);
        msg.setType(type);

        messageRepository.save(msg);

        return true;
    }


}
