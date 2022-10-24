package com.example.lecture4_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sentIntent(View view) {

    }

    public void onToggleButtonClicked(View view) {
        boolean on = ((ToggleButton) view).isChecked();
        if (on) {
        } else {

        }
    }

    public void onSwitchClicked(View view) {
        boolean on = ((Switch) view).isChecked();
        if (on) {

        } else {

        }
    }


    public void onCheckboxClicked(View view) {
        boolean checked=((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.checkBox_milk:
                if (checked) {

                } else {

                }
            case R.id.checkBox_sugar:
                if (checked) {

                } else {

                }
                break;
        }
    }

    public void onRadioButtonClicked(View view){
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        int id = radioGroup.getCheckedRadioButtonId();
        switch (id){
            case R.id.radio_cavemen:
                break;
            case R.id.radio_astronauts:
                break;
        }
        if(id==-1){

        }else{
            RadioButton radioButton=findViewById(id);
        }

    }
    public void onImageButtonClicked(View view){

    }
}