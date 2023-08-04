package oracle.cloud.exprivia.tutorial.controllers;

import oracle.cloud.exprivia.tutorial.models.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Long> {

}
