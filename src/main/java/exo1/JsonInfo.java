package exo1;

public class JsonInfo implements FormatInfo {
    @Override
    public String getInfoContact(Contact contact) {
        return "{" +
                "\n\t\"nom\": \"" + contact.getNom() + "\"," +
                "\n\t\"numero\": \"" + contact.getNumero() + "\"" +
                "\n}";
    }
}
