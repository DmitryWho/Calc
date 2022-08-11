package CalculatorForKata;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Калькулятор римских и арабских чисел" +
                "\nВведите два числа от 1 до 10 включительно" +
                "\nДоступные операции: + - * /" +
                "\nЧтобы запустить калькулятор нажмите ENTER");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toUpperCase();
        System.out.println(calc(input));

    }

    public static String calc(String input) throws Exception {
        String result = "";

        String[] inputArray = input.split(" ");
        if (inputArray.length != 3)
            throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, *, /)");
        char operation = inputArray[1].charAt(0);
        int number1 = 0, number2 = 0;

        switch (inputArray[0]) {
            case "I" -> number1 = 1;
            case "II" -> number1 = 2;
            case "III" -> number1 = 3;
            case "IV" -> number1 = 4;
            case "V" -> number1 =5;
            case "VI" -> number1 = 6;
            case "VII" -> number1 = 7;
            case "VIII" -> number1 = 8;
            case "IX" -> number1 = 9;
            case "X" -> number1 = 10;
            default -> number1 =0;
        } if (number1 > 0 && number1 <= 10){
            switch (inputArray[2]){
                case "I" -> number2 = 1;
                case "II" -> number2 = 2;
                case "III" -> number2 = 3;
                case "IV" -> number2 = 4;
                case "V" -> number2 =5;
                case "VI" -> number2 = 6;
                case "VII" -> number2 = 7;
                case "VIII" -> number2 = 8;
                case "IX" -> number2 = 9;
                case "X" -> number2 = 10;
                default -> number2 = 0;
            }
        } if (number2 > 0 && number2 <= 10){
            switch (inputArray[1]){
                case "+" -> result = Convert.converter(Integer.parseInt(String.valueOf(number1 + number2)));
                case "-" -> result = Convert.converter(Integer.parseInt(String.valueOf(number1 - number2)));
                case "*" -> result = Convert.converter(Integer.parseInt(String.valueOf(number1 * number2)));
                case "/" -> result = Convert.converter(Integer.parseInt(String.valueOf(number1 / number2)));
            };
        } if (result.equals(0)){
            throw new Exception("В Римских числах нет нуля и отрицательных чисел");
        }

        if (number2 == 0) {
            int n1 = Integer.parseInt(inputArray[0]);
            int n2 = Integer.parseInt(inputArray[2]);

            if (n1 > 10 || n1 < 1 && n2 > 10 || n2 < 1){
                throw new Exception();
            }
            switch (inputArray[1]){
                case "+" -> result = String.valueOf(n1 + n2);
                case "-" -> result = String.valueOf(n1 - n2);
                case "*" -> result = String.valueOf(n1 * n2);
                case "/" -> result = String.valueOf(n1 / n2);
            }
        }


        return result;

        }

    }
