package org.example.blog_show.controller;

import org.example.blog_show.service.AiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AiController {

    private final AiService aiService;

    public AiController(AiService aiService) {
        this.aiService = aiService;
    }

    @GetMapping("/ai/suggest")
    public String suggest(@RequestParam String content) {
        return aiService.suggestTitle(content);
    }

    @GetMapping("/ai/summarize")
    public String summarize(@RequestParam String content) {
        return aiService.summarize(content);
    }
}

