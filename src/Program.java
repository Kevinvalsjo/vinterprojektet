import java.util.HashMap;
import java.util.Scanner;

public class Program {
    //initierar alla variabler som används
    private HashMap<String, Ingredienser> allaI;
    private Ingredienser ing;
    private int eat, värma, värme, svarNumInt, info, laga, k;
    private String svarNum, svarYN;

    public Program() {
        // sätter alla startvärden
        this.allaI = new HashMap<>();
        this.ing = null;
        this.eat = 0;
        this.värma = 0;
        this.värme = 0;
        this.svarNumInt = 0;
        this.info = 0;
        this.laga = 0;
        this.k = 0;
        this.svarNum = "";
        this.svarYN = "";
        //skapar objekt för ingredienserna och anger dess egenskaper
        allaI.put("dåligsås", new dåligsås("Spanien", 50, 50, 30, "flytande"));
        allaI.put("brunsås", new Brunsås("Spanien", 50, 50, 30, "flytande"));
        allaI.put("vitlökssås", new Vitlökssås("Spanien", 50, 50, 30, "flytande"));
        allaI.put("sås", new Sås("Spanien", 50, 50, 30, "flytande"));
        allaI.put("ris", new Ris("Kina", 100, 5, 70));
        allaI.put("majs", new Majs("Argentina", 20, 10, 250));
        allaI.put("salt", new Salt("Uganda", 3, 10, 150));
        allaI.put("bacon", new Bacon("Danmark", 80, 20, 200));


    }

    public void run() {
        int[] total = {0, 0, 0, 0, 0, 0, 0};
        Scanner input = new Scanner(System.in);

        System.out.println("Vill du spela Ja/nej");
        // körs tills användaren skriver rätt,
        checkYN(input);

        if (svarYN.equalsIgnoreCase("nej")) {
            // avslutar programmet
            System.out.println("Du har valt att avsluta");
            return;
        } else {
            System.out.println("Skulle du vilja veta lite om ingredienserna som du kan välja? (Ja/Nej)");
            checkYN(input);//kollar ja eller nej
        }

        // while loop som omfattar andra while loopar så att man alltid kan
        // t.ex veta mer om en ingrediens oavsett om man har hoppat ur just den while loopen

        info(input);

        chooseIng(input, total);


        System.out.println("Du har " + total[1] + " kalorier salt");
        System.out.println("Du har " + total[2] + " kalorier bacon");
        System.out.println("Du har " + total[3] + " kalorier sås");
        System.out.println("Du har " + total[4] + " kalorier ris");
        System.out.println("Du har " + total[5] + " kalorier majs");

        System.out.println("Nu är det då dags att sätta på spisen, Vill du veta lite om ingrediensernas gradtålighet innan du börjar ja/nej");

        checkYN(input);

        boolean san = svarYN.equalsIgnoreCase("ja");
        if (san == true) {
            cookingInfo(input, san);
        } else {
            System.out.println("Taskigt");
        }

        System.out.println("Nu är det dags att dra på värmen(Enter)");
        input.nextLine();
        input.nextLine();
        cook(input, total);

        eat(input, total);

    }

    private void checkYN(Scanner input) {
        this.svarYN = input.next();
        while (!"ja".equalsIgnoreCase(this.svarYN) && !"nej".equalsIgnoreCase(this.svarYN)) {
            System.out.println("Du måste skriva 'ja' eller 'nej'");
            this.svarYN = input.next();
        }
    }

    private void check16(Scanner input) {
        this.svarNum = input.next();
        while (!"1".equalsIgnoreCase(svarNum) && !"2".equalsIgnoreCase(svarNum) && !"3".equalsIgnoreCase(svarNum) && !"4".equalsIgnoreCase(svarNum) && !"5".equalsIgnoreCase(svarNum) && !"6".equalsIgnoreCase(svarNum)) {

            System.out.println("Du måste skriva en siffra i intervallet 1-6");
            this.svarNum = input.next();

        }
    }

    private void check17(Scanner input) {
        this.svarNum = input.next();
        while (!"1".equalsIgnoreCase(svarNum) && !"2".equalsIgnoreCase(svarNum) && !"3".equalsIgnoreCase(svarNum) && !"4".equalsIgnoreCase(svarNum) && !"5".equalsIgnoreCase(svarNum) && !"6".equalsIgnoreCase(svarNum) && !"7".equalsIgnoreCase(svarNum)) {

            System.out.println("Du måste skriva en siffra i intervallet 1-7");
            this.svarNum = input.next();

        }
    }

    private void check12(Scanner input) {
        this.svarNum = input.next();
        while (!"1".equalsIgnoreCase(svarNum) && !"2".equalsIgnoreCase(svarNum)) {

            System.out.println("Du måste skriva en siffra i intervallet 1-2");
            this.svarNum = input.next();

        }
    }

    private void info(Scanner input) {
        // while loop som används för att veta mer om ingredienser
        while (info == 0) {
            if (svarYN.equalsIgnoreCase("nej")) {
                break;
            }

            System.out.println("Vilken ingrediens är du intresserad av? \n1.Salt 2.bacon 3.Sås 4.Ris 5.Majs 6.Ingen");

            //
            check16(input);
            svarNumInt = Integer.parseInt(svarNum);
            switch (svarNumInt) {
                case 1 -> {
                    ing = allaI.get("salt");
                    System.out.println("Så du vill veta lite mer om salt, spännande, Vill du veta 1.Kalorier eller 2.Plats?");
                }
                case 2 -> {
                    ing = allaI.get("bacon");
                    System.out.println("Så du vill veta lite mer om bacon, spännande, Vill du veta 1.Kalorier eller 2.Plats?");
                }
                case 3 -> {
                    ing = allaI.get("sås");
                    System.out.println("Så du vill veta lite mer om sås, spännande, det finns faktiskt 3 olika såser. Vilken vill du veta mer om? 1.Brunsås 2.Vitlökssås 3.dåligsås");
                    svarNum = input.next();

                    while (!"1".equalsIgnoreCase(svarNum) && !"2".equalsIgnoreCase(svarNum) && !"3".equalsIgnoreCase(svarNum)) {

                        System.out.println("Du måste skriva en siffra i intervallet 1-3");
                        svarNum = input.next();

                    }

                    svarNumInt = Integer.parseInt(svarNum);
                    switch (svarNumInt) {
                        case 1 -> {
                            ing = allaI.get("brunsås");
                            System.out.println("Så du vill veta lite mer om brunsåsen? 1.Kalorier 2.Plats");
                        }
                        case 2 -> {
                            ing = allaI.get("vitlökssås");
                            System.out.println("Så du vill veta lite mer om vitlökssåsen? 1.Kalorier 2.Plats");
                        }
                        case 3 -> {
                            ing = allaI.get("dåligsås");
                            System.out.println("Så du vill veta lite mer om såsen som smakar jättedåligt? 1.Kalorier 2.Plats");
                        }
                    }
                }
                case 4 -> {
                    ing = allaI.get("ris");
                    System.out.println("Så du vill veta lite mer om Ris, spännande, Vill du veta 1.Kalorier eller 2.Plats?");
                }
                case 5 -> {
                    ing = allaI.get("majs");
                    System.out.println("Så du vill veta lite mer om Majs, spännande, Vill du veta 1.Kalorier eller 2.Plats?");
                }
                case 6 -> {
                    return;
                }
            }

            //
            check12(input);
            svarNumInt = Integer.parseInt(svarNum);
            switch (svarNumInt) {
                case 1 -> {
                    System.out.println("Den här produkten har " + ing.getkalo() + " kalorier");
                }
                case 2 -> {
                    System.out.println("Den här produkten kommer ifrån " + ing.getlocation());
                }
            }
        }
    }

    private void chooseIng(Scanner input, int[] total) {
        // while loop som handlar om att laga mat där man får reda på hur många gånger man kan använda något
        // och hur mycket kalorier maträtten innehåller
        while (laga == 0) {

            System.out.println("Vad vill du lägga i kastrullen, 1.Salt 2.bacon 3.Sås 4. Ris 5.Majs 6.Veta mer 7.Avsluta, Om du får slut på en ingrediens kommer du bli riktigt arg");
            check17(input);
            svarNumInt = Integer.parseInt(svarNum);
            switch (svarNumInt) {
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
                    info(input);
                }
                case 7 -> {
                    int totalen = total[1] + total[2] + total[3] + total[4] + total[5];
                    System.out.println("Din maträtt har " + totalen + " kalorier");
                    return;
                }
            }
        }
    }

    private void cookingInfo(Scanner input, boolean san) {
        while (san == true) {
            System.out.println("Okej Vilken vill du veta mer om 1.Salt 2.bacon 3.Sås 4.Ris 5.Majs 6.Ingen");
            check16(input);
            svarNumInt = Integer.parseInt(svarNum);
            switch (svarNumInt) {
                case 1 -> {
                    ing = allaI.get("salt");
                    System.out.println("Den här ingrediensen kommer dö vid temperaturen " + ing.getgrader() + " grader");
                }
                case 2 -> {
                    ing = allaI.get("bacon");
                    System.out.println("Den här ingrediensen kommer dö vid temperaturen " + ing.getgrader() + " grader");
                }
                case 3 -> {
                    ing = allaI.get("sås");
                    System.out.println("Den här ingrediensen kommer dö vid temperaturen " + ing.getgrader() + " grader");
                }
                case 4 -> {
                    ing = allaI.get("ris");
                    System.out.println("Den här ingrediensen kommer dö vid temperaturen " + ing.getgrader() + " grader");
                }
                case 5 -> {
                    ing = allaI.get("majs");
                    System.out.println("Den här ingrediensen kommer dö vid temperaturen " + ing.getgrader() + " grader");
                }
                case 6 -> {
                    san = false;
                }
            }
        }
    }

    private void cook(Scanner input, int[] total) {

        ing = allaI.get("sås");
        for (int r = 0; r < 1000; r++) {
            värme = r;
            if (värme == ing.getgrader() && k == 0) {
                System.out.println("Såsen brände fast");
                input.nextLine();
                ing = allaI.get("ris");
                total[3] = 0;
                k = 1;
            }
            if (värme == ing.getgrader() && k == 1) {
                System.out.println("Riset brände fast (Enter)");
                input.nextLine();
                ing = allaI.get("salt");
                total[4] = 0;
                k = 2;
            }
            if (värme == ing.getgrader() && k == 2) {
                System.out.println("Saltet brändes(Enter)");
                input.nextLine();
                input.nextLine();
                total[1] = 0;
                ing = allaI.get("bacon");
                k = 3;
            }
            if (värme == ing.getgrader() && k == 3) {
                System.out.println("Bacon brändes (Enter)");
                input.nextLine();
                total[2] = 0;
                ing = allaI.get("majs");
                k = 4;
            }
            if (värme == ing.getgrader() && k == 4) {
                System.out.println("Din sista ingrediens brändes, nu da?");
                input.nextLine();
                total[5] = 0;
                input.nextLine();
            }
            System.out.println(värme);
            for (int a = 0; a < 60000000; a++) {

            }
            if (värme == 100 || värme == 200 || värme == 300 || värme == 400 || värme == 500 || värme == 600 || värme == 700 || värme == 800 || värme == 900 || värme == 1000) {
                System.out.println("Vill du forsätta värma upp? Ja/Nej");
                svarNum = input.next();
                if ("nej".equalsIgnoreCase(svarNum)) {
                    r = 1001;
                }
            }
        }
    }


    private void eat(Scanner input, int[] total) {
        int totCal = 0;
        while (eat == 0) {
            System.out.println("Vad vill du lägga på tallriken?\n 1.Salt 2.Bacon 3.Sås 4.Ris 5.Majs.6.Ät");
            check16(input);
            svarNumInt = Integer.parseInt(svarNum);
            switch (svarNumInt) {

                case 1 -> {
                    ing = allaI.get("salt");

                    if (total[1] == 0) {
                        System.out.println("Du har bränt eller redan tagit allt ditt " + ing.returnMyName());
                    } else {
                        System.out.println("Du har " + total[1] + " kalorier salt");
                        System.out.println("Hur många kalorier vill du lägga på tallriken?");
                        int value = input.nextInt();
                        total[1] -= value;
                        totCal += value;
                        //  ing.setKalorier(value);
                    }
                }
                case 2 -> {
                    ing = allaI.get("bacon");

                    if (total[2] == 0) {
                        System.out.println("Du har bränt eller redan tagit all din " + ing.returnMyName());
                    } else {
                        System.out.println("Du har " + total[2] + " kalorier bacon");
                        System.out.println("Hur många kalorier vill du lägga på tallriken?");
                        int value = input.nextInt();
                        total[2] -= value;
                        totCal += value;
                        //  ing.setKalorier(value);
                    }

                }
                case 3 -> {
                    ing = allaI.get("sås");

                    if (total[3] == 0) {
                        System.out.println("Du har bränt eller redan tagit all din " + ing.returnMyName());
                    } else {
                        System.out.println("Du har " + total[3] + " kalorier sås");
                        System.out.println("Hur många kalorier vill du lägga på tallriken?");
                        int value = input.nextInt();
                        total[3] -= value;
                        totCal += value;

                        //  ing.setKalorier(value);
                    }
                }
                case 4 -> {
                    ing = allaI.get("ris");

                    if (total[4] == 0) {
                        System.out.println("Du har bränt eller redan tagit allt ditt " + ing.returnMyName());
                    } else {
                        System.out.println("Du har " + total[4] + " kalorier ris");
                        System.out.println("Hur många kalorier vill du lägga på tallriken?");
                        int value = input.nextInt();
                        total[4] -= value;
                        totCal += value;
                        //  ing.setKalorier(value);
                    }
                }
                case 5 -> {
                    ing = allaI.get("majs");

                    if (total[5] == 0) {
                        System.out.println("Du har bränt eller redan tagit all din " + ing.returnMyName());
                    } else {
                        System.out.println("Du har " + total[5] + " kalorier majs");
                        System.out.println("Hur många kalorier vill du lägga på tallriken?");
                        int value = input.nextInt();
                        total[5] -= value;
                        totCal += value;
                        //  ing.setKalorier(value);
                    }
                }
                case 6 -> {
                    eat = 1;
                }

            }


        }
        System.out.println("Du har nu konsumerat din måltid på " + totCal + " kalorier");
    }
}

