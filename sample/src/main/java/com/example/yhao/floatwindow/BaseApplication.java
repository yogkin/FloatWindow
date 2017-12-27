package com.example.yhao.floatwindow;

import android.app.Application;
import android.util.Log;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.widget.ImageView;

import com.example.yhao.fixedfloatwindow.R;
import com.yhao.floatwindow.FloatWindow;
import com.yhao.floatwindow.MoveType;
import com.yhao.floatwindow.Screen;

/**
 * Created by yhao on 2017/12/18.
 * https://github.com/yhaolpz
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ImageView imageView = new ImageView(getApplicationContext());
//        imageView.setImageResource(R.drawable.icon);
        imageView.setImageResource(R.drawable.float_select01);


        //效果图1
        FloatWindow
                .with(getApplicationContext())
                .setView(imageView)
                .setWidth(Screen.width,0.1f)
                .setHeight(Screen.width,0.1f)
                .setX(Screen.width,0.8f)
                .setY(Screen.height,0.3f)
                .setMoveType(MoveType.slide)
                .setMoveStyle(500,new BounceInterpolator())
                .build();

        FloatWindow.get().getView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("BaseApplication", "点击了");
            }
        });

        //效果图2
//        FloatWindow
//                .with(getApplicationContext())
//                .setView(imageView)
//                .setWidth(Screen.width,0.2f)
//                .setHeight(Screen.width,0.2f)
//                .setX(Screen.width,0.7f)
//                .setY(Screen.height,0.2f)
//                .setMoveType(MoveType.back)
//                .setMoveStyle(300,null)
//                .setFilter(true,A_Activity.class,C_Activity.class)
//                .build();
    }
}
