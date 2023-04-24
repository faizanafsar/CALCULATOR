package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class CheckBoxAndRadioButton extends AppCompatActivity implements CheckBox.OnCheckedChangeListener, RadioGroup.OnCheckedChangeListener {

    String items []= new String[]{"red", "green", "blue","mycolor"};

    CheckBox  boldStyle, italicStyle;
RadioGroup radioGrp;
RadioButton rd30, rd40, rd50;
Spinner spinner;
TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_and_radio_button);
        boldStyle = (CheckBox) findViewById(R.id.Bold);

        italicStyle =(CheckBox) findViewById(R.id.Italic);
        radioGrp = (RadioGroup) findViewById(R.id.radiogroup);
        rd30 = (RadioButton)  findViewById(R.id.size30);
        rd40 = (RadioButton)  findViewById(R.id.size40);
        rd50 = (RadioButton)  findViewById(R.id.size50);
        display = (TextView) findViewById(R.id.textStyle);


        boldStyle.setOnCheckedChangeListener(this);
        italicStyle.setOnCheckedChangeListener(this);
        radioGrp.setOnCheckedChangeListener(this);
        rd30.setOnCheckedChangeListener(this);
        rd40.setOnCheckedChangeListener(this);
        rd50.setOnCheckedChangeListener(this);

        // for spinner
        spinner = (Spinner) findViewById(R.id.spinnercolor);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,items);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long id) {
                if (i==0){
                    display.setTextColor(Color.RED);
                }
                if (i==1){
                    display.setTextColor(Color.GREEN);
                }
                if (i==2){
                    display.setTextColor(Color.BLUE);
                }
                if (i==3){
                    display.setTextColor(getResources().getColor(R.color.light_Green));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (boldStyle.isChecked()){
            if (italicStyle.isChecked()){
                display.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD_ITALIC));


            }else {
                display.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            }} else {
                if (italicStyle.isChecked()) {
                    display.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));


                } else {
                    display.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));

                }
                }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int i) {
    if (rd30.isChecked()){
        display.setTextSize(30);
    } if (rd40.isChecked()) {
            display.setTextSize(40);
        }    if (rd50.isChecked()) {
                display.setTextSize(50);

    }
    }
}