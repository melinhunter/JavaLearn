package lab.java8;

public class ExceptionTest {
    public static void main(String[] args) {
        try{
            throw new ExceptionB("b");
        }
        catch(ExceptionA e){
            System.out.println("ExceptinA");
        }
//        catch(ExceptionB e){
//            System.out.println("ExceptinB");
//f        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}
