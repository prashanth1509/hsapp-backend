package com.evo.backend.controllers.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by prashanth.a on 25/04/15.
 */
@RestController
@RequestMapping("/")
public class Invite {

    @RequestMapping(value = "/api/invite", method = RequestMethod.GET)
    public Object getUsers(
            @RequestParam(value = "rid", required = true) String rid
    ) {
        return true;
    }

}