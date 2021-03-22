import java.util.Scanner;

public class {

	public static void main (String[] args){


		Scanner fetch = new Scanner(System.in);

                System.out.println("Give me the First X Co-ordinate");
                int x_one = fetch.nextInt();
                System.out.println("Give me the First Y Co-ordinate");
                int y_one = fetch.nextInt();
                System.out.println("Give me the Second X Co-ordinate");
                int x_two = fetch.nextInt();
                System.out.println("Give me the Second Y Co-ordinate");
                int y_two = fetch.nextInt();

                double line_length = Math.sqrt(( Math.pow((x_two - x_one) , 2 )+ Math.pow((y_two- y_one) ,2 )));

                System.out.println("The length of the line is "+line_length);


		}

}

