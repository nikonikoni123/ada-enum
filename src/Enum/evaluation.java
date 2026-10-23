package Enum;

class evaluation {

    private double[] notes;
    private double asistance;

    protected evaluation(double[] notes, double asistance) {
        this.notes = notes;
        this.asistance = asistance;
    }

    protected String result() {
        double average = 0;
        for (double note : notes) {
            average += note;
        }
        average /= notes.length;

        if (average >= 4.5 && asistance >= 80.0) {
            return "APROBADO \uD83D\uDE00, su nota es:" + average;
        } else if (average >= 4.5 && asistance < 80.0) {
            return "REPROBADO POR ASISTENCIA \uD83D\uDE1E";
        } else if (average < 4.5 && asistance >= 80.0) {
            return "REPROBADO POR NOTAS \uD83D\uDE1E su nota es:" + average;
        }
        else {
            return "REPROBADO \uD83D\uDE1E";
        }
    }


}
