package com.evo.backend.controllers.rest;

import com.evo.backend.datastores.AttributeRepository;
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

    @Autowired
    private AttributeRepository attributeRepository;

    @RequestMapping(value = "/api/attributes", method = RequestMethod.GET)
    public Object getAttributes(
            @RequestParam(value = "rid", required = true) String rid
    ){
        Room room = roomRepository.findById(rid);
        return attributeRepository.findById(room.getAttributesId());
    }

    @RequestMapping(value = "/api/attributes/feedback", method = RequestMethod.GET)
    public Object attributeFeedback(
            @RequestParam(value = "rid", required = true) String rid,
            @RequestParam(value = "username", required = true) String uname,
            @RequestParam(value = "attribute_id", required = true) String aid,
            @RequestParam(value = "feedback", required = true) Boolean isUp
    ){
        Room room = roomRepository.findById(rid);
        AttributeCollection attributes = attributeRepository.findById(room.getAttributesId());

        User uzer = new User();
        uzer.setId(uname);
        uzer.setName(uname);

        int index = 0;
        for(Attribute attribute : attributes.getAttributeList()){
            if(attribute.getId().equals(aid)){
                if(isUp){
                    List<User> uppers = attributes.attributeList.get(index).getVotesUp();
                    for(User user: uppers){
                        if(user.getName().equals(uname)){
                            return false;
                        }
                    }
                    uppers.add(uzer);
                }
                else{
                    List<User> booers = attributes.attributeList.get(index).getVotesDown();
                    for(User user: booers){
                        if(user.getName().equals(uname)){
                            return false;
                        }
                    }
                    booers.add(uzer);
                }
            }
            index = index + 1;
        }

        attributeRepository.save(attributes);
        return true;
    }

}
