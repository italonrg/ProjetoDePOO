package util;

public class conversorDeTempo {
    public static int segundosEmMinutos (int segundos){///segundos em minutos
       return segundos/60;
    }
    public static int horasemminutos (int horas){  /// horas em minutos
      return  horas*60;
    }
    public static int diasEmHoras (int dias){///dias em horas
        return dias*24;
    }
    private static int semanasEmDias (int semanas){///semanas em dias
        return   semanas*7;
    }
    public static double mesesEmdias (int meses){///meses em dias
        return  meses*30.4375;
    }
    public static int anosParaDias(int anos) {
        return anos * 365;
    }

    public class main{
        public static void main(String[] args) {

            int quantidadeDeSegundos = 60;
            quantidadeDeSegundos = segundosEmMinutos(quantidadeDeSegundos);
            System.out.println(quantidadeDeSegundos + " segundos equivalem a " + quantidadeDeSegundos + " minutos");

            int quantidadeDeHoras =12;
            quantidadeDeHoras=horasemminutos(quantidadeDeHoras);
            System.out.println(quantidadeDeHoras+ " horas equivalem a " + quantidadeDeHoras + " minutos");

            int quantidadeDeDias =7;
            quantidadeDeDias=horasemminutos(quantidadeDeDias);
            System.out.println(quantidadeDeDias+ "dias equivalem a " + quantidadeDeDias + " horas");

            int quantidadeDeSemanas = 5;
            quantidadeDeSemanas= semanasEmDias(quantidadeDeSemanas);
            System.out.println(quantidadeDeSemanas+" semanas equivalem a "+quantidadeDeSemanas+"dias");

            int quantidadeDeMeses = 23;
            quantidadeDeMeses = (int) mesesEmdias(quantidadeDeMeses);
            System.out.println(quantidadeDeMeses+"meses equivalem a "+quantidadeDeMeses+"dias");

            int quantidadeAnos = 2;
            quantidadeAnos = anosParaDias(quantidadeAnos);
            System.out.println(quantidadeAnos + "equivalem a " + quantidadeAnos + " dias");
        }


        }


    }


