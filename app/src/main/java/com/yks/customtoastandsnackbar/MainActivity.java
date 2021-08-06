package com.yks.customtoastandsnackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;

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
        customtoast.toast(this,"simple toast");
            //custom toast//

        customtoast.seticon(R.drawable.ic_baseline_notifications_24);
        customtoast.customtoast(getApplicationContext(), "custom toast");
         //total 15 properties//
        //custom toast with bg image, icon image,bg color,text color,card elevation,elevation,radius,textsize, position of toast (x,y)offset,icon gravity//
          customtoast.seticon(R.drawable.new1);
          customtoast.setbgcolor("#FF0000");
          customtoast.setbg(R.drawable.toast);
          customtoast.setcardelevation(5);
          customtoast.setelevation(5);
          customtoast.setradius(10);
          customtoast.settextcolor("#ffffff");
          customtoast.settextsize(20);
          customtoast.settextstyle(Typeface.BOLD_ITALIC);
          customtoast.setxoffset(0);
          customtoast.setyoffset(300);
          customtoast.seticongravity(Gravity.CENTER);
          customtoast.settextgravity(Gravity.CENTER);
          customtoast.seticonmargin(5,5,0,5);
          customtoast.settextmargin(5,5,15,5);

        customtoast.customtoast(getApplicationContext(), "custom toast with bg");

          // u have to define attributes for each new toast otherwise it sets to default//
        customtoast.setbgcolor("#3A6CA3");
        customtoast.settextcolor("#ffffff");
        customtoast.customtoast(getApplicationContext(), "custom toast with color");

//myfn();

    }
    //if you have to use it in a static function then use it like this//
//    public static void myfn(){
//        customtoast.customtoast(cc, "custom toast",R.drawable.toast);
//   }
}