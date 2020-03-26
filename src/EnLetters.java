import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//upl

//checking github
//adding one more comment
public class EnLetters {

    public static int enLettersCount(ArrayList<Character> list) {
        List<Character> arr_en = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');  //eng Alphabet
        int count = 0;

        for (Character c : list) {
            for (Character inner : arr_en) {
                if (c.equals(inner)) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {

        String fileName = "C:\\JavaRushTasks\\est.txt"; // fileName here
        InputStream is = new ByteArrayInputStream(fileName.getBytes());
        System.setIn(is);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        reader.close();
        ArrayList<Character> letters = new ArrayList<>();

        while (fis.available() > 0) {   //filling list with symbols from file
            letters.add((char) fis.read());
        }

        fis.close();
        System.out.println(enLettersCount(letters));
    }
}
