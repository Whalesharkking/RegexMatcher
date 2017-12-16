package ch.christen.elias.regex_matcher;


import android.widget.Spinner;
import android.widget.TextView;


class Regex {
    private TextView textViewText;
    private TextView textViewRegex;
    private Spinner spinnerDropdown;

     Regex(TextView textViewText, TextView textViewRegex, Spinner spinnerDropdown) {
        this.textViewRegex=textViewRegex;
        this.textViewText=textViewText;
        this.spinnerDropdown=spinnerDropdown;

    }


     String getRegexText(){
        return textViewRegex.getText().toString();
    }
     String getTextText(){
        return textViewText.getText().toString();
    }
     String getSelectedFlag(){

       return spinnerDropdown.getSelectedItem().toString();
    }


}
