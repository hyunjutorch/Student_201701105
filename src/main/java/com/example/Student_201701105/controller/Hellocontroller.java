package com.example.Student_201701105.controller;

import com.example.Student_201701105.dto.HelloRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/greeting")
public class Hellocontroller {
    @GetMapping("/hello")
    public String hello(@RequestParam(required = false, defaultValue = "") String name,
                        @RequestParam(required = false, defaultValue = "1") int level){
        return "hello " + name + "("+level+")";
    }

    @GetMapping("/path-hello/{name}")
    public String pathHello(@PathVariable String name){
        return "hello " + name ;
    }

    @GetMapping("/map-hello")
    public String mapHello(@RequestParam Map<String, String> queryParam){

        queryParam.entrySet().forEach(stringStringEntry -> {
            System.out.println("key : " +stringStringEntry.getKey()+
                    " value : " +stringStringEntry.getKey());
        });
        return "";
    }

    @GetMapping("object-hello")
    public String objectHello(HelloRequest requestParam){
        System.out.println(requestParam.toString());

        return requestParam.toString();
    }

    @GetMapping("/hi")
    public String hi(){
        return "hi";

    }
}
