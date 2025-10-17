package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class OperationsActivity extends AppCompatActivity {

    EditText text1,text2;

    TextView displaytextresult;
    Button clickforresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_operations);
        text1=findViewById(R.id.edtext1);
        text2=findViewById(R.id.edtext2);
        displaytextresult=findViewById(R.id.tvresult);
        clickforresult=findViewById(R.id.resultbtn);

        clickforresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no1 = text1.getText().toString();
                String no2 = text2.getText().toString();
                String result = add(no1,no2);
                displaytextresult.setText("Sum = "+result);

            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private String add(String no1,String no2){
        return String.valueOf(Integer.parseInt(no1)+Integer.parseInt(no2));
    }
}