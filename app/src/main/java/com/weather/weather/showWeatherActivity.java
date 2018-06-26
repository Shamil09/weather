package com.weather.weather;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class showWeatherActivity extends AppCompatActivity{
    private static final String TEXT = "TEXT";
    private EditText editText;
//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        //setContentView(R.layout.create_action_activity);
//        butOk=findViewById(R.id.butOk);
//        butOk.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(this,weather.class);
//                intent.putExtra(TEXT, editText.getText().toString().trim());
//                startActivity(intent);
//                finish();
//            }
//        });
//    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this,weather.class);
        intent.putExtra(TEXT, editText.getText().toString().trim());
        startActivity(intent);
        finish();
    }
}
