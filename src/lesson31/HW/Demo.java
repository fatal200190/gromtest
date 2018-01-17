package lesson31.HW;

public class Demo {
    public static void main(String[] args) throws Exception {
        String text = "text for counting words and letters : aa bb text for letters text";
        String text1 = null;
        String text2 = "";
        String text3 = "999";
        String text4 = "a b c dd aa bb";
        Solution solution = new Solution();
        System.out.println(solution.countSymbols(text));
        try {
            System.out.println(solution.countSymbols(text1));
        }catch (Exception e){
            System.out.println("null detected");
        }
        System.out.println(solution.countSymbols(text2));
        System.out.println(solution.countSymbols(text3));
        System.out.println(solution.countSymbols(text4));


        System.out.println(solution.words(text));
        try {
        System.out.println(solution.words(text1));
        }catch (Exception e){
            System.out.println("null detected");
        }
        System.out.println(solution.words(text2));
        System.out.println(solution.words(text3));
        System.out.println(solution.words(text4));

    }
}
