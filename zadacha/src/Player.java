import java.util.ArrayList;
import java.util.List;

public class Player {

	
	
 int player;
 int magicPoints=10;
 List<MonsterClass> monsters=new ArrayList<MonsterClass>();
 
 int magicIndex;
 String magicName ;
 
 
 
 



public Player(int player) {
	super();
	this.player = player;
}



public int getMagicPoints() {
	return magicPoints;
}



public void setMagicPoints(int magicPoints) {
	this.magicPoints = magicPoints;
}



public String getMagicName() {
	return magicName;
}



public void setMagicName(String magicName) {
	this.magicName = magicName;
}



public void osvobodiMagiq(MonsterClass monster){
	 if(PromenliviZaIgrata.MAGICHESKA_SILA_ZA_MAGIITE[magicIndex]>magicPoints){
		 return;
	 }
	 switch(magicIndex){
	 case 0:
		 monster.setMagicheskaSila(PromenliviZaIgrata.MAGICHESTI_TOCHKI[monster.getIndex()]);
		 
		 magicPoints-=20;
		 break;
	 case 1:
		 
		 break;
	 case 2:
		 monster.setZashtita(PromenliviZaIgrata.ZASHITA[monster.getIndex()]);
		 break;
	 case 3:
		 monster.setFrozen(false);
		 break;
	 case 4:
		 monster.setAtaka(monster.getAtaka()*2);
		 break;
	 }
 }

public void addMonster(MonsterClass m ){
	monsters.add(m);
}
 
}
