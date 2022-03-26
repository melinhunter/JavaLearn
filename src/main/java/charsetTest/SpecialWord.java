package charsetTest;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class SpecialWord {
    public static void main(String[] args) throws Exception {

        String words = "中文王榺生";
        for(String k : Charset.availableCharsets().keySet()){
            System.out.println("<<<<<<<<<<<<<<<<<<<<");
            System.out.println(k);
            try {
                String a = new String(words.getBytes(), k);
                System.out.println(a);
                String b = new String(a.getBytes(k), "x-windows-950");
                System.out.println(b);
                String c = new String(b.getBytes("x-windows-950"), k);
                System.out.println(c);
                String d = new String(c.getBytes(k));
                System.out.println(d);

            }
            catch(Exception e){
                e.printStackTrace();
            }
            System.out.println(">>>>>>>>>>>>>>>>>>>>");
        }

        //String words = "中文王榺生";
        words = "展碁中文王榺生";
        for(char c : words.toCharArray()) {
            System.out.println(c + "--");
            String s = String.valueOf(c);
            String s1 = new String(s.getBytes(StandardCharsets.UTF_8), "8859_1");
            System.out.println(s1);
            String s3 = new String(s1.getBytes("8859_1"), "MS950");
            System.out.println(s3);
            s3 = new String(s3.getBytes("MS950"), "8859_1");
            System.out.println(s3);
            String s2 = new String(s3.getBytes("8859_1"),"UTF-8");
            System.out.println(s2);

            System.out.println();
            System.out.println();

        }

    }
}
