package com.example.a15301068.searchgoogle;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        TextView textView = findViewById(R.id.textView);

        Intent intent = getIntent();
        final String str = intent.getStringExtra("location");
        textView.setText(str);

        Button btnGo = findViewById(R.id.button2);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TextView textView1 = findViewById(R.id.textView);
                Uri uri = Uri.parse("http://www.google.com/#q=" + str);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}
