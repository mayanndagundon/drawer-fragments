package com.fragments.drawer.dagundon.drawer_fragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;


public class ToggleDemoFragment extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_toggle_demo);

        getSupportActionBar().setTitle("Toggle Demo");

        ToggleButton toggleButton = findViewById(R.id.toggle_button);
        SwitchCompat toggleSwitch = findViewById(R.id.toggle_switch);

        toggleButton.setOnCheckedChangeListener(this);
        toggleSwitch.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        int id = buttonView.getId();
        String messsage = "";

        switch (id){
            case R.id.toggle_button:
                messsage = isChecked ? "Toggle Button is on" : "Toggle Button is off";
                break;

            case R.id.toggle_switch:
                messsage = isChecked ? "Switch is on" : "Switch is off";
                break;
        }

        Toast.makeText(this, messsage, Toast.LENGTH_SHORT).show();
    }
    }
}
