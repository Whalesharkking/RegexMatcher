package ch.christen.elias.regex_matcher;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class RegexTestController {
    private String textFlag;
    private String textRegex;
    private String textString;

    RegexTestController(Regex regex) {
        this.textFlag = regex.getSelectedFlag();
        this.textRegex = regex.getRegexText();
        this.textString = regex.getTextText();
    }

    List<String> createPatternAndTestRegex() {
        try {
            if (!textFlag.contains("NONE")) {
                for (final Flag flags : Flag.values()) {
                    if (flags.getFlagName().equals(textFlag.toUpperCase())) {
                        return createMatcherAnfFindMatches(textString, Pattern.compile(textRegex, flags.getPattern()));
                    }
                }
            } else {
                return createMatcherAnfFindMatches(textString, Pattern.compile(textRegex));
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private List<String> createMatcherAnfFindMatches(final String text, final Pattern pattern) {

        return matcherFind(pattern.matcher(text));
    }

    private List<String> matcherFind(final Matcher matcher) {
        final List<String> matcherList = new ArrayList<>();

        while (matcher.find()) {
            matcherList.add("I found the text:");
            matcherList.add(matcher.group());
            matcherList.add("Start Index:");
            matcherList.add(matcher.start() + "");
            matcherList.add("Ending Index");
            matcherList.add(matcher.end() + "");

        }

        return matcherList;
    }
    // private String getResults(final Matcher matcher) {
    //   return "I found the text " + matcher.group() + " starting at index " + matcher.start() + " and ending at index " + matcher.end();
    //}
}
