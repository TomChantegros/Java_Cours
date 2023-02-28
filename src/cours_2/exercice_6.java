package cours_2;

import java.util.Scanner;

public class exercice_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez la température");
        double temp = sc.nextDouble();
        if (temp >= 36 && temp <= 38)
        {
            System.out.println("OK");
        }
        else
        {
            System.out.println("Allez voir un médecin");
        }

    }

}
