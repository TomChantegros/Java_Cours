package cours_3;

public class Exemple_C {

    public static void main(String[] args) {
// boucle de 1er niveau
        for (int i = 1 ; i <= 4 ; i++)
        {
            System.out.println("Boucle de 1er niveau. i : " + i);
            System.out.println("\tDébut Boucle imbriquée");
// boucle imbriquée
            for (int j = 1 ; j <= 3 ; j++)
            {
                System.out.println("\t j : " + j);
            }
            System.out.println("\tFin boucle imbriquée");
            System.out.println("Fin boucle de 1er niveau");


        }
    }
}
