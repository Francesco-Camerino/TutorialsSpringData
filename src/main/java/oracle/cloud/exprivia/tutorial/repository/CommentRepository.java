package oracle.cloud.exprivia.tutorial.repository;

import jakarta.transaction.Transactional;
import oracle.cloud.exprivia.tutorial.model.Comment;
import oracle.cloud.exprivia.tutorial.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByTutorialId(Long postId);

    List<Comment> findByContentContaining(String content);

    @Transactional
    void deleteByTutorialId(Long tutorialId);
}
