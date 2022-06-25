package regExExample;

public class ReplaceRegEx{


    public static void main(String[] args) {
        System.out.println("TEST");
    }
    public   static   String filterString(String   str)   throws   PatternSyntaxException   {
        String regEx= "[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？\\\\]";
        Pattern   p   =   Pattern.compile(regEx);
        Matcher   m   =   p.matcher(str);
        return   m.replaceAll("_").trim();
    }

}