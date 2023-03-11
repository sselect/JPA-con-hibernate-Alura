
// abstract o abstracto nos indica que esta clase es abstracta, significa
// es aquella de la que no se pueden declarar instancias, dicho de otra manera no se pueden declarar objetos de una clase abstracta.
// La finalidad de una clase abstracta es servir como clase base para otras clases a las que generalmente se conoce como clases "concretas".
// Correcto. Una clase abstracta representa un concepto, algo abstracto,
// y el compilador no permite instanciar un objeto de esa clase.
// Para crear una instancia, es necesario crear primero una clase hija no abstracta.

public abstract class Funcionario {

    private String nombre;
    private String documento;
    private double salario;
    private int tipo;

    //  constructor es un método del mismo tipo de retorno de la clase
    //  y que puede aceptar parámetros o no para asignarlos a las variables aquí

    public Funcionario() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double getBonificacion();

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
