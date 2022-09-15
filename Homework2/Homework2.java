// Задача №1

// Напишите программу, записывающую 100 раз слово ”ТЕST” в файл. 
// Слова должны чередоваться по формату – четная итерация большими буквами, 
// нечетные – маленькими Пример: TESTtestTESTtestTEST

package Homework2;
import java.util.logging.Logger;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Homework2{
    private static boolean createNewFile;
    public static void main(String[] args) throws IOException {

        File file = new File("Test.txt");
        createNewFile = file.createNewFile();
        FileWriter writer = new FileWriter(file); 
        writer.write(word(100, "TEST", "test")); 
        writer.flush();
        writer.close();

        Logger log = Logger.getAnonymousLogger();
        log.info(word(100, "TEST", "test"));
    }

    private static String word(int n, String stringOne, String stringTwo) {
        StringBuilder wd = new StringBuilder();
        for (int i = 0; i < n; i++){
            if (i%2==0){
                wd.append(stringOne);
            }
            else {
                wd.append(stringTwo);
            }
        }
        return wd.toString();
    } 
}
