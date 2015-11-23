package cardClass;

public class rCrad {
    int num;
    String model;
    rCrad(int num, String model)
    {
	this.num=num;
	this.model=model;
    }
    
   // "spade":"diamond":"clover":"heart");
    public String toString() {
	return num + model;
}

}
