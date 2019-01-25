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

		private static void studentNames()
			{
				
				
			}


		private static void groupGenerator()
			{
				boolean restart = true;
				while (restart)
					{
						Scanner options = new Scanner (System.in);
						System.out.println("How many groups would you like?");
						int group = options.nextInt();
						
						restart = false;
					}
				
			}
	}
