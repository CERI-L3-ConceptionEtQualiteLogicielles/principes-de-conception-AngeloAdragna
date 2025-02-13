package exo1;

public class XmlInfo implements FormatInfo {
    public String getInfoContact(Contact c) {
        StringBuilder sb = new StringBuilder();

        // JSON Format
        sb.append("{\n");
        sb.append("\t\"Nom\": \"").append(c.getNom()).append("\",\n");
        sb.append("\t\"Numéro\": \"").append(c.getNumero()).append("\"");

        if (c.getPrenom() != null && !c.getPrenom().isEmpty()) sb.append(",\n\t\"Prénom\": \"").append(c.getPrenom()).append("\"");
        if (c.getCivilite() != null && !c.getCivilite().isEmpty()) sb.append(",\n\t\"Civilité\": \"").append(c.getCivilite()).append("\"");
        if (c.getAdressePostale() != null && !c.getAdressePostale().isEmpty()) sb.append(",\n\t\"Adresse\": \"").append(c.getAdressePostale()).append("\"");
        if (c.getAdresseMail() != null && !c.getAdresseMail().isEmpty()) sb.append(",\n\t\"Email\": \"").append(c.getAdresseMail()).append("\"");
        if (c.getDateAnniversaire() != null && !c.getDateAnniversaire().isEmpty()) sb.append(",\n\t\"Date d'anniversaire\": \"").append(c.getDateAnniversaire()).append("\"");
        if (c.getLieuTravail() != null && !c.getLieuTravail().isEmpty()) sb.append(",\n\t\"Lieu de travail\": \"").append(c.getLieuTravail()).append("\"");
        if (c.getVille() != null && !c.getVille().isEmpty()) sb.append(",\n\t\"Ville\": \"").append(c.getVille()).append("\"");

        sb.append("\n}");

        return sb.toString();
    }
}
