package assign22;

import java.util.ArrayList;
import java.util.Collections;

public class Grades {

    public int number;
    public String str;
    static ArrayList<Integer> numbers = new ArrayList();
    static ArrayList<String> names = new ArrayList();

    Grades(ArrayList<Integer> numbers, ArrayList<String> names) {
        this.names = names;
        this.numbers = numbers;
    }

    public void getMean(int temp) {
        double mean = 0;
        for (int i = 0; i < numbers.size(); i++) {
            mean += (double) (numbers.get(i)) / (double) numbers.size();
        }
        System.out.format("\nThe Mean Of The Entered Grades Is: %.1f ", mean);
        System.out.println("");

    }

    public static void Sort(ArrayList<Integer> numbers) {
        int j;
        for (int i = 0; i < numbers.size() - 1; i++) {
            j = i;
            while (j >= 0 && numbers.get(j) > numbers.get(j + 1)) {
                Collections.swap(numbers, j, j + 1);
                Collections.swap(names, j, j + 1);
                j--;

            }
        }
    }

    public static void getMedian(ArrayList<Integer> numbers) {
        double median, Median, meds1, meds2;
        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.size() % 2 != 0 && numbers.size() != 2) {
                int temp;
                median = numbers.size() / 2;
                temp = (int) median;
                System.out.println("\nThe Median Of The Entered Grades Is: " + numbers.get((int) median) + ". The Student is: " + names.get(temp));
                break;
            }
            if (numbers.size() % 2 == 0 && numbers.size() != 2) {
                int temp2, temp1;
                meds1 = (double) numbers.size() / 2;
                meds2 = (double) (numbers.size() / 2) - 1;
                temp1 = (int) meds1;
                temp2 = (int) meds2;
                median = (numbers.get((int) meds1)) + numbers.get((int) meds2);
                Median = median / 2;
                System.out.println("\nThe Median Is: " + Median + ". The Students are: " + names.get(temp1) + " and " + names.get(temp2));
                break;
            } else if (numbers.size() == 2) {
                int temp;
                median = ((double) numbers.get(0) + (double) numbers.get(1)) / 2;
                temp = numbers.size() / 2;
                System.out.println("\nThe Median Is: " + median + ". The Students Are: " + names.get(0) + " and " + names.get(1));
                break;

            }
        }
    }

    public static void getMode(ArrayList<Integer> numbers) {
        int frequency[] = new int[101];
        ArrayList<Integer> dude = new ArrayList();
        for (int i = 0; i < numbers.size(); i++) {
            frequency[numbers.get(i)]++;
        }
        int max = frequency[0];
        for (int i = 1; i < frequency.length; i++) {
            if (frequency[i] > max) {
                max = frequency[i];
            }
        }
        String temp = "";
        if (max > 1) {
            System.out.print("\nThe Mode(s) are: ");
            for (int i = 0; i < frequency.length; i++){
                if (frequency[i] == max) {
                    System.out.print(i + " ");
                    for(int x = 0; x < numbers.size(); x++){
                    if(numbers.get(x) == i){
                    temp += names.get(x) + " ";
                    }
                    }
                }
            }
            System.out.println();
            System.out.println("\nThe Students At The Mode Are: " + temp);
        } else {
            System.out.println("\nThere Is No Mode");
        }
    }

}
