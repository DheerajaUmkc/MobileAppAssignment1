package loginapp.umkc.com.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {
    private EditText name;
    private EditText email;
    private EditText password;
    private Button   signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        name = (EditText)findViewById(R.id.etname);
        password = (EditText)findViewById(R.id.etpassword);
        email = (EditText)findViewById(R.id.etemail);
        signUp = (Button) findViewById(R.id.btnsignUp);
        signUp.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validation(name.getText().toString(), email.getText().toString(), password.getText().toString());
            }
        });
    }

    private void validation(String name, String email, String password){
        if((name.equals("admin")) && (email.equals("dheeraja999@gmail.com"))&&(password.equals("enter")))
        {
            Intent GO = new Intent(SignUp.this, Login.class);

            startActivity(GO);


        }


    }
}
