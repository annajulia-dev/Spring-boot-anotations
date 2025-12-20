package aspects.customAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = context.getBean(CommentService.class);

        service.publishComment("Oi");
        service.editComment("Oi");
        service.deleteComment("Oi");
    }
}
