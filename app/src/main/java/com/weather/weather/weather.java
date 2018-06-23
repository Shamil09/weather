package com.weather.weather;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class weather extends AppCompatActivity {
    private void message(String mess){
        Toast.makeText(getApplicationContext(), mess, Toast.LENGTH_SHORT).show();
        Log.d("weatAPP", mess);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String mess;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        if (savedInstanceState == null)
             mess ="Первое созданеи App - onCreate()";
        else mess = "Следующее созданеи App - onCreate()";
        message(mess);
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
    }

    @Override
    protected void onResume() {
        super.onResume();
        message("Тут востанавливаем ресурсы");
    }

    @Override
    protected void onPause() {
        super.onPause();
        message("Я на паузу");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        message("На всякий случай во время паузы сохроняю состояние App");
    }

    @Override
    protected void onStop() {
        super.onStop();
        message("На всякий случай во время паузы сохроняю состояние App");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        message("Меня решили востановить, а так же после меня запуститься onStart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        message("Меня решили уничтожить((");
    }

    @Override
    public void finish() {
        super.finish();
        message("Почемуто вызвался метод finish()");
    }
}
