package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void buttonClickReplace(View view) {

        TextView out = (TextView) findViewById(R.id.output);
        TextView input = (TextView) findViewById(R.id.input);
        out.setText(Solution.shrink_space_v1(input.getText().toString()));

    }

    public void buttonClickFor(View view) {

        TextView out = (TextView) findViewById(R.id.output);
        TextView input = (TextView) findViewById(R.id.input);
        out.setText(Solution.shrink_space_v2(input.getText().toString()));

    }
    public void buttonClearClick(View view) {

        TextView input = (TextView) findViewById(R.id.input);
        input.setText(null);

    }
}