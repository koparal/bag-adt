public class Node<N>
{
	private N key;
    private int value;
    private Node<N> next;

    public Node(N k)
    {
    	key = k;
        value = 1;   
        next = null;
    }

    public void setValue(int newData)
    {
        value = newData;
    }

    public void setNext(Node<N> NextData)
    {
        next = NextData;
    }

    public void setKey(N newKey)
    {
        key = newKey;
    }

    public int getValue()
    {
        return value;
    }

    public Node<N> getNext() 
    {
        return next;
    }

    public N getKey() 
    {
        return key;
    }

    public void increaseValue() 
    {
        value++;
    }

    public void decreaseValue() 
    {
        value--;
    }

    
}