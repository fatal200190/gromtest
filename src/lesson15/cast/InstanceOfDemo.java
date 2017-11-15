package lesson15.cast;

/**
 * Created by Alex on 12.10.2017.
 */
public class InstanceOfDemo {
    public static void main(String[] args) {
        Provider provider = new Provider();
        InternetProvider internetProvider = new InternetProvider();
        FoodProvider foodProvider = new FoodProvider();

        System.out.println(provider instanceof Provider);
        System.out.println(provider instanceof InternetProvider);
        System.out.println(provider instanceof FoodProvider);
        System.out.println(internetProvider instanceof InternetProvider);

        if(test() instanceof InternetProvider){
            //
        }else if(test() instanceof FoodProvider){
            //
        }
    }
    private static Provider test (){
        //logic

        return new InternetProvider();
    }
}
