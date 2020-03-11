package com.niit.lambda;
interface IAverage
{
	double avg(int[] array);
}
public class SumAvg {
	static int arr[]={2,4,6,7};

	public static void main(String[] args) {
      IAverage ia=(arr)->{
    	double sum=0;
    	double sum1=0;
    	  for(int i=0;i<=arr.length-1;i++)
    	  {
    		  sum+=arr[i];
    	  }
    	  System.out.println(sum);
    	  sum1=sum/arr.length;
    	  
    	  return sum1;    	  
    	  
      };
     
	System.out.println(ia.avg(arr));

	}

}

