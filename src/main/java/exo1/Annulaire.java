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
    public void afficheContacts() {
        for (Contact contact : lesContacts) {
            System.out.println(contact);
        }
    }

    public void sauvegardeEnBD() {
        // Logique pour sauvegarder les contacts dans une base de données
    }

}
