package ch.christen.elias.regex_matcher;

import java.util.regex.Pattern;
public enum Flag {
    NONE("NONE", Pattern.CASE_INSENSITIVE),CANON_EQ("CANON_EQ", Pattern.CANON_EQ), CASE_INSENSITIVE("CASE_INSENSITIVE", Pattern.CASE_INSENSITIVE), COMMENTS("COMMENTS", Pattern.COMMENTS), DOTALL("DOTALL", Pattern.DOTALL), LITERAL(
            "LITERAL", Pattern.LITERAL), MULTILINE("MULTILINE", Pattern.MULTILINE), UNICODE_CASE("UNICODE_CASE", Pattern.UNICODE_CASE), UNIX_LINES("UNIX_LINES", Pattern.UNIX_LINES);
    private final String flagName;
    private final int patternValue;

    Flag(final String flagName, final int patternValue) {
        this.flagName = flagName;
        this.patternValue = patternValue;
    }

    public int getPattern() {
        return patternValue;
    }

    public String getFlagName() {
        return flagName;
    }
}
