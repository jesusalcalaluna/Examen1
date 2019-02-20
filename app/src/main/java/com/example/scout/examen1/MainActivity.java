package com.example.scout.examen1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView numran, numsum,mensaje;
    Random numero = new Random();
    Button btn1, btn2, btn3, btn4, btn5;

    int opr1, num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        numran = (TextView)findViewById(R.id.txtrandom);
        numsum = (TextView)findViewById(R.id.txtnumerosum);
        mensaje = (TextView)findViewById(R.id.txtmensaje);
        btn1= findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2=findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3=findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        btn4=findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        btn5=findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
        findViewById(R.id.btnNuevo).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.btn1:
                num = numero.nextInt(9)+1;
                opr1+=num;
                numran.setText(String.valueOf(num));
                numsum.setText(String.valueOf(opr1));
                v.setEnabled(false);
                


                break;
            case R.id.btn2:
                num = numero.nextInt(9)+1;
                opr1+=num;
                numran.setText(String.valueOf(num));
                numsum.setText(String.valueOf(opr1));

                break;
            case R.id.btn3:
                num = numero.nextInt(9)+1;
                opr1+=num;
                numran.setText(String.valueOf(num));
                numsum.setText(String.valueOf(opr1));
                v.setEnabled(false);

                break;
            case R.id.btn4:
                num = numero.nextInt(9)+1;
                opr1+=num;
                numran.setText(String.valueOf(num));
                numsum.setText(String.valueOf(opr1));
                v.setEnabled(false);

                break;
            default:
                num = numero.nextInt(9)+1;
                opr1+=num;
                numran.setText(String.valueOf(num));
                numsum.setText(String.valueOf(opr1));
                v.setEnabled(false);

                break;
            case R.id.btnNuevo:
                numran.setText("0");
                numsum.setText("0");
                mensaje.setText(" ");
                btn1.setEnabled(true);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                opr1=0;
                break;
        }

        if (opr1 == 21){
            Toast.makeText(this,"GANASTE", Toast.LENGTH_SHORT).show();
        }
        if (opr1 > 21){
            Toast.makeText(this,"PERDISTE", Toast.LENGTH_LONG).show();
        }

    }
}
