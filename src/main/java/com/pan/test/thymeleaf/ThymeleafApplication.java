package com.pan.test.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RequestMapping("/")
@SpringBootApplication
public class ThymeleafApplication {



    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("msg","dasdas");

        List<User> userList = new ArrayList<>();
        User u  = null;

        for (int i =0;i<10;i++){
            u= new User();
            u.setId(i);
            u.setName(UUID.randomUUID().toString().replace("-","").substring(0,5));
            u.setCreateTime(new Date());
            u.setNikeName("nikeName:"+UUID.randomUUID().toString().replace("-","").substring(0,5));
            userList.add(u);
        }
        model.addAttribute("userList",userList);

        u = new User();
        u.setId(99);
        u.setName("测试一下");
        model.addAttribute("user",u);

        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafApplication.class, args);
    }

}
