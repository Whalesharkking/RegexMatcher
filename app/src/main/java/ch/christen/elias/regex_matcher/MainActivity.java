package ch.christen.elias.regex_matcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fillDropDown();
        checkIfButtonClicked();



    }

    private void checkIfButtonClicked() {
        final Button button = findViewById(R.id.checkButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               new RegexTestController().checkRegex();
            }
        });
    }

    private void fillDropDown() {
        Spinner s = findViewById(R.id.dropdownFlag);
        Flag[] values = Flag.values();
        List<String> stringList = new ArrayList<>();
        stringList.add("None");
        for (int i = 0; i <= Flag.values().length - 1; i++) {
            stringList.add(values[i].getFlagName());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, stringList);
        s.setAdapter(adapter);
    }



}
