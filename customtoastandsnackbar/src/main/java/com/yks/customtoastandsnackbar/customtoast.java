package com.yks.customtoastandsnackbar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;


//.... other attributes

public  class customtoast {
    @SuppressLint("StaticFieldLeak")
    private static Activity activity;

  //methods//
   private   static int toasticon=0;
   private   static int toastbg=0;
    private  static String color="#3f3d3e";
    private  static int typeface= Typeface.BOLD;
    private static float textsize=15;
   private    static String bgcolor="#ffffff";
    private static float elevation=5;
    private  static float cardelevation=5;
    private  static  float radius=10;
    private  static int x=0;
    private static int y=150;

    //initialise//
    public  customtoast(Activity _activity) {
        activity = _activity;
    }

   //attributes//
    public static void seticon(int toasticon2){ toasticon = toasticon2;}
    public static void setbg(int toastbg2){
        toastbg = toastbg2;
    }
    public static void settextcolor(String color2){ color=color2;}
    public static void settextstyle(int typeface2){typeface=typeface2;}
    public static void settextsize(float textsize2){textsize=textsize2;}
    public static void setbgcolor(String bgcolor2){bgcolor=bgcolor2;}
    public static void setelevation(float elevation2){elevation=elevation2;}
    public static void setcardelevation(float cardelevation2){cardelevation=cardelevation2;}
    public static void setradius(float radius2){radius=radius2;}
    public static void setxoffset(int x2){x=x2;}
    public static void setyoffset(int y2){y=y2;}

///
    ///simple toast//
    public static void toast(Context context, String message3){ Toast.makeText(context,message3,Toast.LENGTH_SHORT).show(); }



           ///custom toast//
        public static void customtoast(Context context, String message) {


            //  LayoutInflater inflater = getLayoutInflater();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            //    View layout = inflater.inflate(R.layout.toast, (ViewGroup) layout.findViewById());
            View layout = inflater.inflate(R.layout.toast, (ViewGroup) activity.findViewById(R.id.custom_toast_layout));
            ImageView im = layout.findViewById(R.id.imagetoast);
            LinearLayout lv = layout.findViewById(R.id.cardbg);
            CardView cv = layout.findViewById(R.id.cardview);

            lv.setBackgroundColor(Color.parseColor(bgcolor));
            if (toasticon != 0) {
                im.setBackgroundResource(toasticon);

            }
            if (toastbg != 0) {
                lv.setBackgroundResource(toastbg);

            }

            cv.setElevation(converter(elevation,context));
            cv.setCardElevation(converter(cardelevation,context));
            cv.setRadius(converter(radius,context));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins((int) (converter(cardelevation,context)+40), (int) (converter(cardelevation,context)+40), (int) (converter(cardelevation,context)+40), (int) (converter(cardelevation,context)+40));
            cv.setLayoutParams(params);


            //https://picsum.photos/200
            TextView tv = (TextView) layout.findViewById(R.id.txtvw);

            tv.setTextColor(Color.parseColor(color));
            tv.setTypeface(Typeface.defaultFromStyle(typeface));
            tv.setTextSize(textsize);


            tv.setText(message);
            Toast toast = new Toast(context);
            toast.setGravity(Gravity.BOTTOM, x, y);

            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();


            //set default attributes//
            toasticon=0;
            toastbg=0;
            x=0;y=150;
            bgcolor="#ffffff";
            color="#3f3d3e";
            typeface= Typeface.BOLD;
            textsize=15;
             elevation=5;
             cardelevation=5;
             radius=10;
        }
        private static int converter(float dp,Context cc){
            Resources r = cc.getResources();
            int px = (int) TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP,
                    dp,
                    r.getDisplayMetrics()
            );
            return px;
        }
    }

