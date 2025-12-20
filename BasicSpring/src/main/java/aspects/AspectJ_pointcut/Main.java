package aspects.AspectJ_pointcut;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var commentService = context.getBean(CommentService.class);

        var comment = new Comment();
        comment.setAuthor("Ayaya");
        comment.setText("Hello people");

        commentService.publishComment(comment);
    }
}
