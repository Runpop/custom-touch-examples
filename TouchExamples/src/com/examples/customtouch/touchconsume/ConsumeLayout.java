package com.examples.customtouch.touchconsume;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by diff on 2016/3/4.
 */
public class ConsumeLayout extends LinearLayout {
    public ConsumeLayout(Context context) {
        super(context);
    }

    public ConsumeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i("difflog", "ConsumeLayout - dispatchTouchEvent:" + ev.getAction());
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.i("difflog", "ConsumeLayout - onInterceptTouchEvent:" + ev.getAction());
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("difflog", "ConsumeLayout - onTouchEvent:" + event.getAction());
        return super.onTouchEvent(event);
    }
}
