
public class match {
	fighter f1;
	fighter f2;
	int minWeight;
	int maxWeight;	
	boolean isCheck;
	
	match(fighter f1,fighter f2,int minWeight,int maxWeight){
		this.f1=f1;
		this.f2=f2;
		this.minWeight=minWeight;
		this.maxWeight=maxWeight;	
	}	
	void run()
	{
		if(!isCheck) {
			while(this.f1.health>0&&this.f2.health>0) {
				
				this.f2.health=this.f1.hit(this.f2);
				if(isWin()) {
					break;
				}
				this.f1.health=this.f2.hit(this.f1);
				if(isWin()) {
					break;
				}
				
				System.out.println("Mavi köşe "+this.f2.health);				
				System.out.println("kırmızı köşe "+this.f1.health);
				System.out.println("---------");
			}
							
			}			
		else {
			System.out.println("Sporcuların sikletleri uymuyor.");
		}
		
		 
	}
												boolean isCheck() {
												return(this.f1.weight>=minWeight&&this.f1.weight<=maxWeight)&&(this.f2.weight>=minWeight&&this.f2.weight<=maxWeight);
												}
	
									boolean isWin() {
										if(this.f1.health==0) {
											System.out.println(this.f2.name+" kazandı.");
											return true;
										}
										if(this.f2.health==0) {
											System.out.println(this.f1.name+" kazandı.");
											return true;
										}
										return false;
		
										}										
}
	
	
