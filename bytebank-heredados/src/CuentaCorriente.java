public final class CuentaCorriente extends Cuenta{

    public CuentaCorriente(int agencia, int numero) {
        super(agencia, numero); //super llama cualquier atributo de la clase padre en este caso 'Cuenta'
    }

    @Override
    public boolean saca(double valor) {
        double comision = 0.2;
        return super.saca(valor + comision);
    }
}
