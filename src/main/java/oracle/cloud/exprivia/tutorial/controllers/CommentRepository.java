package oracle.cloud.exprivia.tutorial.controllers;

import oracle.cloud.exprivia.tutorial.models.Comment;
import oracle.cloud.exprivia.tutorial.models.Tutorial;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommentRepository extends CrudRepository<Comment, Long> {

    List<Comment> findByTutorial(Tutorial tutorial);
}
