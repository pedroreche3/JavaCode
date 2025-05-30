package lojagamer;

public class Produtos { // OBJETO E ATRIBUTOS DO OBJETO
	private int id;
	private String nome;
	private String descricao;
	private float preco;
	private int quantidade;
	private String categoria;
	
	public Produtos() {} //CONSTRUTOR VAZIO PARA CRIAR INSTACIAS SEM INICIALIZAR OS ATRIBUTOS PARA JDBC
	
	public Produtos(String nome, String descricao, float preco, int quantidade, String categoria) { // CONSTRUTOR COM PARAMETRO PARA CRIAR O PRODUTO COM VALORES INICIAIS
		this.nome = nome; //THIS É PARAMETRO PARA DIZER QUE O PARAMETRO NOME VAI SER GUARDADA NO ATRIBUTO NOME
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
		this.categoria = categoria;
	}
	public int getId() { //getters e setters usado para modificar atributos privados fora da classe 
		return id;
	}
    public void setId(int id) {
    	this.id = id; }
    
    public String getNome() { 
    	return nome; 
    }
    public void setNome(String nome)  {
    	this.nome = nome; 
    }
    public String getDescricao() {
    	return descricao; 
    }
    public void setDescricao(String descricao) { 
    	this.descricao = descricao; 
    }
    public float getPreco() { 
    	return preco;
    }
    public void setPreco(float preco) { 
    	this.preco = preco; 
    }
    public int getQuantidade() {
    	return quantidade; 
    }
    public void setQuantidade(int quantidade) { 
    	this.quantidade = quantidade; 
    }
    public String getCategoria() { 
    	return categoria; 
    }
    public void setCategoria(String categoria) { 
    	this.categoria = categoria; 
    }

    @Override //usado para sobrescrever o metodo tostring 
    public String toString() {
    	return String.format(
    			"ID: %d\n" +
    			"Nome: %s\n" +
    			"Descrição %s\n" +
    			"Preço: R$ %.2f\n" +
    			"Quantidade: %d\n" +
    			"Categoria: %s\n" +
    			"----------------------------",
    			id, nome, descricao, preco, quantidade, categoria
    			);
    }
}
