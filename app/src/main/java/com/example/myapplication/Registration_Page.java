package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Registration_Page extends AppCompatActivity {

    EditText FullName, Email, writepassword, confirmpassword;

    Button registerreal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registration_page);
        FullName=findViewById(R.id.FullName);
        Email=findViewById(R.id.Email);
        writepassword=findViewById(R.id.writepassword);
        confirmpassword=findViewById(R.id.confirmpassword);
        registerreal=findViewById(R.id.registerreal);

        registerreal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Username = FullName.getText().toString();
                String UserEmail = Email.getText().toString();
                String Passwordcheck = writepassword.getText().toString();
                String Passwordfinal = confirmpassword.getText().toString();

                if (Username.isEmpty() || UserEmail.isEmpty() || Passwordcheck.isEmpty() || Passwordfinal.isEmpty())
                {
                    Toast.makeText(Registration_Page.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                }

                else if (!Passwordcheck.equals(Passwordfinal))
                {
                    Toast.makeText(Registration_Page.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(Registration_Page.this, "Registration Successful!", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(getApplicationContext(),LoginPage.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}