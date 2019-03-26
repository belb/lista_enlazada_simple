package bel.listaenlazadasimple;

public class ListSimple {
     private Node nodeFirst;
     private Node nodeLast;
     private int count;
     
     public ListSimple(){
    	nodeFirst=null;
    	nodeLast=null;
    	count=0;
       	 
     }
     public int length()
     {
         return count;	 
     }
     
     public void addLast(int dato)
     {
    	 if(nodeFirst==null)
    	 {
    		Node newone=new Node(dato);
    		     nodeFirst=newone;
    		     nodeLast=newone;
    		     count++;
    		
    	 }else
    	 {
    		 Node newon=new Node(dato);
     		 nodeLast.next=newon;
    		 nodeLast=newon;
    		 count++;
    		 
    	 }
    	
    	 
     }
     
     public void addFirst(int dato)
     {
    	 if(nodeFirst==null)
    	 {
    		 Node newNode=new Node(dato);
    		 nodeFirst=newNode;
    		 nodeLast=newNode;
    		 count++;
    		 
    	 }
    	 else
    	 {
    		 Node newNode=new Node(dato);
    		   newNode.next=nodeFirst;
    		   nodeFirst=newNode;
    		   count++;   		 
    	 }
     }
     
     public void addToPosition(int position, int dato){
         
         if(nodeFirst==null&&position>=0)
         {
        	 Node newNodo=new Node(dato);
        	    nodeFirst=newNodo;
        	    nodeLast=newNodo;
        	    count++;
         }
                 else
         {
             Node current=nodeFirst;
             Node before=null;
        	 int cont=-1;
        	
        	 while(current!=null&&cont>=-1){
        		   		    
        		 if(cont==position&&before!=null)
        		 {
        			 
        			Node nodoNew=new Node(dato);
        			     nodoNew.next=current;
        			     before.next=nodoNew;
                         current=nodoNew;
                         count++;
        			            			 		 
        		 }
        		       		 
        		 before=current;
        	
        		 current=current.next;
        
        		 cont++;
        		         		 
        	 }
        	 if(position>=cont)
        	 {
        		 Node newNodo=new  Node(dato);
        		 nodeLast.next=newNodo;
        		 nodeLast=newNodo;
        		 count++;
        	 }
        	 
         }
    	 
     
     }
     
     public int getItem(int position)
     {
    	 int i=0;
    	 int dato=0;
    	 Node temp=nodeFirst;
    		 while(temp!=null)
    		 {
    			 if(i==position)
    			 {
    				dato=  temp.dato;
    				 break;
    			 }
    			  i++;
    			 temp=temp.next;
    		 }
    	  	 
    	 return dato;
     }
     
     public void removeToInitial()
     {
    	 if(count==0)
    	 {
    		 nodeFirst=null;
    		 nodeLast=null;
    	 }
    	 if(count>0)
    	 {
    		nodeFirst=nodeFirst.next;
    		    		 
    	 }
     }
     public void removeToLast()
     {
    	 if(count==0)
    	 {
    		 nodeFirst=null;
    		 nodeLast=null;
    	 }
    	 if(count>0)
    	 {
    		 Node current=nodeFirst;
    		 Node before=null;
    		 int i=0;
    	   while(current!=null&&i<count)
    	   {   before=current;
    		   current=current.next;
    		   i++;
    	   }
    	    before.next=null;
    	   
    	   
    	 }
     }
     
     public void showList()
     {
    	 Node temp=nodeFirst;
    	 while(temp!=null)
    	 {
    		 System.out.println(temp.dato);
   	      temp= temp.next;
    		 
    	 }
     }
     public String toString()
     {
    	 Node temp=nodeFirst;
    	String string="[";
    	int i=0;
    	 while(temp!=null)
    	 {
    		 string+=String.valueOf(temp.dato);
    		 if(i<count-1)
    		 {
                string+=",";
    		 }
    		 
   	      temp= temp.next;
   	      i++;
    	 }
    	     string+="]";
    	 return string;
     }
     
     public int[] getArray()
     {
    	 Node temp=nodeFirst;
    	 int[] aux=new int[count];
    	 for(int i=0;i<count;i++)
    	 {
    		 aux[i]=temp.dato;
    		 temp=temp.next;
    	 }
    	 
    	 return aux;
     }
	
	
}
