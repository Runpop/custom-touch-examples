package com.examples.customtouch.touchconsume;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import com.examples.customtouch.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class TouchConsumeActivity extends Activity implements View.OnTouchListener {

    @Bind(R.id.consume_btn_no)
    ConsumeTextView consumeBtnNo;
    @Bind(R.id.consume_btn_dwon)
    ConsumeTextView consumeBtnDwon;
    @Bind(R.id.consume_btn_move)
    ConsumeTextView consumeBtnMove;
    @Bind(R.id.consume_btn_up)
    ConsumeTextView consumeBtnUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_touch_consume_main);
        ButterKnife.bind(this);

        consumeBtnNo.setOnTouchListener(this);
        consumeBtnDwon.setOnTouchListener(this);
        consumeBtnMove.setOnTouchListener(this);
        consumeBtnUp.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        boolean result = false;
        switch (v.getId()) {
            case R.id.consume_btn_no:
                break;
            case R.id.consume_btn_dwon:
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    result = true;
                }
                break;
            case R.id.consume_btn_move:
                if (event.getAction() == MotionEvent.ACTION_DOWN || event.getAction() == MotionEvent.ACTION_MOVE) {
                    result = true;
                }
                break;
            case R.id.consume_btn_up:
                if (event.getAction() == MotionEvent.ACTION_DOWN || event.getAction() == MotionEvent.ACTION_UP) {
                    result = true;
                }
                break;
        }
        return result;
    }
}
