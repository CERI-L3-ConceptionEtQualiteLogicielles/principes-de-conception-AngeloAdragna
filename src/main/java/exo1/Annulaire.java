package exo1;

import java.util.ArrayList;
import java.util.List;

public class Annulaire implements ContactService {
    private List<Contact> lesContacts = new ArrayList<>();

    @Override
    public void ajouteContact(Contact contact) {
        lesContacts.add(contact);
    }

    @Override
    public void supprimeContact(Contact contact) {
        lesContacts.remove(contact);
    }

    @Override
    public void envoiEmail(Contact contact, String message) {
        // Logique pour envoyer un email
    }

    @Override
    public void afficheContacts() {
        for (Contact contact : lesContacts) {
            System.out.println("Nom: " + contact.getNom() + ", Numéro: " + contact.getNumero());
        }
    }

    public void sauvegardeEnBD() {
        // Logique pour sauvegarder les contacts dans une base de données
    }

}
