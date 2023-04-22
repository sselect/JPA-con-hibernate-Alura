public final class CuentaCorriente extends Cuenta{

    public CuentaCorriente(int agencia, int numero) {
        super(agencia, numero); //super llama cualquier atributo de la clase padre en este caso 'Cuenta'
    }

    @Override
    public void deposita(double valor) {

    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException {
        double valorSacar = valor + 0.2;
        super.saca (valorSacar);
    }
}
