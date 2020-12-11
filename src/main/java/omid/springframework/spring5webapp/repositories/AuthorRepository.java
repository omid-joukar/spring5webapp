package omid.springframework.spring5webapp.repositories;

import omid.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by omid on 12/11/2020.
 */
public interface AuthorRepository extends CrudRepository<Author,Long> {
}
