package com.example.apiintegration.Retrofit.Models;



//Single User (GET)
//Single user data needs two classes 1. DataClass 2. Support Class
//
//{
//        "data": {
//        },
//        "support": {
//        }
//        }
public class SingleUserData {
    //creating objects of both classes
    DataClass data;
    SupportClass support;

    //constructors getters and setters


    public void setData(DataClass data) {
        this.data = data;
    }

    public void setSupport(SupportClass support) {
        this.support = support;
    }

    public DataClass getData() {
        return data;
    }

    public SupportClass getSupport() {
        return support;
    }

    public SingleUserData(DataClass data, SupportClass support) {
        this.data = data;
        this.support = support;
    }

    public class DataClass{
        public Integer id;
        public String first_name;
        public String last_name;
        public String email;
        public String avatar;

        public DataClass(Integer id, String first_name, String last_name, String email, String avatar) {
            this.id = id;
            this.first_name = first_name;
            this.last_name = last_name;
            this.email = email;
            this.avatar = avatar;
        }

        public DataClass() {
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public Integer getId() {
            return id;
        }

        public String getFirst_name() {
            return first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public String getEmail() {
            return email;
        }

        public String getAvatar() {
            return avatar;
        }
    }

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
}
