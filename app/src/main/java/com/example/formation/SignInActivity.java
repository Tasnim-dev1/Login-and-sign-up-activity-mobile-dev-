package com.example.formation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {

    private TextView goToSignUp;
    private TextView goToForget;
   @Override
    protected void onCreate(Bundle savedInstanceState){
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_sign_in);

      goToSignUp=findViewById(R.id.goToSignUp);
      goToForget=findViewById(R.id.goToForget);

      goToSignUp.setOnClickListener(view -> {
          startActivity(new Intent(SignInActivity.this,SignUpActivity.class));
      });

      goToForget.setOnClickListener(view -> {
          startActivity(new Intent(SignInActivity.this,ForgetActivity.class));
      });
    }

}