public class PruebaMetodos {

    public static void main(String[] args) {

        Cuenta cuentaDeEly = new Cuenta();
        cuentaDeEly.saldo = 300;
        cuentaDeEly.deposita(200);

        System.out.println(cuentaDeEly.getSaldo());

        cuentaDeEly.retira(100);
        System.out.println(cuentaDeEly.getSaldo());

        Cuenta cuentaDeCarmen = new Cuenta();
        cuentaDeCarmen.deposita(1000);
        cuentaDeCarmen.transfiere(400, cuentaDeEly);

        boolean puedeTransferir = cuentaDeCarmen.transfiere(400, cuentaDeEly);

        if (puedeTransferir){
            System.out.println("Transferencia exitosa");
        } else {
            System.out.println("Usted no puede transferir, No tiene plata");
        }

        System.out.println(cuentaDeCarmen.getSaldo());
        System.out.println(cuentaDeEly.getSaldo());

    }
}
