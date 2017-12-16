package ch.christen.elias.regex_matcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private ListView list;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fillDropDown();
        checkIfButtonClicked();
        list = findViewById(R.id.resultListBox);
        arrayList = new ArrayList<>();
        adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, arrayList);
        list.setAdapter(adapter);
    }

    private void checkIfButtonClicked() {
        final Button button = findViewById(R.id.checkButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView textViewText = findViewById(R.id.textTextBox);
                TextView textViewRegex = findViewById(R.id.regexTextBox);
                Spinner spinnerDropdown = findViewById(R.id.dropdownFlag);
                new RegexTestHarness(new Regex(textViewText, textViewRegex, spinnerDropdown), arrayList, adapter).checkRegex();

            }
        });
    }

    private void fillDropDown() {
        Spinner s = findViewById(R.id.dropdownFlag);
        Flag[] values = Flag.values();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i <= Flag.values().length - 1; i++) {
            stringList.add(values[i].getFlagName());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, stringList);
        s.setAdapter(adapter);
    }


}
