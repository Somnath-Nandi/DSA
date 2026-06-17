// Selection of MPCS exams include a fitness test which is conducted on ground. There will be a batch of 3 trainees, appearing for running test in track for 3 rounds. You need to record their oxygen level after every round. After trainee are finished with all rounds, calculate for each trainee his average oxygen level over the 3 rounds and select one with highest oxygen level as the most fit trainee. If more than one trainee attains the same highest average level, they all need to be selected.

// Display the most fit trainee (or trainees) and the highest average oxygen level.

// Note:

// The oxygen value entered should not be accepted if it is not in the range between 1 and 100.
// If the calculated maximum average oxygen value of trainees is below 70 then declare the trainees as unfit with meaningful message as “All trainees are unfit.
// Average Oxygen Values should be rounded.
// Example 1:
// INPUT VALUES
// 95
// 92
// 95
// 92
// 90
// 92
// 90
// 92
// 90

// OUTPUT VALUES
// Trainee Number : 1
// Trainee Number : 3

// Note:
// Input should be 9 integer values representing oxygen levels entered in order as

// Round 1

// Oxygen value of trainee 1
// Oxygen value of trainee 2
// Oxygen value of trainee 3
// Round 2

// Oxygen value of trainee 1
// Oxygen value of trainee 2
// Oxygen value of trainee 3
// Round 3

// Oxygen value of trainee 1
// Oxygen value of trainee 2
// Oxygen value of trainee 3
// Output must be in given format as in above example. For any wrong input final output should display “INVALID INPUT”

import java.util.Scanner;

public class most_fit_trainee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int trainee[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                trainee[i][j] = sc.nextInt();

                if (trainee[i][j] < 1 || trainee[i][j] > 100) {
                    System.out.println("INVALID INPUT");
                    return;
                }
            }
        }

        int avg[] = new int[3];

        for (int j = 0; j < 3; j++) {
            avg[j] = Math.round(
                    (trainee[0][j] + trainee[1][j] + trainee[2][j]) / 3.0f);
        }

        int max = Math.max(avg[0], Math.max(avg[1], avg[2]));

        if (max < 70) {
            System.out.println("All Trainees are unfit");
            return;
        }

        for (int i = 0; i < 3; i++) {
            if (avg[i] == max) {
                System.out.println("Trainee Number : " + (i + 1));
            }
        }
    }
}
