import java.util.Iterator;

class KidsCollection implements Collection {

	static final int MAX_ITEMS = 6;
	int numberOfItems = 0; 
    Kids[] kidsList; 
    
    
    public KidsCollection () {
    	
    	kidsList = new Kids[MAX_ITEMS];
    	
    	addItem("Kid1 Max");
    	addItem("Kid2 Est");
    	addItem("Kid3 Leo");
    	addItem("Kid4 JuJu");
    }
	
    public void addItem(String str) 
    { 
        Kids kids = new Kids(str); 
        if (numberOfItems >= MAX_ITEMS) 
            System.err.println("Full"); 
        else
        { 
            kidsList[numberOfItems] = kids; 
            numberOfItems = numberOfItems + 1; 
        } 
    } 
  
    public Iterator createIterator() 
    { 
        return new KidsIterator(kidsList); 
    } 
} 
  
// We could also use Java.Util.Iterator 



