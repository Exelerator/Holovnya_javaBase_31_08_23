package ua.hillel.Holovnya.lessons.lesson6;

public class Japan {
    public static void main(String[] args) {


        int counter=99;
        for (int i = 0; i<9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    if (i != 4 && j != 4 && k != 4)
                        System.out.println(i + "" + j + "" + k);

                }
            }
        }
        counter++;
        System.out.println("counter="+counter);


    }
}
