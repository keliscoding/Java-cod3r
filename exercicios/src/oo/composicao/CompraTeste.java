package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		Compra c1 = new Compra();
		c1.cliente = "João Pedro";
		c1.adicionarItem("Camisa", 3, 29.90);
		c1.adicionarItem(new Item("Calça", 3, 79.90));
		c1.adicionarItem(new Item("Cuecas", 10, 9.90));
		
		System.out.println(c1.itens.size());
		System.out.println(c1.getValorTotal());
	}
}
