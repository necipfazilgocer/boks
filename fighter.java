
public class fighter {
	String name;
	int damage;
	int health;
	int weight;
	int dodge;
	fighter(String name,int damage,int health,int weight,int dodge)
	{
	this.damage=damage;
	this.name=name;
	this.health=health;
	this.weight=weight;
	if(dodge>00&&dodge<0100) {
		this.dodge=dodge;
	}
	else {
		this.dodge=0;
	}
	}
			 int hit(fighter foe) 
				{
					System.out.println(this.name+"=> "+" "+ foe.name+"'ye "+ this.damage+" hasar verdi");
					 if(foe.isDodge())
					 {
						 
						 System.out.println(foe.name+" gelen hasarı blokladı.");
						 return foe.health;
					 }
					if ((foe.health-this.damage)<0)
					{
						return 0;
					}
					 return foe.health-this.damage;
				}
			
			 							boolean isDodge()
			 									{
			 									 double randomNumber=Math.random()*100;
			 									return randomNumber<=this.dodge;
			
			 										}

}
