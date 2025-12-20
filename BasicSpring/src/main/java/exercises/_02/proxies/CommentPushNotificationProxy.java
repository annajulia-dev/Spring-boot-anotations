package exercises._02.proxies;

import exercises._02.models.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PUSH")
public class CommentPushNotificationProxy implements Comment_NotificationProxy{

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Pushing the comment: "+ comment.getText());
    }
}
