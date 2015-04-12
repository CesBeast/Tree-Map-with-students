import java.util.TreeMap;
public class Table<K extends Comparable<K> ,T> {   // K = key,  T = item
	
 TreeMap<K,T> Studentmap = new TreeMap<K, T>();
 TreeMap<K, T> Temp = new TreeMap<K, T>();
 
	public Table() {  //constructor for table
	
}
	public boolean isEmpty(){
		if(Studentmap.isEmpty()== true)
			return true;
		else{
			return false;}
		}
	
	   public int size(){
		return Studentmap.size(); 
		}
	   
	   public void tableInsert(K key, T item) throws TableException { 
		   if(Studentmap.containsKey(key)==true)
			   throw new TableException("Error: Key already exists in table.");
		   else
			   Studentmap.put(key, item);
	   }
	   public boolean tableDelete(K key) {
		   if(Studentmap.containsKey(key)!=true)
			   return false;
		   else{
			   //Studentmap.remove(key);
			   return true; }
		}
	   
	   public T tableRetrieve(K key){
		   if(Studentmap.containsKey(key)==true){
			   return Studentmap.get(key);
		   }
		return null; 
		}  //return null if not found
	   
	   public void printTable(){ 
		   Temp=(TreeMap<K, T>) Studentmap.clone();
		   int loopCount=Temp.size();
		   for(int i=0; i<loopCount;i++)
		   System.out.println(Temp.pollFirstEntry().toString());
	   }  //print in search key order

}
