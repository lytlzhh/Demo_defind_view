package com.example.administrator.demo_defind_attribute_view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/1/10/010.
 */

public class DF_view extends RelativeLayout {

    private Button left_btn, right_btn;
    private TextView textView;

    /*TextView*/
    private float titleSize;
    private String titleString;
    private int titleColor;

    /*lrftbutton*/
    private int leftbtnSize;
    private String leftbtnString;
    private Drawable leftbtnBackground;
    private int leftbtnColor;

    /*rightbutton*/
    private int rightbtnSize;
    private String rightbtnString;
    private Drawable rightbtnBackground;
    private int rightbtnColor;

    private LayoutParams left_layoutParams, right_layoutParams, title_layoutParams;

    public DF_view(final Context context, AttributeSet attrs) {
        super(context, attrs);
        /*将自定义的attribute放入到数组中*/
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.MYattr);

        leftbtnBackground = typedArray.getDrawable(R.styleable.MYattr_left_btn_background);
        leftbtnColor = typedArray.getColor(R.styleable.MYattr_left_btn_text_color, 0);
        leftbtnSize = typedArray.getDimensionPixelSize(R.styleable.MYattr_left_btn_text_size, 0);
        leftbtnString = typedArray.getString(R.styleable.MYattr_left_btn_text);


        rightbtnBackground = typedArray.getDrawable(R.styleable.MYattr_right_btn_background);
        rightbtnColor = typedArray.getColor(R.styleable.MYattr_right_btn_text_color, 0);
        rightbtnSize = typedArray.getDimensionPixelSize(R.styleable.MYattr_right_btn_text_size, 0);
        rightbtnString = typedArray.getString(R.styleable.MYattr_right_btn_text);


        titleColor = typedArray.getColor(R.styleable.MYattr_title_text_color, 0);
        titleSize = typedArray.getDimension(R.styleable.MYattr_title_text_size, 0);
        titleString = typedArray.getString(R.styleable.MYattr_title_text);


        /*刷新*/
        typedArray.recycle();

        left_btn = new Button(context);

        left_btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "lllllllllllllllllllllllllll", Toast.LENGTH_SHORT).show();
            }
        });


        right_btn = new Button(context);

        right_btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        textView = new TextView(context);


        left_btn.setBackground(leftbtnBackground);
        left_btn.setTextColor(leftbtnColor);
        left_btn.setTextSize(leftbtnSize);
        left_btn.setText(leftbtnString);


        right_btn.setBackground(rightbtnBackground);
        right_btn.setTextColor(rightbtnColor);
        right_btn.setTextSize(rightbtnSize);
        right_btn.setText(rightbtnString);


        textView.setTextColor(titleColor);
        textView.setTextSize(titleSize);
        textView.setText(titleString);

        setBackgroundColor(0xD81212);

        left_layoutParams = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        left_layoutParams.addRule(ALIGN_PARENT_LEFT, TRUE);

        addView(left_btn, left_layoutParams);

        right_layoutParams = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        right_layoutParams.addRule(ALIGN_PARENT_RIGHT, TRUE);

        addView(right_btn, right_layoutParams);


        title_layoutParams = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        title_layoutParams.addRule(CENTER_IN_PARENT, TRUE);

        addView(textView, title_layoutParams);

    }

}
