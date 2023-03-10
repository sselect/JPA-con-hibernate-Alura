public class ProgramaConBreak {

    public static void main(String[] args) {

        for (int numero1 = 0; numero1 <=20; numero1++){
            for (int numero2 = 0; numero2 <=20; numero2++){
                if (numero1 <= numero2){
                    break;
                }
                System.out.print(numero1);
                System.out.print("#");
                System.out.print(" ");

            }
            System.out.println();
        }
    }
}
