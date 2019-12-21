public class Bag<N>
{
    private Node<N> head;
    
    public Bag()
    {
        head = null;
    }

    public void add(N key)
    {

        if (isEmpty())
        {
            Node<N> newNode = new Node<N>(key);
            head = newNode;
        } else
        {
            Node<N> current = head;
            Node<N> last = head; 
            boolean found = false;
            while (current != null)
            {
                if (current.getKey().equals(key) )
                {
                    current.incrementValue();
                    found = true;
                    break;
                }
                last = current;
                current = current.getNext();
            }

            if (!found)
            {
                Node<N> newNode = new Node<N>(key);
                last.setNext(newNode);
            }

        }

    }

    public void clear() {
        head = null;
    }
    
    public boolean contains(N key)
    {
        Node<N> current = head;
        while (current != null)
        {
            if (current.getKey().equals(key) )
            {
                return true;
            }
            current = current.getNext();
        }

        return false;
    }

    public int distictSize()
    {
        Node<N> current = head;
        int counter = 0;
        while (current != null) 
        {
            counter++;
            current = current.getNext();
        }
        
        return counter;
    }
    	
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
    
    public int elementSize(N key) 
    {
        Node<N> current = head;
        int elementsize = 0;
        while (current != null) 
        {
            if (current.getKey() == key) 
            {
                elementsize = current.getValue();
                break;
            }

            current = current.getNext();
        }
        
        return elementsize;
    }

    public boolean remove(N key) 
    {

        if (!contains(key))
        {
            System.out.println("The item '" + key + "' does not exists");
        } else
        {
            Node<N> current = head;
            Node<N> previous = head;
            while (current != null)
            {
                if (current.getKey().equals(key) )
                {
                    if (current == head) 
                    {
                        current.decreaseValue();
                        if (current.getValue() < 1) 
                        {
                            head = head.getNext();
                            return false;
                        }
                        return true;
                    } else
                    {
                        current.decreaseValue();
                        if (current.getValue() < 1)
                        {
                            previous.setNext(current.getNext());
                            current.setNext(null);
                            return false;
                        }

                        return true;

                    }
                }
                previous = current;
                current = current.getNext();
            }
        }
        return false;
    }

    public int size() 
    {
        Node<N> current = head;
        int size = 0;
        while (current != null)
        {
            size = size + current.getValue();
            current = current.getNext();

        }
        return size;
    }

    public void display()
    {
        if (head == null){
            System.out.println("No data to list. The bag is empty");
        }
        else{
            Node<N> current = head;
        	String list ="Bag : ";
        	while (current != null)
	        {
        		list+="[" + current.getKey() + " , " + current.getValue() + "]" + "--> ";	            
	            current = current.getNext();
	        }
	        System.out.println(list + "null" );
        }
    }
    
    public boolean isEmpty()
    {
        if (head == null) 
        {
            return true;
        } else
        {
            return false;
        }
    }

    public String toString()
    {
        if(isEmpty()){
            return "The Bag is empty";
        }
        
        Node<N> current = head;
        
        String string = "Bag = ";
        while (current != null)
        {
            for (int i = 0; i < current.getValue(); i++) 
            {

                string += "[" + current.getKey() + "]";
            }

            current = current.getNext();
        }
        return string;
    }

}