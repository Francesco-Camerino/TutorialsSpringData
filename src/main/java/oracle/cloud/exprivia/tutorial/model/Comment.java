package oracle.cloud.exprivia.tutorial.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 * Questa classe rappresenta un commento associato a un tutorial.
 */
@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comment_generator")
    private Long id;

    private String content;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tutorial_id", nullable = false, foreignKey = @ForeignKey(name = "FK_Tutorial"))
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore // per evitare loop infiniti
    private Tutorial tutorial;

    /**
     * Costruttore vuoto della classe Comment.
     */
    public Comment() {}

    /**
     * Costruttore che inizializza un nuovo commento con il contenuto specificato e il tutorial associato.
     *
     * @param content   Il contenuto del commento.
     * @param tutorial  Il tutorial a cui è associato il commento.
     */
    public Comment(String content, Tutorial tutorial) {
        this.content = content;
        this.tutorial = tutorial;
    }

    /**
     * Restituisce l'ID del commento.
     *
     * @return L'ID del commento.
     */
    public Long getId() {
        return id;
    }

    /**
     * Restituisce il contenuto del commento.
     *
     * @return Il contenuto del commento.
     */
    public String getContent() {
        return content;
    }

    /**
     * Imposta il contenuto del commento.
     *
     * @param content Il nuovo contenuto del commento.
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Restituisce il tutorial associato a questo commento.
     *
     * @return Il tutorial associato a questo commento.
     */
    public Tutorial getTutorial() {
        return tutorial;
    }

    /**
     * Imposta il tutorial associato a questo commento.
     *
     * @param tutorial Il nuovo tutorial associato a questo commento.
     */
    public void setTutorial(Tutorial tutorial) {
        this.tutorial = tutorial;
    }
}
