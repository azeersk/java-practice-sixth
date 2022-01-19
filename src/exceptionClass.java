public class exceptionClass {
    public static void main(String[] args){
        try{
            System.out.println(12);
            System.out.println(23);
            System.out.println(2);
            System.out.println(10/0);

        }catch (Exception e){
            System.out.println("exception: "+ e);
            System.out.println(43);
            System.out.println(98);
        }

        try{
            //array[6] = 23;
            int[] array = new int[5];
            array[10] = 12;
            System.out.println(12/0);
        }
        catch (ArithmeticException a){
            System.out.println(a);

        }
        catch (ArrayIndexOutOfBoundsException AI){
            System.out.println(AI);


        }
        catch (Exception e){
            System.out.println(e);

        }

        System.out.println("Rest of the code executed!!");
    }
}
