package exercises._02.services;

import exercises._02.models.Comment;
import exercises._02.proxies.Comment_NotificationProxy;
import exercises._02.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    private final CommentRepository commentRepository;
    private final Comment_NotificationProxy commentNotificationProxy;

    @Autowired
    public CommentService(CommentRepository commentRepository, Comment_NotificationProxy commentNotificationProxy){
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
