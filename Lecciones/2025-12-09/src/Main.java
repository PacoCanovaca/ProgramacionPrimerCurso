import model.Coche;

public class Main {

    public static void main(String[] args) {
        Coche audi = new Coche("Audi", "eTron", "23432A", "Blanco", 500);
        Coche ford = new Coche("Ford", "Focus", 40000);
        Coche opel = new Coche();
        System.out.println("Los CV que tiene el Audi son " + audi.getCv());
        audi.setCv(70);
        System.out.println("Los CV que tiene el Audi son " + audi.getCv());
        System.out.println("El modelo del coche es " + audi.getModelo());
    }

}
