package scope_prototype._02;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private AnnotationConfigApplicationContext context;

    public void sendComment(Comment c) {   // DON'T create the commentProcessor as attribute because, if you do this it will be the same always.
        CommentProcessor p = context.getBean(CommentProcessor.class); // creating here, everytime you call the method...
                                                                      // a new instance of CommentProcessor is created
        p.setComment(c);
        p.processComment(c);
        p.validateComment(c);

        c = p.getComment();
// do something further
    }
}
