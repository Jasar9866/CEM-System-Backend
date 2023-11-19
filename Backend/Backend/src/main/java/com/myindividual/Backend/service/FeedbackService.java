package com.myindividual.Backend.service;

import com.myindividual.Backend.model.Feedback;

import java.util.List;

public interface FeedbackService {

    void saveFeedback(Feedback feedback);
    List<Feedback> getAllFeedbacks();
    void deleteFeedback(int id); // Corrected method signature
}
