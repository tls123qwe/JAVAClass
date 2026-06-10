package ch2homework;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> results;

    public Calculator() {
        results = new ArrayList<>();
    }

    public int calculate(int num1, int num2, char cla) {

    switch (cla) {
        case '+' -> num1 += num2;
        case '-' -> num1 -= num2;
        case '*' -> num1 *= num2;
        case '/' -> {
            if (num1 == 0 || num2 == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
            } else {
                num1 /= num2;
            }
        }
    }
    results.add(num1);
    return num1;
    }

    public List<Integer> getResults() {
        return results;
    }

    public void setResults(List<Integer> results) {
        this.results = results;
    }

    public void removeResults(){
        if (!results.isEmpty()){
            results.remove(0);
        }
    }
}

