package exo1;

import java.awt.*;

public class EnvoiPhoto implements SendService{ //extends ServiceEnvoiPhoto
    final ServiceEnvoiPhoto service = new ServiceEnvoiPhoto();
    public void envoiMessage(Contact contact, String image) {
        //envoiPhoto(contact,image); //méthode 1
        service.envoiPhoto(contact,image); //méthode 2
    }
}
