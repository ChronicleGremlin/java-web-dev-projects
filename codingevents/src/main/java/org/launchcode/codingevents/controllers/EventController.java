package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class EventController {

//    private static List<String> events = new ArrayList<>();
    final static Map<String, String> events = new HashMap<>();

    @GetMapping
    public String index(){
        return "home";
    }

    //lives at /events/create
    @GetMapping("/create")
    public String renderCreateEventForm() {
        return "create";
    }

    //lives at /events/create
    @PostMapping("/create")
    public String createEvent(Model model, @RequestParam String eventName, @RequestParam String eventDescription) {
//        events.add(eventName);
        events.put(eventName, eventDescription);

        model.addAttribute("name", eventName);
        model.addAttribute("description", eventDescription);

        System.out.println(events);
        return "index";
    }

    @GetMapping("/events")
    public String displayAllEvents(Model model) {
        model.addAttribute("allEvents", events);

        events.put("Menteaship","A fun meetup for connecting with mentors");
        events.put("Code With Pride","A fun meetup sponsored by LaunchCode");
        events.put("Javascripty", "An imaginary meetup for Javascript developers");
        System.out.println(events);

        return "events";
    }
}









