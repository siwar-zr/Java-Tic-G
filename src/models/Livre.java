package models;

public class Livre {
    private String titre;
    private String auteur;
    private boolean disponible;

    public Livre(String titre, String auteur, boolean disponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.disponible = disponible;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void emprunter(){
        if (disponible){
            disponible = false;
            System.out.println("Le livre "+titre+" est empreinté avec succes!");
        }else{
            System.out.println("Le livre "+titre+" est déjà empreinté !");
        }
    }

    public void retourner(){
        if(!disponible){
            disponible = true;
            System.out.println("Le livre "+titre+" est retourne avec succes !");
        }else{
            System.out.println("Le livre "+titre+" est deja retourne !");
        }
    }

    public void showDetails(){
        System.out.println(titre+" : "+auteur+" : "+disponible);
    }
}
