package com.example.newsapp;

import java.util.ArrayList;

public class NewsModal {
    private int totalResults;
    private String status;
    private ArrayList<Articles> articles;

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setArticles(ArrayList<Articles> articles) {
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public ArrayList<Articles> getArticles() {
        return articles;
    }

    public NewsModal(int totalResults, String status, ArrayList<Articles> articles) {
        this.totalResults = totalResults;
        this.status = status;
        this.articles = articles;
    }
}
