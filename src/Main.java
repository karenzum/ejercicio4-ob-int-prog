package com.company;


public class Main {
    public static void main(String[] args) {
        int numeroIf = 0;
        if (numeroIf > 0){
            System.out.println("El numero es positivo");
        } else if (numeroIf < 0){
            System.out.println("El numero es negativo");
        } else{
            System.out.println("El numero es igual cero");
        }

        int numeroWhile = 1;

        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile ++;

        }
        do {
            System.out.println("solo una vez "+numeroWhile);
        } while (numeroWhile < 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor ++){
            System.out.println(numeroFor);
        }
        var estacion = "VERANO";

        switch (estacion){
            case "PRIMAVERA":
                System.out.println("La estacion es primavera");
                break;
            case "VERANO" :
                System.out.println("La estacion es verano");
                break;
            case "INVIERNO" :
                System.out.println("La estacion es invierno");
                break;
            case "OTOÑO" :
                System.out.println("La estacion es otoño");
                break;
            default:
                System.out.println("No es una estacion");
        }

    }
}
