package com.yxy.gitsubmodule.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * 一：
 * https://www.cnblogs.com/andy-songwei/p/10955062.html
 * 二：
 * https://www.cnblogs.com/andy-songwei/p/10960012.html
 * 三：
 * https://www.cnblogs.com/andy-songwei/p/10968358.html
 * 四：
 * https://www.cnblogs.com/andy-songwei/p/10979161.html
 * 五：事件分发
 * https://www.cnblogs.com/andy-songwei/p/10998855.html
 * 六：
 * https://www.cnblogs.com/andy-songwei/p/11039252.html
 * 七：
 * https://www.cnblogs.com/andy-songwei/p/11076612.html
 * <p>
 * 其他：
 * https://www.jianshu.com/p/76603b122fb4
 */

public class TouchView extends View {
    private Paint paint;
    private Path path;

    public TouchView(Context context) {
        super(context);
        init();
    }

    public TouchView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TouchView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        Log.d("test", "33View onTouchEvent:" + event.getAction());
//        return super.onTouchEvent(event);
//    }
//
//    @Override
//    public boolean dispatchTouchEvent(MotionEvent event) {
//        Log.d("test", "11View dispatchTouchEvent:" + event.getAction());
//        return super.dispatchTouchEvent(event);
//    }

    private void init() {
        paint = new Paint();
        path = new Path();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.reset();
        path.reset();
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        path.moveTo(100, 100);
        path.rLineTo(0, 400);
        path.rLineTo(800, 0);
        canvas.drawPath(path, paint);

        //绘制文字
        paint.reset();
        paint.setTextSize(30);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawText("Froyo", 160, 540, paint);
        canvas.drawText("CB", 280, 540, paint);
        canvas.drawText("ICS", 380, 540, paint);
        canvas.drawText("J", 480, 540, paint);
        canvas.drawText("KitKat", 560, 540, paint);
        canvas.drawText("L", 690, 540, paint);
        canvas.drawText("M", 790, 540, paint);

//        canvas.drawText("Froyo", 150, 600, paint);
//        canvas.drawText("CB", 250, 600, paint);
//        canvas.drawText("ICS", 350, 600, paint);
//        canvas.drawText("J", 450, 600, paint);
//        canvas.drawText("KitKat", 550, 600, paint);
//        canvas.drawText("L", 650, 600, paint);
//        canvas.drawText("M", 750, 600, paint);

        //绘制直方图，柱形图是用较粗的直线来实现的
        paint.reset();
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(50);

        float[] lines3 = {
                200, 500, 200, 495,
                300, 500, 300, 480,
                400, 500, 400, 480,
                500, 500, 500, 300,
                600, 500, 600, 200,
                700, 500, 700, 150,
                800, 500, 800, 350,
        };
        canvas.drawLines(lines3, paint);

//        canvas.

        Paint paintyxy = new Paint();
        paintyxy.setColor(Color.WHITE);
        paintyxy.setStyle(Paint.Style.STROKE);
        paintyxy.setTextSize(40);
        paintyxy.setStrikeThruText(true);
        canvas.drawText("杨勋宇", 160, 600, paintyxy);
    }
}
