import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int temp;

        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter the temperature : ");

        temp = inp.nextInt();

        if (temp < 5 ) {
            System.out.println("You can go skiing now!");
        }else if (temp >= 5 && temp <= 15){
            System.out.println("You can go to the cinema now!");
        }else if (temp >=15 && temp <25){
            System.out.println("You can go for a picnic now!");
        }else if (temp == 25){
            System.out.println("You can go for a picnic or you can go swimming now!");
        }else if (temp > 25) {
            System.out.println("You can go swiming now!");
        }
    }

}