package first;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {80,10,20,70,80};
		int max=a[0];
		int min_diff=0;
		int temp,j=0;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				
				max=a[i];
			}
			
			min_diff=max;
		}
		System.out.println(max);
	
		
		for(int i=0;i<a.length;i++)
		{
			temp=max-a[i];
			if(temp<min_diff && temp!=0)
				{
					min_diff=temp;
					j=i;
				}
			}
		System.out.println("second largest value is:"+a[j]);
		}}
+






