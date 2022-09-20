// package Lecture4;
// import java.util.PriorityQueue;

// public class Lecture4 {
//     public static void main(String[] args) {
//         PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//         pq.add(123);
//         pq.add(3);
//         pq.add(13);
//         pq.add(1);
//         System.out.println(pq);
//         System.out.println(pq.poll());
//         System.out.println(pq.poll());
//         System.out.println(pq.poll());
//         System.out.println(pq.poll());
//         System.out.println(pq.poll());
//     }
// }



// import java.util.LinkedList;

// public class Lecture4 {
//     public static void main(String[] args) {
//         LinkedList<Integer> ll = new LinkedList<Integer>();

//         ll.add(1);
//         ll.add(2);
//         ll.add(3);
        
//     }
    
// }



// package Lecture4;

// import java.util.LinkedList;
// import java.util.Queue;

// public class Lecture4 {
//     public static void main(String[] args) {
//         Queue<Integer> queue = new LinkedList<Integer>();
//         queue.add(1);
//         queue.add(2);
//         queue.add(3);
//         queue.add(4);
//         System.out.println(queue); // [1, 2, 3, 4]
//         int item = queue.remove();
//         System.out.println(queue); // [2, 3, 4]
//         queue.offer(2809);
//         item = queue.remove();
//         System.out.println(queue); // [3, 4, 2809]
//         item = queue.remove();
//         System.out.println(queue); // [4, 2809]
//         item = queue.remove();
//         System.out.println(queue); // [2809]
//         System.out.println(queue.peek());
        
//     }
// }


// package Lesson_04;

// import java.util.*;

// public class Ex003 {
//     public static void main(String[] args) {
//         Deque<Integer> deque = new ArrayDeque<>();
//         deque.addFirst(1); deque.addLast(2);
//         deque.removeLast(); deque.removeLast();
//         deque.offerFirst(1); deque.offerLast(2);
//         deque.pollFirst(); deque.pollLast();
//         deque.getFirst(); deque.getLast();
//         deque.peekFirst(); deque.peekLast();
//     }
// }



// package Lesson_04;

// import java.util.*;

// public class Ex004 {
//     public static void main(String[] args) {
//         Stack<Integer> stack = new Stack<>();
//         stack.push(1);
//         stack.push(12);
//         stack.push(123);
//         System.out.println(stack.pop()); // 123
//         System.out.println(stack.pop()); // 12
//         System.out.println(stack.pop()); // 1
//     }
// }


// package Lesson_04;

// import java.util.Stack;

// public class Ex005 {

//     private static boolean isDigit(String s) throws NumberFormatException {
//         try {
//             Integer.parseInt(s);
//             return true;
//         } catch (NumberFormatException e) {
//             return false;
//         }
//     }

//     public static void main(String[] args) {
//         // (1+2*3*4)*(10/5) - 20
//         // 1 2 3 * 4 * + 10 5 / * 20 -
        
//         //var exp = "20 30 - 10 *".split(" "); // (20-30)*10
//         var exp = "1 2 + 3 *".split(" "); // (1 + 2) * 3
        
//         //var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3
//         int res = 0;
//         System.out.println(exp);
        
//         Stack<Integer> st = new Stack<>();
//         for (int i = 0; i < exp.length; i++) {

//             if (isDigit(exp[i])) {
//                 st.push(Integer.parseInt(exp[i]));
//             } else {
//                 switch (exp[i]) {
//                     case "+":
//                         res = st.pop() + st.pop();
//                         st.push(res);
//                         break;
//                     case "-":
//                         res = -st.pop() + st.pop();
//                         st.push(res);
//                         break;
//                     case "*":
//                         res = st.pop() * st.pop();
//                         st.push(res);
//                         break;
//                     case "/":
//                         res =  st.pop()/ st.pop();
//                         st.push(res);
//                         break;
//                     default:
//                         break;
//                 }
//             }
//         }
//         System.out.printf("%d\n", st.pop());
//     }
// }