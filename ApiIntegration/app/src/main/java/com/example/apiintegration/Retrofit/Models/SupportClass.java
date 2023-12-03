package com.example.apiintegration.Retrofit.Models;

public class SupportClass{
    public String url, text;

    public SupportClass() {
    }

    public SupportClass(String url, String text) {
        this.url = url;
        this.text = text;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public String getText() {
        return text;
    }
}