import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Введите первое число: ");
        int firstNumber=new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = new Scanner(System.in).nextInt();
        int sum = firstNumber+secondNumber;
        int difference=firstNumber-secondNumber;
        int mult=firstNumber*secondNumber;
          double division= (double) firstNumber/secondNumber;
        System.out.println(firstNumber+"+"+secondNumber+"="+sum);
        System.out.println(firstNumber+"-"+secondNumber+"="+difference);
        System.out.println(firstNumber+"*"+secondNumber+"="+mult);
        System.out.println(firstNumber+"/"+secondNumber+"="+division);
    }
}
