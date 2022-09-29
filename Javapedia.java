import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        int number = scan.nextInt();           

        String[][] historicalFigures = new String[number][3];
        
        scan.nextLine();

        for(int i=0; i<historicalFigures.length; i++){
                System.out.print("\t - Name: ");
                historicalFigures[i][0] = scan.nextLine();
                System.out.print("\t - Date of birth: ");
                historicalFigures[i][1] = scan.nextLine();
                System.out.print("\t - Occupation: ");
                historicalFigures[i][2] = scan.nextLine();
        }
        System.out.println("These are the values you stored:"); 

        print2DArray(historicalFigures);

        System.out.print("\nWho do you want information on? ");
        String find = scan.nextLine();
        
        for(int i=0; i<historicalFigures.length; i++){
            for(int j=0; j<historicalFigures[i].length; j++){
                if(find.equalsIgnoreCase(historicalFigures[i][j])){
                    System.out.println("\tName: " + historicalFigures[i][0]);
                    System.out.println("\tDate of birth: " + historicalFigures[i][1]);
                    System.out.println("\tOccupation: " + historicalFigures[i][2]);
                    break;
                }
            }
        }
        

        scan.close();
    }

    /**
     * Function name: print2DArray
     * @param array (String[][])
     * 
     * Inside the function
     *  1. print the database
     *     • a tab of space precedes each row.
     *     • each value in database has one space from the other value. 
     *     • print a new line.
     */

    public static void print2DArray(String[][] array){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    } 

}
