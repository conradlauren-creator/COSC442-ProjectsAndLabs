import java.util.Arrays;

public class Main {

    /**
     * Returns x+y
     */

    public static int addItUp(int x, int y) {
        int total = 0;

        try {
            total = x + y;
           
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        return total;
    }
    
    
    /**
     * Prints "Hello World!" to the standard output.
     * @param args the command-line arguments passed to the program
     */
    public static void main(String[] args) {
        int x = 5;
        int y = 7;

        System.out.print("Let's add it up! Your total is: ");
        System.out.println(addItUp(x,y));
    }
}

