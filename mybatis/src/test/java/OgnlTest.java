import base.entity.Author;
import base.entity.Blog;
import base.entity.Post;
import org.apache.ibatis.ognl.OgnlContext;
import org.junit.Before;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

/**
 * @author xutong
 */
@SpringBootTest
public class OgnlTest {
    @Before
    public void start() {
        Blog.staticField = "static Field";
        Author author = new Author(1, "username1", "passwrod1", "email1");
        Post post = new Post();
        post.setAuthor(author);
        post.setContent("PostContent");
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(post);
        Blog blog = new Blog(1, "title", author, posts);
//        OgnlContext ognlContext = new OgnlContext();
    }
}