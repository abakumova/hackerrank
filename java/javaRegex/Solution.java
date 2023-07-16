package javaRegex;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                var ip = scanner.next();
                System.out.println(ip.matches(MyRegex.PATTERN));
            }
        }
    }

    private static class MyRegex {
        private static final String PATTERN = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.(?!$)|$)){4}$";
    }
}