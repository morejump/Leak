package com.example.huynh.leak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText nameEditText;
    private EditText ageEditText;
    private Button saveButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = (EditText) findViewById(R.id.name_et);
        ageEditText = (EditText) findViewById(R.id.age_et);
        saveButton = (Button) findViewById(R.id.save_button);
       saveButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this,ListActivity.class);
        switch (view.getId()) {
            case R.id.save_button:
                if(!nameEditText.getText().toString().isEmpty() && !ageEditText.getText().toString().isEmpty()
                      ) {

                    bundle.putString("name",nameEditText.getText().toString());
                    bundle.putString("age",ageEditText.getText().toString());

                    intent.putExtras(bundle);
                    startActivity(intent);
                } else {
                    Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
