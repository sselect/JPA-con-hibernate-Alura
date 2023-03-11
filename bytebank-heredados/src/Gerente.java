
// en este caso "extends" es una extencion de la clase Funcionario
public class Gerente extends Funcionario implements Autenticable {

    public double getBonificacion(){
        System.out.println("Ejecutando desde gerente");
        return 2000;
    }

    @Override
    public void setClave(String clave) {
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return false;
    }
}
