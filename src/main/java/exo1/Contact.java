package exo1;

import exo1.FormatInfo;

public class Contact  {
    public static class ContactBuilder{
        //obligatoire
        private String nom;
        private String numero;
        //faculatif
        private String prenom=null;
        private String civilite=null;
        private String adressePostale=null;
        private String adresseMail=null;
        private String dateAnniversaire=null;
        private String lieuTravail=null;
        private String ville=null;

        public ContactBuilder(String nom,String numero){
            this.nom=nom;
            this.numero=numero;
        }

        public ContactBuilder addPrenom(String prenom){
            this.prenom=prenom;
            return this;
        }
        public ContactBuilder addCivilite(String civilite){
            this.civilite=civilite;
            return this;
        }
        public ContactBuilder addAdresseMail(String adresseMail){
            this.adresseMail=adresseMail;
            return this;
        }
        public ContactBuilder addDateAnniversaire(String dateAnniversaire){
            this.dateAnniversaire=dateAnniversaire;
            return this;
        }
        public ContactBuilder addLieuTravail(String lieuTravail){
            this.lieuTravail=lieuTravail;
            return this;
        }
        public ContactBuilder addVille(String ville){
            this.ville=ville;
            return this;
        }
        public ContactBuilder addNom(String nom){
            this.nom=nom;
            return this;
        }
        public ContactBuilder addNumero(String numero){
            this.numero=numero;
            return this;
        }

        public ContactBuilder addAdressePostale(String adressePostale){
            this.adressePostale=adressePostale;
            return this;
        }
        public Contact build(){
               return new Contact(nom, numero, prenom, civilite, adressePostale, adresseMail, dateAnniversaire, lieuTravail, ville);
        }

    }
    private String nom;
    private String numero;
    private String prenom;
    private String civilite;
    private String adressePostale;
    private String adresseMail;
    private String dateAnniversaire;
    private String lieuTravail;
    private String ville;

    private Contact(String nom, String numero, String prenom, String civilite,String adressePostale,String adresseMail, String dateAnniversaire, String lieuTravail, String ville) {
        this.nom = nom;
        this.numero = numero;
        this.prenom = prenom;
        this.civilite = civilite;
        this.adressePostale = adressePostale;
        this.adresseMail = adresseMail;
        this.dateAnniversaire = dateAnniversaire;
        this.lieuTravail = lieuTravail;
        this.ville = ville;
    }

    public String getNom() {
        return nom;
    }
    public String getNumero() {
        return numero;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getCivilite() {
        return civilite;
    }
    public String getAdressePostale() {
        return adressePostale;
    }
    public String getAdresseMail() {
        return adresseMail;
    }
    public String getDateAnniversaire() {
        return dateAnniversaire;
    }
    public String getLieuTravail() {
        return lieuTravail;
    }
    public String getVille() {
        return ville;
    }

    public String getInfoContact(FormatInfo format) {
        return format.getInfoContact(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nom: ").append(nom).append(", ");
        sb.append("Numéro: ").append(numero);

        if (prenom != null && !prenom.isEmpty()) sb.append(", Prénom: ").append(prenom);
        if (civilite != null && !civilite.isEmpty()) sb.append(", Civilité: ").append(civilite);
        if (adressePostale != null && !adressePostale.isEmpty()) sb.append(", Adresse: ").append(adressePostale);
        if (adresseMail != null && !adresseMail.isEmpty()) sb.append(", Email: ").append(adresseMail);
        if (dateAnniversaire != null && !dateAnniversaire.isEmpty()) sb.append(", Date d'anniversaire: ").append(dateAnniversaire);
        if (lieuTravail != null && !lieuTravail.isEmpty()) sb.append(", Lieu de travail: ").append(lieuTravail);
        if (ville != null && !ville.isEmpty()) sb.append(", Ville: ").append(ville);

        return sb.toString();
    }
}