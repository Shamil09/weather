package com.weather.weather;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class weather extends AppCompatActivity {
    TextView textCount;
    Button butCount;
    private int count=0;
    private void message(String mess){
        Toasty.info(getApplicationContext(), mess, Toast.LENGTH_SHORT).show();
        Log.d("weatAPP", mess);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String mess;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        if (savedInstanceState == null)
             mess ="Первое создание App - onCreate()";
        else mess = "Следующее создание App - onCreate()";
        message(mess);

        //savedInstanceState.putInt("count",count);

        textCount=findViewById(R.id.IDTCount);
        textCount.setText(((Integer)count).toString());
        butCount=findViewById(R.id.IDButCount);
        butCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                textCount.setText(((Integer)count).toString());
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        message("App запустилось");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        message("Выполняюсь после полного запуска APP");
        count=savedInstanceState.getInt("count");
        textCount.setText(((Integer)count).toString());
    }

    @Override
    protected void onResume() {
        super.onResume();
        message("Тут восстанавливаем ресурсы");
    }

    @Override
    protected void onPause() {
        super.onPause();
        message("Я на паузу");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        message("На всякий случай во время паузы сохраняю состояние App");
        outState.putInt("count",count);
    }

    @Override
    protected void onStop() {
        super.onStop();
        message("На всякий случай во время паузы сохраняю состояние App");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        message("Меня решили восстановить, а так же после меня запуститься onStart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        message("Меня решили уничтожить((");
    }

    @Override
    public void finish() {
        super.finish();
        message("Почему-то вызвался метод finish()");
    }
}
