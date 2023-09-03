import java.util.Scanner; /*импортируем класс сканер*/

public class Calculator {
    public static void main(String[] args) {


        System.out.println("Калькулятор");     // вывод приветствия в консоль
        double firstOperand = getNumber();
        byte action = getAction();             // получение математического действия
        double secondOperand = getNumber();    // получение второго операнда
        double sum = 0;
        switch (action) {
            case 1 -> sum = firstOperand + secondOperand;
            case 2 -> sum = firstOperand - secondOperand;
            case 3 -> sum = firstOperand * secondOperand;   // математические операции
            case 4 -> sum = firstOperand / secondOperand;
        }
        System.out.println("Результат: " + sum);                // вывод результата



    }

    private static double getNumber() { //получение числа

        System.out.println("Введите число:");          // после предложения ввести число, сканер считает
        Scanner scanner = new Scanner(System.in);      // введенное значение, и если оно действительно является числом,
        if (scanner.hasNextDouble()) {                 // то оно запишется в переменную. Иначе, getNumber предложит
            return (scanner.nextDouble());             // повторить ввод
        } else System.out.println("Вы ввели не число, \nпопробуйте еще раз");
        return (getNumber());
    }


    private static byte getAction() {                            // этот метод получает математическое действие.
        System.out.println("Введите действие: +, -, * или /");   // после предложения ввести значение, сканер считывает
        Scanner scanner = new Scanner(System.in);                // символ действия. если действие не является ни одним
        // из предложенных вариантов, getAction укажет, что
        char act = scanner.next().charAt(0);                     // пользователь ввел неверный вариант, и вернет его к
        switch (act) {                                           // к началу метода
            case '+' -> {
                return (1);
            }
            case '-' -> {
                return (2);
            }
            case '*' -> {
                return (3);
            }
            case '/' -> {
                return (4);
            }
            default -> System.out.println("Вы ввели неверное значение");
        }
        return (getAction());

    }


}




