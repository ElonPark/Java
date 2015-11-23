package abstractTest;

public class abstractTest {

    public static void main(String[] args) {
	
	/*productA pa = new productA();
	
	pa.dispName();
	pa.dispCompany();
	
*/
	Unit un = new Marine();
	Marine ma= new Marine();
	Tank tank = new Tank();
	Dropship drs= new Dropship();
	ma.move(35, 61);
	ma.stop();
	ma.stimPack();
	
	tank.changeMode();
	drs.load();
	drs.unload();
	
	un.move(11, 32);
	un.stop();
	
	
    }

}
