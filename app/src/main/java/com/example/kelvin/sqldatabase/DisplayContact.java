package com.example.kelvin.sqldatabase;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DisplayContact extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_contact);
    }

    public void run(View view) {
        Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_SHORT).show();
    }
}
