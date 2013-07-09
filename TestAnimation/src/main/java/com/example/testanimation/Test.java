package com.example.testanimation;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by stephen on 13-7-9.
 */
public class Test extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slidein, R.anim.slideout);
    }
}