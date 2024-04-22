import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MyInterface {
    HashMap<String, Ingredienser> allaI = new HashMap<>();
    Ingredienser ing;
    int Total;
    int i = 0;
    int svar1 = i;
    String svar;
    int info = i;
    int laga = i;
    int total = i;
    int k = 0;
    int p;
    int h;
    String svar2;

    public MyInterface() {
        System.out.println("Välkommen till the food program där man kan göra bra mat");
        int[] total = new int[7];
        Scanner tangentbord = new Scanner(System.in);
        Bacon bacon;
        allaI.put("dåligsås", new dåligsås("Spanien", 10, 10));
        allaI.put("vitlökssås", new Vitlökssås("Spanien", 10, 2));
        allaI.put("brunsås", new Brunsås("Spanien", 10, 5));
        allaI.put("sås", new Sås("Spanien", 50, 50));
        allaI.put("ris", new Ris("Kina", 100, 5));
        allaI.put("majs", new Majs("Argentina", 20, 10));
        allaI.put("salt", new Salt("Uganda", 3, 10));
        allaI.put("bacon", new Bacon("Danmark", 80, 20));

//skapar objekt för ingredienserna och anger dess egenskaper

        for (int r = 0; r < 7; r++) {
            total[r] = 0;

        }
        System.out.println("Vill du laga mat? (Ja/Nej)");
        svar2 = tangentbord.next();

        while (!"ja".equalsIgnoreCase(svar2) && !"nej".equalsIgnoreCase(svar2)) {

            System.out.println("Du måste skriva 'ja' eller 'nej'");
            svar2 = tangentbord.next();

        }//körs tills användaren skriver rätt,


        if (svar2.equalsIgnoreCase("nej")) {

            info = 1;
            laga = 2;
//ingen av de tre while looparna kommer köras efter man sätter värdet på info och laga till de här
        } else {
            System.out.println("Tjenare du där borta innan vi börjar laga mat, skulle du vilja veta lite om ingredienserna som du kan välja?(Ja/Nej)");
            svar2 = tangentbord.next();
            while (!"ja".equalsIgnoreCase(svar2) && !"nej".equalsIgnoreCase(svar2)) {

                System.out.println("Du måste skriva 'ja' eller 'nej'");
                svar2 = tangentbord.next();

            }
        }

        while (laga != 2) {
            //while loop som omfattar andra while loopar så att man alltid kan t.ex veta mer om en ingrediens oavsett om man har hoppat ur just den while loopen
            while (info == i) {//while loop som används för att veta mer om ingredienser
                if (svar2.equalsIgnoreCase("ja")) {
                    System.out.println("Vilken ingrediens är du intresserad av? 1.Salt 2.bacon 3.Sås 4.Ris 5.Majs 6.Ingen");
                    svar = tangentbord.next();

                    while (!"1".equalsIgnoreCase(svar) && !"2".equalsIgnoreCase(svar) && !"3".equalsIgnoreCase(svar) && !"4".equalsIgnoreCase(svar) && !"5".equalsIgnoreCase(svar) && !"6".equalsIgnoreCase(svar)) {

                        System.out.println("Du måste skriva en siffra i intervallet 1-6");
                        svar = tangentbord.next();

                    }

                    svar1 = Integer.parseInt(svar);
                    switch (svar1) {


                        case 1 -> {
                            ing = allaI.get("salt");
                            System.out.println("Så du vill veta lite mer om salt, spännande, Vill du veta 1.Kalorier eller 2.Plats?");
                            svar = tangentbord.next();

                            while (!"1".equalsIgnoreCase(svar) && !"2".equalsIgnoreCase(svar)) {

                                System.out.println("Du måste skriva en siffra i intervallet 1-2");
                                svar = tangentbord.next();

                            }

                            svar1 = Integer.parseInt(svar);

                            switch (svar1) {

                                case 1 -> {
                                    System.out.println("Den här produkten har " + ing.getkalo() + " kalorier");

                                }
                                case 2 -> {
                                    System.out.println("Den här produkten kommer ifrån " + ing.getlocation());
                                }
                            }
                        }


                        case 2 -> {
                            ing = allaI.get("bacon");
                            System.out.println("Så du vill veta lite mer om bacon, spännande, Vill du veta 1.Kalorier eller 2.Plats?");
                            svar = tangentbord.next();

                            while (!"1".equalsIgnoreCase(svar) && !"2".equalsIgnoreCase(svar)) {

                                System.out.println("Du måste skriva en siffra i intervallet 1-2");
                                svar = tangentbord.next();

                            }

                            svar1 = Integer.parseInt(svar);
                            switch (svar1) {
                                case 1 -> {
                                    System.out.println("Den här produkten har " + ing.getkalo() + " kalorier ");

                                }
                                case 2 -> {
                                    System.out.println("Den här produkten kommer ifrån " + ing.getlocation());

                                }
                            }


                        }


                        case 3 -> {
                            ing = allaI.get("sås");
                            System.out.println("Så du vill veta lite mer om sås, spännande, det finns faktiskt 3 olika såser. Vilken vill du veta mer om? 1.Brunsås 2.Vitlökssås 3.dåligsås");
                            svar = tangentbord.next();

                            while (!"1".equalsIgnoreCase(svar) && !"2".equalsIgnoreCase(svar)) {

                                System.out.println("Du måste skriva en siffra i intervallet 1-2");
                                svar = tangentbord.next();

                            }

                            svar1 = Integer.parseInt(svar);
                            switch (svar1) {
                                case 1 -> {
                                    System.out.println("Så du vill veta lite mer om brunsåsen? 1.Kalorier 2.Plats");
                                    ing = allaI.get("brunsås");
                                    svar1 = tangentbord.nextInt();
                                    switch (svar1) {
                                        case 1 -> {
                                            System.out.println("Den här produkten har " + ing.getkalo() + " kalorier");

                                        }
                                        case 2 -> {
                                            System.out.println("Den här produkten kommer ifrån " + ing.getlocation());
                                        }

                                    }
                                }
                                case 2 -> {
                                    System.out.println("Så du vill veta lite mer om vitlökssåsen? 1.Kalorier 2.Plats");
                                    ing = allaI.get("vitlökssås");
                                    svar = tangentbord.next();

                                    while (!"1".equalsIgnoreCase(svar) && !"2".equalsIgnoreCase(svar)) {

                                        System.out.println("Du måste skriva en siffra i intervallet 1-2");
                                        svar = tangentbord.next();

                                    }

                                    svar1 = Integer.parseInt(svar);
                                    switch (svar1) {
                                        case 1 -> {
                                            System.out.println("Den här produkten har  kalorier");

                                        }
                                        case 2 -> {
                                            System.out.println("Den här produkten kommer ifrån " + ing.getlocation());
                                        }
                                    }
                                }
                                case 3 -> {
                                    ing = allaI.get("dåligsås");
                                    System.out.println("Så du vill veta lite mer om såsen som smakar jättedåligt? 1.Kalorier 2.Plats");
                                    svar = tangentbord.next();

                                    while (!"1".equalsIgnoreCase(svar) && !"2".equalsIgnoreCase(svar)) {

                                        System.out.println("Du måste skriva en siffra i intervallet 1-2");
                                        svar = tangentbord.next();

                                    }

                                    svar1 = Integer.parseInt(svar);
                                    switch (svar1) {
                                        case 1 -> {
                                            System.out.println("Den här produkten har " + ing.getkalo() + " kalorier");

                                        }
                                        case 2 -> {
                                            System.out.println("Den här produkten kommer ifrån " + ing.getlocation());
                                        }
                                    }
                                }
                            }
                        }


                        case 4 -> {
                            ing = allaI.get("ris");
                            System.out.println("Så du vill veta lite mer om Ris, spännande, Vill du veta 1.Kalorier eller 2.Plats?");
                            svar = tangentbord.next();

                            while (!"1".equalsIgnoreCase(svar) && !"2".equalsIgnoreCase(svar)) {

                                System.out.println("Du måste skriva en siffra i intervallet 1-2");
                                svar = tangentbord.next();

                            }

                            svar1 = Integer.parseInt(svar);
                            switch (svar1) {

                                case 1 -> {
                                    System.out.println("Den här produkten har " + ing.getkalo() + " kalorier");

                                }
                                case 2 -> {
                                    System.out.println("Den här produkten kommer ifrån " + ing.getlocation());
                                }
                            }
                        }


                        case 5 -> {
                            ing = allaI.get("majs");
                            System.out.println("Så du vill veta lite mer om Majs, spännande, Vill du veta 1.Kalorier eller 2.Plats?");
                            svar = tangentbord.next();

                            while (!"1".equalsIgnoreCase(svar) && !"2".equalsIgnoreCase(svar)) {

                                System.out.println("Du måste skriva en siffra i intervallet 1-2");
                                svar = tangentbord.next();

                            }

                            svar1 = Integer.parseInt(svar);
                            switch (svar1) {


                                case 1 -> {
                                    System.out.println("Den här produkten har " + ing.getkalo() + " kalorier");

                                }


                                case 2 -> {
                                    System.out.println("Den här produkten kommer ifrån " + ing.getlocation());
                                }
                            }
                        }


                        case 6 -> {
                            info = 1;
                            laga = i;

                        }


                    }
                } else {
                    info = 1;
                    laga = i;


                }

            }

            while (laga == i) {//while loop som handlar om att laga mat där man får reda på hur många gånger man kan anvämnda något och hur mycket kalorier maträtten innehåller
                System.out.println("Vad vill du lägga i kastrullen, 1.Salt 2.bacon 3.Sås 4. Ris 5.Majs 6.Veta mer 7.Avsluta");
                svar1 = tangentbord.nextInt();
                switch (svar1) {


                    case 1 -> {
                        ing = allaI.get("salt");

                        total[1] = ing.mat();
                    }


                    case 2 -> {
                        ing = allaI.get("bacon");
                        total[2] = ing.mat();
                    }


                    case 3 -> {

                        ing = allaI.get("sås");
                        total[3] = ing.mat();
                    }


                    case 4 -> {
                        ing = allaI.get("ris");

                        total[4] = ing.mat();
                    }


                    case 5 -> {
                        ing = allaI.get("majs");

                        total[5] = ing.mat();

                    }


                    case 6 -> {
                        laga = 1;

                        info = i;

                    }
                    case 7 -> {
                        int totalen = total[1] + total[2] + total[3] + total[4] + total[5];
                        System.out.println("Din maträtt har " + totalen + " kalorier");
                        laga = 2;

                    }
                }


            }


        }
        System.out.println("Du har " + total[1] + " kalorier salt");
        System.out.println("Du har " + total[2] + " kalorier bacon");
        System.out.println("Du har " + total[3] + " kalorier sås");
        System.out.println("Du har " + total[4] + " kalorier ris");
        System.out.println("Du har " + total[5] + " kalorier majs");
        tangentbord.next();
        System.out.println("Vill du dricka saltet?");
        svar = tangentbord.next();
        if (svar.equalsIgnoreCase("ja")) {
            System.out.println("Varför dricker du saltet är du dum i huvet");
            svar = tangentbord.next();
            if (svar.equalsIgnoreCase("ja")) {
                System.out.println("Jag skulle rekommendera att inte dricka saltet");
                svar = tangentbord.next();
                if (svar.equalsIgnoreCase("hej")) {
                    System.out.println("Vill du ha såsen");

                }
            }
        }


        System.out.println("Hejdå!!!");
    }


}
