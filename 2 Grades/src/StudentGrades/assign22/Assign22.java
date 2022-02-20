package assign22;

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.String;
import java.util.Collections;

public class Assign22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList();
        ArrayList<String> names = new ArrayList();
        double mean, median, mode;
        int number = 0, temp = 0;
        String name = "";

        while (true) {
            System.out.println("Input A Name: ");
            name = input.next();
            if (name.equals("-1")) {
                break;
            } else {
                names.add(name);
            }
            System.out.println("Enter A Corresponding Grade: ");
            number = input.nextInt();
            if (number == -1) {
                break;
            } else {
                numbers.add(number);
            }
        }
        Grades g = new Grades(numbers, names);
        g.getMean(temp);
        g.Sort(numbers);
        g.getMedian(numbers);
        g.getMode(numbers);
    }

}
