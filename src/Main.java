// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int svar1=0;
        String svar;
        int fortsätt=0;
        System.out.println("Välkommen till the food program där man kan göra bra food");

        Ingredienser ingrediens = new Ingredienser();

        Scanner tangentbord = new Scanner(System.in);
        Salt salt = new Salt("uganda",3);
        Bacon bacon = new Bacon("primabacon",80);
        Sås sås = new Sås("Spanien",100);



        System.out.println("Hejsan välkommen till matstugan vill du laga mat");
       svar = tangentbord.next();
        while(!"ja".equalsIgnoreCase(svar) && !"Nej".equalsIgnoreCase(svar))
                 {
            System.out.println("Du måste skriva 'ja' eller 'nej'");
            svar = tangentbord.next();
                 }


       /* System.out.println("Vill du veta stället där salt kommer ifrån?");
        svar = tangentbord.next();
        if(svar.equalsIgnoreCase("ja"))
                 {
                     salt.saltet();

                 }
*/

        System.out.println("Tjenare du där borta innan vi börjar skulle du vilja veta lite om ingredienserna? säg ja" );
        svar = tangentbord.next();
        while(fortsätt==0) {
            if (svar.equalsIgnoreCase("ja")) {
                System.out.println("vilken ingrediens är du intresserad av? 1.Salt 2.bacon 3.Sås");
                ;

                svar1 = tangentbord.nextInt();
                switch (svar1) {
                    case 1 -> {
                        System.out.println("Så du vill veta lite mer om salt, spännande, Vill du veta 1.Kalorier eller 2.Plats?");
                        svar1 = tangentbord.nextInt();
                        switch (svar1) {

                            case 1 -> {
                                System.out.println("Den här produkten har " + salt.saltkalo() + " kalorier");

                            }
                            case 2 -> {
                                System.out.println("Den här produkten kommer ifrån " + salt.saltplats());
                            }
                        }
                    }

                    case 2 -> {
                        System.out.println("Så du vill veta lite mer om bacon, spännande, Vill du veta 1.Kalorier eller 2.Plats?");
                        svar1 = tangentbord.nextInt();
                        switch (svar1) {
                            case 1 -> {
                                System.out.println("Den här produkten har " + bacon.baconkalo() + " kalorier ");

                            }
                            case 2 -> {
                                System.out.println("Den här produkten kommer ifrån " + bacon.baconplats());

                            }
                        }
                    }


                    case 3 -> {
                        System.out.println("Så du vill veta lite mer om sås, spännande, Vill du veta 1.Kalorier eller 2.Plats?");
                        svar1 = tangentbord.nextInt();
                        switch (svar1) {
                            case 1 -> {
                                System.out.println("Den här produkten har " + sås.såskalo() + " kalorier");

                            }
                            case 2 -> {
                                System.out.println("Den här produkten kommer ifrån " + sås.såsplats());
                            }
                        }
                    }


                } System.out.println("Vill du veta mer om ingredienserna? svara ja isåfall");
                svar= tangentbord.next();
                if(svar.equalsIgnoreCase("nej")){
                    fortsätt=1;
                }
            }

        }


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