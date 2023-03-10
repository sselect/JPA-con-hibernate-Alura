public class TestGerente {

    public static void main(String[] args) {
       Gerente gerente = new Gerente();
        gerente.setNombre("Ely");
        gerente.setDocumento("17081364");
        gerente.setSalario(5000.0);

        System.out.println(gerente.getNombre());
        System.out.println(gerente.getDocumento());
        System.out.println(gerente.getSalario());

        gerente.setClave("2222");
        boolean autenticou = gerente.iniciarSesion("2222");

        System.out.println(autenticou);
        System.out.println(gerente.getBonificacion());
    }
}

