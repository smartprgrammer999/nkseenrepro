package TryToUndastand;
import java.util.Scanner;
public class RemoveNumber {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    int n,dl,i,p=0,j,k=0;
    System.out.print("Enter numbers of element :");
    n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter "+n+" numbers");
    for(i=0;i<n;i++)
    	arr[i]=sc.nextInt();
    p=n;
    System.out.print("Enter numbers to be deleted!");   
    dl=sc.nextInt();
    for(i=0;i<n-k;i++)
    {
    	if(arr[i]==dl)
    	{k++;
    	  
    		for(j=i;j<p-1;j++)
    		{
    			arr[j]=arr[j+1];
    			
    		}
    		p--;
    		if(arr[i]==dl)
    		{
    			i--;
    		}
    	}
    }
    if(n==p)
    {
    	System.out.println("Deleting element could not found");
    } 
    else
    {
    	for(i=0;i<p;i++)
    		System.out.print(arr[i]+" ");
    }
	}
}
