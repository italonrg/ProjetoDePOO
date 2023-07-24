package sobrecargaDeconstutoresTiagoAguiar;

public class sobrecagaCOnstrutor {

    private String firstName;

    private  String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public sobrecagaCOnstrutor(String firstName, String lastName){
         this.firstName=firstName;
         this.lastName=lastName;
    }

    public String output(){
        return firstName.toUpperCase()+" " + lastName.toUpperCase();
    }///construtores podem ter os mesmos nomes desde que tenham parametros diferentes
    ///quando vc for usar o metodo que se quer basta passar o parametro que vc passou para ele
    public String output(boolean showLastName){
        if ( showLastName == true){
            return output();
        }
        return firstName.toLowerCase();
    }
    public  String toString(){
        return " Usuario {"+
                " FisrtName="+firstName + " , "+
                "  Lastname = "+lastName;
        ///isso e tipo uma estrutura de checagem de nomes!!!
    }
}
