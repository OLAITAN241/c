public class ManipulationVariables  {
    public static void main(String[] args) {
        int epargne = 500;
        int revenus = 2000;

        //Ajouter 100 à votre épargne (Yeah !)
        epargne = epargne + 100;

        //Enlevez 50 à votre indemnité (Snif)
        revenus = revenus - 50;

        //Faites une mise à jour sur votre délai d'épargne
        int nombreDeJoursEpargne = (5000 - revenus) / 500;

        //Mettez à jour à nouveau votre indemnité (encore)
        revenus = revenus + (30 - 10) * 7;
    }
    
}


public class OPenClassroom {

    public static void main(String[] args) {

        int agePersonne = 19;

        agePersonne = 33;

        agePersonne = agePersonne + 28;

        System.out.println("Age = " + agePersonne + "ans" );
    }
}

String text = "A wonderful string that consists of multiple characters";

int numberOfVowels = 0;

double percentageOfVowels = 0.0;

//Pour déclarer une constante en Java, vous devez utiliser le mot clé final
final int NUMBEROFWEEKDAYS = 7;




public class LessonOne {
    
    public static void main(String[] args) {
        int thisYear = 2019;
        String birthdayMonth = "June";
        int firstDay = 3;       
        
        //TODO Etape 1 : créez une variable daysInWeek avec une valeur de 7
        int daysInWeek = 7 ;
        //TODO Etape 2 : ajoutez la valeur de la variable daysInWeek à la variable firstDay, en utilisant un opérateur raccourci
        firstDay += daysInWeek;
        //TODO Etape 3 : créez une constante numérique nommé STARTINGDAY avec la nouvelle valeur de la variable firstDay    
        int STARTINGDAY = firstDay;
        // Affiche le résultat 
        System.out.println("There are " + daysInWeek + "days in a week.\nYour starting day in the month is: " + STARTINGDAY);
    }  
    
}


package hello;

/** Ceci est une implémentation du message traditionnel "Hello world!"

* @author L'équipe Education d'OpenClassrooms

*/

public class HelloWorld {

    /** Le programme commence ici */

    public static void main(String[] args) {

        System.out.println("Hello World!");

    }

}


package hello;
/** Ceci est une implémentation du message traditionnel "Hello world!"
* @author L'équipe Education d'OpenClassrooms
*/
public class HelloWorld {
    /** Le programme commence ici */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}