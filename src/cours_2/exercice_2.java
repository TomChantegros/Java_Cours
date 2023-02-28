package cours_2;

import java.util.Scanner;
public class exercice_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez votre age");
        int age = sc.nextInt();
// initialisation de la variable tarif
        int tarif = 0;
        if (age < 5 )
        {
            tarif = 2 ;
        }
        else if (age <= 17 )
        {
            tarif = 5 ;
        }
        else
        {
            tarif = 9 ;
        }
// affichage du tarif
        System.out.println("le tarif est : " + tarif);


    }
}
