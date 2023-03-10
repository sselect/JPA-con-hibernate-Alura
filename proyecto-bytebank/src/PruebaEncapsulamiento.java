public class PruebaEncapsulamiento {
    public static void main(String[] args) {
        Cuenta cuenta  = new Cuenta();
        Cliente cliente = new Cliente();
        cliente.setNombre("ely");
        cliente.setDocumento("17081364");


        cuenta.setTitular(cliente);

        System.out.println(cliente.getNombre());
        System.out.println(cuenta.getTitular().getNombre());
    }
}
