package com.birthday.shruti.wish;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ViewFlipper;

public class VideoActivity extends Activity {
    ViewFlipper viewFlipper;
    MediaPlayer mp;
    int length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        viewFlipper = (ViewFlipper) this.findViewById(R.id.viewFlipper);
        mp = MediaPlayer.create(VideoActivity.this,R.raw.wish);
        mp.start();
        //sets auto flipping
        mp.setLooping(true);
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.startFlipping();
    }
    protected void onStop() {
        super.onStop();
        mp.stop();
    }
    /*protected void onPause(){
        super.onPause();
        mp.pause();
        length=mp.getCurrentPosition();
    }
    protected void onResume(){
        super.onResume();
        mp.seekTo(length);
        mp.start();
    }*/
}
