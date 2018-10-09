import java.util.Iterator;

class KidsBar {
	KidsCollection kids;
	
	public KidsBar(KidsCollection kids)
	{
		this.kids = kids;
	}
    
	public void printKids()
	{
		Iterator iterator = kids.createIterator(); 
        System.out.println(" **NAMES BAR** "); 
        while (iterator.hasNext()) 
        { 
            Kids n = (Kids)iterator.next(); 
            System.out.println(n.getKids()); 
        } 	
	}
}
