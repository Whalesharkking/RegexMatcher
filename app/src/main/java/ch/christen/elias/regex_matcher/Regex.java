package ch.christen.elias.regex_matcher;

import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by Christen on 13.12.2017.
 */

class Regex {
    private TextView textViewText;
    private TextView textViewRegex;
    private Spinner spinnerDropdown;
    private ListView listViewResult;
    public Regex(TextView textViewText, TextView textViewRegex, Spinner spinnerDropdown, ListView listViewResult) {
        this.textViewRegex=textViewRegex;
        this.textViewText=textViewText;
        this.spinnerDropdown=spinnerDropdown;
        this.listViewResult=listViewResult;
    }

    public Spinner getSpinnerDropdown() {
        return spinnerDropdown;
    }

    public TextView getTextViewRegex() {
        return textViewRegex;
    }

    public TextView getTextViewText() {
        return textViewText;
    }
    public String getRegexText(){
        return textViewRegex.getText().toString();
    }
    public String getTextText(){
        return textViewText.getText().toString();
    }
    public Flag getSelectedFlag(){
       return Flag.valueOf(spinnerDropdown.toString());
    }

    public ListView getListViewResult() {
        return listViewResult;
    }
}
