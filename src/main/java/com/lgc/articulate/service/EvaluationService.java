package com.lgc.articulate.controller;

import com.lgc.articulate.model.EvaluationRequest;
import com.lgc.articulate.model.EvaluationResponse;
import com.lgc.articulate.service.EvaluationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class EvaluationController {

    private final EvaluationService evaluationService;

    public EvaluationController(EvaluationService evaluationService) {
        this.evaluationService = evaluationService;
    }

    @PostMapping("/evaluate")
    public EvaluationResponse evaluate(@RequestBody EvaluationRequest request) {
        return evaluationService.evaluate(request);
    }
}
