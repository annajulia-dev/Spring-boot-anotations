package aspects.customAnnotation;


import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(String comment){
        logger.info("Publishing the comment: " + comment);
    }

    public void editComment(String comment){
        logger.info("Editing the comment: " + comment);
    }

    @toLog
    public void deleteComment(String comment){
        logger.info("Deleting the comment: " +comment);
    }
}
