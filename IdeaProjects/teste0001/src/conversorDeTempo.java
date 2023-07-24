
public class main {

    public static void main(String[] args) {

        class conversorDeTempo {
            public static int segundos(int segundos) {///segundos em minutos
                int resulatado = segundos / 60;
                System.out.println(" a quantidade de segundos em minutos e:" + segundos);
                return resulatado;
            }

            public static int horas(int horas) {  /// horas em minutos
                int resulstado = horas * 60;
                System.out.println(" a quantidade de segundos em minutos e:" + horas);
                return resulstado;
            }

            public static int dias(int dias) {///dias em horas
                int resultado = dias * 24;
                System.out.println(" a quantidade de segundos em minutos e:" + dias);
                return resultado;
            }

            private static int semanas(int semanas) {///semanas em dias
                int resultado = semanas * 7;
                System.out.println(" a quantidade de segundos em minutos e:" + semanas);
                return resultado;
            }

            public static double meses(int meses) {///meses em dias
                double resultado = meses * 30.4375;
                System.out.println(" a quantidade de segundos em minutos e:" + meses);
                return resultado;
            }

            public static double anos(int anos) {///
                double resultado = anos * 365.25;
                System.out.println(" a quantidade de segundos em minutos e:" + anos);
                return resultado;
            }

            public class frevers {
                public static void main(String[] args) {
            /*
            Scanner entrada = new Scanner(System.in);
            System.out.println("digite os segundos :");
            segundos(entrada.nextInt());
            horas(entrada.nextInt());
            dias(entrada.nextInt());
            semanas(entrada.nextInt());
            meses(entrada.nextInt());
            anos(entrada.nextInt());
*/
                    int minutos = 2;
                    int segundos = conversorDeTempo.segundos(minutos);
                    System.out.println(minutos + " minutos = " + segundos + " segundos");

                    int horas = 3;
                    int horasConvertidas = conversorDeTempo.horas(horas);
                    System.out.println(horas + " horas = " + horas + " minutos");

                    int dias = 7;
                    int diasConvertidas = conversorDeTempo.dias(dias);
                    System.out.println(horas + " horas = " + dias + " minutos");

                    int semanas = 7;
                    int semanasConvertidas = conversorDeTempo.semanas(semanas);
                    System.out.println(horas + " horas = " + semanas + " minutos");

                    int meses = 7;
                    int mesesConvertidas = (int) conversorDeTempo.meses(meses);
                    System.out.println(horas + " horas = " + meses + " minutos");

                    int anos = 7;
                    int anosConvertidas = (int) conversorDeTempo.anos(anos);///sugestão do intellij fazer casting do int!
                    System.out.println(horas + " horas = " + anos + " minutos");

                    conversorDeTempo.segundos();
                }


            }

            private static void segundos() {///sugestão do intellij
            }
        }
    }
}