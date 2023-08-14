package HashCodeEquals;

public class ProgramEq {
    public static void main(String[] args) {
        String a = " Mary";
        String b = " Anna";

        System.out.println(a.equals(b));

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println("---------------------");
        System.out.println();

        client Client = new client(" mary","MaryGGZinha@gmail.com");
        client Client01 = new client(" Anna","AnnaEQ587@gmail.com");

        System.out.println(Client.hashCode());
        System.out.println(Client01.hashCode());
        System.out.println(Client.equals(Client01));
        System.out.println(Client == Client01);//todo:Essa comapração diz respeito ao objeto alocado na memoria, logo ainda que os nomes fossem iguais eles seria diferentes
        //todo: pois estão em posições diferentes na memoria;

    }
}
