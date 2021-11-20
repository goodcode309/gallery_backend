package com.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.entity.User;
import com.example.serviceImpl.*;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private PaintingServiceImpl paintingService;
    @Autowired
    private InstructionServiceImpl instructionService;
    @Autowired
    private ReviewServiceImpl reviewService;
    @Autowired
    private TestServiceImpl testService;

    public UserController() {
    }

    @RequestMapping({"/hello"})
    public String hello() {
        return "hello";
    }

    @RequestMapping(
            value = {"/api/users"},
            method = {RequestMethod.POST},
            produces = {"application/json;charset=UTF-8"}
    )
    @ResponseBody
    public String register(@RequestBody User user) {
        return this.userService.register(user);
    }

    @RequestMapping(
            value = {"/api/users/self"},
            method = {RequestMethod.POST},
            produces = {"application/json;charset=UTF-8"}
    )
    @ResponseBody
    public String login(HttpSession httpSession, @RequestBody User user) {
        return this.userService.login(user, httpSession);
    }

    @RequestMapping(
            value = {"/api/users/logout"},
            method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"}
    )
    @ResponseBody
    public String userLogout(HttpSession httpSession) {
        return this.userService.logout(httpSession);
    }

    @RequestMapping(
            value = {"/api/users/self"},
            method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"}
    )
    @ResponseBody
    public String getUserLogin(HttpSession httpSession) {
        return this.userService.getUserLogin(httpSession);
    }

    @RequestMapping(
            value = {"/api/paintings"},
            method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"}
    )
    @ResponseBody
    public String getPaintings() {
        System.out.println("----------");
        //return "paintings";
        return this.paintingService.getAllPaintings();
    }

    @RequestMapping(
            value = {"/api/paintings/{paintingId}/introduction"},
            method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"}
    )
    @ResponseBody
    public String getIntroduction(@PathVariable Integer paintingId) {
        return this.instructionService.getInstruction(paintingId);
    }

    @RequestMapping(
            value = {"/api/paintings/{paintingId}/comments"},
            method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"}
    )
    @ResponseBody
    public String releaseComment(@PathVariable Integer paintingId) {
        return this.reviewService.getComments(paintingId);
    }

    @RequestMapping(
            value = {"/api/paintings/{paintingId}/comments"},
            method = {RequestMethod.POST},
            produces = {"application/json;charset=UTF-8"}
    )
    @ResponseBody
    public String releaseComment(HttpSession httpSession, @PathVariable Integer paintingId, @RequestBody JSONObject comment) {
        return this.reviewService.releaseComment(httpSession, paintingId, comment.getString("content"), comment.getJSONObject("transform").getJSONObject("position"), comment.getJSONObject("transform").getJSONObject("rotation"));
    }

    @RequestMapping(
            value = {"/api/paint/{paintingId}"},
            method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"}
    )
    @ResponseBody
    public String getOnePainting(@PathVariable Integer paintingId) {
        return this.testService.getOnePainting(paintingId);
    }

}