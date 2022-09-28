// HashSet
// isEmpty() – проверка на пустоту.
// add(V) – добавление элемента в коллекцию.
// remove(V) – удаление элемента из коллекцию.
// contains(V) – проверка на включение элемента в коллекции.
// clear() – удаление всех элементов коллекции.
// size() – возвращает количество элементов коллекции.

// package Lecture6;

// import java.util.HashSet;
// import java.util.Set;

// public class Lecture6 {
//     public static void main(String[] args) {
//       Set<Integer> set = new HashSet<>();
//       set.add(1); set.add(12); set.add(123);
//       set.add(1234); set.add(1234);
//       System.out.println(set.contains(12)); // true
//       set.add(null);
//       System.out.println(set.size()); // 5
//       System.out.println(set); // [null, 1, 1234, 123, 12]
//       set.remove(12);
//       for (var item : set) System.out.println(item); // null 1 1234 123
//       set.clear();
//       System.out.println(set); // []
//      }
//   }


// package Lecture6;

// import java.util.HashSet;
// import java.util.Set;

// public class Lecture6 {
//     public static void main(String[] args) {
//       Set<Integer> set = new HashSet<>();
//       set.add(1); set.add(12); set.add(123);
//       set.add(1234); set.add(1234);
//       System.out.println(set.contains(12)); // true
//       set.add(null);
//       System.out.println(set.size()); // 5
//       System.out.println(set); // [null, 1, 1234, 123, 12]
//       set.remove(12);
//       for (var item : set) System.out.println(item); // null 1 1234 123
//       set.clear();
//       System.out.println(set); // []
//      }
//   }
  
// addAll(Coll) – объединение множеств.
// retainAll(Coll) – пересечение множеств.
// removeAll(Coll) – разность множеств.

// package Lecture6;

// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.Set;

// public class Lecture6{
//     public static void main(String[] args) {
//         var a = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
//         var b = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17));
//         var u = new HashSet<Integer>(a); u.addAll(b);
//         var r = new HashSet<Integer>(a); r.retainAll(b);
//         var s = new HashSet<Integer>(a); s.removeAll(b);
//         System.out.println(a); // [1, 2, 3, 4, 5, 6]
//         System.out.println(b); // [17, 2, 3, 5, 7, 11]
//         System.out.println(u); // [1, 17, 2, 3, 4, 5, 6, 11]
//         System.out.println(r); // [2, 3, 5, 7]
//         System.out.println(s); // [1, 4, 6]
//         boolean res = a.addAll(b);
//     }
//  }

//  first()
//  last()
//  headSet(E)
//  tailSet(E)
//  subSet(E1, E2)


// package Lecture6;

// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.Set;
// import java.util.*;
// public class Lecture6 {
//    public static void main(String[] args) {
//        var a = new TreeSet<>(Arrays.asList(1,7,2,3,6,4,5));
//        var b = new TreeSet<>(Arrays.asList(13,3,17,7,2,11,5));

//        System.out.println(a); // [1, 2, 3, 4, 5, 6, 7]
//        System.out.println(b); // [2, 3, 5, 7, 11, 13, 17]
//        System.out.println(a.headSet(4)); // [1, 2, 3]
//        System.out.println(a.tailSet(4)); // [4, 5, 6, 7]
//        System.out.println(a.subSet(3, 5)); // [3, 4]
//    }
// }


// TreeSet
// В основе HashMap.
// Упорядочен по возрастанию.
// null’ов быть не может.

// package Lecture6;
// import java.util.*;

// public class Lecture6 {
//    public static void main(String[] args) {
//        var a = new TreeSet<>(Arrays.asList(1,7,2,3,6,4,5));
//        var b = new TreeSet<>(Arrays.asList(13,3,17,7,2,11,5));

//        System.out.println(a); // [1, 2, 3, 4, 5, 6, 7]
//        System.out.println(b); // [2, 3, 5, 7, 11, 13, 17]
//        System.out.println(a.contains(1)); // true
//    }
// }

// LinkedHashSet
// В основе HashMap.
// Помнит порядок.
// Использовать, когда нужен HashSet с запоминанием порядка элемента.

// isEmpty() – проверка на пустоту.
// add(V) – добавление элемента в коллекцию.
// remove(V) – удаление элемента из коллекцию.
// contains(V) – проверка на включение элемента в коллекции.
// clear() – удаление всех элементов коллекции.
// size() – возвращает количество элементов коллекции.

// package Lecture6;
// import java.util.*;

// public class Lecture6 {
//    public static void main(String[] args) {
//        var a = new LinkedHashSet<>(Arrays.asList(1,7,2,3,6,4,5));
//        var b = new LinkedHashSet<>(Arrays.asList(13,3,17,7,2,11,5));
//        a.add(28);
//        System.out.println(a); // [1, 7, 2, 3, 6, 4, 5, 28]
//        System.out.println(b); // [13, 3, 17, 7, 2, 11, 5]
//    }
// }



