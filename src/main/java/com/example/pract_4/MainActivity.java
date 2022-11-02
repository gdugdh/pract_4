package com.example.pract_4;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.*;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextView tvInfo;
    EditText etInput;
    Button bControl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvInfo = (TextView)findViewById(R.id.textView2);
        etInput = (EditText)findViewById(R.id.editTextNumber);
        bControl = (Button)findViewById(R.id.button);

    }

    public void onClick(View v) {
        int guess = (int)(Math.random()*100);
        boolean gameFinished = false;

        // Integer.parseInt(etInput.getText().toString());
        // tvInfo.setText(getResources().getString(R.string.ahead));

        if (!gameFinished) {
            int num = Integer.parseInt(etInput.getText().toString());
            Log.d("myTag", "2314");

            if (num > guess) {
                tvInfo.setText(getResources().getString(R.string.ahead));
            }
            if (num < guess) {
                tvInfo.setText(getResources().getString(R.string.behind));
            }
            if (num == guess) {
                tvInfo.setText(getResources().getString(R.string.hit));
                bControl.setText(getResources().getString(R.string.play_more));
                gameFinished = true;
            }
        } else {
            tvInfo.setText(getResources().getString(R.string.try_to_goes));
            etInput.setText("");
        }
    }
}
