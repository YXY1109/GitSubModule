package com.yxy.gitsubmodule.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.yxy.gitsubmodule.R;

public class MyTopView extends RelativeLayout {

    private ImageView img_left, img_right;
    private TextView text_center;
    private RelativeLayout layout_root;

    public MyTopView(Context context) {
        this(context, null);
    }

    public MyTopView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyTopView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context, attrs);
    }

    public void initView(Context context, @Nullable AttributeSet attrs) {
        LayoutInflater.from(context).inflate(R.layout.view_header, this, true);
        img_left = (ImageView) findViewById(R.id.header_left_img);
        img_right = (ImageView) findViewById(R.id.header_right_img);
        text_center = (TextView) findViewById(R.id.header_center_text);
        layout_root = (RelativeLayout) findViewById(R.id.header_root_layout);
        layout_root.setBackgroundColor(Color.BLACK);
        text_center.setTextColor(Color.WHITE);

        initAttrs(context, attrs);
    }

    public void initAttrs(Context context, @Nullable AttributeSet attrs) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.MyView);
        String text = typedArray.getString(R.styleable.MyView_text);
        boolean showRight = typedArray.getBoolean(R.styleable.MyView_showRight, false);
        typedArray.recycle();

        if (showRight) {
            img_right.setVisibility(View.VISIBLE);
        } else {
            img_right.setVisibility(View.GONE);
        }

        text_center.setText(text);
    }

    //设置标题文字的方法
    private void setTitle(String title) {
        if (!TextUtils.isEmpty(title)) {
            text_center.setText(title);
        }
    }

    public void setLeftListener(OnClickListener onClickListener) {
        img_left.setOnClickListener(onClickListener);
    }

    //对右边按钮设置事件的方法
    private void setRightListener(OnClickListener onClickListener) {
        img_right.setOnClickListener(onClickListener);
    }

}
