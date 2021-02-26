import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class EvenMorePizza {

    int numPizza;
    int teamOf2;
    int teamOf3;
    int teamOf4;
    boolean firstLine = true;
    ArrayList<Integer> numToppings = new ArrayList<>();
    ArrayList<String[]> typeToppings = new ArrayList<>();
    int pizzaDelivered = 0;


    public static void main(String[] args) {
        EvenMorePizza pizza = new EvenMorePizza();
        try {
            File file = new File("/home/cameron/Documents/leetcode/HashCode/input/a_example");
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if(pizza.firstLine) {
                    pizza.readFirstLine(data);
                    pizza.firstLine = false;
                } else
                    pizza.readFile(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    void readFirstLine(String line) {
        String[] digits = line.split(" ");
        numPizza = Integer.parseInt(digits[0]);
        teamOf2 = Integer.parseInt(digits[1]);
        teamOf3 = Integer.parseInt(digits[2]);
        teamOf4 = Integer.parseInt(digits[3]);
    }

    void readFile(String line) {
        String[] pizza = line.split(" ");
        numToppings.add(Integer.parseInt(pizza[0]));
        String[] toppings = new String[Integer.parseInt(pizza[0])];
        for(int i = 0; i < Integer.parseInt(pizza[0]); i++)
            toppings[i] = pizza[i + 1];
        typeToppings.add(toppings);
    }

    void output() {
        for(int i = numPizza; i > 0; i++) {
            if(numPizza - 4 >= 2) {

            }
            
        }
    }

}
