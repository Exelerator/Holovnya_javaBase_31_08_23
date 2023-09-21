package ua.hillel.Holovnya.lessons.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        int a=5;
//        int b=10;
//        System.out.println(a>b);
//        System.out.println(a>=b);
//        System.out.println(a<b);
//        System.out.println(a<=b);
//        System.out.println(a==b);
//        System.out.println(a!=b);

//        System.out.println(!true);
//        System.out.println(!false);

//        boolean result =a!=b;
//
//        System.out.println(result);

//        String str1="Hello";
//        String str2="Hello";
//        String str3= new String("Hello");

//        System.out.println(str1== str2);
//        System.out.println(str1==str3);

//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equals(str3));

//        int a=5;
//        int b=10;
//        int c=15;

//        System.out.println(a>b  ||  b<c);
//        System.out.println(a>b || b>c);
//
//        System.out.println(a>b && b<c);
//        System.out.println(a<b && b<c);


//        int x=5;
//        System.out.println(x>3 && x++ ==6);

//        int a=5;
//        int b=10;

//        if (a<b) {
//            System.out.println("a<b");
//        }


//        if (a<b) {
//            System.out.println("a<b");
//        }else {
//            System.out.println("a>=b");
//        }

//        if (a<b) {
//            System.out.println("a<b");
//        }else if(a>b){
//            System.out.println("a>b");
//        }else {
//            System.out.println("a=b");
//        }

//        if (a<=b) {
//            System.out.println("a<=b");
//            if (a==b) {
//                System.out.println("a=b");
//            }else {
//                System.out.println("a<b");
//            }
//        }

//        умова ? вираз1 : вираз2

//        if(5>4) {
//            System.out.println("YES");
//        }else {
//            System.out.println("NO");
//        }
//        System.out.println((5 > 4) ? "YES" : "NO");

//        int a=3;
//         switch (a) {
//             case 1: {
//                 System.out.println("1");
//                 break;
//             }
//             case 2: {
//                 System.out.println("2");
//                 break;
//             }
//             case 3: {
//                 System.out.println("3");
//                 break;
//             }
//             case 4: {
//                 System.out.println("4");
//                 break;
//             }
//             default: {
//                 System.out.println("default");
//             }
//
//         }
//         String str="QWE";
//         switch (str){
//             case "qwe": {
//                 System.out.println(1);
//                 break;
//             }
//             case "Qwe": {
//                 System.out.println(2);
//                 break;
//             }
//             case "QWE": {
//                 System.out.println(3);
//                 break;
//
//             }
//         }
        Scanner scanner = new Scanner(System.in);
//
//        String str =scanner.next();
//        System.out.println("str="+str);
//        String str2 =scanner.next();
//        String str3 =scanner.next();
//        String str4 =scanner.next();
//        String str5 =scanner.next();
//        System.out.println("str="+str2);
//        System.out.println("str="+str3);
//        System.out.println("str="+str4);
//        System.out.println("str="+str5);

//        String str =scanner.nextLine();
//        System.out.println("str="+str);

//        int number=scanner.nextInt();
//        System.out.println("number="+number);
//        scanner.nextLine();

//        System.out.println("Please enter number");
//        int number = 0;
//        if (scanner.hasNextInt()) {
//            number = scanner.nextInt();
//            System.out.println("number=" + number);
//        } else {
//            System.out.println("Wrong data");
//            System.exit(0);
//        }

//        if (number > -10) {
//            System.out.println("sdqwqweqw");

//         }



        System.out.println("Enter team1 name:");
        String Avengers =scanner.nextLine();
        System.out.println("Enter team2 name:");
        String DC= scanner.nextLine();
        System.out.println("Please enter frags for IronMan from team Avengers");
        int IronMan = 0;
        if (scanner.hasNextInt()) {
            IronMan = scanner.nextInt();
        } else {
            System.out.println("Try again");
            System.exit(0);
        }
        System.out.println("Please enter frags for Tor from team Avengers");
        int Tor = 0;
        if (scanner.hasNextInt()) {
            Tor = scanner.nextInt();
        } else {
            System.out.println("Try again");
            System.exit(0);
        }
        System.out.println("Please enter frags for Hawkey from team Avengers");
        int Hawkey = 0;
        if (scanner.hasNextInt()) {
            Hawkey = scanner.nextInt();
        } else {
            System.out.println("Try again");
            System.exit(0);
        }
        System.out.println("Please enter frags for SpiderMan from team Avengers");
        int SpiderMan = 0;
        if (scanner.hasNextInt()) {
            SpiderMan = scanner.nextInt();
        } else {
            System.out.println("Try again");
            System.exit(0);
        }
        System.out.println("Please enter frags for Hulk from team Avengers");
        int Hulk = 0;
        if (scanner.hasNextInt()) {
            Hulk = scanner.nextInt();
        } else {
            System.out.println("Try again");
            System.exit(0);
        }
        System.out.println("Please enter frags for Batman from team DC");
        int Batman = 0;
        if (scanner.hasNextInt()) {
            Batman = scanner.nextInt();
        } else {
            System.out.println("Try again");
            System.exit(0);
        }
        System.out.println("Please enter frags for SuperMan from team DC");
        int SuperMan = 0;
        if (scanner.hasNextInt()) {
            SuperMan= scanner.nextInt();
        } else {
            System.out.println("Try again");
            System.exit(0);
        }
        System.out.println("Please enter frags for SuperGirl from team DC");
        int SuperGirl = 0;
        if (scanner.hasNextInt()) {
            SuperGirl = scanner.nextInt();
        } else {
            System.out.println("Try again");
            System.exit(0);
        }
        System.out.println("Please enter frags for Aquaman from team DC");
        int Aquaman = 0;
        if (scanner.hasNextInt()) {
            Aquaman = scanner.nextInt();
        } else {
            System.out.println("Try again");
            System.exit(0);
        }
        System.out.println("Please enter frags for Flash from team DC");
        int Flash = 0;
        if (scanner.hasNextInt()) {
            Flash = scanner.nextInt();
        } else {
            System.out.println("Try again");
            System.exit(0);
        }

        double sumAvengers=(Tor+IronMan+SpiderMan+Hawkey+Hulk);
        System.out.println("sum frags from team Avengers="+sumAvengers);
        double sumDC=(Batman+SuperGirl+SuperMan+Aquaman+Flash);
        System.out.println("sum frags from team DC="+sumDC);
        double avgAvengers=sumAvengers/5;
        System.out.println("avg frags from team Avengers="+avgAvengers);
        double avgDC=sumDC/5;
        System.out.println("avg frags from team DC="+avgDC);
        if (avgAvengers<avgDC) {
            System.out.println("Team-DC WIN");
        }else if(avgDC==avgAvengers){
            System.out.println("Peace WIN");
        }else {
            System.out.println("Team-Avengers WIN");
        }

    }
}
