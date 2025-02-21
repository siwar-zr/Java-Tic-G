import models.CompteBancaire;
import models.Human;
import models.Livre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        Human h1 = new Human();
        h1.setName("Siwar");
        h1.setAge(30);
        System.out.println(h1.getAge());
        System.out.println(h1.getName());

        Human h2 = new Human("Ali",20);
        System.out.println(h2.getName()+" : "+h2.getAge());*/
/*

        //exercice1
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le titre du livre : ");
        String titre = sc.next();
        System.out.print("Entrez l'auteur du livre : ");
        String auteur = sc.next();
        System.out.print("Entrez la disponibilite du livre : ");
        boolean dispo = sc.nextBoolean();

        Livre livre = new Livre(titre,auteur,dispo);
        livre.showDetails();

        System.out.println();
        System.out.println("1er empreint");
        livre.emprunter();
        livre.showDetails();

        System.out.println();
        System.out.println("2eme empreint");
        livre.emprunter();
        livre.showDetails();

        System.out.println();
        System.out.println("1er retour");
        livre.retourner();
        livre.showDetails();

        System.out.println();
        System.out.println("2eme retour");
        livre.retourner();
        livre.showDetails();
*/
        //exercice2


        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez votre numero de compte : ");
        String nc = sc.next();
        System.out.println("Entrez votre solde initial : ");
        double si = sc.nextDouble();

        CompteBancaire cb = new CompteBancaire(nc,si);
        System.out.println("1er Depot");
        cb.deposer(1000);
        System.out.println("1er Retrait");
        cb.retirer(1000);
        System.out.println("2eme Retrait");
        cb.retirer(1000);
        System.out.println("3eme Retrait");
        cb.retirer(100);

    }

}