package springmvcdispatch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springmvcdispatch.component.EventHolder;
import springmvcdispatch.model.Participant;

import java.beans.EventHandler;

@Controller
public class EventController {

    EventHolder eventHolder;

    @Autowired
    public EventController(EventHolder eventHolder) {
        this.eventHolder = eventHolder;
    }

    @PostMapping("/register")
    public String register(@RequestParam String firstName, @RequestParam String lastName) {
        Participant participant = new Participant(firstName, lastName);
        if (eventHolder.checkRegistration(participant)) {
            return "redirect:error";
        } else {
            eventHolder.addParticipant(participant);
            return "redirect:success";
        }
    }

    @GetMapping("/success")
    public String addProduct(){
        return "succes";
    }
}
