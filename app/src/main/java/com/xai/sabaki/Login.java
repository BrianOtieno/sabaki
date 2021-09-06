package com.xai.sabaki;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;

public class Login extends AppCompatActivity {

    public static EditText mUsername;
    private EditText Password;
    private Button mLogin;
    ImageButton mScanStaffTag;
    ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(ContextCompat.getColor(getApplicationContext(), R.color.blue));
        }

        setContentView(R.layout.activity_login);

        mUsername = findViewById(R.id.emailSignIn);
        mLogin = findViewById(R.id.Login);
        mProgressBar = (ProgressBar) findViewById(R.id.progressbars);
        mScanStaffTag = findViewById(R.id.scanStaffTag);
        mProgressBar.setVisibility(View.GONE);

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(new Intent(Login.this, MainActivity.class));
            }
        });

//        mScanStaffTag.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(Login.this, scanLoginCode.class));
//            }
//        });
    }
}