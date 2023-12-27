package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TestController {
    @RequestMapping("/session/set/{sessionKey}")
    @ResponseBody
    public String set(HttpSession session, @PathVariable(value = "sessionKey") String sessionKey) {
        session.setAttribute(sessionKey, sessionKey);
        return sessionKey;
    }

    @RequestMapping("/session/get/{sessionKey}")
    @ResponseBody
    public String get(HttpSession session, @PathVariable(value = "sessionKey") String sessionKey) {
        return (String) session.getAttribute(sessionKey).toString();
    }
}
