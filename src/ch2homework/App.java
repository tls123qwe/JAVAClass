package ch2homework;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int num1;
        int num2;
        String oper = "";

        while (true) {
            System.out.print("첫 번째 정수 입력: ");
            if (sc.hasNextInt()) {
                num1 = sc.nextInt();
                break;
            }
            System.out.println("정수가 아닙니다.");
            sc.next();
        }

        while (!oper.equals("exit")) {

            while (true) {
                System.out.print("사직연산 기호 입력: ");
                oper = sc.next();
                char cla = oper.charAt(0);

                if (oper.equals("+") || oper.equals("-") || oper.equals("*") || oper.equals("/")) {
                    while (true) {
                        System.out.print("다음 정수 입력: ");
                        if (sc.hasNextInt()) {
                            num2 = sc.nextInt();
                            break;
                        }
                        System.out.println("정수가 아닙니다.");
                        sc.next();
                    }

                    num1 = calculator.calculate(num1, num2, cla);
                    System.out.println("현재 계산 값: " + num1);

                    System.out.println("더 계산 하시겠습니까? go or exit 입력");
                    oper = sc.next();
                    if (oper.equals("exit")) break;
                } else System.out.println("사칙연산자 기호를 확인하세요.");
            }
            System.out.println(num1);
        }
        System.out.println(calculator.getResults());
        calculator.removeResults();
        System.out.println(calculator.getResults());
    }
}
/*            switch (cla) {
                case '+' -> result += num2;
                case '-' -> result -= num2;
                case '*' -> result *= num2;
                case '/' -> {
                    if (result == 0 || num2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                    } else {
                        result /= num2;
                    }
                }
                default -> System.out.println("사칙연산 재입력");*/
