package oo.heranca;

public class Jogador {
	private int vida = 100;
	private int x;
	private int y;
	
	protected Jogador(int x, int y) {
		this.x = x;
		this.y = y;
	}
		
	public int getVida() {
		return vida;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	protected boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
		} else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;
		} else {
			return false;
		}
		
		return true;
	}
	
	protected boolean andar(Direcao direcao) {
		switch(direcao) {
			case NORTE:
				y--;
				break;
			case LESTE:
				x++;
				break;
			case SUL:
				y++;
				break;
			case OESTE:
				x--;
				break;
		}
		
		return true;
	}
	
	
}
