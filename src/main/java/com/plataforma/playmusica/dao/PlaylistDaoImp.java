package com.plataforma.playmusica.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.plataforma.playmusica.domain.Playlist;


@Repository
public class PlaylistDaoImp implements PlaylistDao {
	
	@PersistenceContext
	private EntityManager em;

	public void salvar(Playlist playlist) {
		em.persist(playlist);
		
	}

	public List<Playlist> recuperar() {
		 return em.createQuery("select p from Playlist p", Playlist.class).getResultList();
		
	}

	public Playlist recuperarPorID(long id) {
		return em.find(Playlist.class,id);
		
	}

	public void atualizar(Playlist playlist) {
		em.merge(playlist);
		
	}

	public void excluir(long id) {
		em.remove(em.getReference(Playlist.class, id));
		
	}

}
