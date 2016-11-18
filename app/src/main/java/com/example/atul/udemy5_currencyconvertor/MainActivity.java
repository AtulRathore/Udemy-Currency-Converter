package com.example.atul.udemy5_currencyconvertor;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){

        try {
            String emptyString="";
            EditText editText = (EditText) findViewById(R.id.editText);
            Double BAmount = Double.parseDouble(editText.getText().toString());
            if(BAmount.toString().equals(emptyString)){

                Double PAmount= BAmount*100;

                Toast.makeText(this, "$"+PAmount.toString(), Toast.LENGTH_SHORT).show();

                Log.i("Currency","$"+editText.getText().toString());
            }
            else {
                Toast.makeText(this, "Please enter something", Toast.LENGTH_SHORT).show();
            }

        }catch (Exception e){
            Log.e("Exception",""+e);
            Toast.makeText(this, e+ "exception", Toast.LENGTH_SHORT).show();
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
