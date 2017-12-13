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

/**
 * Created by Christen on 13.12.2017.
 */

class RegexTestController {
    Regex regex;
    public RegexTestController(Regex regex) {
        this.regex = regex;
    }

    public void checkRegex() {
        if (checkIfTextFieldNotEmpty()) {


        }
    }

    private boolean checkIfTextFieldNotEmpty() {
        return !regex.getRegexText().isEmpty() && !regex.getTextText().isEmpty();
    }


}
