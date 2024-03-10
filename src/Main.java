// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int svar1=0;
        String svar;
        int info=0;
        int laga=0;
        int total=0;
        System.out.println("Välkommen till the food program där man kan göra bra mat");
        Ingredienser ingrediens = new Ingredienser();

        Scanner tangentbord = new Scanner(System.in);
        Salt salt = new Salt("Uganda",3, 10);
        Bacon bacon = new Bacon("Danmark",80, 20 );
        Sås sås = new Sås("Spanien",50, 50);
        Ris ris = new Ris("Kina",100, 5);
        Majs majs = new Majs("Argentina",20, 10);

        System.out.println("Vill du laga mat? (Ja/Nej)");
       svar = tangentbord.next();

        while(!"ja".equalsIgnoreCase(svar) && !"nej".equalsIgnoreCase(svar))

                 {

            System.out.println("Du måste skriva 'ja' eller 'nej'");
            svar = tangentbord.next();

                 }
        if(svar.equalsIgnoreCase("nej"))

            {

            info=1;
            laga=2;

             }

        else{
            System.out.println("Tjenare du där borta innan vi börjar skulle du vilja veta lite om ingredienserna?(Ja/Nej)" );
            svar = tangentbord.next();
        }

while(laga!=2){
        while(info==0) {
laga=0;
            if (svar.equalsIgnoreCase("ja"))
            {
                System.out.println("Vilken ingrediens är du intresserad av? 1.Salt 2.bacon 3.Sås 4. Ris 5.Majs 6.Ingen");
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




                    case 2 ->


                                    {
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



                    case 3 ->

                                        {
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



                    case 4 -> {
                        System.out.println("Så du vill veta lite mer om Ris, spännande, Vill du veta 1.Kalorier eller 2.Plats?");
                        svar1 = tangentbord.nextInt();
                        switch (svar1) {

                            case 1 ->

                            {
                                System.out.println("Den här produkten har " + ris.riskalo() + " kalorier");

                            }
                            case 2 ->

                            {
                                System.out.println("Den här produkten kommer ifrån " + ris.risplats());
                            }
                                         }
                                }




                    case 5 ->


                                    {
                        System.out.println("Så du vill veta lite mer om Majs, spännande, Vill du veta 1.Kalorier eller 2.Plats?");
                        svar1 = tangentbord.nextInt();
                        switch (svar1) {


                            case 1 ->

                            {
                                System.out.println("Den här produkten har " + majs.majskalo() + " kalorier");

                            }


                            case 2 -> {
                                System.out.println("Den här produkten kommer ifrån " + majs.majsplats());
                            }
                                          }
                                 }



                    case 6 ->{
                        info=1;
                    }


                }
            }
            else{
                info=1;
            }

        }


        while(laga==0) {
            System.out.println("Vad vill du lägga i kastrullen, 1.Salt 2.bacon 3.Sås 4. Ris 5.Majs 6.Veta mer 7.Avsluta");
            svar1 = tangentbord.nextInt();
            switch (svar1) {


                case 1 -> {
                    if (bacon.uses <= 0) {
                        System.out.println("Du har ingen mer salt");
                    } else {
                        System.out.println("Du har bara " + salt.saltuses() + " kvar");

                        salt.uses--;
                        total += 3;
                        System.out.println("Du har lagt i lite salt och kalorierna av soppan har gått upp till " + total);
                    }
                }


                case 2 -> {
                    if (bacon.uses <= 0) {
                        System.out.println("Du har ingen mer bacon");
                    } else {
                        System.out.println("Du har bara " + bacon.baconuses() + " kvar");

                        bacon.uses--;
                        total += 100;
                        System.out.println("Du har lagt i lite bacon och kalorierna av soppan har gått upp till " + total);
                    }
                }


                case 3 -> {
                    if (sås.uses <= 0) {
                        System.out.println("Du har ingen mer sås");
                    } else {
                        System.out.println("Du har bara " + sås.såsuses() + " kvar");

                        sås.uses--;
                        total += 80;
                        System.out.println("Du har lagt i lite sås och kalorierna av soppan har gått upp till " + total);
                    }
                }


                case 4 -> {
                    if (ris.uses <= 0) {
                        System.out.println("Du har ingen mer ris");
                    } else {
                        System.out.println("Du har bara " + ris.risuses() + " kvar");

                        ris.uses--;
                        total += 100;
                        System.out.println("Du har lagt i lite ris och kalorierna av soppan har gått upp till " + total);
                    }
                }


                case 5 -> {
                    if (majs.uses <= 0) {
                        System.out.println("Du har ingen mer majs");
                    } else {
                        System.out.println("Du har bara " + majs.majsuses() + " kvar");

                        majs.uses--;
                        total += 20;
                        System.out.println("Du har lagt i lite majs och kalorierna av soppan har gått upp till " + total);
                    }
                }



                case 6 -> {
                    laga =1;

                    info = 0;

                }
                case 7 -> {
                    System.out.println("Din maträtt har " + total + " kalorier");
                    laga = 2;

                }
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
        System.out.println("Hejdå!!!");
}

}