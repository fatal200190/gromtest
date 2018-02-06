package lesson34.HW;

public class Demo {
    public static void main(String[] args) throws Exception {
//        SolutionSentence solutionSentence = new SolutionSentence();
//        solutionSentence.transferSentences("C:\\Users\\Alex\\Desktop\\test.txt", "C:\\Users\\Alex\\Desktop\\test1.txt", "test");
//        SolutionWithDelete solutionWithDelete = new SolutionWithDelete();
//        solutionWithDelete.transferFileContent("C:\\Users\\Alex\\Desktop\\test.txt", "C:\\Users\\Alex\\Desktop\\test1.txt");
        SolutionStandardMethods solutionStandardMethods = new SolutionStandardMethods();
        solutionStandardMethods.copyFileContent("C:\\Users\\Alex\\Desktop\\test.txt", "C:\\Users\\Alex\\Desktop\\test1.txt");
        //solutionStandardMethods.copyFileContentApacheIO("C:\\Users\\Alex\\Desktop\\test.txt", "C:\\Users\\Alex\\Desktop\\test1.txt");
    }
}
