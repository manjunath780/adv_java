public class NewRunner  {
    public static void main(String[] args)  {
        System.out.println("main started");

        method1();

        System.out.println("main ended");
    }
    private static void method1 () throws NullPointerException {
        System.out.println("method1 started");
        method2();
        System.out.println("method1 ended");
    }

    private static void method2() throws NullPointerException{
        System.out.println("method2 started");
        method3();
        System.out.println("method2 ended");
    }

    private static void method3() throws NullPointerException{
        System.out.println("method3 started");
        String in = null;
        try{
        System.out.println(in.length());
       }catch (NullPointerException e){}
        System.out.println("method3 ended");
    }

}
