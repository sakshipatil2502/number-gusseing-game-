import java.util.*;

		import java.util.Random;

public class NumberGusessing {

			public int number;

		public int inputnumber;

		public int noofguesses=0;

		public int gettwonumber()
		{
			return noofguesses;
		}
		public void settwonumber(int noofguesses)
		{
			this.noofguesses=noofguesses;
		}

		NumberGusessing()
		{
			Random ran=new Random();
			System.out.println("Guess the number");
			this.number=ran.nextInt(100);
		}
		void takeuserinput()
		{
			Scanner sc=new Scanner(System.in);
			inputnumber = sc.nextInt();
		}
		boolean iscorrectnumber()
		{
			noofguesses++;
			if(inputnumber==number)
			{
				System.out.format("yes u guessed it right.");
				return true;
			}
			else if(inputnumber<number)
			{
				System.out.println("Too less...");
			}
			else if(inputnumber>number)
			{
				System.out.println("Too high...");
			}
			return false;
		}
		

		class guess_number { 
			public static void main(String args[]) 
			{ 
				boolean b=false;

		NumberGusessing g=new NumberGusessing();
			
			while(!b){
			
			g.takeuserinput();
			
		        b=g.iscorrectnumber();
			
			System.out.println(b);
			
			}
			
		}
		}
	}


