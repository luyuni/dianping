package top.luyuni.dianping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import top.luyuni.dianping.model.UserModel;
import top.luyuni.dianping.service.UserService;

import javax.annotation.Resource;

@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "test";
    }


    @RequestMapping("/get")
    @ResponseBody
    public UserModel getUser(@RequestParam(name = "id") Integer id) {
        return userService.getUser(id);
    }


}
