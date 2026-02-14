package com.lgc.articulate.model;

import java.util.List;

public class EvaluationResponse {

    private double score;
    private String feedback;
    private List<String> strengths;
    private List<String> weaknesses;

    public EvaluationResponse(double score, String feedback,
                              List<String> strengths,
                              List<String> weaknesses) {
        this.score = score;
        this.feedback = feedback;
        this.strengths = strengths;
        this.weaknesses = weaknesses;
    }

    public double getScore() {
        return score;
    }

    public String getFeedback() {
        return feedback;
    }

    public List<String> getStrengths() {
        return strengths;
    }

    public List<String> getWeaknesses() {
        return weaknesses;
    }
}
