package com.example.calculator_app_ri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String oldNumber;
    String operator = "";
    Boolean isNew = true;
    EditText etNumbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumbers = findViewById(R.id.etNumbers);
    }

    public void clickNumber(View view) {
        if (isNew)
            etNumbers.setText("");
        isNew = false;
        String number = etNumbers.getText().toString();
        switch (view.getId()){
            case R.id.btnOne:
                if (zeroIsFirst(number)){
                    number = number.substring(1);
                }
                number = number + "1";
                    break;
            case R.id.btnTwo:
                if (zeroIsFirst(number)){
                    number = number.substring(1);
                }
                number = number + "2";
                    break;
            case R.id.btnThree:
                if (zeroIsFirst(number)){
                    number = number.substring(1);
                }
                number = number + "3";
                    break;
            case R.id.btnFour:
                if (zeroIsFirst(number)){
                    number = number.substring(1);
                }
                number = number + "4";
                    break;
            case R.id.btnFive:
                if (zeroIsFirst(number)){
                    number = number.substring(1);
                }
                number = number + "5";
                    break;
            case R.id.btnSix:
                if (zeroIsFirst(number)){
                    number = number.substring(1);
                }
                number = number + "6";
                    break;
            case R.id.btnSeven:
                if (zeroIsFirst(number)){
                    number = number.substring(1);
                }
                number = number + "7";
                    break;
            case R.id.btnEight:
                number = number + "8";
                if (zeroIsFirst(number)){
                    number = number.substring(1);
                }
                    break;
            case R.id.btnNine:
                if (zeroIsFirst(number)){
                    number = number.substring(1);
                }
                number = number + "9";
                    break;
            case R.id.btnZero:
                if (zeroIsFirst(number) && number.length() == 1){
                    number = "0";
                }else {
                    number = number + "0";
                }
                break;

            case R.id.btnDot:
                if (dotIsPresent(number)) {
                }else {
                number = number + ".";
                }
                break;

            case R.id.btnPlusMinus:
                  if (numberIsZero(number)){
                      number = "0";
                  }else {
                      if (minusIsPresent(number)) {
                          number = number.substring(1);
                      }else{
                          number = "-" + number;
                      }
                  }
                break;
        }
        etNumbers.setText(number);
    }


    public void btnOperator(View view) {
        isNew = true;
        oldNumber = etNumbers.getText().toString();
        switch (view.getId()){
            case R.id.btnMinus: operator = "-" ;
                break;
            case R.id.btnPlus: operator = "+" ;
                break;
            case R.id.btnDivide: operator = "/" ;
                break;
            case R.id.btnMultiply: operator = "*" ;
                break;
        }
    }

    public void clickEquals(View view) {
        String newNumber = etNumbers.getText().toString();
        Double result = 0.0;
        switch (operator){
            case "-": result = Double.parseDouble(oldNumber) - Double.parseDouble(newNumber) ;
                break;
            case "+": result = Double.parseDouble(oldNumber) + Double.parseDouble(newNumber) ;
                break;
            case "*": result = Double.parseDouble(oldNumber) * Double.parseDouble(newNumber) ;
                break;
            case "/": result = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber) ;
                break;
        }
        etNumbers.setText(result+"");
    }

    public void clickAC(View view) {
        etNumbers.setText("0");
        isNew = true;
    }

    public boolean dotIsPresent(String number) {
        if (number.indexOf(".") == -1 ){
            return false;
        }else {
            return true;
        }
    }

    public boolean minusIsPresent(String number) {
        if (number.charAt(0) == '-') {
            return true;
        }else {
            return false;
        }
    }

    public void clickPercent(View view) {
        if (operator == ""){
            String number = etNumbers.getText().toString();
            double temp = Double.parseDouble(number) / 100;
            number = temp+"";
            etNumbers.setText(number);
        }else {
            String newNumber = etNumbers.getText().toString();
            Double result = 0.0;
            switch (operator){
                case "+": result = Double.parseDouble(oldNumber) + Double.parseDouble(oldNumber) + Double.parseDouble(newNumber) / 100;
                    break;
                case "-": result = Double.parseDouble(oldNumber) - Double.parseDouble(oldNumber) + Double.parseDouble(newNumber) / 100 ;
                    break;
                case "*": result = Double.parseDouble(oldNumber) * Double.parseDouble(newNumber) / 100;
                    break;
                case "/": result = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber) * 100;
                break;
            }
            etNumbers.setText(result+"");
            operator = "";
        }
    }

    private boolean numberIsZero(String number) {
        if (number.equals("0") || number.equals("")){
            return true;
        }else {
            return false;
        }

    }

    private boolean zeroIsFirst(String number) {
        if (number.equals("")){
            return true;
        }
        if (number.charAt(0) == '0') {
            return true;
        }else {
            return false;
        }
    }
}