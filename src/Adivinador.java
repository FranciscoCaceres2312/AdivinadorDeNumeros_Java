import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Adivinador {
        public static void main(String[] args) {
            Random numAle = new Random();
            Scanner Leer = new Scanner(System.in);

            int numMay=10;
            int numMen=0;

            ArrayList<Integer> numSorteado = new ArrayList<>();

            int opc = 0;

            boolean banderNumRepe = false;
            int num;
            do {
                do {
                    banderNumRepe = false;
                    num = numAle.nextInt(numMay-numMen+1)+numMen;

                    for (int i = 0; i <numSorteado.size(); i++) {
                        if (num == numSorteado.get(i)) {
                            banderNumRepe = true;
                            break;
                        }

                    }
                }while (banderNumRepe);
                numSorteado.add(num);
                System.out.println(num);
                System.out.println("1) El numero es menor");
                System.out.println("2) El numero es mayor");
                System.out.println("3) Es El numero que pense ");
                opc = Leer.nextInt();
                if (opc == 1) {
                    numMay=num;
                    System.out.println("Numero mayor: "+ numMay);
                }else if (opc==2){
                    numMen=num;
                    System.out.println("Numero menor: "+ numMen);
                }
            } while (opc!=3);
        }

}
