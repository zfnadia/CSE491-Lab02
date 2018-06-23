package com.example.a15301068.searchgoogle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnGo = findViewById(R.id.button);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                EditText etLocation = findViewById(R.id.editText);
                Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                intent.putExtra("location", etLocation.getText().toString());
                startActivity(intent);
                }
        });
    }
}