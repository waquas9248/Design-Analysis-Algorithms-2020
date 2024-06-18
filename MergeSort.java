public class MergeSort{
	public void Merge(int A[],int low,int mid,int high){
		int i = low;
		int j = mid+1;
		int k = low;
		int B[] = new int[high+1];
		while(i<=mid&&j<=high){
			if(A[i]<A[j]){
				B[k] = A[i];
				i=i+1;
			}
			else{
				B[k]=A[j];
				j=j+1;
			}
			k=k+1;
		}
		while(i<=mid){
			B[k]=A[i];
			i=i+1;
			k=k+1;
		}
		while(j<=high){
			B[k]=A[j];
			j=j+1;
			k=k+1;
		}
		for(int x=low;x<high+1;x++)
		A[x]=B[x];
	}
	public void mergesort(int A[],int low,int high){
		if(low<high){
			int mid = (low+high)/2;
			mergesort(A,low,mid);
			mergesort(A,mid+1,high);
			Merge(A,low,mid,high);
		}
	}
	public void display(int A[],int n){
		for(int i=0;i<n;i++){
			System.out.print(A[i]+ " ");
		}
			System.out.println();
	}
	public static void main(String args[]){
		MergeSort m = new MergeSort();
		//int A[] = {3,5,8,9,6,2};
		int n =1000000;
		int A[] = new int[n];
		for(int i = 0;i<n;i++){
			A[i] = (int)(Math.random()*1000);
		}
		m.display(A,n);
		long start = System.currentTimeMillis();
		m.mergesort(A,0,n-1);
		long end = System.currentTimeMillis();
		m.display(A,n);
		System.out.println("time:"+(end-start));
	}
}
