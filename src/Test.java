import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args){

		ArrayList<String> eduAchieve = new ArrayList<String>();
		String educ, position, experiance, toExit = "stop";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Education and type \"exit\" to continue:   ");
		do{



			System.out.println("Enter Company");
			educ = input.nextLine();
			System.out.println("Enter Position");
			position = input.nextLine();
			System.out.println("Enter Exp");
			experiance = input.nextLine();
			if(!(educ.equalsIgnoreCase(toExit))){
				eduAchieve.add(educ); /*store in the array list*/
				eduAchieve.add(position);
				eduAchieve.add(experiance);
			}

		}while (!(toExit.equalsIgnoreCase(educ)));

		

		String[] array = eduAchieve.toArray(new String[eduAchieve.size()]);
		for(int i=0;i<array.length;i++){
			System.out.println(i + "\t" +array[i]);
		}

	}
}
