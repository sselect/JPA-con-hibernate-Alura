public class EjemploCicloFor {

    public static void main(String[] args) {

        // variable      |    condicion      |   ejecutar al FINAL
        for (int contador = 0; contador <= 10; contador++) {
            for (int multiplicacion = 0; multiplicacion <= 10; multiplicacion++)
                System.out.print(contador * multiplicacion);
                System.out.println();
        }
    }
}