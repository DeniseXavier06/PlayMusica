package com.plataforma.playmusica.service;

import java.util.List;

import com.plataforma.playmusica.dao.PlaylistDao;
import com.plataforma.playmusica.domain.Playlist;

public interface PlaylistService {
	 void salvar(Playlist playlist);
	    List<Playlist> recuperar();
	    Playlist recuperarPorId(long id);
	    void atualizar(Playlist playlist);
	    void excluir(long id);

}
