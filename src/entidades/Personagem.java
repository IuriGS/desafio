package entidades;

public class Personagem {

	private Integer id;
	private String nome;
	private Character genero;
	private Boolean morto;
	private Integer temporadas;

	public Personagem() {

	}

	public Personagem(Integer id, String nome, Character genero, Integer temporadas) {
		this.id = id;
		this.nome = nome;
		this.genero = genero;
		this.temporadas = temporadas;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Character getGenero() {
		return genero;
	}

	public void setGenero(Character genero) {
		this.genero = genero;
	}

	public Integer getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(Integer temporadas) {
		this.temporadas = temporadas;
	}

	public String toString() {
		return "Nome do Personagem: " + nome + " / Genero: " + genero + " / Temporadas: " + temporadas;
	}

}
