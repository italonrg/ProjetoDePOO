package enumeracao;

public enum tipoCliente {

    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2),
    PESSOA_SEI_LA(3);
    private final int VALOR;
/*
    public static tipoCliente tipoClientePorNome(String nomeRelatorio){
        for (tipoCliente cliente : values()) {
            if (cliente.getRelatorio().equals(nomeRelatorio)){
                return cliente;
            }
            
        }

        return null;
    }
*/
public static tipoCliente tipoClientePorNome(String nomeRelatorio){
    for (tipoCliente tipo : values()) {
        if (tipo.getRelatorio().equals(nomeRelatorio)){
            return tipo;
        }
    }
    // Caso nenhum tipo de cliente seja encontrado com o nome do relatório
    return null; // ou lançar uma exceção, dependendo dos requisitos do seu código
}

    private Object getRelatorio() {
        return null;
    }

    public int valor() {
        return VALOR;
    }

    tipoCliente(int VALOR) {
        //este construtor força a a passar o valor que foi definido no parametro do construtor
        this.VALOR = VALOR;
    }
}
