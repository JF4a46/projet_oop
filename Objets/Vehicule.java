public class Vehicule{
    private final int id;
    private string nom;
    private Categorie categorie;
    
    
    public Vehicule(int id, String nom, int categorie){
        this.id = id;
        this.nom = nom;
        this.categorie = categorie;
    }
    
    public Vehicule(String nom, int categorie){
        this.id = null;
        this.nom = nom;
        this.categorie = categorie;
    }
    
    public static Vehicule selectVehicule(int id){
        //utiliser le ID pour obtenir le bon véhicule
        return new Vehicule();
    }
    
    public static List<Vehicule> getVehicules(){
        //Obtenir la liste de tous les véhicules
        return new Vehicule();
    }
    
    private void verifierDisponibiliteVehicule(){
        //Ajoute un véhicule
        return;
    }
    
    public void sauvegarderVehicule(){
        //Sauvegarde le véhicule dans la base de données
        if (id){
            this.miseAJourVehicule();
        } else {
            this.ajouterVehicule();
        }
        return;
    }
    
    private void ajouterVehicule(){
        //Ajoute un véhicule
        return;
    }
    
    private void miseAJourVehicule(){
        //Update un véhicule
        return;
    }
    
    private void retirerVehicule(){
        //Delete un véhicule
        return;
    }
    
    private void reserverVehicule(){
        //Réserve un véhicule
        return;
    }
    
    private void modifierReservationVehicule(){
        //Réserve un véhicule
        return;
    }
}