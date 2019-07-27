package com.sda11.exempleArrays;

import java.util.Scanner;

public class ArrayCititTastatura {

    public static void main (String [] args){
        Scanner input=new Scanner(System.in);


        int lungimeSir;

//CIITM LUNGIMEA SIRULUI DE LA TASTATURA

        System.out.println( "Introduceti lungimea sirului : ");
        lungimeSir=input.nextInt();

        int [] sirDeElemente=new int [lungimeSir];

        //citim elementele

        for (int i=0 ; i< lungimeSir; i++) {

            System.out.println("Introduceti elementul " + (i + 1));
            sirDeElemente[i] = input.nextInt();
        }

//afisam elementele sirului introdus

    for(int i=0; i<lungimeSir; i++){

        System.out.println("Elementele cu indexul " +i + "este" + sirDeElemente [i]);
    }
      for (int i:sirDeElemente){
            System.out.println(i);
        }

    }
}
