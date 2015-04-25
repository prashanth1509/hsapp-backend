package com.evo.backend.utils;

import com.evo.backend.entities.PropertyAttributes;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 * Created by prashanth.a on 25/04/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PropertyAttributeWrapper {
    private PropertyAttributes result;

    public PropertyAttributes getResult() {
        return result;
    }

    public void setResult(PropertyAttributes result) {
        this.result = result;
    }

    public PropertyAttributes getAttributes() {
        return result;
    }
}

