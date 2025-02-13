package exo1;

public class Main {
    public static void main(String[] args) {
        Contact fabou = new Contact.ContactBuilder("Fabou","0273301762").build();
        GestionnaireService gs = new GestionnaireService();
        MailBox mb = new MailBox();
        gs.envoiMessage(mb,fabou,"salutation");
        System.out.println(fabou.getInfoContact(new XmlInfo()));
    }
}