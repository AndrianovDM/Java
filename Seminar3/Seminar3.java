// package Seminar3;

// public class Seminar3{
//     public static void main(String[] args) {
//     String s1 = "hello";
//     String s2 = "hello";
//     String s3 = s1;
//     String s4 = "h" + "e" + "l" + "l" + "o";
//     String s5 = new String("hello");
//     String s6 = new String(new char[]{'h' , 'e' , 'l' , 'l' , 'o'});
//     System.out.println(s1.equals(s5));
//     System.out.println(s1 == s5);
// }

// }


// package Seminar3;

// import java.util.ArrayList;
// import java.util.Comparator;
// import java.util.List;

// public class Seminar3{
//     public static void main(String[] args) {
//         List<Integer> list = new ArrayList<>();
//         list.add(22);
//         list.add(5);
//         list.add(10);

//         list.sort(Comparator.naturalOrder());
//         System.out.println(list);

//     }
// }



// package Seminar3;

// import java.util.ArrayList;
// import java.util.Comparator;
// import java.util.List;
// import java.util.Map;
// import java.util.function.Function;
// import java.util.stream.Collector;
// import java.util.stream.Collectors;

// public class Seminar3{
//     public static void main(String[] args) {
//         List<String> list = new ArrayList<>();
//         list.add("mercury");
//         list.add("Cenues");
//         list.add("earth"); 
//         list.add("mars");
//         list.add("venues");
//         Map<String,Long> fr = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//         System.out.println(fr);

//     }
// }

// package Seminar3;
// import java.util.ArrayList;
// import java.util.List;
// public class Seminar3{
//     public static void main(String[] args) {
//         List<String> list = new ArrayList<>();
//         list.add("Венера");
//         list.add("Нептун");
//         list.add("Плутон");
//         int count;
//         for (int i = 0; i < list.size(); i++){
//         count = 0;
//         for (int j = i+1; j < list.size(); j++) {
//             if (list.get (i) .equalsIgnoreCase(list.get(j))){
//                 count++;
//             }
//         }
//         System.out.println(list.get(i) + " "+ ++count);
//     }
// }
// }

// package Seminar3;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// public class Seminar3{
//     public static void main(String[] args) {
//         List<List<String>> list = new ArrayList<>();
//         list.add(addBooks("type1", Arrays.asList("name1", "name2")));
//         list.add(addBooks("type1", Arrays.asList("name1", "name2")));
//         for (list l1: list) {
//             for (List l:list.get(i)) {
//             }
//         }
//         System.out.println(list);
//     }
//     public static List<String> addBooks(String genre, List<String> names){
//         List<String> list = new ArrayList<>();
//         list.add(genre);
//         list.addAll(names);
//         return list;
//     }
// }


