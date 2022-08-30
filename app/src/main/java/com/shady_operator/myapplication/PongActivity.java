package com.shady_operator.myapplication;

import android.app.Activity;
import android.view.Window;
import android.os.Bundle;
import android.view.WindowManager;

import android.graphics.Point;
import android.view.Display;

public class PongActivity extends Activity {

    private PongGame mPongGame;
    private PongGame contentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        mPongGame = new PongGame(this, size.x, size.y);
        setContentView(mPongGame);

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    public void setContentView(PongGame contentView) {
        this.contentView = contentView;
    }

    public PongGame getContentView() {
        return contentView;
    }
}