package exercises._02;

import exercises._02.models.Comment;
import exercises._02.proxies.EmailCommentNotificationProxy;
import exercises._02.repositories.DBCommentRepository;
import exercises._02.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var commentService =
                context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setAuthor("Ana");
        comment.setText("Hello cuties :3");

        commentService.publishComment(comment);
    }
}
