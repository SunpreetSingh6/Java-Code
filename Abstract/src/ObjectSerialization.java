import java.io.*;
class ObjSerial implements Serializable
{
	int i;
}

public class ObjectSerialization 
{

	public static void main(String[] args) throws Exception
	{
		// Serialization :- Saving the state of an object in a file. 
		// In object serialization we can actually store objects in a file by using ObjectOutputStream and can 
		// read using ObjectInputStream
		// Java won't allow us to store object directly because it can used be for some miscellaneous work
		// so if we want to store objects in file we need to use a marker interface known as Serializable.
		
		// Serialization :- Serialization is a mechanism of converting a state of an object into a byte stream
		// De-Serialization :- De-Serialization is a reverse process where byte stream is used to recreate actual java object.
		
		//  Example is when we want to save any game which is in progress we actually save the state of 
		//	the object and when we want to continue then we just fetch that stored object.
		
		ObjSerial os = new ObjSerial();
		os.i = 15;
		File f = new File("ObjectSerialization.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(os);
		fos.close();
		oos.close();
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		ObjSerial obj1 = (ObjSerial)ois.readObject(); 
		// readobject() method returns the object of Object class,so we need to change/typecast that object into our class object.
		System.out.println("Value for i :- " + obj1.i);
		fis.close();
		ois.close();
	}

}
