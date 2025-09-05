package questao_10;

import java.time.Duration;

public class Musica {

	private String titulo, artista;
	private Duration duracao;

	public Musica(String titulo, String artista, Duration duracao) {
		this.titulo = titulo;
		this.artista = artista;
		this.duracao = duracao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public Duration getDuracao() {
		return duracao;
	}

	public void setDuracao(Duration duracao) {
		this.duracao = duracao;
	}

	public String getDuracaoFormatada() {
		long minutos = duracao.toMinutes();
		long segundos = duracao.minusMinutes(minutos).getSeconds();
		return String.format("%02d:%02d", minutos, segundos);
	}

}
