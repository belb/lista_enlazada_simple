package bel.listaenlazadasimple;

public class Ejemplo1 {
	
	public static void main(String ar[])
	{
	    
		ListSimple lista=new ListSimple();
		
		lista.addFirst(23);
		lista.addLast(67);
		//lista.insertListLast(1);
		//lista.insertListLast(2);
		//lista.insertListFirst(3);
		//lista.InsertListLast(4);
	//	lista.showList();
		//lista.insertValuePosition(0, 1);
		//lista.insertValuePosition(1, 2);
		//lista.insertValuePosition(2, 6);
		//lista.insertValuePosition(3, 78);
		//lista.insertValuePosition(4, 90);
		//lista.insertValuePosition(1, 900);
		//lista.insertValuePosition(3, 900);
		//lista.insertValuePosition(1, 2);
		//lista.insertValuePosition(2, 3);
		//lista.showList();
		lista.addToPosition(0,20);
		lista.addToPosition(2,5);
		//lista.addToPosition(3,30);
		//lista.addToPosition(4,200);
	   lista.showList();
	  System.out.println("-------------");
	  // lista.removeToInitial();
	  // lista.removeToInitial();
	 // lista.removeToLast();
	  //lista.showList();
	  for(int i=0;i<lista.length();i++)
	  {
		  System.out.println(i+" position "+lista.getItem(i));
	  }
	  
	//  lista.addToPosition(5,100);
	  System.out.println("-------------------------------------------");
	  lista.addFirst(100);
	  lista.addLast(200);
	  lista.addToPosition(4,76);
	  System.out.println(lista);
	 
	}
	
	

}
