package exo1;

public class XmlInfo implements FormatInfo {
    @Override
    public String getInfoContact(Contact contact) {
        return "<nom>"+contact.getNom()+"</nom>\n" +"<numero>"+ contact.getNumero() +"</numero>\n";
    }
}
