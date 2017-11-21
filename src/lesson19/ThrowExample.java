package lesson19;

/**
 * Created by Alex on 06.11.2017.
 */
public class ThrowExample {
    private static String[] array = {"test", "test1", null, "adsasf", "sdfsdf"};

    public static void main(String[] args) {
        //test();

        useOfTestMethod();

    }

    private static void test() throws Exception{
        for (String element : array) {
            if (element == null)
                throw new Exception("null is detected");
        }
        System.out.println("done");
    }

    private static void useOfTestMethod(){
        try {
            //some code
            test();
            //some code
        }catch (Exception e){
            System.out.println("error: " + e.getMessage());
        }

    }
}

