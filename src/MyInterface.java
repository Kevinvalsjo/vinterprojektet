import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MyInterface {
    HashMap<String, Ingredienser> allaI = new HashMap<>();
    Ingredienser ing;
    int eat;
    int värma;
    int Total;
    int värme;
    int i = 0;
    int svar1 = i;
    String svar;
    int info = i;
    int laga = i;
    int total = i;
    int k;
    int p;
    int h;
    String svar2;

    public MyInterface() {
        System.out.println("Välkommen till the food program där man kan göra bra mat");
        int[] total = new int[7];
        Scanner input = new Scanner(System.in);
        Bacon bacon;
        allaI.put("dåligsås", new dåligsås("Bermuda Triangeln", 10, 10, 30));
        allaI.put("vitlökssås", new Vitlökssås("Spanien", 10, 3, 150));
        allaI.put("brunsås", new Brunsås("Antarktis", 10, 5, 40));
        allaI.put("sås", new Sås("Spanien", 50, 50, 30));
        allaI.put("ris", new Ris("Kina", 100, 5, 70));
        allaI.put("majs", new Majs("Argentina", 20, 10, 2000));
        allaI.put("salt", new Salt("Uganda", 3, 10, 150));
        allaI.put("bacon", new Bacon("Danmark", 80, 20, 200));

//skapar objekt för ingredienserna och anger dess egenskaper

        for (int r = 0; r < 7; r++) {
            total[r] = 0;

        }
        System.out.println("Vill du laga mat? (Ja/Nej)");
        svar2 = input.next();

        while (!"ja".equalsIgnoreCase(svar2) && !"nej".equalsIgnoreCase(svar2)) {

            System.out.println("Du måste skriva 'ja' eller 'nej'");
            svar2 = input.next();

        }//körs tills användaren skriver rätt,


        if (svar2.equalsIgnoreCase("nej")) {

            info = 1;
            laga = 2;
//ingen av de tre while looparna kommer köras efter man sätter värdet på info och laga till de här
        } else {
            System.out.println("Tjenare du där borta innan vi börjar laga mat, skulle du vilja veta lite om ingredienserna som du kan välja?(Ja/Nej)");
            svar2 = input.next();
            while (!"ja".equalsIgnoreCase(svar2) && !"nej".equalsIgnoreCase(svar2)) {

                System.out.println("Du måste skriva 'ja' eller 'nej'");
                svar2 = input.next();

            }
        }

        while (laga != 2) {
            //while loop som omfattar andra while loopar så att man alltid kan t.ex veta mer om en ingrediens oavsett om man har hoppat ur just den while loopen
            while (info == i) {//while loop som används för att veta mer om ingredienser
                if (svar2.equalsIgnoreCase("ja")) {
                    System.out.println("Vilken ingrediens är du intresserad av? 1.Salt 2.bacon 3.Sås 4.Ris 5.Majs 6.Ingen");
                    svar = input.next();

                    while (!"1".equalsIgnoreCase(svar) && !"2".equalsIgnoreCase(svar) && !"3".equalsIgnoreCase(svar) && !"4".equalsIgnoreCase(svar) && !"5".equalsIgnoreCase(svar) && !"6".equalsIgnoreCase(svar)) {

                        System.out.println("Du måste skriva en siffra i intervallet 1-6");
                        svar = input.next();

                    }

                    svar1 = Integer.parseInt(svar);
                    switch (svar1) {


                        case 1 -> {
                            ing = allaI.get("salt");
                            System.out.println("Så du vill veta lite mer om salt, spännande, Vill du veta 1.Kalorier eller 2.Plats?");
                            svar = input.next();

                            while (!"1".equalsIgnoreCase(svar) && !"2".equalsIgnoreCase(svar)) {

                                System.out.println("Du måste skriva en siffra i intervallet 1-2");
                                svar = input.next();

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
                            svar = input.next();

                            while (!"1".equalsIgnoreCase(svar) && !"2".equalsIgnoreCase(svar)) {

                                System.out.println("Du måste skriva en siffra i intervallet 1-2");
                                svar = input.next();

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
                            svar = input.next();

                            while (!"1".equalsIgnoreCase(svar) && !"2".equalsIgnoreCase(svar) && !"3".equalsIgnoreCase(svar)) {

                                System.out.println("Du måste skriva en siffra i intervallet 1-3");
                                svar = input.next();

                            }

                            svar1 = Integer.parseInt(svar);
                            switch (svar1) {
                                case 1 -> {
                                    System.out.println("Så du vill veta lite mer om brunsåsen? 1.Kalorier 2.Plats");
                                    ing = allaI.get("brunsås");
                                    svar1 = input.nextInt();
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
                                    svar = input.next();

                                    while (!"1".equalsIgnoreCase(svar) && !"2".equalsIgnoreCase(svar)) {

                                        System.out.println("Du måste skriva en siffra i intervallet 1-2");
                                        svar = input.next();

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
                                    svar = input.next();

                                    while (!"1".equalsIgnoreCase(svar) && !"2".equalsIgnoreCase(svar)) {

                                        System.out.println("Du måste skriva en siffra i intervallet 1-2");
                                        svar = input.next();

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
                            svar = input.next();

                            while (!"1".equalsIgnoreCase(svar) && !"2".equalsIgnoreCase(svar)) {

                                System.out.println("Du måste skriva en siffra i intervallet 1-2");
                                svar = input.next();

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
                            svar = input.next();

                            while (!"1".equalsIgnoreCase(svar) && !"2".equalsIgnoreCase(svar)) {

                                System.out.println("Du måste skriva en siffra i intervallet 1-2");
                                svar = input.next();

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
                System.out.println("Vad vill du lägga i kastrullen, 1.Salt 2.bacon 3.Sås 4. Ris 5.Majs 6.Veta mer 7.Avsluta, Om du får slut på en ingrediens kommer du bli riktigt arg");
                svar1 = input.nextInt();
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


        System.out.println("Nu är det då dags att sätta på spisen, Vill du veta lite om ingrediensernas gradtålighet innan du börjar ja/nej");
        svar = input.next();
        while (!"ja".equalsIgnoreCase(svar) && !"nej".equalsIgnoreCase(svar)) {

            System.out.println("Du måste skriva 'ja' eller 'nej'");
            svar = input.next();
        }
        boolean san = svar.equalsIgnoreCase("ja");
        if (san = true) {
            while (san == true) {
                System.out.println("Okej Vilken vill du veta mer om 1.Salt 2.bacon 3.Sås 4.Ris 5.Majs 6.Ingen");
                svar1 = input.nextInt();
                switch (svar1) {
                    case 1 -> {
                        ing = allaI.get("salt");
                        System.out.println("Den här ingrediensen kommer dö vid temperaturen  " + ing.getgrader() + " grader");

                    }


                    case 2 -> {
                        ing = allaI.get("bacon");
                        System.out.println("Den här ingrediensen kommer dö vid temperaturen " + ing.getgrader() + " grader");

                    }


                    case 3 -> {
                        ing = allaI.get("sås");
                        System.out.println("Den här ingrediensen kommer dö vid temperaturen" + ing.getgrader() + "grader");


                    }


                    case 4 -> {
                        ing = allaI.get("ris");
                        System.out.println("Den här ingrediensen kommer dö vid temperaturen  " + ing.getgrader() + " grader");


                    }


                    case 5 -> {
                        ing = allaI.get("majs");
                        System.out.println("Den här ingrediensen kommer dö vid temperaturen  " + ing.getgrader() + " grader");

                    }


                    case 6 -> {
                        laga = 1;

                        info = i;
                        san = false;
                    }
                }
            }
        } else {
            System.out.println("Taskigt");
        }
        System.out.println("Nu är det dags att dra på värmen,För att starta värmning skriv 1,För att stoppa värmning skriv 2,");
        svar1 = input.nextInt();
        switch (svar1) {

            case 1 -> {

                ing = allaI.get("sås");
                while (värme <= 2000 || värma == 0) {
                    for (int r = 0; r < 2000; r++) {
                        värme = r;


                        if (värme == ing.getgrader()) {
                            System.out.println("Såsen dog men vem bryr sig");
                            ing = allaI.get("ris");
                        }
                        if (värme == ing.getgrader()) {
                            System.out.println("Blev det risgrynsgröt? riset dör");
                            ing = allaI.get("salt");
                        }
                        if (värme == ing.getgrader()) {
                            System.out.println("o nej salten dö:(");
                            ing = allaI.get("bacon");
                        }
                        if (värme == ing.getgrader()) {
                            System.out.println("o nej bacon dö:(");
                            ing = allaI.get("majs");
                        }


                        if (värme == ing.getgrader()) {
                            System.out.println("Din sista ingrediens dog, nu da?");

                        }
                        System.out.println(värme);
                        for (int a = 0; a < 500000000; a++) {

                        }

                    }
                }
            }


            case 2 -> {
                värma = 1;

            }

        }

        while (eat == 0) {
            System.out.println("Vad vill du göra med din maträtt 1.Äta upp bacon 2.dricka saltet? 3.Dricka såsen 4.Äta ris 5.Äta majs.6.avslut");
            svar1 = input.nextInt();
            switch (svar1) {
                case 1 -> {

                    System.out.println("Mm bacon" + total[2]);


                }

                case 2 -> {

                    System.out.println("Varför dricker du saltet är du dum i huvet Ja/Nej");
                    svar = input.next();
                    if (svar.equalsIgnoreCase("ja")) {
                        System.out.println("Jag skulle rekommendera att inte dricka saltet");
                    }
                }


                case 3 -> {
                    System.out.println("Nu har du valt att dricka såsen men jag förstår dig inte");
                }
                case 4 -> {
                    System.out.println("ris");


                }
                case 5 -> {
                    System.out.println("majs");


                }
                case 6 -> {
                    System.out.println("ris");
                    eat = 1;


                }

            }
        }
        System.out.println("Hejdå!!!");
    }


}
