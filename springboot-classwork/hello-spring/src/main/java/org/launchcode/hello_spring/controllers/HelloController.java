package org.launchcode.hello_spring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@ResponseBody
@RequestMapping("hello")
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
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    // handles requests of the form /hello/LaunchCode
    @GetMapping("{name}")
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
    }


    @GetMapping("form")
    public String helloForm() {
        String html =
                "<form method='post'>" +
                "<input type='text' name='name' placeholder='Enter your name'>" +
                "<label for='language'>Choose a language:</label>" +
                "<select name='language' id='language'>" +
                "  <option value=''>--Please choose an option--</option>" +
                "  <option value='english'>English</option>" +
                "  <option value='french'>French</option>" +
                "  <option value='spanish'>Spanish</option>" +
                "  <option value='german'>German</option>" +
                "  <option value='italian'>Italian</option>" +
                "</select>" +
                "<button type='submit'>Greet Me!</button>" +
                "</form>";
        return html;
    }

    @PostMapping("form")
    @ResponseBody
    public String helloPost(@RequestParam String name, @RequestParam String language) {
        System.out.println("Testing words!");
// test set up correctly
//        return language + " " + name;

        if (name == null || name.trim().isEmpty()) {
            name = "World";
        }

        return "<h1>" + createMessage(name, language) + "</h1>";
    }

    public static String createMessage(String n, String l) {
        System.out.println("Testing things!");
        String greeting = switch (l) {
            case "english" -> "Hello";
            case "french" -> "Bonjour";
            case "italian" -> "Bonjourno";
            case "spanish" -> "Hola";
            case "german" -> "Hallo";
            default -> "";
        };
        return "<h1>" + greeting + " " + n + "!" + "</h1>";
    }
}
