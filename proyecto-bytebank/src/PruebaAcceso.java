public class PruebaAcceso {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(555);
        cuenta.deposita(400);
        cuenta.retira(300);


        System.out.println(cuenta.getSaldo());
        System.out.println(cuenta.getAgencia());
    }

}
