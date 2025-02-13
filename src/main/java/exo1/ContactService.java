package exo1;

public interface ContactService {
    void ajouteContact(Contact contact);
    void supprimeContact(Contact contact);
    void afficheContacts();

    public class Contact {
        public static class ContactBuilder{
            //obligatory
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

        private Contact(String nom, String numero, String prenom, String civilite, String adressePostale, String adresseMail, String dateAnniversaire, String lieuTravail, String ville) {
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
    }
}