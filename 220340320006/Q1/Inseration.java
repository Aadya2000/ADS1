class Inseration
{
void printarray(int arr[])
{
	int n=arr.length;
	for(int i=0;i<n;i++)
	{
		System.out.print(arr[i]+"");
	}
	System.out.println(" ");
}
void inserationSort(int arr[])
{
	int n=arr.length;
	for(int i=4;i>=0;i--)
	{
		int temp=arr[i];
		int j=i-1;
		while(j>=0&&arr[j]>temp)
		{
			arr[j+1]=arr[j];
			printarray(arr);
			j=j-1;
		}
		arr[j+1]=temp;
	}
	printarray(arr);
}
	public static void main(String Args[])
	{
		Inseration i=new Inseration();
		int A1[]={2,4,6,8,3};
		i.inserationSort(A1);
	}
	
	
}




