package com.plataforma.playmusica.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.plataforma.playmusica.dao.MusicaDao;
import com.plataforma.playmusica.domain.Musica;



@Service
@org.springframework.transaction.annotation.Transactional
public class MusicaServicempl implements MusicaService {
	
	private MusicaDao musicaDao;
	private PlaylistService playlistService;

	public void salvar(Musica musica, long playlistId) {
		musica.setPlaylist(playlistService.recuperarPorId(playlistId));
		musicaDao.salvar(musica);
		
	}
	@org.springframework.transaction.annotation.Transactional (readOnly = true)
	public List<Musica> recuperarPorPlaylist(long playlistId) {
		return musicaDao.recuperarPorPlaylist(playlistId);
		
	}
	@org.springframework.transaction.annotation.Transactional (readOnly = true)
	public Musica recuperarPorPlaylistIdEMusicaId(long playlistId, long musicaId) {
		return musicaDao.recuperarPorPlaylistIdEMusicaId(playlistId, musicaId);
		
	}

	public void atualizar(Musica musica, long playlistId) {
		musica.setPlaylist(playlistService.recuperarPorId(playlistId));
		musicaDao.atualizar(musica);
		
	}

	public void excluir(long playlistId, long musicaId) {
		musicaDao.excluir(recuperarPorPlaylistIdEMusicaId(playlistId, musicaId).getId());
		
		
	}

}
