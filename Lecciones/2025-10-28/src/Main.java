public class Main {

    static void main() {
//        sentenciaFor();
        tablasMultiplicar();


    }

    public static void sentenciaFor(){
        for (int i=0; i<5; i++) {
            System.out.println("Ejecutando línea");
        }
        for (int i=100; i>=0; i-=10) {
            System.out.println(i);
        }
    }

    public static void tablasMultiplicar() {
        for (int i = 1; i < 11; i++) {
            System.out.println("Tabla del " + i);
            for (int j = 0; j < 11; j++) {
                System.out.printf("\t%d x %d = %d%n", i, j, i*j);
            }
        }
    }

}
