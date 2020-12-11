package omid.springframework.spring5webapp.bootstrap;

import omid.springframework.spring5webapp.model.Author;
import omid.springframework.spring5webapp.model.Book;
import omid.springframework.spring5webapp.model.Publisher;
import omid.springframework.spring5webapp.repositories.AuthorRepository;
import omid.springframework.spring5webapp.repositories.BookRepository;
import omid.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by omid on 12/11/2020.
 */
@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {
    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootStrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    private void initData(){
        Author eric = new Author("Eric","Evans");
        Publisher publisher = new Publisher();
        publisher.setName("foo");
        publisherRepository.save(publisher);
        Book ddd = new Book("Domain Driver Design","1234",publisher);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        bookRepository.save(ddd);
        authorRepository.save(eric);

        Author rod = new Author("Rod" , "Johnson");
        Book noEJB = new Book("j2EE Development without Ejb","23444",publisher);
        rod.getBooks().add(noEJB);
        authorRepository.save(rod);
        bookRepository.save(noEJB);
}

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
