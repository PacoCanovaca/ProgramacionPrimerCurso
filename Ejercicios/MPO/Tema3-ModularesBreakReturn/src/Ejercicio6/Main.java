package Ejercicio6;

public class Main {
    public static void main(String[] args) {
        ToDo toDo = new ToDo();
        String[] toDoList = {"Limpiar la habitación", "Lavar la ropa", "Sacar el lavavajillas (urgente)", "URGENTE Echar gasolina"};
        System.out.println(toDo.processTasks(toDoList));
        String[] toDoList2 = {"Limpiar la habitación", "Lavar la ropa", "Sacar el lavavajillas", "Echar gasolina"};
        System.out.println(toDo.processTasks(toDoList2));
    }
}
