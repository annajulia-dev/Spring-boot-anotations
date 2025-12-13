package exercises._02.proxies;

import exercises._02.models.Comment;

public interface Comment_NotificationProxy {
    public void sendComment(Comment comment);
}
