public class ControlBonificaciones {

    private double suma;

    public double registrarSalario(Funcionario funcionario){
        this.suma = funcionario.getBonificacion() + this.suma;
        System.out.println("Calculo actual: "+this.suma);
        return this.suma;
    }
     //** esto seria sobre escribir el codigo porque todas las funciones abajao de esta
    // ya estan declara en la clase generica FUNCIONARIO  **//
  //  public double registrarSalario(Gerente gerente) {
  //      this.suma = gerente.getBonificacion() + this.suma;
  //      System.out.println("Calculo actual: " + this.suma);
  //      return this.suma;
  // }
  //  public double registrarSalario(Contador contador) {
  //      this.suma = contador.getBonificacion() + this.suma;
  //      System.out.println("Calculo actual: " + this.suma);
  //     return this.suma;
  //  }

}


