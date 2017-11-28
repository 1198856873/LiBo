package com.example.lenovo.day07_zidingyiview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by lenovo on 2017/11/24.
 */
public class DingYiView extends View {
    private Paint paint;
    private float top=300;
    public DingYiView(Context context) {
        super(context);
        System.out.println("===="+"第一个构造方法");
        initPaint();
    }

    public DingYiView(Context context, AttributeSet attrs) {
        super(context, attrs);
        System.out.println("===="+"第二个构造方法");
        initPaint();
    }

    public DingYiView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        System.out.println("===="+"第三个构造方法");
        initPaint();
    }
    //初始化画笔
    private void initPaint() {
        paint=new Paint();
        paint.setColor(getResources().getColor(android.R.color.holo_blue_bright)); //设置画笔颜色
        paint.setStrokeWidth(40); //设置线宽
        System.out.println("===="+"initpaint方法");

    }

    @Override  //测量view(当前view的大小)
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        System.out.println("===="+"onMeasure");

    }

    @Override  //摆放的是当前view的布局
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        System.out.println("===="+"onLayout方法");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
            canvas.drawRect(200f,top,300f,300f,paint);
        System.out.println("===="+"onDraw方法");
    }
    public void setTops(float top){
        this.top=top;
        postInvalidate();
        System.out.println("===="+"更新ui的方法");
//        invalidate();
    }

}
