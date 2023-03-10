public class TestReferencias {

    public static void main(String[] args) {

        //Elemento más generico puede ser adaptado
        //                     al elemento más específico
        Funcionario funcionario = new Gerente();
        funcionario.setNombre("Diego");

        Gerente gerente = new Gerente();
        gerente.setNombre("Jimena");

        Gerente g1 = new Gerente();
        g1.setNombre("Marcos");
        g1.setSalario(5000.0);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        Designer d = new Designer();
        d.setSalario(2000.0);

        ControleBonificacion controleBonificacion = new ControleBonificacion();
        controleBonificacion.registrar(g1);
        controleBonificacion.registrar (ev);
        controleBonificacion.registrar(d);

        funcionario.setSalario(2000);
        gerente.setSalario(10000);

        System.out.println(controleBonificacion.getSuma());
    }
}
