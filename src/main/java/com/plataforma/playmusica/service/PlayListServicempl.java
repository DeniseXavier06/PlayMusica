package com.plataforma.playmusica.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.plataforma.playmusica.dao.PlaylistDao;
import com.plataforma.playmusica.domain.Playlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@org.springframework.transaction.annotation.Transactional

public class PlayListServicempl implements PlaylistService {
	
	private PlaylistDao playlistDao;

	public void salvar(Playlist playlist) {
		playlistDao.salvar(playlist);
		
	}

    @org.springframework.transaction.annotation.Transactional (readOnly = true)
   	public List<Playlist> recuperar() {
		return playlistDao.recuperar();
	}

    @org.springframework.transaction.annotation.Transactional (readOnly = true)
	public Playlist recuperarPorId(long id) {
		return playlistDao.recuperarPorID(id);
		
	}

	public void atualizar(Playlist playlist) {
		playlistDao.atualizar(playlist);
		
	}

	public void excluir(long id) {
		playlistDao.excluir(id);
		
	}
	
	

}
