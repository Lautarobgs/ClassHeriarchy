package classes.newhierarchy;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;
import java.util.Date;
import java.util.List;

@XmlRootElement(name = "book")
@XmlAccessorType(XmlAccessType.FIELD)
public class Book {
    @XmlElement(name = "title")
    @JsonProperty("title") // Para JSON
    private String title;

    @XmlElement(name = "author")
    @JsonProperty("author") // Para JSON
    private Author author;

    @XmlElement(name = "reviews")
    @JsonProperty("reviews") // Para JSON
    private List<Review> reviews;

    @XmlElement(name = "publicationDate")
    @XmlSchemaType(name = "date")
    @JsonProperty("publicationDate") // Para JSON
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd") // Para manejar el formato de fecha
    private Date publicationDate;

    // Getters y setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }
}