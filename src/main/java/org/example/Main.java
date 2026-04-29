package org.example;

public class Main {

    public static void main(String[] args) {

        // დავალება #1
        int j = 1;
        while (j <= 10){
            System.out.println("3 * " + j + " = " + (3 * j));
            j++;
        }
        // დავალება #2
        String sentence = "I love exploratory testing";
        int x = sentence.length();

        if (x % 2 == 0){
            System.out.println("წინადადების სიგრძე არის ლუწი: " + x + " " + "სიმბოლო");
        } else {
            System.out.println("წინადადების სიგრძე არის კენტი: " + x + " " + "სიმბოლო");
        }

        //დავალება #3

        String[] learningJourney = {"Java", "is", "too", "interesting", "not interesting", "to learn"};
        for (int f = 0; f < learningJourney.length; f++){
            if (f == 4){
                continue;
            }
            System.out.println(learningJourney[f]);
        }

        // დავალება #4
        String text = "automation";
        int count = 0;
        char[] xmovani = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < text.length(); i++){
            char asobgera = text.charAt(i);
            for (int z = 0; z < xmovani.length; z++){
                if (asobgera == xmovani[z]){
                    count++;
                }
            }
        }
        System.out.println("ხმოვნების რაოდენობა: " + count);

        // დავალება #5
        String text1 = "selenium";
        int count1 = 0;
        int a = 0;
        while (a < text1.length()){
            char asobgera1 = text1.charAt(a);

            if (asobgera1 != 'a' && asobgera1 != 'e' && asobgera1 != 'i'
                    && asobgera1 != 'o' && asobgera1 != 'u'){
                count1++;
            }
            a++;
        }
        System.out.println("თანხმოვნების რაოდენობა არის: " + count1);


    }
}


















