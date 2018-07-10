package com.example.jhpal.hestia;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.view.WindowManager;

public class SplashActivity extends Activity  {
    private final int DURACION_SPLASH = 2000;

    private TextView textoSplash;

    private Typeface DosisBold;
    private Typeface DosisSemi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_spash);

        String Dosis1 = "fonts/gotham.ttf";
        this.DosisBold = Typeface.createFromAsset(getAssets(), Dosis1);

        String Dosis2 = "fonts/RalewayS.ttf";
        this.DosisSemi = Typeface.createFromAsset(getAssets(), Dosis2);

        this.textoSplash = (TextView)findViewById(R.id.txt_Splash);
        textoSplash.setTypeface(DosisBold);

        new Handler().postDelayed(new Runnable(){
            public void run(){
                Intent intent = new Intent(SplashActivity.this, Main3Activity.class);
                startActivity(intent);
                finish();
            };
        }, DURACION_SPLASH);

    }
}
