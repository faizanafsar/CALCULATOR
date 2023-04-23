package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText numE1, numE2;
    Button addBtn, subBtn, mulBtn;
    TextView resultView;
    int n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numE1 = (EditText) findViewById(R.id.editText1);
        numE2 = (EditText) findViewById(R.id.editText2);

        addBtn = (Button) findViewById(R.id.addButton);
        addBtn.setOnClickListener(this);
        mulBtn = (Button) findViewById(R.id.mulButton);
        subBtn.setOnClickListener(this);
        subBtn = (Button) findViewById(R.id.subButton);
        subBtn.setOnClickListener(this);
        resultView = (TextView) findViewById(R.id.resultTV);

    }

    @Override
    public void onClick(View view) {
        n1 = Integer.parseInt(numE1.getText().toString());
        n2 = Integer.parseInt(numE2.getText().toString());
        switch (view.getId()){
            case R.id.addButton:
                resultView.setText("answer is "+ (n1 + n2));
                break;
            case R.id.subButton:
                resultView.setText("answer is "+ (n1 - n2));
                break;
            case R.id.mulButton:
                resultView.setText("answer is "+ (n1 * n2));
                break;
            default:
                break;

        }

    }
}