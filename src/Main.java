// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Välkommen till the food program där man kan göra bra food");

        Ingredienser ingrediens = new Ingredienser();

        Scanner tangentbord = new Scanner(System.in);
        Salt salt = new Salt("ugand",3);
        Bacon bacon = new Bacon("primabacon");
        Sås sås = new Sås();

        System.out.println(salt.saltkal());

        System.out.println("Hejsan välkommen till matstugan");
        String svar = tangentbord.next();
        while(!"ja".equalsIgnoreCase(svar) && !"Nej".equalsIgnoreCase(svar))
                 {
            System.out.println("Du måste skriva 'ja' eller 'nej'");
            svar = tangentbord.next();
                 }
        System.out.println("Vill du veta stället där salt kommer ifrån?");
        svar = tangentbord.next();
        if(svar.equalsIgnoreCase("ja"))
                 {
                     salt.saltet();

                 }System.out.println(bacon.baconnamn());

/*
        System.out.println("Vill du dricka saltet?");
        svar = tangentbord.next();
        bacon.bacons();
        if(svar.equalsIgnoreCase("ja"))
        {salt.drink();
            System.out.println("Varför dricker du saltet är du dum i huvet");
        svar = tangentbord.next();
        if(svar.equalsIgnoreCase("ja"))
                     {
            System.out.println("Jag skulle rekommendera att inte dricka saltet");
            svar = tangentbord.next();
            if(svar.equalsIgnoreCase("hej") ){
                System.out.println("Vill du ha såsen");

                    }
        }
    }

 */
}}