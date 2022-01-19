public class finallyClass {
    public static void main(String[] args){
        try{
            int a = 45;
            System.out.println("try block executed!!");
            int[] arrayOne = new int[5];
            arrayOne[6] = a;
        }
        catch (ArithmeticException AE){
            System.out.println("Arithmetic Exception: "+AE);
        }
        catch (ArrayIndexOutOfBoundsException A){
            System.out.println("Array index: "+A);
        }
        finally {
            System.out.println("Finally block is executed!!");
        }
        System.out.println("Rest code is executed!!");

    }
}
