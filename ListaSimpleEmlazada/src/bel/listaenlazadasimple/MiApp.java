package bel.listaenlazadasimple;




public class MiApp {
	public static void main(String ar[])throws  InterruptedException   
	
	{
		int num []=new int[100000];
		for(int i=0;i<num.length;i++)
		{
			num[i]=(int)(Math.random()*1000000);
			
		}
		
		int aux=0;
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num.length-1;j++)
			{
				if(num[j]>num[j+1])
				{
					aux=num[j];
					num[j]=num[j+1];
					num[j+1]=aux;
					
				}
			}
		}
	     
		for(int n : num)
		{
			System.out.println(n);
		}
	
		
	}

}
