package study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input: ");
        String input = scanner.nextLine();
        String removeParathesis = removeParathesis(input);
        List<Integer> numbers = myParser(removeParathesis);
        System.out.println("numbers = " + numbers);

    }

    public static String removeParathesis(String string) {
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
    public static int myCharAt(String string, char s) throws IndexOutOfBoundsException{
        return string.charAt(s);
    }
    

}
