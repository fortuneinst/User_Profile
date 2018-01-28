package com.example.sony.user_profile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2,et3,et4;
    Button bt1,bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.etuname);
        et2 = (EditText)findViewById(R.id.etid);
        et3 = (EditText)findViewById(R.id.etmnumber);
        et4 = (EditText)findViewById(R.id.etemail);
    }

    public void login(View v){

    }

    public void register(View v){

    }
}
