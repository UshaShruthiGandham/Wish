package com.birthday.shruti.wish;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WishYou extends AppCompatActivity {

    TextView txt,txt1;
    Button btn1;
   // MediaPlayer mp;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.you_wish);
        Toolbar tbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(tbar);
        txt=(TextView)findViewById(R.id.textView);
        txt1=(TextView)findViewById(R.id.textView2);
        btn1=(Button)findViewById(R.id.Button2);


        Intent intent=getIntent();
        String enteredname =intent.getStringExtra("Name");
        txt1.setText("Hy " + enteredname + "...");
        txt.setText("Look whats hiding in here for you");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.Button2) {
                    //Toast.makeText(WishYou.this, "Imagebutton is clicked", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), VideoActivity.class);
                    startActivity(intent);
                }

            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.optionsmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.Audio) {
        Intent int1=new Intent(getApplicationContext(),AudioActivity.class);
            startActivity(int1);
        }
        return super.onOptionsItemSelected(item);
    }
}
