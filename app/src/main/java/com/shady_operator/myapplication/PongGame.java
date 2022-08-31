package com.shady_operator.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class PongGame extends SurfaceView {
    // Is this debugging?
    private final boolean DEBUGGING = true;
    // These objects are needed for drawing
    private SurfaceHolder mOurHolder;
    private Canvas mCanvas;
    private Paint mPaint;
    // How many frames per second did we get?
    private long mFPS;
    // The number of milliseconds in a second
    private final int MILLIS_IN_SECOND = 1000;
    // Holds the resolution of the screen
    private int mScreenX;
    private int mScreenY;
    // How big will the text be?
    private int mFontSize;
    private int mFontMargin;
    // The game objects
    private Bat mBat;
    private Ball mBall;
    // The current score and lives remaining
    private int mScore;
    private int mLives;

    public PongGame(Context context, int x, int y) {
        super(context);
    }
}
