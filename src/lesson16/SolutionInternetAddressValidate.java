package lesson16;

/**
 * Created by Alex on 30.10.2017.
 */
public class SolutionInternetAddressValidate {

    public boolean validate (String adress){
        if(adress == null || adress.isEmpty())
            return false;

        adress = adress.trim();
        if (!adress.startsWith("http://") && !adress.startsWith("https://"))
            return false;

        if (!adress.endsWith(".com") && !adress.endsWith(".net") && !adress.endsWith(".org"))
            return false;

        adress = adress.replaceAll("www." , "");

        adress = adress.replaceAll("http://" , "");
        adress = adress.replaceAll("https://" , "");
        adress = adress.replaceAll(".com" , "");
        adress = adress.replaceAll(".net" , "");
        adress = adress.replaceAll(".org" , "");

        return checker(adress);
    }

    private static boolean checker (String inputWord){
        for (int i=0; i < inputWord.length(); i++){
            if(!Character.isLetterOrDigit(inputWord.charAt(i)))
                return false;
        }
        return true;
    }

}
