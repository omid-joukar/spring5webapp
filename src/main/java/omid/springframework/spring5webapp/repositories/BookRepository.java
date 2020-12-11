package omid.springframework.spring5webapp.repositories;

import omid.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by omid on 12/11/2020.
 */
public interface BookRepository extends CrudRepository<Book,Long>{

}

