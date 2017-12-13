package ch.christen.elias.regex_matcher;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Christen on 13.12.2017.
 */

class RegexTestController extends AppCompatActivity {

    public void checkRegex() {
        if(checkIfTextFieldNotEmpty()){
            ListView textViewRegex = (ListView) findViewById(R.id.resultListBox);
            final List<String> fruits_list = new ArrayList<String>();

            // Create an ArrayAdapter from List
            final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                    (this, android.R.layout.simple_list_item_1, fruits_list);

            // DataBind ListView with items from ArrayAdapter
            textViewRegex.setAdapter(arrayAdapter);
            fruits_list.add("Loquat");
            arrayAdapter.notifyDataSetChanged();

        }
    }

    private boolean checkIfTextFieldNotEmpty() {
        TextView textViewRegex = (TextView) findViewById(R.id.regexTextBox);
        TextView textViewText = (TextView) findViewById(R.id.textTextBox);
        String textRegex=   textViewRegex.getText().toString();
        String textText=   textViewText.getText().toString();
        return !textRegex.isEmpty()&& !textText.isEmpty();
    }


}
