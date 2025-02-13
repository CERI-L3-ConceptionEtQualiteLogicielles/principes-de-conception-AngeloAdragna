package exo1;

public class JsonInfo implements FormatInfo {
    @Override
    public String getInfoContact(Contact contact) {
        return "<Contact>" +
                "\n\t<nom>" + contact.getNom() + "</nom>" +
                "\n\t<numero>" + contact.getNumero() + "</numero>" +
                "\n\t<prenom>" + contact.getPrenom() + "</prenom>" +
                "\n\t<civilite>" + contact.getCivilite() + "</civilite>" +
                "\n\t<adresse>" + contact.getAdressePostale() + "</adresse>" +
                "\n\t<email>" + contact.getAdresseMail() + "</email>" +
                "\n\t<dateNaissance>" + contact.getDateAnniversaire() + "</dateNaissance>" +
                "\n\t<lieuTravail>" + contact.getLieuTravail() + "</lieuTravail>" +
                "\n\t<ville>" + contact.getVille() + "</ville>" +
                "\n</Contact>";
    }
}
