package oo.heranca;

public class Jogo {
	public static void main(String[] args) {
		Jogador jogador1 = new Monstro();
		jogador1.x = 10;
		jogador1.y = 10;
		
		Jogador jogador2 = new Heroi();
		jogador2.x = 10;
		jogador2.y = 11;
		
//		jogador1.andar(Direcao.NORTE);
//		jogador1.andar(Direcao.LESTE);
//		jogador1.andar(Direcao.NORTE);
//		jogador1.andar(Direcao.LESTE);
//		System.out.println(jogador1.x + " " + jogador1.y);
		
		System.out.println(jogador1.vida);
		System.out.println(jogador2.vida);
		
		jogador1.atacar(jogador2);
		
		System.out.println(jogador1.vida);
		System.out.println(jogador2.vida);
			
	}
}
