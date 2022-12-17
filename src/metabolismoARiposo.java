/*
Calcolare il  metabolismo a riposo di una persona, sapendo che esso è diverso tra uomo e donna:
Metabolismo Donna = 65 + (9,6 * peso in kg) + (1,8 * statura in cm) - (4.7 * età in anni)
Metabolismo Uomo = 66 + (13.8 * peso in kg) + (5 * statura in cm) - (6.8 * età in anni)
Sapendo poi che una barretta di cereali  contiene 230 calorie
Quante barrette  servono per mantenere il proprio peso?
(ossia non andare sopra ne sotto con le calorie totali rispetto a quelle del metabolismo).
*/
import java.util.Scanner;
public class metabolismoARiposo {
    public static void main(String[] args) {
        Scanner pers = new Scanner(System.in);
        double calorie = 0.0;
        double peso, statura;
        int eta;
        int barrette=0;
        String sesso = null;
        System.out.println("Metabolismo a riposo");
        System.out.print("Inserisca il peso della persona: ");
        peso = pers.nextDouble();
        System.out.print("Inserisca la statura: ");
        statura = pers.nextDouble();
        System.out.print("Inserisca l'èta; ");
        eta = pers.nextInt();
        System.out.print("Uomo o Donna?: ");
        sesso = pers.next();
        System.out.println();

        switch (sesso) {
            case "Uomo":
            case "uomo":
            case "U":
            case "u":
                sesso="Uomo";
                calorie = 66+(13.8*peso)+(5.0*statura)-(6.8* eta);
                barrette = (int) (calorie/230);
                break;
            case "Donna":
            case "donna":
            case "D":
            case "d":
                sesso="Donna";
                calorie = 66+(13.8*peso)+(5.0 * statura)-(6.8*eta);
                barrette = (int) (calorie/230);
                break;
            default:
            System.out.println("\nDeve inserire un sesso esistente");
            break;

        /*if (sesso=="Uomo" || sesso=="uomo" || sesso=="U" || sesso=="u") {
            metabolismo = 66 + (13.8 * peso) + (5.0 * statura) - (6.8 * eta);
        }
        else if (sesso=="Donna" || sesso=="donna" || sesso=="D" || sesso=="d") {
            metabolismo = 66 + (13.8 * peso) + (5.0 * statura) - (6.8 * eta);
        }
        else{
                System.out.println("\nDeve inserire un sesso esistente");
        } */

        }
        System.out.println("Lei è un " + sesso);
        System.out.println("Per mantenere le " +calorie + " calorie deve consumare " + barrette + " barrette di cereali");
    }
}