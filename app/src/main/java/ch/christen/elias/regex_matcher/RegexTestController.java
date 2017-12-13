package ch.christen.elias.regex_matcher;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;



class RegexTestController  {
    private Regex regex;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> arrayList;

     RegexTestController(Regex regex, ArrayList<String> arrayList, ArrayAdapter<String> adapter) {
        this.regex = regex;
        this.arrayList=arrayList;
        this.adapter=adapter;
    }

    void checkRegex() {
        if (checkIfTextFieldNotEmpty()) {
            arrayList.add("hallo");
            // next thing you have to do is check if your adapter has changed
            adapter.notifyDataSetChanged();
        }
    }

    private boolean checkIfTextFieldNotEmpty() {
        return !regex.getRegexText().isEmpty() && !regex.getTextText().isEmpty();
    }


}
