package com.evo.backend.controllers.rest;

import com.evo.backend.entities.Attribute;
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
public class Attributes {

    @RequestMapping(value = "/api/attributes", method = RequestMethod.GET)
    public Object getAttributes(
            @RequestParam(value = "rid", required = true) String rid
    ){
        Attribute attr = new Attribute();

        List<Attribute> atts = new ArrayList();
        atts.add(attr);

        return atts;
    }

}
