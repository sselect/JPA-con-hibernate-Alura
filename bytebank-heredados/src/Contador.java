public class Contador extends Funcionario {

    @Override
    public double getBonificacion() {
             System.out.println("Ejecutando desde..");
             return 200;
    }
}
