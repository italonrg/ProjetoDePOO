package HashCodeEquals;

import java.util.Objects;

//todo: quando se quiser, comparar se duas coisas são iguais usase o hasCode ou o Equals;
public class client {
    private String name;
    private String email;
/*
    @Override//todo: HasCode e Equals são da classe Object, portanto elas sobreescrevem os metodos da classe;
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof client client)) return false;

        return getName() != null ? getName().equals(client.getName()) : client.getName() == null;
    }

    @Override
    public int hashCode() {
        return getName() != null ? getName().hashCode() : 0;
    }
*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof client client)) return false;
        return Objects.equals(getName(), client.getName()) && Objects.equals(getEmail(), client.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getEmail());
    }

    public client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
