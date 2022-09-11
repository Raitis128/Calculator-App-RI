package com.example.calculator_app_ri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etNumbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumbers = findViewById(R.id.etNumbers);
    }

    public void clickNumber(View view) {
        String number = etNumbers.getText().toString();
        switch (view.getId()){
            case R.id.btnOne: number = number + 1; break;
            case R.id.btnTwo: number = number + 2; break;
            case R.id.btnThree: number = number + 3; break;
            case R.id.btnFour: number = number + 4; break;
            case R.id.btnFive: number = number + 5; break;
            case R.id.btnSix: number = number + 6; break;
            case R.id.btnSeven: number = number + 7; break;
            case R.id.btnEight: number = number + 8; break;
            case R.id.btnNine: number = number + 9; break;
            case R.id.btnZero: number = number + 0; break;
        }
        etNumbers.setText(number);
    }
}