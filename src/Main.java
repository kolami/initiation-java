public class Main {
    public static void main(String[] args) {

        // Le classique Hello World! qui apparait dans la console
        System.out.println("Hello world!");

        // Chaque instruction est terminée par un ;

        // System.out.println permet d'afficher ce que l'on veut dans la console
        System.out.println("Mes débuts en java");

        // Les différents types de variable courant procédurale :
        int nbreEntier = 5;
        boolean vraiFaux = true;
        String chaineCaractere = "On peut y glisser ce que l'on veut la dedans";

        System.out.println(chaineCaractere.getClass()); // en ajoutant .getClass() derriere ta variable, tu peux afficher son type

        float decimal = 2.21f; // bien ajouté le f pour spécifier un float

        int[] tableauEntier = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // un tableau "classique" mais typé de int
        String[] tableauChaineCaractere = {"Iron man", "Thor", "Ultron", "Deadpool"}; // un tableau "classique" mais typé de String

        System.out.println("Le tableau d'entier : "+tableauEntier);
        System.out.println("Combien d'éléments dans le tableau d'entier : "+tableauEntier.length);
        System.out.println("Le tableau de String : "+tableauChaineCaractere);
        System.out.println("Combien d'éléments dans le tableau de String : "+tableauChaineCaractere.length);

        // Afficher un tableau complet, je n'ai pas l'impression que ce soit faisable mais on peut accéder aux différents en les appelant directement

        System.out.println(tableauChaineCaractere[0]); // Le chiffre correspond à l'index du tableau qui commence toujours à 0
        System.out.println(tableauChaineCaractere[1]);
        System.out.println(tableauChaineCaractere[2]);
        System.out.println(tableauChaineCaractere[3]);

        // Ce qui nous amene aux boucles :
        // 3 types de boucles en procédural : for, while et la do/while (moins utilisé)
        System.out.println("Affichage de la boucle for en ligne");
        for(int i=0; i<10; i++){    // int i = 0 => index d'incrément, i<10 => condition de sortie de la boucle, i++ => incrément de l'index de +1 (i++ équivaut à i=i+1)
            System.out.print(i);
        }

        System.out.println("\nAffichage de la boucle while en ligne"); // \n retour a la ligne dans le print
        int i =0;
        while (i<10){
            System.out.print(i);
            i++;
        }

        System.out.println("\nAffichage de la boucle do/while en ligne");
        int index = 0;
        do {
            System.out.print(index);
            index++;
        }while (index<10);
    }
}