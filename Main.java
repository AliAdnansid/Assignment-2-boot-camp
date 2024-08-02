/*
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TASK 1
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        boolean verify = true;
        System.out.println(answer);
        for (int i = 0; i < answer.length(); i++) {
            if(answer.charAt(i) != answer.charAt(answer.length()-i-1)){
                verify = false;
                break;
            }
        }
        if(verify){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("It isn't a Palindrome");
        }



        //TASK2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your university mail ID :");
        String input = scanner.nextLine();
        String regex = "([a-zA-Z]*[0-9]*@umt.edu.pk)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        boolean flag = matcher.matches();
        if(flag){
            System.out.println("Valid Email");
        }
        else{
            System.out.println("Invalid Email");
        }


        //TASK 3
        LocalDate today = LocalDate.now();
        String nextDay = today.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(today);
        System.out.println(nextDay);
        today = today.plusWeeks(10);
        System.out.println(today.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));

        //TASK4
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        String str = input.nextLine();//input a number //14
        int mInt = Integer.parseInt(str);//convert string to int
        //take all the roman number in string array
        String[] rnChars = { "M",  "CM", "D", "C",  "XC", "L",  "X", "IX", "V", "I" };
        //take all the roman number values in int array
        int[] rnVals = {  1000, 900, 500, 100, 90, 50, 10, 9, 5, 1 };
        String retVal = "";
        for (int i = 0; i < rnVals.length; i++) {
            int num = mInt / rnVals[i];
            if (num == 0) continue;
            retVal += (num == 4 && i > 0)? rnChars[i] + rnChars[i - 1]: rnChars[i];
            mInt = mInt % rnVals[i];
        }
        System.out.println("roman number = "+retVal);

        //TASK 6
        Scanner input = new Scanner(System.in);
        String userLine = input.nextLine();
        Pattern pattern = Pattern.compile("\\(\\)\\{\\}\\[\\]|\\(\\)|\\(\\{\\[\\]\\}\\)");
        Matcher matcher = pattern.matcher(userLine);
        if(matcher.matches()){
            System.out.println("Valid Data");
        }
        else{
            System.out.println("Invalid Data");
        }

        //TASK 7



    }
}
*/
