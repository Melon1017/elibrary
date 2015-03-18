package foyuang.elibrary.dao;

import java.util.List;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.data.repository.Repository;

import foyuang.elibrary.entity.Books;

public interface BooksDao extends Repository<Books, Long> {
	public List<Books> findAll();

	public Books save(Books books);

	public Books delete(Long id);
}
