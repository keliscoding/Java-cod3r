package oo.heranca;

public class Jogo {
	public static void main(String[] args) {
		Jogador monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		Jogador heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;
		
//		jogador1.andar(Direcao.NORTE);
//		jogador1.andar(Direcao.LESTE);
//		jogador1.andar(Direcao.NORTE);
//		jogador1.andar(Direcao.LESTE);
//		System.out.println(jogador1.x + " " + jogador1.y);
		
		System.out.println(monstro.vida);
		System.out.println(heroi.vida);
		
		heroi.atacar(monstro);
		
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);
			
	}
}
