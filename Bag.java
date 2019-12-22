public class Bag<N>
{
    private Node<N> head;
    
    /**
     * Constructor
     */ 
    public Bag()
    {
        head = null;
    }
    
    /** 
     * @return String  
     */
    public String getName()
    {
    	return this.getClass().getSimpleName();
    }
    
    /**
     * @param N key
     * @return void  
     */ 
    public void add(N key)
    {
        if (isEmpty()){
            Node<N> newNode = new Node<N>(key);
            head = newNode;
        }else{	
        	boolean is_there = false;
            Node<N> currentNode = head;
            Node<N> lastNode = head; 
            
            while (currentNode != null) {
                if (currentNode.getKey().equals(key)){
                    currentNode.increaseValue();
                    is_there = true;
                    break;
                }
                lastNode = currentNode;
                currentNode = currentNode.getNext();
            }

            if (!is_there){
                Node<N> newNode = new Node<N>(key);
                lastNode.setNext(newNode);
            }

        }

    }
    
    /**
     * @return void  
     */
    public void clear() {
        head = null;
    }
    
    
    /**
     * @param N key
     * @return boolean  
     */
    public boolean contains(N key)
    {
        Node<N> currentNode = head;
        while (currentNode != null){
            if (currentNode.getKey().equals(key)){
                return true;
            }
            currentNode = currentNode.getNext();
        }

        return false;
    }

    /**
     * @return int  
     */
    public int distictSize()
    {
        Node<N> currentNode = head;
        int counter = 0;
        while (currentNode != null){
            counter++;
            currentNode = currentNode.getNext();
        }
        
        return counter;
    }
    	
    /**
     * @param Object obj
     * @return boolean  
     */   
    public boolean equals(Object obj)
    {
	    if (obj == this){
	        return true;
	    }
	    if (obj == null){
	        return false;
	    }
	    if (obj instanceof Bag){
	    		return true;
	    }
	    else{
	        return false;
	    }
    }
    
    /**
     * @param N key
     * @return int  
     */ 
    public int elementSize(N key) 
    {
        Node<N> currentNode = head;
        int elementsize = 0;
        while (currentNode != null){
            if (currentNode.getKey() == key){
                elementsize = currentNode.getValue();
                break;
            }
            currentNode = currentNode.getNext();
        }
        
        return elementsize;
    }
    
    /**
     * @param N key
     * @return boolean  
     */    
    public boolean remove(N key) 
    {

        if (!contains(key)){
            System.out.println("The item '" + key + "' does not exists");
        } else{
            Node<N> currentNode = head;
            Node<N> previousNode = head;
            while (currentNode != null){
                if (currentNode.getKey().equals(key) ){
                    if (currentNode == head){
                        currentNode.decreaseValue();
                        if (currentNode.getValue() < 1){
                            head = head.getNext();
                            return false;
                        }
                        return true;
                    } 
                    else{
                        currentNode.decreaseValue();
                        if (currentNode.getValue() < 1){
                            previousNode.setNext(currentNode.getNext());
                            currentNode.setNext(null);
                            return false;
                        }
                        return true;
                    }
                }
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
        }
        return false;
    }

    /**
     * @return int 
     */   
    public int size() 
    {
    	int size = 0;
        Node<N> currentNode = head;
        while (currentNode != null){
            size = size + currentNode.getValue();
            currentNode = currentNode.getNext();
        }
        return size;
    }

    /**
     * @return void  
     */ 
    public void display()
    {
        if (isEmpty()){
            System.out.println("No data to list. The bag is empty");
        }
        else{
            Node<N> currentNode = head;
        	String list ="Bag List : ";
        	while (currentNode != null){
        		list+="[" + currentNode.getKey() + " x " + currentNode.getValue() + "]" + " > ";	            
	            currentNode = currentNode.getNext();
	        }
	        System.out.println(list + "null" );
        }
    }
    
    /**
     * @return boolean  
     */
    public boolean isEmpty()
    {
        if (head == null){
            return true;
        } else{
            return false;
        }
    }
    
    /**
     * @return String  
     */
    public String toString()
    {
        if(isEmpty()){
            return "The Bag is empty";
        }else {
        	
            Node<N> currentNode = head;
            
            String text = "Bag Object : ";
            while (currentNode != null){
                for (int i = 0; i < currentNode.getValue(); i++){
                	text += "[" + currentNode.getKey() + "]";
                }
                currentNode = currentNode.getNext();
            }
            return text;
        }
    }

}