package scope_prototype._02;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {

    @Autowired
    private CommentRepository repo;

    private Comment comment;

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public void processComment(Comment c){
        System.out.println("Processing the comment"); // changes the attribute comment
    }
    public void validateComment(Comment c){
        System.out.println("Validating the comment"); // changes the attribute comment
    }
}
