package com.mine.ssm.controller;

import com.mine.ssm.pojo.User;
import com.mine.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by LiJiaXin on 2018/3/26.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/showAllUser",method = RequestMethod.GET)
    public String showAllUser(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = userService.getUserById(userId);
        model.addAttribute("user",user);
        model.addAttribute("user",user);
        return "showUser";
    }

    @RequestMapping(value = "/toShowAllUser",method = RequestMethod.GET)
    public String toShowAllUser(@RequestParam("id") Integer id, Model model){
        User user = userService.getUserById(id);
        model.addAttribute("user",user);
        return "showUser";
    }

    @RequestMapping(value = "/toShowUser/{id}",method = RequestMethod.GET)
    public String toShowUser(@PathVariable("id") Integer id, Model model){
        User user = userService.getUserById(id);
        model.addAttribute("user",user);
        return "showUser";
    }
}
