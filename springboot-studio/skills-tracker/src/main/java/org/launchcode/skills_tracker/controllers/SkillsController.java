package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String getSkillsPage() {
        String welcomeSkillsPage =
                "<h1>" + "Skills Tracker" + "</h1>" +
                        "<h1>" + "We have a few skills we would like to learn. Here is the list!" +
                        "<h2>" + "<ol>" +
                        "<li>Python</li>" +
                        "<li>Java</li>" +
                        "<li>JavaScript</li>" +
                        "</ol>" + "</h2>";

        return welcomeSkillsPage;
    }

    @GetMapping("form")
    public String skillsForm() {
        String html =
                "<form method='post'>" +
                        "<input type='text' name='name' placeholder='Enter your name'>" +
                        "<br>" +
                        "<label for='program language'>My favorite language:</label>" +
                        "<select name='firstLanguage' id='program language'>" +
                        "  <option value=''>--Please choose an option--</option>" +
                        "  <option value='Python'>Python</option>" +
                        "  <option value='Java'>Java</option>" +
                        "  <option value='Javascript'>JavaScript</option>" +
                        "</select>" +
                        "<br>" +
                        "<label for='program language'>My second favorite language:</label>" +
                        "<select name='secondLanguage' id='program language'>" +
                        "  <option value=''>--Please choose an option--</option>" +
                        "  <option value='Python'>Python</option>" +
                        "  <option value='Java'>Java</option>" +
                        "  <option value='Javascript'>JavaScript</option>" +
                        "</select>" +
                        "<br>" +
                        "<label for='program language'>My third favorite language:</label>" +
                        "<select name='thirdLanguage' id='program language'>" +
                        "  <option value=''>--Please choose an option--</option>" +
                        "  <option value='Python'>Python</option>" +
                        "  <option value='Java'>Java</option>" +
                        "  <option value='Javascript'>JavaScript</option>" +
                        "</select>" +
                        "<br>" +
                        "<button type='submit'>Submit!</button>" +
                        "</form>";
        return html;
    }

    @PostMapping("form")
    public String skillsPost(@RequestParam String name, @RequestParam String firstLanguage, @RequestParam String secondLanguage, @RequestParam String thirdLanguage) {
        String goodbyeSkillsPage =  "<h1>" + name + "</h1>" +
                "<h2>" + "<ol>" +
                "<li>" + firstLanguage + "</li>" +
                "<li>" + secondLanguage + "</li>" +
                "<li>" + thirdLanguage + "</li>" +
                "</ol>" + "</h2>";

        return  goodbyeSkillsPage;
    }

}
