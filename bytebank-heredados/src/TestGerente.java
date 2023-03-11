public class TestGerente {

    public static void main(String[] args) {
       Gerente gerente = new Gerente();
       /*
        gerente.setNombre("Ely");
        gerente.setDocumento("17081364");
       */
        gerente.setSalario(5000.0);
        gerente.setClave("AluraCursosOnline");
        gerente.setTipo(1);

        System.out.println(gerente.getBonificacion());
        System.out.println(gerente.iniciarSesion("AluraCursosOnline"));
    }
}

