import java.awt.Color;
import java.util.Random;

public class Spawn {

	
	private Random random =new Random();
	public void spawn(MonsterClass[][] monsters){
		
		for(int i=0;i<10;i++){
			int randomColor=random.nextInt(5);
			
			if(i<5){
			monsters[i+3][0]=new MonsterClass((i+3)*48,0,48,48,5,5,5,5,new Color(51*(randomColor+1),0,51),randomColor);
		monsters[i+3][0].setPlayer(1);
		Table.player1.addMonster(monsters[i+3][0]);
		
		}else{
			monsters[i-2][monsters.length-1]=new MonsterClass((i-2)*48,(monsters.length-1)*48,48,48,5,5,5,5,new Color(0,51,51*(randomColor)),randomColor);
		monsters[i-2][monsters.length-1].setPlayer(2);
		Table.player2.addMonster(monsters[i-2][monsters.length-1]);
		
		
		}
		}
		
		
		
	}
	
	
}
