package com.ai.SpringAiProject;

import org.springframework.stereotype.Component;

@Component
public class ChatModel {
    public String call(String prompt) {
        // Implementation of the call method
        return "Response to: " + prompt;
    }
}
