package com.example.yhao.floatwindow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.yhao.fixedfloatwindow.R;

public class B_Activity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        setTitle("B");
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.float_item_select);

        addContentView(imageView,new RelativeLayout.LayoutParams(100,100));
    }

    public void change(View view) {
        startActivity(new Intent(this, C_Activity.class));
    }

    public void back(View view) {
        finish();
    }
}
