import java.util.Scanner;
class Homework1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        char word;
        double num1 = Num();
        double num2 = Num();
        char operation = Operation();
        double result = Calculator(num1,num2,operation);
        System.out.println("Результат операции: " + result);
        System.out.println("Хотите продолжить?");
        word = scanner.next().charAt(0);
        while (word == 'D' || word == 'd'){
            num1 = Num();
            num2 = Num();
            operation = Operation();
            result = Calculator(num1,num2,operation);
            System.out.println("Результат операции: " + result);
            System.out.println("Хотите продолжить?");
            word = scanner.next().charAt(0);
        }
    }

    public static double Num(){
        System.out.println("Введите число:");
        double numFirst;
        if(scanner.hasNextDouble()){
            numFirst = scanner.nextDouble();
        } else {
            System.out.println("Допущена ошибка.Введите еще раз");
            scanner.next();
            numFirst = Num();
        }
        return numFirst;
    }

    public static char Operation(){
        System.out.println("Введите желаемую операцию: ");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Допущена ошибка.Введите еще раз");
            scanner.next();//рекурсия
            operation = Operation();
            }
            return operation;
    }
    
    public static double Calculator(double numberOne, double numTwo, char operation){
        double result;
        switch (operation){
            case '+':
                result = numberOne + numTwo;
                break;
            case '-':
                result = numberOne - numTwo;
                break;
            case '*':
                result = numberOne * numTwo;
                break;
            case '/':
                result = numberOne / numTwo;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = Calculator(numberOne, numTwo, Operation()); //рекурсия
        }
        return result;
    }

}