public class innerClasses {
    class innerOf{
        void innerMain(){
            System.out.println("this is inner class!!");
        }
    }
}

class MainClass{
    public static void main(String[] args){
        innerClasses obj = new innerClasses();
        innerClasses.innerOf objOne = obj.new innerOf();
        objOne.innerMain();
    }
}
