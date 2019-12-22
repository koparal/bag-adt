public class TestBag {

    public static void main(String[] args)
    {
        	
    	System.out.println("Test of object equals");
        Bag bag = new Bag();
        Bag bag2 = new Bag();
        TestObj testObj = new TestObj();
        
        System.out.println(bag.getName()+ " and "+testObj.getName()+" objects is equal : "+bag.equals(testObj));
        System.out.println(bag.getName()+" and "+bag2.getName()+"2 objects is equal : "+bag.equals(bag2));      
        
        System.out.println("*********************");
        
        System.out.println("Added items in the bag : ");
        
        bag.add("saban");
        bag.add("koparal");  
        bag.add("saban");
        bag.add("anil");
        bag.add("anil");
        bag.add("saglam");
        bag.add("koparal");
  
        bag.display();
        
        System.out.println(bag);
               
        System.out.println("*********************");
        
        System.out.println("Is contains 'anil' : "+ bag.contains("anil"));
        
        System.out.println("Is contains 'Saban' : "+ bag.contains("Saban"));
        
        System.out.println("*********************");     
        
        System.out.println("Element Size : " + bag.size());
        
        System.out.println("*********************");
        
        System.out.println("Distict Size : " + bag.distictSize());
        
        System.out.println("*********************");
        
        int elementSizeByItem = bag.elementSize("anil");
        
        System.out.println("Element Size of 'anil' : "+ elementSizeByItem);
        
      	int elementSizeByItem2 = bag.elementSize("saban");
        
        System.out.println("Element Size of 'saban' : "+ elementSizeByItem2);
        
        System.out.println("*********************");
       
        
        System.out.println("Removed items in the bag : ");
        
        bag.remove("saban");
        bag.remove("koparal");  
        bag.remove("saban");
        bag.remove("anil");
        bag.remove("anil");
        bag.remove("saglam");
        bag.remove("koparal");
      
        System.out.println(bag);
        
        System.out.println("*********************");
        
        System.out.println("Trying to delete 'test' record that's not in the bag");
        
        bag.remove("test");
        
        System.out.println("*********************");
        
        bag.add("saban");
        
        System.out.println("Before clear isEmpty : "+ bag.isEmpty());
        
        bag.clear();
        
        System.out.println("Clear After");
        System.out.println("isEmpty : "+bag.isEmpty());
        
        System.out.println("Display List");
        bag.display();
       
        System.out.println("*********************");
        

    }

}