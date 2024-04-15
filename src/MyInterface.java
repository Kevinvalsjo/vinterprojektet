import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MyInterface {
    HashMap<String, Ingredienser> allaI = new HashMap<>();
    Ingredienser ing;

    int i = 0;
    int svar1 = i;
    String svar;
    int info = i;
    int laga = i;
    int total = i;
    int k = 0;
    int p;
    int h;

    public MyInterface() {
        System.out.println("Välkommen till the food program där man kan göra bra mat");

        Scanner tangentbord = new Scanner(System.in);

        Bacon bacon;
        Sås sås = new Sås("Spanien", 50, 50);
        Ris ris = new Ris("Kina", 100, 5);
        Majs majs = new Majs("Argentina", 20, 10);
        allaI.put("salt", new Salt("Uganda", 3, 10));
        allaI.put("bacon", new Bacon("Danmark", 80, 20));

//skapar objekt för ingredienserna och anger dess egenskaper

        System.out.println("Vill du laga mat? (Ja/Nej)");
        svar = tangentbord.next();

        while (!"ja".equalsIgnoreCase(svar) && !"nej".equalsIgnoreCase(svar)) {

            System.out.println("Du måste skriva 'ja' eller 'nej'");
            svar = tangentbord.next();

        }//körs tills användaren skriver rätt,


        if (svar.equalsIgnoreCase("nej")) {

            info = 1;
            laga = 2;
//ingen av de tre while looparna kommer köras efter man sätter värdet på info och laga till de här
        } else {
            System.out.println("Tjenare du där borta innan vi börjar laga mat, skulle du vilja veta lite om ingredienserna som du kan välja?(Ja/Nej)");
            svar = tangentbord.next();
        }

        while (laga != 2) {//while loop som omfattar andra while loopar så att man alltid kan t.ex veta mer om en ingrediens oavsett om man har hoppat ur just den while loopen
            while (info == i) {//while loop som används för att veta mer om ingredienser
                laga = 0;
                if (svar.equalsIgnoreCase("ja")) {
                    System.out.println("Vilken ingrediens är du intresserad av? 1.Salt 2.bacon 3.Sås 4.Ris 5.Majs 6.Ingen");
                    ;

                    svar1 = tangentbord.nextInt();
                    switch (svar1) {


                        case 1 -> {
                            ing = allaI.get("salt");
                            System.out.println("Så du vill veta lite mer om salt, spännande, Vill du veta 1.Kalorier eller 2.Plats?");
                            svar1 = tangentbord.nextInt();
                            switch (svar1) {

                                case 1 -> {
                                    System.out.println("Den här produkten har " + ing.kalo() + " kalorier");

                                }
                                case 2 -> {
                                    System.out.println("Den här produkten kommer ifrån " + ing.plats());
                                }
                            }
                        }


                        case 2 -> {
                            /*
                            System.out.println("Så du vill veta lite mer om bacon, spännande, Vill du veta 1.Kalorier eller 2.Plats?");
                            svar1 = tangentbord.nextInt();
                            switch (svar1) {
                                case 1 -> {
                                    System.out.println("Den här produkten har " + bacon.kalo() + " kalorier ");

                                }
                                case 2 -> {
                                    System.out.println("Den här produkten kommer ifrån " + bacon.plats());

                                }
                            }

                             */

                        }


                        case 3 -> {
                            System.out.println("Så du vill veta lite mer om sås, spännande, det finns faktiskt 3 olika såser. Vilken vill du veta mer om? 1.Brunsås 2.Vitlökssås 3.dåligsås");
                            svar1 = tangentbord.nextInt();
                            switch (svar1) {
                                case 1 -> {
                                    svar1 = tangentbord.nextInt();
                                    switch (svar1) {
                                        case 1 -> {
                                            System.out.println("Den här produkten har " + sås.kalo() + " kalorier");

                                        }
                                        case 2 -> {
                                            System.out.println("Den här produkten kommer ifrån " + sås.plats());
                                        }

                                    }
                                }
                                case 2 -> {
                                    svar1 = tangentbord.nextInt();
                                    switch (svar1) {
                                        case 1 -> {
                                            System.out.println("Den här produkten har  kalorier");

                                        }
                                        case 2 -> {
                                            System.out.println("Den här produkten kommer ifrån " + sås.plats());
                                        }
                                    }
                                }
                                case 3 -> {
                                    svar1 = tangentbord.nextInt();
                                    switch (svar1) {
                                        case 1 -> {
                                            System.out.println("Den här produkten har " + sås.kalo() + " kalorier");

                                        }
                                        case 2 -> {
                                            System.out.println("Den här produkten kommer ifrån " + sås.plats());
                                        }
                                    }
                                }
                            }


                            svar1 = tangentbord.nextInt();
                            switch (svar1) {
                                case 1 -> {
                                    System.out.println("Den här produkten har " + sås.kalo() + " kalorier");

                                }
                                case 2 -> {
                                    System.out.println("Den här produkten kommer ifrån " + sås.plats());
                                }
                            }


                        }


                        case 4 -> {
                            System.out.println("Så du vill veta lite mer om Ris, spännande, Vill du veta 1.Kalorier eller 2.Plats?");
                            svar1 = tangentbord.nextInt();
                            switch (svar1) {

                                case 1 -> {
                                    System.out.println("Den här produkten har " + ris.kalo() + " kalorier");

                                }
                                case 2 -> {
                                    System.out.println("Den här produkten kommer ifrån " + ris.plats());
                                }
                            }
                        }


                        case 5 -> {
                            System.out.println("Så du vill veta lite mer om Majs, spännande, Vill du veta 1.Kalorier eller 2.Plats?");
                            svar1 = tangentbord.nextInt();
                            switch (svar1) {


                                case 1 -> {
                                    System.out.println("Den här produkten har " + majs.kalo() + " kalorier");

                                }


                                case 2 -> {
                                    System.out.println("Den här produkten kommer ifrån " + majs.plats());
                                }
                            }
                        }


                        case 6 -> {
                            info = 1;
                        }


                    }
                } else {
                    info = 1;
                }

            }

            while (laga == i) {//while loop som handlar om att laga mat där man får reda på hur många gånger man kan anvämnda något och hur mycket kalorier maträtten innehåller
                System.out.println("Vad vill du lägga i kastrullen, 1.Salt 2.bacon 3.Sås 4. Ris 5.Majs 6.Veta mer 7.Avsluta");
                svar1 = tangentbord.nextInt();
                switch (svar1) {


                    case 1 -> {
                        ing = allaI.get("salt");

                        ing.mat();

                    }


                   /* case 2 -> {
                        p=bacon.uses();
                        Ingredienser ingredienser = new Ingredienser(p);
                        ingredienser.mat();
                    }


                    case 3 -> {

                        p=sås.uses();
                        Ingredienser ingredienser = new Ingredienser(p);
                        ingredienser.mat();


                    }


                    case 4 -> {
                        p=salt.uses();
                        Ingredienser ingredienser = new Ingredienser(p);
                        ingredienser.mat();

                    }


                    case 5 -> {
                        p=ris.uses();
                        Ingredienser ingredienser = new Ingredienser(p);
                        ingredienser.mat();

                    }

                    */


                    case 6 -> {
                        laga = 1;

                        info = i;

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
