package com.evo.backend.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by prashanth.a on 25/04/15.
 */
public class UIUtils {

    public static ObjectMapper mapper = new ObjectMapper();

    public static String getJSONString(Object object){
        try {
            return (mapper.writeValueAsString(object));
        } catch (IOException ex) {
            return "{}";
        }
    }

}
