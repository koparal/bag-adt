public class TestObj {
	
	int item;
	
	public TestObj()
	{
		this.item = 0;
	}
	
   public String getName()
    {
    	return this.getClass().getSimpleName();
    }
}
