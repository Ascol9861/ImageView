package com.example.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private RadioButton rdoSingle, rdoDay, rdoNight;
    private ImageView imgOutput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdoSingle = findViewById(R.id.rdoSingle);
        rdoDay = findViewById(R.id.rdoDay);
        rdoNight = findViewById(R.id.rdoNight);
        imgOutput = findViewById(R.id.imgOutput);

        rdoSingle.setOnClickListener(this);
        rdoDay.setOnClickListener(this);
        rdoNight.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.rdoSingle:
//                Toast toast = Toast.makeText(this,"Single", Toast.LENGTH_LONG);
//                toast.show();
                imgOutput.setImageResource(R.drawable.single);
                break;

            case R.id.rdoDay:
//                Toast toast1 = Toast.makeText(this,"Day", Toast.LENGTH_SHORT);
//                toast1.show();
                imgOutput.setImageResource(R.drawable.day);
                break;

            case R.id.rdoNight:
//                Toast toast2 = Toast.makeText(this,"Night", Toast.LENGTH_LONG);
//                toast2.show();
                imgOutput.setImageResource(R.drawable.night);
                break;

        }
    }
}
