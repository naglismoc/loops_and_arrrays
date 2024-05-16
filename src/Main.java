public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int number = 7;
        int[] numbers = {1,5,10};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        numbers[0] = 17;
        System.out.println(numbers[0]);

        int[] emptyArray = new int[50];

        String[] timeLord = {"Time", "lord","Java","Vilnius"};
        //                      0          1        2      3
        String[] Dovydas = {"Dovydas", "Baublys","Java","Vilnius"};

        String[][] classMates = {
                {"Time", "lord","Java","Vilnius"},
                {"Dovydas", "Baublys","Java","Vilnius"},
                {"Agnė", "Burbaitė","Java","kazkur pakrastys"}
        };
        System.out.println(classMates[0][2]);

        for (int i = 0; i < 10; i++) {
            System.out.println("labas");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("-----------------");
        System.out.println( Dovydas[0] );
        System.out.println( Dovydas[1] );
        System.out.println( Dovydas[2] );
        System.out.println( Dovydas[3] );
        System.out.println("-----------------");

        for (int i = 0; i < 4; i++) {
            System.out.println( "Dovydas[" + i + "]" );
        }
        System.out.println(Dovydas.length);

        for (int i = 0; i < Dovydas.length; i++) {
            System.out.println( "Dovydas[" + i + "]" );
        }
        System.out.println("-----------------");


        for (int i = 0; i < Dovydas.length; i++) {
            System.out.println( Dovydas[i] );
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if(i == 7){
                break;
            }
        }

        System.out.println("-----------------");
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }

        int count = 0;
        while(true){
            System.out.println("labas");
            count++;
            if(count > 5){
                break;
            }
        }

        String loremIpsum = "For God so loved the world that he gave his one and only Son, that whoever believes in him shall not perish but have eternal life. For I know the plans I have for you,” declares the LORD, “plans to prosper you and not to harm you, plans to give you hope and a future. And we know that in all things God works for the good of those who love him, who have been called according to his purpose. I can do everything through him who gives me strength. In the beginning God created the heavens and the earth.";

        String[] words = loremIpsum.split(" ");
        System.out.println(words.length);

        int wordsCounter = 0;
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() == 7){
                wordsCounter++;
            }
        }
        System.out.println(wordsCounter);

        while (Math.random() > 0.5){
            System.out.println("Raudona");
        }
        System.out.println("-----------------");

        while(true){
            int dice =  1 + (int) Math.floor(Math.random() * 6);
            if (dice == 5){
                break;
            }
            System.out.println(dice);
        }

        System.out.println("-----------------");

        boolean shouldGo = true;
        while (shouldGo){
            int dice =  1 + (int) Math.floor(Math.random() * 6);
            if (dice == 5){
                shouldGo = false;
            }
            System.out.println(dice);
        }

        String[][] classMates2 = {
                {"Time", "lord","Java","Vilnius"},
                {"Dovydas", "Baublys","Java","Vilnius"},
                {"Agnė", "Burbaitė","Java","kazkur pakrastys"}
        };

        for (int i = 0; i < classMates2.length; i++) {
            for (int a = 0; a < classMates2[i].length; a++) {
                System.out.println(classMates2[i][a]);
            }
        }

        for (int i = 0; i < classMates2.length; i++) {
            System.out.println(classMates2[i][0]);
        }
        System.out.println("-----------------");


        for (int i = 0; i < classMates2.length; i++) {
            for (int a = 0; a < classMates2[i].length; a++) {
                System.out.println(classMates2[i][a]);
            }
            System.out.println();
        }

        System.out.println("-----------------");
        String[] headers = {"vardas","pavarde","programa","miestas"};
        for (int i = 0; i < classMates2.length; i++) {
            for (int a = 0; a < classMates2[i].length; a++) {
                System.out.print(headers[a] + ":" + classMates2[i][a] + "; ");
            }
            System.out.println();
        }

        System.out.println("-----------------");
        for (int i = 1; i <= 10; i++) {
            for (int a = 1; a <= 10; a++) {
                System.out.print(a * i + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------");

        for (int i = -10; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("-----------------");

        for (int i = 0; i < 100; i+=5) {
            System.out.println(i);
        }
        System.out.println("-----------------");
        int i = 0;
        for (; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("-----------------");
        i = 0;
        for (; i < 5;) {
            System.out.println(i);
            i++;
        }
        System.out.println("-----------------");
        i = 0;
        for (;true;) {
            if(i >= 5){
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("-----------------");

        for (int a = 0; a < Dovydas.length; a++) {
            System.out.println(Dovydas[a]);
        }

        System.out.println("-----------------");

        for (int a = Dovydas.length - 1; a >= 0; a--) {
            System.out.println(Dovydas[a]);
        }

    }
}