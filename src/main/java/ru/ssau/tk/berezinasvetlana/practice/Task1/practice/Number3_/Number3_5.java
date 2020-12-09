package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number3_;

import java.util.Objects;

public class Number3_5 {
    static boolean differentStr(String _1str, String _2str) {
        return !Objects.equals(null, _1str) && !Objects.equals(null, _2str)
                && !_1str.equals(_2str)
                && _1str.equalsIgnoreCase(_2str);
    }
}
