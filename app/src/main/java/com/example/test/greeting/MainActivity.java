package com.example.test.greeting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    Button b1;
    TextView t1;
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.greet);
        t1 = (TextView) findViewById(R.id.lookHere);
        e1 = (EditText) findViewById(R.id.editText);
        t1.setTextSize(t1.getTextSize()/2);
        b1.setOnClickListener(greetByTime);
    }

    private View.OnClickListener greetByTime = new View.OnClickListener() {
        public void onClick(View v) {
            Date date = new Date();
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            int hour = cal.get(Calendar.HOUR_OF_DAY);

            if (hour > 6 && hour < 12) {
                t1.setText("Good Morning! " + e1.getText());
            } else if (hour >= 12 && hour < 17)
                t1.setText("Good Afternoon! " + e1.getText());
            else if (hour >= 17 && hour < 21)
                t1.setText("Good Evening! " + e1.getText());
            else
                t1.setText("Good Night! " + e1.getText());
        }

    };
}
