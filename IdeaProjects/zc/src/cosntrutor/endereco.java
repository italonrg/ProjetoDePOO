package cosntrutor;

public class endereco {

    public String logradouro;
    public String cep;
    public String bairro;
    public String cidade;
    public String complemento;
    public String numero;

   public endereco(String logradouro, String cep, String bairro, String complemento, String numero, String cidade){
        this.bairro = bairro;
        this.cep = cep;
        this.logradouro = logradouro;
        this.cidade= cidade;
        this.numero=numero;
        //metodo inicializador!!!
    }
public endereco(){


        //metodo vazio!!!

}

}
