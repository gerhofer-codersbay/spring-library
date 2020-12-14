package com.codersbay.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MySecondController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/bookView")
    public ModelAndView home2() {
        Map<String, Object> model = new HashMap<>();
        model.put("name", "Pia");
        model.put("books", List.of(
                new Book("Qualityland", "Marc Uwe Kling"),
                new Book("The name of the wind", "Patrick Rothfus"),
                new Book("Dawnshard", "Brandon Sanderson")
        ));
        return new ModelAndView("books", model);
    }

}
