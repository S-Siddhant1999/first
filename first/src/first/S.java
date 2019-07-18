package first;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class S 
{
	void read(String filename)
	{
		try(FileReader fr=new FileReader(filename);
				BufferedReader br=new BufferedReader(fr))
			{
				String x;
				while( (x=br.readLine())!=null)
				{
					System.out.println(x);
					int i=0,j=0;
					String f[]=x.split(",");
				
					int price=Integer.parseInt(f[3]);
					if(f[2].equalsIgnoreCase("india"))
					{
						i=price*5/100;
						j=price+i;
					}
					else if(f[2].equalsIgnoreCase("japan"))
					{
						i=price*6/100;
						j=price+i;
					}
					else if(f[2].equalsIgnoreCase("korea"))
					{
						i=price*4/100;
						j=price+i;
					}
					else if(f[2].equalsIgnoreCase("china"))
					{
						i=price*2/100;
						j=price+i;
					}
					write(x,i,j);	
				}
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}
	void write(String x,int i,int j)
	{
		try(FileWriter fw =new FileWriter("f:\\core\\demooutput.csv",true);
				BufferedWriter bw=new BufferedWriter(fw))
			{
				bw.write(x+","+i+","+j+"\n");
				bw.flush();
				System.out.println("Output:");
				System.out.println(x+","+i+","+j+"\n");
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
	}
	public static void main(String[] args) {
		String filename="F:\\core\\demo.csv";
		S s=new S();
		s.read(filename);
		
	}
}
