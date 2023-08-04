package oracle.cloud.exprivia.tutorial.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Questa classe rappresenta un tutorial.
 * Un tutorial ha un identificatore univoco, un titolo, una descrizione e uno stato di pubblicazione.
 */
@Entity(name = "tutorials")
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
    private String title;

    /**
     * Descrizione del tutorial.
     */
    private String description;

    /**
     * Stato di pubblicazione del tutorial.
     */
    private Boolean published;

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
}

