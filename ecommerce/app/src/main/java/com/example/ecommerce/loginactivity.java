package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginactivity extends AppCompatActivity {
    private EditText InputPhoneNumber,InputPassword;
    private Button LoginButton;
    private ProgressDialog loadingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        LoginButton=(Button) findViewById(R.id.login_btn);
         InputPassword=(EditText)findViewById(R.id.login_password_input);
        InputPhoneNumber=(EditText)findViewById(R.id.login_phone_number_input);
        loadingBar=new ProgressDialog(this);

        LoginButton.setOnClickListener(new View.OnClickListener(){
            @override
                    public void onClick(View view)
            {
                LoginUser();
            }
        });
    }

   private void LoginUser()
   {
       String phone = InputPhoneNumber.getText().toString();
       String password = InputPassword.getText().toString();
       if (TextUtils.isEmpty(phone)) {
           Toast.makeText(this, "please write your phonenumber", Toast.LENGTH_SHORT).show();
       } else if (TextUtils.isEmpty(password)) {
           Toast.makeText(this, "please write your password", Toast.LENGTH_SHORT).show();
       } else {
           loadingBar.setTitle("Login Account");
           loadingBar.setCancelMessage("please wait,while we are checking the credentials");
           loadingBar.setCanceledOnTouchOutside(false);
           loadingBar.show();
            AllowAccessToA
       }
   }

}
