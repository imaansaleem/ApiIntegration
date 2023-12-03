package com.example.apiintegration.Retrofit.Models;

import java.util.ArrayList;

public class ListUsers {
    ArrayList<DataClass> data;
    SupportClass support;
    int page;
    int perPage;
    int total;
    int totalPages;

    public ListUsers(ArrayList<DataClass> data, SupportClass support, int page, int perPage, int total, int totalPages) {
        this.data = data;
        this.support = support;
        this.page = page;
        this.perPage = perPage;
        this.total = total;
        this.totalPages = totalPages;
    }

    public ArrayList<DataClass> getData() {
        return data;
    }

    public SupportClass getSupport() {
        return support;
    }

    public int getPage() {
        return page;
    }

    public int getPerPage() {
        return perPage;
    }

    public int getTotal() {
        return total;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setData(ArrayList<DataClass> data) {
        this.data = data;
    }

    public void setSupport(SupportClass support) {
        this.support = support;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}