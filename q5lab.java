package LAB.lab1.lab2;


public class q5lab
{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
		    for(int j=0;j<i;j++)
		    {
		        if(i%2!=0)
		        {
		           System.out.print("*"); 
		        }
		        
		        else{
		            continue;
		        }
		        
		    }
		    System.out.println("\n");
		}
	}
}

