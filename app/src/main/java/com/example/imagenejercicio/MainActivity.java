package com.example.imagenejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_resultado, tv_valor1, tv_valor2, tv_signo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_resultado = (TextView) findViewById(R.id.textView3);
        tv_valor1 = (TextView) findViewById(R.id.tv_valor1);
        tv_valor2 = (TextView) findViewById(R.id.tv_valor2);
        tv_signo = (TextView) findViewById(R.id.tv_signo);

    }
    public void Operaciones(View view){
        String resultado = tv_resultado.getText().toString();
        String campo2 = tv_valor2.getText().toString();

        if (resultado.equals("0")){
            resultado = "";
        }

        switch (view.getId()){
            case R.id.btn1:
                tv_resultado.setText(resultado + "1");
                if (tv_signo.getText().equals("vacio")){
                    tv_valor1.setText(resultado + "1");
                }else{
                    tv_valor2.setText(campo2 +"1");
                }
                break;
            case R.id.btn2:
                tv_resultado.setText(resultado + "2");
                if (tv_signo.getText().equals("vacio")){
                    tv_valor1.setText(resultado + "2");
                }else {
                    tv_valor2.setText(campo2 + "2");
                }
                break;
            case R.id.btn3:
                tv_resultado.setText(resultado + "3");
                if (tv_signo.getText().equals("vacio")){
                    tv_valor1.setText(resultado + "3");
                }else {
                    tv_valor2.setText(campo2 + "3");
                }
                break;
            case R.id.btn4:
                tv_resultado.setText(resultado + "4");
                if (tv_signo.getText().equals("vacio")){
                    tv_valor1.setText(resultado + "4");
                }else {
                    tv_valor2.setText(campo2 + "4");
                }
                break;
            case R.id.btn5:
                tv_resultado.setText(resultado + "5");
                if (tv_signo.getText().equals("vacio")){
                    tv_valor1.setText(resultado + "5");
                }else {
                    tv_valor2.setText(campo2 + "5");
                }
                break;
            case R.id.btn6:
                tv_resultado.setText(resultado + "6");
                if (tv_signo.getText().equals("vacio")){
                    tv_valor1.setText(resultado + "6");
                }else {
                    tv_valor2.setText(campo2 + "6");
                }
                break;
            case R.id.btn7:
                tv_resultado.setText(resultado + "7");
                if (tv_signo.getText().equals("vacio")){
                    tv_valor1.setText(resultado + "7");
                }else {
                    tv_valor2.setText(campo2 + "7");
                }
                break;
            case R.id.btn8:
                tv_resultado.setText(resultado + "8");
                if (tv_signo.getText().equals("vacio")){
                    tv_valor1.setText(resultado + "8");
                }else {
                    tv_valor2.setText(campo2 + "8");
                }
                break;
            case R.id.btn9:
                tv_resultado.setText(resultado + "9");
                if (tv_signo.getText().equals("vacio")){
                    tv_valor1.setText(resultado + "9");
                }else {
                    tv_valor2.setText(campo2 + "9");
                }
                break;
            case R.id.btn0:
                tv_resultado.setText(resultado + "0");
                if (tv_signo.getText().equals("vacio")){
                    tv_valor1.setText(resultado + "0");
                }else {
                    tv_valor2.setText(campo2 + "0");
                }
                break;
            case R.id.btn_suma:
                tv_resultado.setText(resultado + "+");
                tv_signo.setText("+");
                break;
            case R.id.btn_resta:
                tv_resultado.setText(resultado + "-");
                tv_signo.setText("-");
                break;
            case R.id.btn_multi:
                tv_resultado.setText(resultado + "*");
                tv_signo.setText("*");
                break;
            case R.id.btn_divi:
                tv_resultado.setText(resultado + "/");
                tv_signo.setText("/");
                break;
        }
    }
    public void Resultado (View view){

        if (tv_signo.getText().equals("+")){
            String valor1_String = tv_valor1.getText().toString();
            String valor2_String = tv_valor2.getText().toString();

            int valor1_int = Integer.parseInt(valor1_String);
            int valor2_int = Integer.parseInt(valor2_String);

            int resultado_int = valor1_int + valor2_int;
            tv_resultado.setText("= " + resultado_int);
        }
        if (tv_signo.getText().equals("-")){
            String valor1_String = tv_valor1.getText().toString();
            String valor2_String = tv_valor2.getText().toString();

            int valor1_int = Integer.parseInt(valor1_String);
            int valor2_int = Integer.parseInt(valor2_String);

            int resultado_int = valor1_int - valor2_int;
            tv_resultado.setText("= " + resultado_int);
        }
        if (tv_signo.getText().equals("*")){
            String valor1_String = tv_valor1.getText().toString();
            String valor2_String = tv_valor2.getText().toString();

            int valor1_int = Integer.parseInt(valor1_String);
            int valor2_int = Integer.parseInt(valor2_String);

            int resultado_int = valor1_int * valor2_int;
            tv_resultado.setText("= " +resultado_int);
        }
        if (tv_signo.getText().equals("/")){
            String valor1_String = tv_valor1.getText().toString();
            String valor2_String = tv_valor2.getText().toString();

            double valor1_int = Integer.parseInt(valor1_String);
            double valor2_int = Integer.parseInt(valor2_String);
            if (valor2_int != 0) {
                double resultado_int = valor1_int / valor2_int;
                tv_resultado.setText("= " + resultado_int);
            }else {
                tv_resultado.setText("no se puede dividir por 0");
            }
        }
    }
    public void Restaurar (View view){
        tv_resultado.setText("0");
        tv_valor1.setText("");
        tv_valor2.setText("");
        tv_signo.setText("vacio");
    }
}