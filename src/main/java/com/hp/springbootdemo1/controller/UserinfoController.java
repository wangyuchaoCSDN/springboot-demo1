package com.hp.springbootdemo1.controller;

import com.hp.springbootdemo1.pojo.Userinfo;
import com.hp.springbootdemo1.service.UserinfoService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserinfoController {

    @Autowired
    private UserinfoService userinfoService;

    @RequestMapping("/findAll")

    public String findAll(Model model){
        List<Userinfo> list = userinfoService.findAll();
        System.out.println(list.size());
        System.out.println(list.toString());
        System.out.println("1=1");
        model.addAttribute("list",list);
        return "list";
    }
}
