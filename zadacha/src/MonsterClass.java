import java.awt.Color;
import java.awt.Graphics;

public class MonsterClass extends GameObject{

	
	
	float ataka;
	float zashtita;
	float magicheskaSila;
	float skorost;
	
	
	
	Color monsterColor;
	int player=1;
	boolean frozen=false;
			int index;
	public MonsterClass(int x,int y,int width,int height,float ataka, float zashtita, float magicheskaSila, float skorost,Color monsterColor,int index) {
		super(x,y,width,height);
		this.ataka = ataka;
		this.zashtita = zashtita;
		this.magicheskaSila = magicheskaSila;
		this.skorost = skorost;
		this.monsterColor=monsterColor;
		this.index=index;
	}
	
	
	
	public boolean isFrozen() {
		return frozen;
	}



	public void setFrozen(boolean frozen) {
		this.frozen = frozen;
	}



	public int getIndex() {
		return index;
	}



	public void setIndex(int index) {
		this.index = index;
	}



	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;
	}



	public float getAtaka() {
		return ataka;
	}
	public void setAtaka(float ataka) {
		this.ataka = ataka;
	}
	public float getZashtita() {
		return zashtita;
	}
	public void setZashtita(float zashtita) {
		this.zashtita = zashtita;
	}
	public float getMagicheskaSila() {
		return magicheskaSila;
	}
	public void setMagicheskaSila(float magicheskaSila) {
		this.magicheskaSila = magicheskaSila;
	}
	public float getSkorost() {
		return skorost;
	}
	public void setSkorost(float skorost) {
		this.skorost = skorost;
	}
	
	

	
	public void paint(Graphics g){
		g.setColor(monsterColor);
		g.fill3DRect(x, y, width, height, true);
	}
	public void tick(){
	
	
	}
	
}
