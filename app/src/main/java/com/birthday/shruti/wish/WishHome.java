package com.birthday.shruti.wish;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class WishHome extends AppCompatActivity {
    EditText edit;
    ImageButton btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_wish);
        edit = (EditText) findViewById(R.id.editText);
        btn = (ImageButton) findViewById(R.id.imageButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(WishHome.this, "Imagebutton is clicked", Toast.LENGTH_SHORT).show();
                if(edit.getText().length()!=0) {
                    String name = edit.getText().toString();
                    Intent in = in = new Intent(getApplicationContext(), WishYou.class);
                    in.putExtra("Name", name);
                    startActivity(in);
                } else edit.setError("Please Enter your name");

            }
        });
    }

    @Override
    public void onResume(){

            super.onResume();
            edit.setText("");
    }


    }




