package ua.hillel.Holovnya.lessons.lesson2;

public class Main {
    public static void main(String[] args) {

 /*      byte agePerson=22;
         System.out.println(agePerson);

         byte ageCopy=agePerson;

         System.out.println(agePerson);
         System.out.println(ageCopy);

         ageCopy=77;

         System.out.println();
         System.out.println(agePerson);
         System.out.println(ageCopy);

         short shortVariable=32000;
         int intVariable=210000000;
         long longVariable=12312432241431L;

         float floatVariable=11.123456789111F;
         double doubleVariable=11.11111111;

         System.out.println(floatVariable);
         System.out.println(doubleVariable);

         char chA='A';
         char chA2=65;
         char chA3='\u0041';

         System.out.println(chA);
         System.out.println(chA2);
         System.out.println(chA3);

         System.out.println('\u004F');
         System.out.println('\u26A1');
         System.out.println('й');

         boolean isCar=false;
         boolean isNext=true;



         String str1 ="Hello World";
         String str2 ="Hello World";
         String str3 =new String("Hello World");

         System.out.println(str1==str2);
         System.out.println(str2==str3);
         str1=str1 + " Java Best " + "12";
         System.out.println(str1);


         char chA='A';
         int intA=chA;
         System.out.println(intA);

         double doubleVariable =15.23231;
         int intVariable=(int) doubleVariable;
Є
        System.out.println(intVariable);*/

//        int number=5;
//        String str = (String) nubmer; ERROR!!!;

//
        double latitude = 34.098907;
        double longitude = -118.327759;
        char specSymbol = '\u00B0';
        char specSymbol2 = '\'';
        char specSymbol3 = '\u0022';
        System.out.println("Longitude:  " + longitude +  " Latitude: " +latitude );
        System.out.println("DMS Lat: 34"+specSymbol+  "5"+ specSymbol2 + "56.0652"+specSymbol3+"N    DMS Long: 118" +specSymbol+  "19" +specSymbol2 +  "39.9324"+specSymbol3+"W");
    }
}
