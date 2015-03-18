package foyuang.elibrary.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import foyuang.elibrary.entity.Favorit;


public interface FavoritDao extends Repository<Favorit, Long> {
   public List<Favorit> findByUser();
   public Favorit save(Favorit favorit);
   public void delete(Long id);
   
}
