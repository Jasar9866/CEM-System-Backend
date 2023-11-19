package com.myindividual.Backend.controller;

import com.myindividual.Backend.model.Feedback;
import com.myindividual.Backend.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/feedback")
@CrossOrigin
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @PostMapping("/add")
    public String add(@RequestBody Feedback feedback) {
        feedbackService.saveFeedback(feedback);
        return "New Feedback submitted";
    }

    @GetMapping("/getAll")
    public List<Feedback> getAllFeedbacks() {
        return feedbackService.getAllFeedbacks();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFeedback(@PathVariable int id) {
        feedbackService.deleteFeedback(id);
    }
}
