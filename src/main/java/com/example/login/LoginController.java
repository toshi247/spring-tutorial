package com.example.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by nishina on 2016/10/01.
 */
@Controller
public class LoginController {
    @RequestMapping("loginForm")
    String loginForm() {
        return "login/loginForm";
    }
}
