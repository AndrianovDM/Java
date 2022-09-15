// // import java.util.Scanner;
// import java.util.logging.Logger;

// public class Seminar2{
//     public static void main(String[] args) {

//         Logger l = Logger.getAnonymousLogger();
//         String str = "ab";
//         l.info(concat(2, str));
        
//     }
//     private static String concat(int n, String string){
//         StringBuilder sb = new StringBuilder();
//         for (int i = 0; i < n; i++){
//             sb.append(string);
//         }
//         return sb.toString();

//     } 
// }
    
// jewels = "aB", stones = "aaaAbbB"
// результат в консоль "a3B1"

// import java.util.Scanner;
// import java.util.logging.Logger;

// public class Seminar2{
//     public static void main(String[] args) {

//         Logger l = Logger.getAnonymousLogger();

//         l.info(search("aB","aaaBaAbbbB"));
        
//     }
//     private static String search(String jewels, String stones){
//         int counter;
//         StringBuilder sb = new StringBuilder();
//         for(char c1: jewels.toCharArray()){
//             counter = 0;
//             for(char c2: stones.toCharArray()){
//                 if (c1 == c2){
//                     counter++;
//                 }
//             }
//             sb.append(c1).append(counter);
//         }
//         return sb.toString();
//     } 
// }

// import java.util.Scanner;
// import java.util.logging.Logger;
// import java.io.File;
// import java.io.FileWriter;
// import java.io.Writer;

// public class Seminar2{
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         byte b = scan.nextByte();
//         Logger l = Logger.getAnonymousLogger();
//         try (FileWriter wr = new FileWriter("results.txt",false)){
//             wr.write(String.valueOf(b));
//             wr.flush();
//         }
//         catch (Exception ex)
//         {
//             l.warning(ex.getMessage());
//         }
//     }
// }