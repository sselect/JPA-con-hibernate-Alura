public class Cuenta {

    private int agencia;
    private int numero;
    private double saldo;
    private static int total = 0;

    public Cuenta(int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100;

        System.out.println("Estoy creando una cuenta");
        total++;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Cuenta.total = total;
    }
}

