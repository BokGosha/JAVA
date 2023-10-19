package ru.mirea.lab7.String;

public class StringFunc implements StringInterf {
    public StringFunc(String str) {
        this.str = str;
    }

    private String str;

    public int count() {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }

        return count;
    }

    public String nechet() {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) {
                s = s + str.charAt(i);
            }
        }

        return s;
    }

    public String invert() {
        String s = "";
        for (int i = str.length() - 1; i > -1; i--) {
            s = s + str.charAt(i);
        }

        return s;
    }
}
