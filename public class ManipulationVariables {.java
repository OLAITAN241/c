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