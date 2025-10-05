package com.abhishek.practicejava.design.builder;

import androidx.annotation.NonNull;

public class User {
    private String name;
    private int age;
    private String phone;
    private String address ;
    private String email;

    private User(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
        this.email = builder.email;
    }

    public static class Builder {
        //Required Field;
        private String name;
        //Optional Field;
        private int age;
        private String phone;
        private String address= "Bangalore India";
        private String email;

        public Builder(String name) {
            this.name = name;
        }
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Builder phone(String phone) {
            this.phone= phone;
            return this;
        }
        public Builder address(String address) {
            this.address = address;
            return this;
        }
        public Builder email(String email) {
            this.email = email;
            return this;
        }
        public User build() {
            return new User(this);
        }
    }
    @NonNull
    @Override
    public String toString() {
        return name + ", " + age + ", " + phone + ", " + address + ", " + email;
    }
}
