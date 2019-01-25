import java.util.ArrayList;
import java.util.List;
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

		public static void studentNames() throws FileNotFoundException
			{
				File names = new File("Random22Names.txt");
				Scanner scannerWithNames = new Scanner(names);
				List<String> estudiantes = new ArrayList<String>();
				while (names.hasNextLine())
					{
						estudiantes.add(names.nextLine());
					}
				
				String[] students = estudiantes.toArray(new String[0]);
			}


		public static void groupGenerator()
			{
				boolean regen = true;
				while (regen)
					{
						Scanner options = new Scanner (System.in);
						System.out.println("How many groups would you like?");
						int group = options.nextInt();
						
						System.out.println(students);
						
						Scanner options2 = new Scanner (System.in);
						System.out.println("Would you like to generate another group?");
						String answer = options2.nextLine();
						if (answer.equals("Yes"))
							{
								regen = true;
							}
						else
							{
								regen = false;
								System.out.println(":thumbs_up:");
							}
						
					}
				
			}
	}
