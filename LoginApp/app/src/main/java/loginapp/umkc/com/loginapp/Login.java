package loginapp.umkc.com.loginapp;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ExpandedMenuView;
import android.support.v7.widget.ButtonBarLayout;
import android.text.LoginFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class Login extends AppCompatActivity {


    private EditText Username;
    private EditText Password;
    private Button   Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Username = (EditText)findViewById(R.id.etUserName);
        Password= (EditText)findViewById(R.id.etPassword);
        Login= (Button)findViewById(R.id.btnLogin);

        Login.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validation(Username.getText().toString(), Password.getText().toString());
            }
        });
    }

    private void validation(String Username, String Password){
        if((Username.equals("admin")) && (Password.equals("enter"))){
            Intent intent = new Intent(Login.this, Myaccount.class);

            startActivity(intent);


        }
    }
}

