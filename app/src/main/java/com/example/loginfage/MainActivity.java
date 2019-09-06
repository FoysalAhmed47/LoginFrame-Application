package com.example.loginfage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    private EditText usernameEditText, passwordEditText;
    private Button loginButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        usernameEditText = (EditText) findViewById(R.id.userNameId);
        passwordEditText = (EditText) findViewById(R.id.passwordId);
        loginButton = (Button) findViewById(R.id.loginButtonId);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                if (username.equals("FoysalAhmed") && password.equals("RawshanFoysal")) {
                    Intent intent = new Intent(MainActivity.this, HomePage.class);
                    startActivity(intent);

                } else if (username.isEmpty() && password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "field is empty", Toast.LENGTH_LONG).show();


                }
            }
        });
    }

}



