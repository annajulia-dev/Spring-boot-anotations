package exercises._02.proxies;

import exercises._02.models.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotificationProxy implements Comment_NotificationProxy{

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending e-mail for the comment: " + comment.getText());
    }
}
