// Дан Deque состоящий из последовательности цифр. Необходимо проверить, что последовательность 
// цифр является палиндромом

// Пример 1:Ввод: d1 = [0] Вывод: true
// Пример 2:Ввод: d1 = [1, 2, 1] Вывод: true
// Пример 3:Ввод: d1 = [1, 2, 1, 2] Вывод: false


// package Seminar4;

// import java.util.Arrays;
// import java.util.Deque;
// import java.util.LinkedList;
// public class Seminar4 {
//     public static void main(String[] args){
//         Deque<Integer> d1 = new LinkedList<>(Arrays.asList(3,1,0,1,3));
//         System.out.println(isPalindrom(d1));
//     }
//     private static boolean isPalindrom(Deque<Integer> d1){
//         while(d1.size() > 1){
//             if(d1.peekFirst()==d1.getLast()){
//                 d1.pollFirst();
//                 d1.peekLast();
//             }
//             else {
//                 return false;
//             }
//     }
//     return true;
// }
// }


// Даны два Deque представляющие два неотрицательных целых числа. 
// Цифры хранятся в обратном порядке, и каждый из их узлов содержит одну цифру. 
// Сложите два числа и верните сумму в виде связанного списка.
// Пример 1:Ввод: d1 = [3,2,1] d2 = [6,4,5] Вывод: ”[9,6,6]”
// Пример 2:Ввод: d1 = [1,1,1,1] d2 = [9,9] Вывод: ”[0,1,2,1]”

// package Seminar4;
// import java.util.Arrays;
// import java.util.Deque;
// import java.util.LinkedList;
// public class Seminar4 {
//     public static void main(String[] args){
//         Deque<Integer> ll1 = new LinkedList<>();
//         ll1.addAll(Arrays.asList(1, 1, 1, 1));
//         Deque<Integer> ll2 = new LinkedList<>();  
//         ll2.addAll(Arrays.asList(9, 9));

//         Deque<Integer> result = new LinkedList<>();

//         int temp, ten = 0;
//         while(ll1.peek() != null || ll2.peek() != null){
//             temp = 0;
//             if (ll1.peek() != null){
//                 temp = ll1.poll();
//             }
//             if (ll2.peek() != null){
//                 temp = temp + ll2.poll();
//             }

//             temp += ten;
//             ten = 0;

//             if (temp>=10){
//                 ten = 1;
//                 temp = temp - 10;
//             }
//             result.add(temp);
//         }
//         if (ten != 0){
//             result.add(ten);
//         }
//         System.out.println(result);
//     }
// }



// Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']',
//  определите, является ли входная строка логически правильной. 
//  Входная строка логически правильная, если: 1) Открытые скобки должны быть закрыты скобками того же типа. 
//  2) Открытые скобки должны быть закрыты в правильном порядке. 
//  Каждая закрывающая скобка имеет соответствующую открытую скобку того же типа.
// Пример 1:Ввод: s = "()” Вывод: true
// Пример 2: Ввод: s = "(]" Вывод: false