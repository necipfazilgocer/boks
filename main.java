
public class main {

	public static void main(String[] args) {
		fighter f1=new fighter("KIRMIZI KÖŞE",10,100,130,50) ;
		fighter f2=new fighter("MAVI KÖŞE",20,100,100,50) ;
		
		match match=new match(f1,f2,100,200);
		match.run();

	}

}
