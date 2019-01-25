import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

public class Creator
	{
		public static void main(String[] args) throws IOException
		{
			studentNames();
	
			groupGenerator();
			//collections/shuffle(myArray)
		}

		private static void studentNames() throws FileNotFoundException
			{
				File names = new File("Random22Names.txt");
				Scanner scannerWithNames = new Scanner(names);
		
			}


		private static void groupGenerator()
			{
				boolean restart = true;
				while (restart)
					{
						Scanner options = new Scanner (System.in);
						System.out.println("How many groups would you like?");
						int group = options.nextInt();
						
						System.out.println("Would you like to generate another group?");
						String answer = options.nextLine();
						if (answer.equals("Yes"))
							{
								restart = true;
							}
						else
							{
								restart = false;
							}
						
					}
				
			}
	}
