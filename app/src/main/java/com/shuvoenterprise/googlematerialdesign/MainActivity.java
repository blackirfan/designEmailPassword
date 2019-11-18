package com.shuvoenterprise.googlematerialdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextEmail,editTextPassword;
    Button logIn;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEmail = findViewById(R.id.email);
        editTextPassword = findViewById(R.id.password);

        logIn = findViewById(R.id.login);


        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int e=0,p = 0;


                if(editTextEmail.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),"enter email address",Toast.LENGTH_SHORT).show();
                }else {
                    if (editTextEmail.getText().toString().trim().matches(emailPattern)) {
//                        Toast.makeText(getApplicationContext(),"valid email address",Toast.LENGTH_SHORT).show();

                        e =1;
                    } else {
                        editTextEmail.setError("Invalid Email Address");
                    }
                }


                //password part


                if(editTextPassword.getText().toString().length()>=8){
//                    Toast.makeText(getApplicationContext(),"your password is valid",Toast.LENGTH_SHORT).show();

                    p=1;



                }else{
                    editTextPassword.setError("Invalid Password");
                }



                if(e==1 && p ==1){

                    Toast.makeText(getApplicationContext(),"operation successfull",Toast.LENGTH_SHORT).show();

                }
            }



        });
    }
}
