package Normal;

import java.util.Scanner;

public class Ejecutarestaturas {
    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);
        Estatura esta = new Estatura();
        int [] alturas=new int[5];

        for (int i =0;i<alturas.length;i++){
            System.out.println("Ingrese la altura del "+ (i+1) + " : ");
            alturas[i]=al.nextInt();
        }
        esta.Estableceralturas(alturas);
        esta.calcualarEstaturas();
        System.out.println("La mayor altura fue de "+esta.Masalto());
        System.out.println("La menor altura fue de "+esta.Masbajo());
    }
}
