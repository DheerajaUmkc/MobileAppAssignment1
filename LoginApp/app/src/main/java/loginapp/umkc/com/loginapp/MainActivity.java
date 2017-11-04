package loginapp.umkc.com.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private TextView SignIn;
    private TextView SignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SignUp = (TextView)findViewById(R.id.Join);
        SignIn = (TextView)findViewById(R.id.CheckIn);

        SignUp.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Intent intent3 = new Intent(MainActivity.this, SignUp.class);
            }
        });
        SignIn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Home = new Intent(MainActivity.this, Myaccount.class);
                startActivity(Home);
            }
        });

    }
}
