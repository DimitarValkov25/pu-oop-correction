import java.awt.Color;
import java.awt.Graphics;

public class Table {

	public static MonsterClass tableOfMonsters[][] =new MonsterClass[12][12];
	
	public static final Player player1=new Player(1);
	public static final Player player2=new Player(2);
	
	
	public Table(){
		Spawn monsterSpawn=new Spawn();
		monsterSpawn.spawn(tableOfMonsters);
		
		
		
		
	}
	
	public void paint(Graphics g){

		
		
		for(int i=0;i<tableOfMonsters.length;i++){
			for(int j=0;j<tableOfMonsters.length;j++){
				
				if(tableOfMonsters[i][j]!=null){
				
						
						tableOfMonsters[i][j].paint(g);
						
					
				}else{
					g.setColor(Color.WHITE);
					g.fill3DRect(i*48, j*48, 48, 48,true);
				}
				
				
			}
		}
		
	}
	
	
}
