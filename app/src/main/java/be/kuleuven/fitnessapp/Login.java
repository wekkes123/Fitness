package be.kuleuven.fitnessapp;
//...
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    private TextView LoginLogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LoginLogo = (TextView) findViewById(R.id.LoginLogo);
        LoginLogo.bringToFront();
    }
}