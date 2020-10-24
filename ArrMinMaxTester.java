package practise;


public class ArrMinMaxTester {
	static class Pair{
		int min;
		int max;
	}
	Pair getMinMaxPair(int arr[],int n) {
		Pair p=new Pair();
		//if there is only element ,copy it both min and max
		if(n==1) {
			p.min=arr[0];
			p.max=arr[1];
		}
		
		if(arr[0]>arr[1]) {
			p.max=arr[0];
			p.min=arr[1];
		}else {
			p.min=arr[0];
			p.max=arr[1];
		}
		
		for(int i=2; i<n;i++) {
			if(arr[i]>p.max) {
				p.max=arr[i];
			}else if(arr[i]<p.min) {
				p.min=arr[i];
			}
		}
		return p;
		
		
	}
	public static void main(String[] args) {
		
		int a[]= {100,4,11,7,9,200};
		int n=4;
		ArrMinMaxTester d=new ArrMinMaxTester();
		Pair minMaxPair = d.getMinMaxPair(a, n);
		System.out.println("Min is "+minMaxPair.min+"and Max is :"+minMaxPair.max);
	}
}
