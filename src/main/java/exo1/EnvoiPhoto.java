package exo1;

import java.awt.*;

public class EnvoiPhoto implements SendService{ //extends ServiceEnvoiPhoto
    private final ServiceEnvoiPhoto service = new ServiceEnvoiPhoto(); //méthode 2
    public void envoiMessage(Contact contact, String image) {
        //envoiPhoto(contact,image); //méthode 1
        service.envoiPhoto(contact,image); //méthode 2
    }
}
