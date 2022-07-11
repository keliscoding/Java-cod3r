package oo.heranca;

public class Jogo {
	public static void main(String[] args) {
		Jogador monstro = new Monstro(10, 10);
	
		Jogador heroi = new Heroi(10, 11);
		
//		jogador1.andar(Direcao.NORTE);
//		jogador1.andar(Direcao.LESTE);
//		jogador1.andar(Direcao.NORTE);
//		jogador1.andar(Direcao.LESTE);
//		System.out.println(jogador1.x + " " + jogador1.y);
		
		System.out.println(monstro.getVida());
		System.out.println(heroi.getVida());
		
		heroi.atacar(monstro);
		
		System.out.println("Monstro tem => " + monstro.getVida());
		System.out.println("Heroi tem => " + heroi.getVida());
			
	}
}
