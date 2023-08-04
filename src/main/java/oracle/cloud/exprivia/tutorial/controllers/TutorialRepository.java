package oracle.cloud.exprivia.tutorial.controllers;

import oracle.cloud.exprivia.tutorial.models.Tutorial;
import org.springframework.data.repository.CrudRepository;

public interface TutorialRepository extends CrudRepository<Tutorial,Long> {
}
