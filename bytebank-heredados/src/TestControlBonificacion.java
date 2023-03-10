public class TestControlBonificacion {

    public static void main(String[] args) {
        Funcionario diego = new Funcionario();
        diego.setSalario(2000);

        Gerente jimena = new Gerente();
        jimena.setSalario(10000);

        Contador ely = new Contador();
        ely.setSalario(5000);

        ControlBonificaciones controlBonificaciones =
                new ControlBonificaciones();

        controlBonificaciones.registrarSalario(diego);
        controlBonificaciones.registrarSalario(jimena);
        controlBonificaciones.registrarSalario(ely);

    }
}
