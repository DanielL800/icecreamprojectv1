package com.example.icecreamproject1.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Functions {

    public Functions() {
    }

    /*public static void animacionIce2(ImageView){
        }*

        public static void arrow_back_function(ImageButton,){
        }
         */
    public void handleArrowBackClickToLogin(ImageButton imgArrow, final Class<?> targetActivity){
        imgArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = imgArrow.getContext();
                Intent intent = new Intent(context, targetActivity);
                context.startActivity(intent);
            }
        });
    }
}