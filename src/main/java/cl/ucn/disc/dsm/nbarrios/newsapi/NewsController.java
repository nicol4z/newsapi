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
     *
     * @return all the News in the Backend.
     */
    @GetMapping("/v1/news")
    public List<News> all() {
        return new ArrayList<>();
    }

    @GetMapping("/v1/news/{id}")
    public News one(@PathVariable final long id){
        //FIXME: Only for test
        News news = new News(
                "Autoridades UCN informan a las unidades los detalles del Plan Retorno y piden acelerar regreso",
                "Noticias UCN",
                "UCN",
                "https://www.noticias.ucn.cl/destacado/autoridades-ucn-informan-a-las-unidades-los-detalles-del-plan-retorno-y-piden-acelerar-regreso/#:~:text=9%20noviembre%2C%202021-,Autoridades%20UCN%20informan%20a%20las%20unidades%20los%20detalles%20del%20Plan,distintas%20unidades%20de%20la%20Universidad.",
                "https://www.noticias.ucn.cl/wp-content/uploads/2011/11/WhatsApp-Image-2021-11-05-at-13.26.53-1.jpeg",
                "En reuniones presenciales realizadas en la Casa Central se expusieron las medidas adoptadas y se respondieron las dudas de los y las representantes de las distintas unidades de la Universidad.",
                "Directores/as y representantes de las distintas unidades académicas de Antofagasta de la Universidad Católica del Norte (UCN), recibieron con aprobación los detalles del Plan Retorno que desarrolla nuestra Casa de Estudios. En dos reuniones presenciales realizadas en el auditorio Andrés Sabella de la Casa Central, el vicerrector académico, Nelson Fernández Vergara; la vicerrectora de Asuntos Económicos y Administrativos, Ingrid Álvarez Arzic; y la directora de la Dirección de Personas (ex Dirección de Recursos Humanos) Alejandra Pizarro Véliz, les explicaron los detalles del proceso, respondiendo también las dudas de los y las asistentes.",
                ZonedDateTime.now(ZoneId.of("-4"))
        );

        return news;
    }
}
