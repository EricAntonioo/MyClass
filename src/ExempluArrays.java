package com.sda11.exempleArrays;

public class ExempluArrays {

    public static void main (String[] args){


        int [] numereIntregi=new int[5];

        numereIntregi[0]=56;
        numereIntregi[1]=44;
        numereIntregi[2]=35;
        numereIntregi[3]=21;
        numereIntregi[4]=87;

        System.out.println("Elementul care are indexul 3 are valoarea " + numereIntregi [3]);
        System.out.println("Lungimea sirului de numere este : " + numereIntregi.length );

        boolean[] valoriBooleene = {true,false,false,true};

        System.out.println( "Valoarea de la Indexul 1 este: " + valoriBooleene [1]);
        System.out.println( "Lungimea sirului de valori boleene este " + valoriBooleene.length);


        for (int nr:numereIntregi){
            System.out.println(nr);
        }
    }
}
