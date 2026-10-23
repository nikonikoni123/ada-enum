package Enum;

public class controller {
    private input input = new input();
    private evaluation evaluation = new evaluation(new double[0], 0.0);
    private double[] notes;

    public controller() {
        System.out.print("Ingrese el número de notas: ");
        int n = input.getNotes();
        notes = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notes[i] = input.getValue();
        }
        System.out.print("Ingrese el porcentaje de asistencia: ");
        double asistance = input.getPercentage();
        evaluation = new evaluation(notes, asistance);
        System.out.println(evaluation.result());
    }
}
