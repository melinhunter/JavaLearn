package regExExample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTester {
    public static void main(String[] args) {
        String emailRegex = "^(.+)@(.+).(.+)$";
        Pattern emailPattern = Pattern.compile(emailRegex);
        String email = "melin@google.com.tw";

        Matcher emailMatcher = emailPattern.matcher(email);
        if(emailMatcher.matches()){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
