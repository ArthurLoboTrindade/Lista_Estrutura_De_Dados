package questao_10;

import java.util.ArrayList;

public class Playlist implements IPlaylist {

	private String nome;
	private ArrayList<Musica> musicas;

	public Playlist(String nome, ArrayList<Musica> musicas) {
		this.nome = nome;
		this.musicas = musicas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(ArrayList<Musica> musicas) {
		this.musicas = musicas;
	}

	@Override
	public boolean AdicionarMusica() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean RemoverMusica() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ListarMusica() {
		// TODO Auto-generated method stub
		return false;
	}

}
