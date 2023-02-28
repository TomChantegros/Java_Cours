package cours_2;

import java.util.Scanner;

public class exercice_1 {
    public static void main(String[] args) {
        System.out.println("Saisissez votre âge");
// saisie d'un entier
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
// condition : si age est plus petit que 18
        if (age < 18)
        {
            System.out.println("Vous êtes mineur(e)");
        }
        else
        {
            System.out.println("Vous êtes majeur(e)");
        }


    }
}
