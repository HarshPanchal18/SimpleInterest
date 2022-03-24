package com.example.simpleinterest;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText amt,Rate,time;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);
        amt = (EditText) findViewById(R.id.amt);
        Rate = (EditText) findViewById(R.id.Rate);
        time = (EditText) findViewById(R.id.time);
        btn = (Button) findViewById(R.id.btn);
    }
    public void Si(View v){
        float p=Integer.parseInt(""+amt.getText());
        float r=Integer.parseInt(""+Rate.getText());
        float n=Integer.parseInt(""+time.getText());
        float si=(p * n * r)/100;
        float total=p+si;
        Toast toast = Toast.makeText(getApplicationContext(),"Interest: "+si+"\nTotal Amount: "+total,Toast.LENGTH_LONG);
        View Tview= toast.getView();
        Tview.setBackgroundColor(Color.LTGRAY);
        toast.show();
    }
}