package com.birthday.shruti.wish;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AudioActivity extends AppCompatActivity {
    MediaPlayer mp;
    Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

         play= (Button)findViewById(R.id.button);
        Button stop= (Button)findViewById(R.id.button2);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(AudioActivity.this, R.raw.audio);
                mp.start();

            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp!=null) {
                    mp.stop();
                }
            }
        });
    }


    @Override
    protected void onStop() {
        super.onStop();
        if(mp!=null) {
            mp.stop();
        }


    }
}
