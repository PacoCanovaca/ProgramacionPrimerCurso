import java.sql.SQLOutput;

public class Tema3 {

    static void main() {

        examenAprobado(6);
        examenAprobado(3);
        notaExamen(6);
        notaExamen(8);
        notaExamen(9);
        notaExamen(10);


    }

    public static void examenAprobado(int nota) {

        if (nota >= 5) {
            System.out.println("El examen está aprobado");
        } else {
            System.out.println("El examen está suspenso");
        }

    }

    public static void notaExamen(int nota) {
        if (nota>0 && nota<=10) {
            if (nota > 0 && nota < 5) {
                System.out.println("El examen está suspenso");
            } else if (nota < 7) {
                System.out.println("El examen está aprobado");
            } else if (nota < 9) {
                System.out.println("El examen es notable");
            } else if (nota < 10) {
                System.out.println("El examen es sobresaliente");
            } else {
                System.out.println("Tienes una matrícula de honor");
            }
        } else {
            System.out.println("La nota no está en la escala correcta");
        }
    }

}
