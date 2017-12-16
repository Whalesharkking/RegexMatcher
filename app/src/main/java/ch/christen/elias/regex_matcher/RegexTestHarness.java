package ch.christen.elias.regex_matcher;

import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

class RegexTestHarness {
    private Regex regex;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> arrayList;
    private RegexTestController controller;

    RegexTestHarness(Regex regex, ArrayList<String> arrayList, ArrayAdapter<String> adapter) {
        this.regex = regex;
        this.arrayList = arrayList;
        this.adapter = adapter;
    }

    void checkRegex() {
        if (checkIfTextFieldNotEmpty()) {
            controller = new RegexTestController(regex);
            List<String> resultList = controller.createPatternAndTestRegex();
            addResultToResultListView(resultList);
        }
    }

    private void addResultToResultListView(List<String> resultList) {
        adapter.clear();
        if (resultList.isEmpty()) {
            resultList.add("No match found!");
        }
        arrayList.addAll(resultList);
        adapter.notifyDataSetChanged();
    }


    private boolean checkIfTextFieldNotEmpty() {
        return !regex.getRegexText().isEmpty() && !regex.getTextText().isEmpty();
    }

}
