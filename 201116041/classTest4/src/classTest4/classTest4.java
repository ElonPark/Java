package classTest4;

public class classTest4 {

    public static void main(String[] args) {
	/*
	youClass ycls = new youClass();
	heClass hcls = new heClass();
	ycls.method();
	hcls.method();
	////////////////////
	myClass[] cls = new myClass[2];
	
	cls[0]= new youClass();
	cls[1]= new heClass();
	
	for(int i=0;i<cls.length;i++){
	    cls[i].method();//자식클래스부터 호출됨
	}
	//youClass ycls = new youClass();
	
	//ycls.method();*/
	sharp shp[] = new sharp[3];
	shp[0] =new Rectangle();
	shp[1]= new circle();
	shp[2]=new triangle();
	for(int i=0;i<shp.length;i++){
	    shp[i].myMethod();//
	}

    }

}
