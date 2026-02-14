package com.lgc.articulate.controller;

import com.lgc.articulate.model.EvaluationRequest;
import com.lgc.articulate.model.EvaluationResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class EvaluationController {

    @PostMapping("/evaluate")
    public EvaluationResponse evaluate(@RequestBody EvaluationRequest request) {

        // Temporary dummy logic
        return new EvaluationResponse(
                7.5,
                "Structured response but needs more technical specificity.",
                List.of("Clear sentence structure", "Professional tone"),
                List.of("Lacks concrete technical details")
        );
    }
}
