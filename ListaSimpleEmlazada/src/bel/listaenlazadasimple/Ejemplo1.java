package bel.listaenlazadasimple;

public class Ejemplo1 {

public static void main(String ar[])
{
    
	ListSimple lista=new ListSimple();
	
	lista.addFirst(23);   //agregar al principio
	lista.addLast(67);     //agregar al final
	lista.addToPosition(0,20);// agregar el valor de 20 en la posicion 0
	lista.addToPosition(2,5);
	lista.addToPosition(3,30);
	lista.addToPosition(4,200);
   lista.showList(); // mostrar lista 
  System.out.println("-------------");
   lista.removeToInitial();  //eliminar un valor al principio
   lista.removeToInitial(); 
  lista.removeToLast();  //eliminar un valor alfinal
  
  lista.showList();  // mostrar lista 
  for(int i=0;i<lista.length();i++)  //optener un valor individual por medio de un for
  {
	  System.out.println(i+" position "+lista.getItem(i));
  }
  
  lista.addToPosition(5,100);   
  System.out.println("-------------------------------------------");
  lista.addFirst(100);
  lista.addLast(200);
  lista.addToPosition(4,76);
  System.out.println(lista);// imprimir el contenido completo de la lista 
 
}
}
