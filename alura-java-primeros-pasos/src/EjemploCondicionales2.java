public class EjemploCondicionales2 {

    public static void main(String[] args) {
        System.out.println("hola mundo ");

        int edad = 15;
        int cantidadPersonas = 2;

        boolean esPareja = cantidadPersonas > 1;
        boolean puedeEntrar = edad >= 18 && esPareja;

        System.out.println("El valor de la condiciones es:" + true);

        if (puedeEntrar) {
            System.out.println("Usted puede entrar");
        } else {
            System.out.println("Usted no esta permitido a "
                    + "entrar");
        }
    }
}
