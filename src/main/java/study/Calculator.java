package study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input: ");
        String input = scanner.nextLine();
        String removeParathesis = removeParenthesis(input);
        List<Integer> numbers = myParser(removeParathesis);
        System.out.println("numbers = " + numbers);
        char c = myCharAt(input, ',');
        System.out.println("index of ',': " + c);

    }

    public static String removeParenthesis(String string) {
        return string.replace("(", "").replace(")","");
    }

    public static List<Integer> myParser(String input){
        List<Integer> numberList = new ArrayList<>();
        String[] stringNumberList = input.split(",");
        for(String sNumber:stringNumberList){
            int number = Integer.parseInt(sNumber);
            numberList.add(number);
        }
        return numberList;
    }
    public static char myCharAt(String string, int index) throws IndexOutOfBoundsException{
        return string.charAt(index);
    }
    

}
