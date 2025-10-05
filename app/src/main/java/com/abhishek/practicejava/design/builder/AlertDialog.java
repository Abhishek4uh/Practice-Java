package com.abhishek.practicejava.design.builder;

import androidx.annotation.NonNull;

public class AlertDialog {
    private String title;
    private String message;
    private String positiveButtonText;
    private String negativeButtonText;

    private AlertDialog(Builder builder){
        this.title = builder.title;
        this.message = builder.message;
        this.positiveButtonText = builder.positiveButtonText;
        this.negativeButtonText = builder.negativeButtonText;
    }

    public static class Builder{
        private String title;
        private String message;
        private String positiveButtonText;
        private String negativeButtonText;

        public Builder(String title){
            this.title = title;
        }

        public Builder setMessage(String message){
            this.message = message;
            return this;
        }

        public Builder setPositiveButtonText(String positiveButtonText){
            this.positiveButtonText = positiveButtonText;
            return this;
        }

        public Builder setNegativeButtonText(String negativeButtonText){
            this.negativeButtonText = negativeButtonText;
            return this;
        }

        public AlertDialog build(){
            return new AlertDialog(this);
        }
    }

    @NonNull
    @Override
    public String toString() {
        return title + ", " + message + ", " + positiveButtonText + ", " + negativeButtonText;
    }

}
