package com.example.vectordraftapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double magnitudeNumber = 0;
    double angleNumber = 0;
    double quadrant = 0;

    EditText magNumb;
    EditText angleNum;
    EditText quadrantNum;

    TextView xDisplay, yDisplay;


    Button buttonSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        magNumb = (EditText) findViewById(R.id.magNumb);
        angleNum = (EditText) findViewById(R.id.angleNum);
        quadrantNum = (EditText) findViewById(R.id.quadrantNum);
        xDisplay = (TextView)findViewById(R.id.xDisplay);
        yDisplay = (TextView)findViewById(R.id.yDisplay);
    }

    public void submitAllInfo(View view){

        double xCoord = 0;
        double yCoord = 0;

        double xIs = 0;

        magnitudeNumber = Double.valueOf(magNumb.getText().toString());

        angleNumber = Double.valueOf(angleNum.getText().toString());

        quadrant = Double.valueOf(quadrantNum.getText().toString());

        if(quadrant == 1){
            if(angleNumber == 60){
                xIs = magnitudeNumber/2;
                xCoord = xIs * Math.sqrt(3);
                yCoord = xIs;
            }
            if(angleNumber == 30){
                xIs = magnitudeNumber/2;
                xCoord = xIs;
                yCoord = xIs * Math.sqrt(3);
            }
            //45 below
            if(angleNumber == 45){
                xIs = magnitudeNumber/Math.sqrt(2);
                xCoord = xIs;
                yCoord = xIs;
            }
        }
        else if(quadrant == 2){
            if(angleNumber == 60){
                xIs = magnitudeNumber/2;
                xCoord = -1* (xIs * Math.sqrt(3));
                yCoord = xIs;
            }
            if(angleNumber == 30){
                xIs = magnitudeNumber/2;
                xCoord = -1*(xIs);
                yCoord = xIs * Math.sqrt(3);
            }
            if(angleNumber == 45){
                xIs = magnitudeNumber/Math.sqrt(2);
                xCoord = -1*(xIs);
                yCoord = xIs;
            }
        }
        else if(quadrant == 3){
            if(angleNumber == 60){
                xIs = magnitudeNumber/2;
                xCoord = -1* (xIs * Math.sqrt(3));
                yCoord = -1*(xIs);
            }
            if(angleNumber == 30){
                xIs = magnitudeNumber/2;
                xCoord = -1*(xIs);
                yCoord = -1*(xIs * Math.sqrt(3));
            }
            if(angleNumber == 45){
                xIs = magnitudeNumber/Math.sqrt(2);
                xCoord = -1*(xIs);
                yCoord = -1*(xIs);
            }
        }
        else if(quadrant == 4){
            if(angleNumber == 60){
                xIs = magnitudeNumber/2;
                xCoord = xIs * Math.sqrt(3);
                yCoord = -1*(xIs);
            }
            if(angleNumber == 30){
                xIs = magnitudeNumber/2;
                xCoord = xIs;
                yCoord = -1*(xIs * Math.sqrt(3));
            }
            if(angleNumber == 45){
                xIs = magnitudeNumber/Math.sqrt(2);
                xCoord = xIs;
                yCoord = -1*(xIs);
            }
        }

        String xStr = Double.toString(xCoord);
        String yStr = Double.toString(yCoord);

        xDisplay.setText("x: " + xStr);
        yDisplay.setText("y: " + yStr);
    }
}
