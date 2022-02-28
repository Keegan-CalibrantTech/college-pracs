#include<iostream.h>
#include<stdio.h>
void swapping(int &a, int &b)
{
	int temp;
	temp = a;
	a = b;
	b = temp;
}
void display(int *array, int size) {
	for(int i = 0; i<size; i++)
	cout << array[i] << " ";
	cout << endl;
}
void insertionSort(int *array, int size)
{
	int key, i, j;
	for (j=1; j<size; j++)
	{
		key = array[j];
		i = j-1;
		while(i >=0 && array[i]>key)
		{
			array[i+1] = array[i];
			i--;
		}
		array[i+1] = key;
		cout<<"\nAfter "<<j<<" pass: ";
		display(array , size);
	}
}
void selectionSort(int *array, int size)
{
	int i,j, small;
	for(i = 0; i<size-1; i++)
	{
		small = i;
		for(j = i+1; j<size; j++)
		if(array[j] < array[small])
		small = j;
		swapping(array[i], array[small]);
		cout<<"\nAfter "<<i+1<<" pass: ";
		display(array , size);
	}
}
int main()
{
	int n,ch;
	cout << "Enter the number of elements: ";
	cin >> n;
	int arr[1000];
	cout << "Enter elements:" << endl;
	for(int i = 0; i<n; i++)
	{
		cin >> arr[i];
	}
	start:
	cout<<"\n\tMENU\n1.INSERTION SORT\n2.SELECTION SORT\n\nEnter your choice:";
	cin>>ch;
	switch(ch)
	{
		case 1:
		cout << "\nArray before Sorting: ";
		display(arr, n);
		insertionSort(arr,n);
		cout << "\nArray after Sorting: ";
		display(arr, n);
		break;
		case 2:
		cout << "\nArray before Sorting: ";
		display(arr, n);
		selectionSort(arr,n);
		cout << "\nArray after Sorting: ";
		display(arr, n);
		break;
		default: cout<<"Invalid choice";
		goto start;
	}
}