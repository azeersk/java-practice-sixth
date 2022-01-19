import java.lang.constant.DynamicCallSiteDesc;

class exceptionOf{
    public static void ExceptionA() throws ArithmeticException{
        throw new ArithmeticException("this is exception, by Zero");
    }
}


public class throwClass {
    public static void validVote(int age){
        if (age<18) {
            throw new ArithmeticException("your not eligible for vote!!");
        }
        else {
            System.out.println("your eligible for vote!!");
        }
    }

    public static void throwEx(){
        try{
            throw new ArithmeticException("program is error!");
        }
        catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
        System.out.println("rest the code is!!");
    }
    public static void main(String[] args) {
        int a = 19;
        validVote(a);
        throwEx();
        exceptionOf exceptionIs = new exceptionOf();
        try {
            exceptionIs.ExceptionA();
        }
        catch (Exception e){
            System.out.println("Exception is: "+ e.getMessage());
            System.out.println("Exception is : Arithmetic exception!");
        }
    }
}
