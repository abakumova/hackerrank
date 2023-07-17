package tagContentExtractor;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("<([^>]+)>([^<]+)</\\1>");

        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());
            while (testCases-- > 0) {
                String line = in.nextLine();
                Matcher m = p.matcher(line);
                boolean found = false;

                while (m.find()) {
                    System.out.println(m.group(2));
                    found = true;
                }
                if (!found) {
                    System.out.println("None");
                }
            }
        }
    }
}
