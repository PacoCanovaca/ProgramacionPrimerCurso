package Ejercicio6;

public class ToDo {
    public String processTasks(String[] tasks) {
        System.out.println("Próxima tarea urgente: ");
        for (String task : tasks) {
            if (task.toUpperCase().contains("URGENTE")) {
                return task;
            }
        }
        return "No hay tareas urgentes";
    }
}
