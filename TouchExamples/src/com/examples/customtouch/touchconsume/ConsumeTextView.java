package com.examples.customtouch.touchconsume;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * Created by diff on 2016/3/4.
 */
public class ConsumeTextView extends TextView {

    public ConsumeTextView(Context context) {
        super(context);
    }

    public ConsumeTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("difflog", "ConsumeButton - onTouchEvent:" + event.getAction());
        return false;
    }
}
