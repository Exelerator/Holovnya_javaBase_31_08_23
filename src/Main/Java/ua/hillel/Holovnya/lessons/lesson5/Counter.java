package ua.hillel.Holovnya.lessons.lesson5;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
