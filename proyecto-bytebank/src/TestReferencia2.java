

public class TestReferencia2 {

    public static void main(String[] args) {

        Cliente ely = new Cliente();
        ely.setNombre("Ely");
        ely.setDocumento("17081364");
        ely.setNombre("920289601");

        Cuenta cuentaDeEly = new Cuenta();
        cuentaDeEly.setAgencia(22);
        cuentaDeEly.getTitular();

        System.out.println(cuentaDeEly.getTitular().getDocumento());
    }
}
