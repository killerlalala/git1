package cn.itcast.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {

    @RequestMapping(path = "/hello")
    public String say(){
        System.out.println("hello world");


        System.out.println("lalala");
        return "success";
    }


}
