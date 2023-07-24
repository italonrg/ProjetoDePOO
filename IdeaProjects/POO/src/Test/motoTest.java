package Test;
import modificadorFinal.cliente;
import modificadorFinal.moto;

public class motoTest {
    public static void main(String[] args) {

        moto motoVR = new moto("1299 s ",2018,"Ducati");
        System.out.println(moto.VELOCIDADE_LIMETE);
        System.out.println(motoVR.toString());

        System.out.println("-------------------");
        motoVR.setAno(2019);

        motoVR.setMarca("Honda");
        motoVR.setModelo(" CBR 1000RR");
        System.out.println(motoVR.toString());

        System.out.println("-----------------");
        moto motoVR01 = new moto(" F4 ",2015,"MV Agusta");
        System.out.println(motoVR01.toString());

    }
}
