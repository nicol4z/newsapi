package cl.ucn.disc.dsm.nbarrios.newsapi;

import cl.ucn.disc.dsm.nbarrios.newsapi.model.News;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;

import java.util.ArrayList;
import java.util.List;

/**
 * The Controller of News
 * @author Nicolas Barrios-Avendaño.
 */

@RestController
public class NewsController{

    /**
     * The Repo of News
     */
    private final NewsRepository newsRepository;

    /**
     * The Contructor of NewsController.
     * @param newsRepository to use.
     */
    public NewsController(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    /**
     *
     * @return all the News in the Backend.
     */
    @GetMapping("/v1/news")
    public List<News> all() {
        // Equals to SELECT * FROM News;
        final List<News> theNews = this.newsRepository.findAll();
        // TODO: Show the in console
        return theNews;
    }

    @GetMapping("/v1/news/{id}")
    public News one(@PathVariable final long id) {
        // FIXME: Change the RuntimeException to 404.
        return this.newsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("News Not Found :("));
    }
}
