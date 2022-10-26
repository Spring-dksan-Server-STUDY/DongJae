package com.dkanServer.dongjae.week2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestController(method = RequestMethod.GET, value = "study")
public class HelloController {

    //
//    @GetMapping("")
//    public String Hello() {
//        return "hello study world";
//    }
//
//    @GetMapping("/hello")
//    public String Hello2() {
//        return "hello study world!!";
//    }
//
//    @GetMapping("name/{name}")
//    public String getName(@PathVariable(value = "name") final String name) {
//        return name;
//    }
//
//    @GetMapping("sopt")
//    public String getPart(
//            @RequestParam(value = "part", defaultValue = "") final String part,
//            @RequestParam(value = "type", defaultValue = "") final String type
//    ) {
//        return "part is " + part + " generation " + type;
//    }
//
//    @PostMapping("member")
//    public String postMember(@RequestBody final Members member){
//        return member.getName();
//    }
//
//    @PutMapping("member")
//    public String putMember(@RequestBody final Members member){
//        return member.getName();
//    }
//
//    @DeleteMapping("member")
//    public String deleteMember(@RequestBody final Members member){
//        return member.getName();
//    }
}