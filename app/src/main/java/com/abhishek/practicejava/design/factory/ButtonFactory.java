package com.abhishek.practicejava.design.factory;

import android.os.Build;

public class ButtonFactory{
    public static Button create(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            return new MaterialButton();
        }
        else{
            return new LegacyButton();
        }
    }
}
