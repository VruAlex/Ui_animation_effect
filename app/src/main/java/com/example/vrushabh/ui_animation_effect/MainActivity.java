package com.example.vrushabh.ui_animation_effect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Relative layout
        final RelativeLayout relativeLayoutAnim = findViewById(R.id.animation);
        //Animation implementation
        final Animation loadAnimation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.layout_animation_effect);



        // First Button on click action
        Button buttonStart = findViewById(R.id.start);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayoutAnim.setVisibility(View.VISIBLE);
                relativeLayoutAnim.setAnimation(loadAnimation);
            }
        });
    }
}
