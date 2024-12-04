package org.launchcode.hello_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
//@ResponseBody
//@RequestMapping("hello")
public class HelloController {

    // handles requests at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }

    // handles requests at path /goodbye
    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    // handles requests of the form /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name, Model model) {
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }

    // handles requests of the form /hello/LaunchCode
    @GetMapping("{name}")
    public String helloWithPathParam(@PathVariable String name, Model model) {
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }


    @GetMapping("form")
    public String helloForm() {
        return "form";
    }

    @GetMapping("hello-names")
    public String helloNames(Model model) {
        List<String> names = new ArrayList<>();
        names.add("LaunchCode");
        names.add("Java");
        names.add("JavaScript");

        model.addAttribute("names", names);
        return "hello-list";
    }

//    @PostMapping("form")
//    @ResponseBody
//    public String helloPost(@RequestParam String name, @RequestParam String language) {
//        System.out.println("Testing words!");
//// test set up correctly
////        return language + " " + name;
//
//        if (name == null || name.trim().isEmpty()) {
//            name = "World";
//        }
//
//        return "<h1>" + createMessage(name, language) + "</h1>";
//    }
//
//    public static String createMessage(String n, String l) {
//        System.out.println("Testing things!");
//        String greeting = switch (l) {
//            case "english" -> "Hello";
//            case "french" -> "Bonjour";
//            case "italian" -> "Bonjourno";
//            case "spanish" -> "Hola";
//            case "german" -> "Hallo";
//            default -> "";
//        };
//        return "<h1>" + greeting + " " + n + "!" + "</h1>";
//    }
}
