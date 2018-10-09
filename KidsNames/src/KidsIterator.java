import java.util.Iterator;

class KidsIterator implements Iterator
{
 
	Kids[] kidsList;
    
	int pos = 0;
	
	public KidsIterator (Kids[] kidsList) {
		
		this.kidsList = kidsList;
		
}

	public Object next() 
    { 
        // return next element in the array and increment pos 
        Kids kids =  kidsList[pos]; 
        pos += 1; 
        return kids; 
    } 
  
    public boolean hasNext() 
    { 
        if (pos >= kidsList.length || 
            kidsList[pos] == null) 
            return false; 
        else
            return true; 
    } 
}


