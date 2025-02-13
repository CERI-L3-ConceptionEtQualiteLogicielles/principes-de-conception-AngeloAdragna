package exo1;

public class GestionnaireService {
    public void envoiMessage(SendService sd, Contact contact, String message) {
        sd.envoiMessage(contact,message);
    }
}
