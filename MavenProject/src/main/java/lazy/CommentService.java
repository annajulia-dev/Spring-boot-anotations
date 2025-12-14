package lazy;

import exercises._02.models.Comment;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service  // Default instantiation is "@Eager"
@Lazy // The instance of this class will be only created (on context) when you call it.
      // Without it the instance is created with context.
      // You'll use it when your application is huge and some functionalities you don't use everytime.
public class CommentService {
    public CommentService(){
        System.out.println("Instance created on context!");
    }
}
