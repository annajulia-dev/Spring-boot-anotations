package aspects.AspectJ_pointcut;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
                                            // this name appears on logs
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public String publishComment(Comment comment){
        logger.info("Publishing comment: "+ comment.getText());
        return "Sucess!";
    }
}
