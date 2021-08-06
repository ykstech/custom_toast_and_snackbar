package com.yks.customtoastandsnackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    public static Context cc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cc=this;

        setContentView(R.layout.activity_main);
         //this is require to pass activity//
       new customtoast(this);
           //simple taost//
        customtoast.toast(this,"library created");
            //custom toast//

          customtoast.seticon(R.drawable.ic_baseline_notifications_24);
          customtoast.setbgcolor("#FF0000");
          customtoast.setbg(R.drawable.ic_baseline_notifications_24);
          customtoast.setcardelevation(5);
          customtoast.setelevation(5);
          customtoast.setradius(10);
          customtoast.settextcolor("#ffffff");
          customtoast.settextsize(20);
          customtoast.settextstyle(Typeface.BOLD_ITALIC);
          customtoast.setxoffset(0);
          customtoast.setyoffset(300);
          customtoast.customtoast(getApplicationContext(), "custom toast");

          // u have to define attributes for each new toast otherwise it sets to default//

        customtoast.customtoast(getApplicationContext(), "custom toast 2");

//myfn();

    }
    //if you have to use it in a static function then use it like this//
//    public static void myfn(){
//        customtoast.customtoast(cc, "custom toast",R.drawable.toast);
//   }
}