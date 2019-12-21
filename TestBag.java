public class TestBag {

    public static void main(String[] args)
    {
        	
    	System.out.println("Test of object equals");
        Bag bag = new Bag();
        Temp temp = new Temp();
        
        System.out.println("Bag and Temp objects is equal : "+bag.equals(temp));      
        
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
        
        System.out.println("Is contains 'saban' : "+ bag.contains("saban"));
        
        System.out.println("Is contains 'cbü' : "+ bag.contains("cbü"));
        
        System.out.println("*********************");
        
        int distictSize = bag.distictSize();
        
        System.out.println("Distict Size : " + distictSize);
        
        System.out.println("*********************");
        
        int elementSizeByItem = bag.elementSize("anil");
        
        System.out.println("Element Size of 'anil' : "+ elementSizeByItem);
        
        System.out.println("*********************");
        
        
        int size = bag.size();
        
        System.out.println("Size of Bag : "+ size);
        
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
        
        System.out.println("Trying to delete a record that's not in the bag");
        
        bag.remove("thebag");
        
        System.out.println("*********************");
        
        bag.add("saban");
        
        System.out.println("Before clear isEmpty : "+ bag.isEmpty());
        
        bag.clear();
        
        System.out.println("Clear After");
        System.out.println("isEmpty : "+bag.isEmpty());
        
        System.out.println("*********************");
        

    }

}