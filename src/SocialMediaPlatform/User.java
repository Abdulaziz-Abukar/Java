package SocialMediaPlatform;
import java.util.ArrayList;
public class User {

    private String userId;
    private String username;
    ArrayList<Post> posts;
    int count;

    public User(String userId, String username) {
        this.userId = userId;
        this.username = username;
        posts = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public void addPost(Post post) {
        posts.add(post);
        System.out.println("Post has been added.");
    }

    public void removePost(String postId) {
        for (int i = 0; i < posts.size(); i++) {
            if (posts.get(i).getPostId().equals(postId)) {
                posts.remove(i);
                System.out.println("Post has been removed.");
            }
        }
    }

    public void listPosts() {
        System.out.println("Posts: ");
        for (Post post : posts) {
            post.getPostInfo();
        }
    }

    public void getUserInfo() {
        System.out.println("User ID: " + userId +
                ", Username: " + username);
    }
}

