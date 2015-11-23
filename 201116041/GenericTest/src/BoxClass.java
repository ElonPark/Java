
public class BoxClass <T>{

    T obj;
    
    BoxClass(T o)
    {
	this.obj = o;
    }
    
    public T get(){
	return this.obj;
	
    }
}
