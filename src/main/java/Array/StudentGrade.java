package Array;

public class StudentGrade {
    public static int[] grade() {
        int[] score = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};

        System.out.println("Grade distribution:");

        for (int i = 0; i < score.length; i++) {
            if (i == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            }
            for (int j = 0; j < score[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return score;

    }

    public static void main(String[] args) {
        grade();
    }
}