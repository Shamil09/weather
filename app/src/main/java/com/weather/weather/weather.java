package com.weather.weather;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class weather extends AppCompatActivity {
    private void messege(String mess){
        Toast.makeText(getApplicationContext(), mess, Toast.LENGTH_LONG).show();
        Log.d("weatAPP", mess);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String mess;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        if (savedInstanceState == null)
             mess = "Первое созданеи App - onCreate()";
        else mess = "Следующее созданеи App - onCreate()";
        messege(mess);
    }

    @Override
    protected void onStart() {
        super.onStart();
        messege("App запустилось");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        messege("Выполняюсь после полного запуска APP");
    }

    @Override
    protected void onResume() {
        super.onResume();
        messege("Тут востанавливаем ресурсы");
    }

    @Override
    protected void onPause() {
        super.onPause();
        messege("Я на паузу");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        messege("На всякий случай во время паузы сохроняю состояние App");
    }

    @Override
    protected void onStop() {
        super.onStop();
        messege("На всякий случай во время паузы сохроняю состояние App");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        messege("Меня решили востановить, а так же после меня запуститься onStart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        messege("Меня решили уничтожить((");
    }

    @Override
    public void finish() {
        super.finish();
        messege("Почемуто вызвался метод finish()");
    }
}
