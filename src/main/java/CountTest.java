import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CountTest {
    public static void main(String[] args) throws IOException {
        String file = "d:/Project/src/main/java/Test.java";
//        countWord countWord = new countWord(file,"public");
//        CountTest.countWord(file,"public");
        int i = CountTest.countWord(file, "public");
        System.out.println(i);
    }

    private static int countWord(String file, String string) throws IOException {

        int count = 0;
        FileReader fileReader = new FileReader(file);
        int c = fileReader.read();
        while (c != -1) {
            while (c == string.charAt(0)) {
                for (int i = 1; i < string.length(); i++) {
                    c = fileReader.read();
                    if (c != string.charAt(i))
                        break;
                    if (c == string.length() - 1)
                        count++;
                }
            }
        }
        fileReader.close();
        return count;
    }

}




