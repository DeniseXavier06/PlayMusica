package com.plataforma.playmusica.dao;

import org.springframework.stereotype.Repository;

import com.plataforma.playmusica.domain.Musica;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MusicaDaoImp implements MusicaDao {

	
	@PersistenceContext
	private EntityManager em;
	
	
	public void salvar(Musica musica) {
		em.persist(musica);
		
	}

	public List<Musica> recuperarPorPlaylist(long playlistId) {
		   return em.createQuery("select m from Musica m where m.playlist.id = :playlistId", Musica.class)
	                .setParameter("playlistId", playlistId)
	                .getResultList();
	
    }

    public Musica recuperarPorPlaylistIdEMusicaId(long playlistId, long musicaId) {
        return em.createQuery("select m from Musica m where m.playlist.id = :playlistId and m.id = :musicaId", Musica.class)
                .setParameter("playlistId", playlistId)
                .setParameter("musicaId", musicaId)
                .getSingleResult();
    }

    
    public void atualizar(Musica musica) {
        em.merge(musica);
    }

    
    public void excluir(long musicaId) {
        em.remove(em.getReference(Musica.class, musicaId));
    }


	
    
    
}