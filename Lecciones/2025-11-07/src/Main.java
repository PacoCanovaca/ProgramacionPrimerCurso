public class Main {

    public static void main(String[] args) {

        DiasSemana diasSemana = DiasSemana.Viernes;

        switch (diasSemana) {
            case Lunes -> {
                System.out.println("Laborable");
            }
            case Martes -> {
                System.out.println("Laborable");
            }
            case Miercoles -> {
                System.out.println("Laborable");
            }
            case Jueves -> {
                System.out.println("Laborable");
            }
            case Viernes -> {
                System.out.println("Laborable, ya queda poco!!");
            }
            case Sabado -> {
                System.out.println("Descanso");
            }
            case Domingo -> {
                System.out.println("Descanso");
            }
        }

        switch (diasSemana) {
            case Lunes:
            case Martes:
            case Miercoles:
            case Jueves:
                System.out.println("Laborable");
                break;
            case Viernes:
                System.out.println("Laborable, ya queda poco!!");
                break;
            case Sabado:
            case Domingo:
                System.out.println("Descanso");
                break;
        }

        switch (diasSemana) {
            case Lunes, Martes, Miercoles, Jueves -> {
                System.out.println("Laborable");
            }
            case Viernes -> {
                System.out.println("Laborable, ya queda poco!!");
            }
            case Sabado, Domingo -> {
                System.out.println("Descanso");
            }
        }

    }

}
