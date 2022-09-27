// package Seminar5;

// import java.util.HashMap;
// import java.util.Map;

// Дана последовательность чисел. Необходимо вернуть сумму уникальных чисел
// Пример 1: In: arr = [3, 2, 2] Out: 3
// Пример 2: In: arr = [1,] Out: 1
// Пример 3: In: arr = [1, 1] Out: 0


// public class Seminar5 {
//     public static void main(String[] args) {
//         int[] a = new int[] {4,3,2,2};
//         Map<Integer,Integer> dic = new HashMap<>();
//         for (Integer i : a) {
//             if (dic.containsKey(i)){
//                 dic.put(i, dic.get(i)+1);
//             }
//             else{
//                 dic.put(i, 1);
//             }
//     }
// int sum = 0;
// for (int i:dic.keySet()) {
//     if (dic.get(i)==1){
//         sum += i;
//     }
// }
// System.out.println(sum);
// }
// }

// Дана последовательность чисел. Необходимо вернуть число совпадающих пар в этой последовательности
// Пример 1: In: arr = [1, 2] Out: 0
// Пример 2: In: arr = [1, 1, 2] Out: 1
// Пример 3: In: arr = [1, 1, 1] Out: 3
// Пример 4: In: arr = [1, 1, 1, 2, 2] Out: 4


// package Seminar5;

// import java.util.Arrays;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;
// import java.util.logging.Logger;

// public class Seminar5 {
//     public static void main(String[] args) {
//         Logger logger = Logger.getAnonymousLogger();
//         logger.info(String.valueOf(numIdenticalPairs(Arrays.asList(1,1,1,2,2))));
//     }

//     private static int numIdenticalPairs(List<Integer> list) {
//         Map<Integer, Integer> map = new HashMap<>();
//         int answer = 0, temp;
//         for (int number : list) {
//             if (map.containsKey(number)){
//                 temp= map.get(number);
//                 answer += temp;
//                 map.put(number, temp + 1);
//             } else {
//                 map.put(number, 1);
//             }
//         }
//         return answer;
//     }
// }
    

// Вам дан массив путей, где пути[i] = [”Город А”, “Город Б”] означают, что существует прямой путь, 
// идущий от ”Город А” до“Город Б”. Верните город назначения, то есть город без какого-либо пути, 
// ведущего в другой город.
// Пример 1: Input: s = [["Москва","Самара"], ["Курск","Пенза"],["Самара","Курск"]] Output: Пенза
// Пример 2: Input: s = [["Москва","Самара"]] Output: Самара

// package Seminar5;
// import java.util.HashMap;
// import java.util.Map;

// public class Seminar5 {
//     public static void main(String[] args) {
//         String[][] a= new String[3][2];
//         Map<String, String> dic = new HashMap<String, String>();
//         {
//             a[0][0] = "Moscow";
//             a[0][1] = "Samara";
//             a[1][0] = "Kursk";
//             a[1][1] = "Penza";
//             a[2][0] = "Samara";
//             a[2][1] = "Kursk";
//             for (int i=0; i<a.length; i++) {
//                 dic.put(a[i][0], a[i][1]);
//             }
//             for (String s : dic.values()) {
//                 if (!(dic.containsKey(s))){
//                     System.out.println(s);
//                 }
//             }
//         }
//     }
// }