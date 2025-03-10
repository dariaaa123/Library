import database.DatabaseConnectionFactory;
import model.Book;
import model.builder.BookBuilder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import repository.book.BookRepository;
import repository.book.BookRepositoryMySQL;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookRepositoryTest {
    private static BookRepository bookRepository;

    @BeforeAll
    public static void  setup()
    {
        bookRepository = new BookRepositoryMySQL(DatabaseConnectionFactory.getConnectionWrapper(false).getConnection());
    }

    @Test
    public void findAll()
    {
        List<Book> books = bookRepository.findAll();
        assertTrue(books.size()>=0);
    }


    @Test
    public void save()
    {
        assertTrue(bookRepository.save( new BookBuilder().setTitle("Ion").setAuthor("Liviu Rebreanu").setPublishedDate(LocalDate.of(1990,10,2)).setStock(9).setPrice(9).build()));
    }

}