package com.example.robot.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 胖聪Online
 */
@RestController
public class WorldController {
    
    @GetMapping("/World")
    public JSONObject World() {
        JSONObject returnValue = new JSONObject();
        returnValue.put("World", "World");
        return returnValue;
    }
}
