
// en este caso "extends" es una extencion de la clase Funcionario
public class Gerente extends Funcionario{

    private String clave;

    public void setClave(String clave){
        this.clave = clave;
    }

    public boolean iniciarSesion(String clave){
        if (this.clave == "2222"){
           return true;
        }else {
            return false;
         }
        //return clave == "AluraCursoOnline";
    }
    // a esto se le llama sobreescritura del método
    public double getBonificacion(){
        return super.getSalario() +
        super.getBonificacion();
    }
// por lo tanto ya no necesito estos campos que ya están definidos en la clase Funcionario
   // private String nombre;
   // private String documento;
   // private double salario;

   // public String getNombre() {
   //     return nombre;
   // }

   // public void setNombre(String nombre) {
   //     this.nombre = nombre;
   // }

   // public String getDocumento() {
   //     return documento;
   // }

   // public void setDocumento(String documento) {
   //     this.documento = documento;
   // }

   // public double getSalario() {
   //     return salario;
   // }

   //  public void setSalario(double salario) {
   //     this.salario = salario;
   // }

   // public double getBonificacion() {
   //     return this.salario;
   // }

}
