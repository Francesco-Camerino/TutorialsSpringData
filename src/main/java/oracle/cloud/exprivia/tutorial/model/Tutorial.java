package oracle.cloud.exprivia.tutorial.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Questa classe rappresenta un tutorial.
 * Un tutorial ha un identificatore univoco, un titolo, una descrizione e uno stato di pubblicazione.
 */
@Entity
@Table(name = "tutorials")
public class Tutorial {
    /**
     * Identificatore univoco del tutorial.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tutorial_generator")
    private Long id;

    /**
     * Titolo del tutorial.
     */
    @Column(name = "title")
    private String title;

    /**
     * Descrizione del tutorial.
     */
    @Column(name = "description", length = 2048)
    private String description;

    /**
     * Stato di pubblicazione del tutorial.
     */
    @Column(name = "published")
    private Boolean published;

    @OneToMany(mappedBy = "tutorial", fetch = FetchType.LAZY)
    private final List<Comment> comments = new ArrayList<>();

    public Tutorial() {}

    public Tutorial(String title, String description, Boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }

    /**
     * Restituisce l'identificatore del tutorial.
     *
     * @return L'identificatore del tutorial.
     */
    public Long getId() {
        return id;
    }

    /**
     * Restituisce il titolo del tutorial.
     *
     * @return Il titolo del tutorial.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Imposta il titolo del tutorial.
     *
     * @param title Il titolo del tutorial da impostare.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Restituisce la descrizione del tutorial.
     *
     * @return La descrizione del tutorial.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Imposta la descrizione del tutorial.
     *
     * @param description La descrizione del tutorial da impostare.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Restituisce lo stato di pubblicazione del tutorial.
     *
     * @return Lo stato di pubblicazione del tutorial.
     */
    public Boolean getPublished() {
        return published;
    }

    /**
     * Imposta lo stato di pubblicazione del tutorial.
     *
     * @param published Lo stato di pubblicazione del tutorial da impostare.
     */
    public void setPublished(Boolean published) {
        this.published = published;
    }

    /**
     * Restituisce i commenti del tutorial.
     *
     * @return La lista dei commenti del tutorial.
     */
    public List<Comment> getComments() {
        return comments;
    }

    @Override
    public String toString() {
        return "Tutorial [id=" + id + ", title=" + title + ", description=" + description + ", published=" + published + "]";
    }
}

