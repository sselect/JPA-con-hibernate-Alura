public class TestAlcance {

    public static void main(String[] args) {
        System.out.println("pruebas condicionales");

        // Ten en cuenta que nuestro
        // código deja de compilarse,
        // ya que nuestra variable se crea dentro del if,
        // cuando llegamos al final del if, deja de existir.

        int edad = 20;
        int cantidadPersonas = 3;
        boolean acompañado;

        acompañado = cantidadPersonas >= 2;

        if (edad >= 18 || acompañado) {
            System.out.println("Bienvenido");
        } else {
            System.out.println("desafortunadamente no puedes ingresar");
        }
    }
}


