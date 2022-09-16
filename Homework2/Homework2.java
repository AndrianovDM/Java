// Задача №1

// Напишите программу, записывающую 100 раз слово ”ТЕST” в файл. 
// Слова должны чередоваться по формату – четная итерация большими буквами, 
// нечетные – маленькими Пример: TESTtestTESTtestTEST

// package Homework2;
// import java.util.logging.Logger;
// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;


// public class Homework2{
//     private static boolean createNewFile;
//     public static void main(String[] args) throws IOException {

//         File file = new File("Test.txt");
//         createNewFile = file.createNewFile();
//         FileWriter writer = new FileWriter(file); 
//         writer.write(word(100, "TEST", "test")); 
//         writer.flush();
//         writer.close();

//         Logger log = Logger.getAnonymousLogger();
//         log.info(word(100, "TEST", "test"));
//     }

//     private static String word(int n, String stringOne, String stringTwo) {
//         StringBuilder wd = new StringBuilder();
//         for (int i = 0; i < n; i++){
//             if (i%2==0){
//                 wd.append(stringOne);
//             }
//             else {
//                 wd.append(stringTwo);
//             }
//         }
//         return wd.toString();
//     } 
// }


// Задача №2

// Напишите программу, которая считает, распарсит и выведет в логгер заранее созданный файл с именами, 
// предметами и оценками студентов
// Формат строк в файле:
// Андрей 5
// Алена 5
// Игорь 4
// Формат вывода: Ученик %s получил сегодня %d.

// package Homework2;
// import java.util.logging.Logger;
// import java.io.BufferedReader;
// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.io.IOException;

// public class Homework2{
//     public static void main(String[] args) throws FileNotFoundException {
//         Logger log = Logger.getAnonymousLogger();
//         File doc = new File("C:\\Users\\Dmitry\\Downloads\\Postgraduate studies\\Homework program\\Java\\Homework2\\exempl.txt");
//         BufferedReader obj = new BufferedReader(new FileReader(doc));
//         String strng;
//         try {
//             while ((strng = obj.readLine()) != null){
//                 String name = strng.substring(0, strng.length()-1);
//                 Integer est = Integer.parseInt(String.valueOf(strng.charAt(strng.length()-1)));
//                 log.info(String.format("Ученик %sполучил сегодня %d", name, est));
//             } 
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }
