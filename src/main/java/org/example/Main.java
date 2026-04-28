package org.example;
  public class Main {

    public static void main(String[] args) {

//      // დავალება #1
      int j = 1;
      while (j <= 10){
        System.out.println("3 * " + j + " = " + (3 * j));
      j++;

      //დავალება #2
        String sentence = "Exploratory";
        int x = sentence.length();

        if (x % 2 == 0) {
          System.out.println("წინადადების სიგრძე არის ლუწი: " + x + " " + "სიმბოლო");
        } else {
          System.out.println("წინადადების სიგრძე არის კენტი: " + x + " " + "სიმბოლო");
        }

      //დავალება #3

        String[] learningJourney = {"Java", "is", "too", "interesting", "not interesting", "to learn"};
        for (int f = 0; f < learningJourney.length; f++) {
          if (f == 4){
            continue;
          }
          System.out.println(learningJourney[f]);

       //დავალება #4
      String text = "automation";
      int count = 0;

      for (int i = 0; i < text.length(); i++) {
        char letter = text.charAt(i);

        if (letter == 'a'){
          count = count + 1;
        }
        if (letter == 'e'){
          count = count + 1;
        }
        if (letter == 'i'){
          count = count + 1;
        }
        if (letter == 'o'){
          count = count + 1;
        }
        if (letter == 'u'){
          count = count + 1;
        }
      }
         System.out.println("ხმოვნების რაოდენობა: " + count);

      //#5 დავალება
        String text1 = "selenium";
        int count1 = 0;
        int a = 0;
        while (a < text1.length()) {
        char letter = text1.charAt(a);

        if (letter != 'a' && letter != 'e' && letter != 'i'
                && letter != 'o' && letter != 'u'){
          count1++;
        }
        a++;
        }
         System.out.println("თანხმოვნების რაოდენობა არის: " + count1);















    }
  }

















