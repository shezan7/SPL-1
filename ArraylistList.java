package arraylistPackage;

public class ArraylistList {
	
	private int n=5;
	private String [] arr = new String[n];
	private String [] brr = new String[n];
	private int index=0;
	
	public ArraylistList()
	{
		
	}

	public void enlarge()
	{
		 n=n*2;
		 brr=new String[n];
		 for(int i=0;i<index;i++) 
		 {
			 brr[i]=arr[i];
		 }
		 arr=new String[n];
		 for(int i=0;i<index;i++) 
		 {
			 arr[i]=brr[i];
		 }
		 
	}
	
	public void add(String element) 
	{
		if(index>=n)
			enlarge();
		arr[index]=element;
		index++;
	}
	
	public void add(int indexposition,String element) 
	{
		if(indexposition<index) 
		{
			if(index>=n)
				enlarge();
		}
		
		for(int i=index-1;i>=indexposition;i--) 
		{
			arr[i+1]=arr[i];
		}
		
		arr[indexposition]=element;
		index++;
	}
	
	public void remove() 
	{
		if(index>=0) 
		{
			arr[index]=" ";
			index--;	
		}
	}
	
	public void remove(int indexposition) 
	{
		if(indexposition<index && indexposition>0) 
		{
			arr[indexposition]=" ";	
		}
		
		for(int i=indexposition;i<index-1;i++) 
		{
			arr[i]=arr[i+1];
		}
		index--;
	}
	
	public int size() 
	{
		return this.index;
	}
	
	public void print() 
	{
		for(int i=0;i<size();i++)
			System.out.println(arr[i]);
	}
	
	
	public boolean contains(String element) 
	{
		for(int i=0;i<index;i++) 
		{
			if(arr[i].equals(element))
				return true;
		}		
	    return false;
	    
	}

}
