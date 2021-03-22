import java.util.Scanner;

public class {

	public static void main (String[] args){


		Scanner fetch = new Scanner(System.in);

                System.out.println("Give me the First X Co-ordinate of First Line");
                int x_one = fetch.nextInt();
                System.out.println("Give me the First Y Co-ordinate of First Line");
                int y_one = fetch.nextInt();
                System.out.println("Give me the Second X Co-ordinate of First Line");
                int x_two = fetch.nextInt();
                System.out.println("Give me the Second Y Co-ordinate of First Line");
                int y_two = fetch.nextInt();

                double line_one_length = Math.sqrt(( Math.pow((x_two - x_one) , 2 )+ Math.pow((y_two- y_one) ,2 )));

                System.out.println("The length of the line is "+line_one_length);

		System.out.println("Give me the First X Co-ordinate of second Line");
                int x_two_one = fetch.nextInt();
                System.out.println("Give me the First Y Co-ordinate of Second Line");
                int y_two_one = fetch.nextInt();
                System.out.println("Give me the Second X Co-ordinate of Second Line");
                int x_two_two = fetch.nextInt();
                System.out.println("Give me the Second Y Co-ordinate of Second Line");
                int y_two_two = fetch.nextInt();

                double line_two_length = Math.sqrt(( Math.pow((x_two_two - x_two_one) , 2 )+ Math.pow((y_two_two - y_two_one) ,2 )));

                System.out.println("The length of the line is "+line_two_length);

		int num = line_one_length > line_two_length ? +1 : line_one_length < line_two_length ? -1 : 0;
        
		 switch(num) {

				case 1 :
				System.out.println("Line One is greater");
				break;

				case -1 :
				System.out.println("Line two is Greater");
				break;

				default :
				System.out.println("Both Line Lengths are Equal");
				break;
			}
                


		}

}
