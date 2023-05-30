package com.example.studentportal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button reg_btn;
EditText name, address, contact, email, pass,cpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.name);
        address=findViewById(R.id.address);
        contact=findViewById(R.id.contact);
        email=findViewById(R.id.email);
        pass=findViewById(R.id.pass);
        cpass=findViewById(R.id.cpass);

        reg_btn=findViewById(R.id.reg_btn);

        reg_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n=name.getText().toString();
                String c=contact.getText().toString();
                String a=address.getText().toString();
                String e=email.getText().toString();
                String p=pass.getText().toString();
                String cp=cpass.getText().toString();
                
                if (n.equals("")){
                    name.setError("Please Enter your name");
                } else if (c.equals("")) {
                    contact.setError("Please Enter Contact");
                } else if (e.equals("")) {
                    email.setError("Please Enter Email");
                } else if (p.equals("")) {
                    pass.setError("Please Create a password");
                } else if (cp.equals("")) {
                    cpass.setError("Please Confirm Your password");
                } else if (c.length()<10) {
                    contact.setError("Please Enter Valid contact");
                } else if (!p.equals(cp)) {
                    cpass.setError("Password does not match");
                } else {
                    Toast.makeText(MainActivity.this, "Registered successfully", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}