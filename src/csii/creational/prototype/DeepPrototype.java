package csii.creational.prototype;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * 深拷贝原型
 * @author xiehai
 * @date 2013-8-8 下午05:51:12 
 */
@SuppressWarnings("unchecked")
public class DeepPrototype implements Prototype,Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private List list;
	private Person person;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object clone(){
		return deepClone();
	}
	
//	public Object deepClone() throws IOException, ClassNotFoundException{  
//	    ByteArrayOutputStream bos = new ByteArrayOutputStream();   
//	    ObjectOutputStream oos = new ObjectOutputStream(bos);   
//	    oos.writeObject(this);   
//	    ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());   
//	    ObjectInputStream ois = new ObjectInputStream(bis);   
//	    return ois.readObject();  
//	}
	public Object deepClone(){
		Object obj = null;
		try{
			obj = (Object) super.clone();
			((DeepPrototype) obj).list = (List) ((LinkedList)this.list).clone(); 
			((DeepPrototype) obj).person = (Person) person.clone();
			return obj;
		}catch(Exception e){
			
		}
		return obj;
	}

	@Override
	public List getList() {
		return list;
	}

	@Override
	public void setList(List list) {
		this.list = list;
	}

	@Override
	public Person getPerson() {
		return person;
	}

	@Override
	public void setPerson(Person p) {
		this.person = p;
	}  
}
