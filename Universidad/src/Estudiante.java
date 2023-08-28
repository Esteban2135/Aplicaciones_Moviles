public class Estudiante extends PersonaUniversidad implements Registro {
    private int numeroMatricula;
    private double[] notas;
    private int[] creditos;

    public Estudiante(String nombre, int numeroMatricula, double[] notas, int[] creditos) {
        super(nombre);
        this.numeroMatricula = numeroMatricula;
        this.notas = notas;
        this.creditos = creditos;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public int[] getCreditos() {
        return creditos;
    }

    public void setCreditos(int[] creditos) {
        this.creditos = creditos;
    }
}
