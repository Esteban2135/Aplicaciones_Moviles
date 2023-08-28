public class ProgramaUniversidad {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana García", "Alumni");

        double[] notasEstudiante = { 85.5, 90.0, 78.3, 95.2 };
        int[] creditosEstudiante = { 3, 4, 3, 5 };
        Estudiante estudiante = new Estudiante("Carlos Pérez", 12345, notasEstudiante, creditosEstudiante);

        System.out.println("Cliente: " + cliente.getNombre() + ", Tipo: " + cliente.getTipo());

        System.out.println("Estudiante: " + estudiante.getNombre() + ", Matrícula: " + estudiante.getNumeroMatricula());
        System.out.print("Notas: ");
        for (double nota : estudiante.getNotas()) {
            System.out.print(nota + " ");
        }
        System.out.println();
        System.out.print("Créditos: ");
        for (int creditos : estudiante.getCreditos()) {
            System.out.print(creditos + " ");
        }
    }
}


