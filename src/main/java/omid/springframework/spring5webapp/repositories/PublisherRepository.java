package omid.springframework.spring5webapp.repositories;

import omid.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by omid on 12/11/2020.
 */
public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
