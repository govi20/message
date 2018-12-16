
package com.example.message.web;

import com.example.message.model.Users;
import com.example.message.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class MainController {

    Logger LOGGER = LoggerFactory.getLogger (MainController.class);

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String root(HttpSession httpSession) {
        return "redirect:/index";
    }

    @GetMapping(value = "index")
    public String index(HttpSession httpSession) {
        Object isLoggedIn =  httpSession.getAttribute ("isLoggedIn");
        LOGGER.debug ("received request in index controller!");
        if(isLoggedIn != null)  {
            LOGGER.debug ("User is authenticated user, redirecting to home page!");
            return "jsp/home.html";
        }
        else {
            LOGGER.debug ("Redirecting to login page!");
            return "jsp/login.html";
        }
    }

    @PostMapping(value = "doLogin")
    public String doLogin(@ModelAttribute Users user) {
        LOGGER.info ("user requesting login => "+user.getUsername ());
        return "jsp/home.html";
    }

    @GetMapping(value = "doLogin")
    public String login() {
        return "jsp/login.html";
    }


    @PostMapping(value = "doRegister")
    public ModelAndView register(@ModelAttribute Users user) {
        LOGGER.info ("user requesting login => "+user.getPassword ());
        return new ModelAndView ("jsp/home.html");
    }

    @GetMapping(value = "register")
    public String register() {
        return "redirect:/index";
    }
}

