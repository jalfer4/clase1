package com.example.clase1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Salida","pasando por onCreate ");
      //  Toast.makeText(this,"pasando por onCreate",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Salida","pasando por onPause ");
       // Toast.makeText(this,"pasando por onPause",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Toast.makeText(this,"pasando por onResume",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Salida","pasando por onStart ");
       // Toast.makeText(this,"pasando por onStart",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Salida","pasando por onDestroy ");
       // Toast.makeText(this,"pasando por onDestroy",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Salida","pasando por onStop ");
       // Toast.makeText(this,"pasando por onStop",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Salida","pasando por onRestart ");
        //Toast.makeText(this,"pasando por onRestart",Toast.LENGTH_LONG).show();
    }
}
