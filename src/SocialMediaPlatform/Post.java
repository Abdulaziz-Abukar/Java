package SocialMediaPlatform;

public class Post {

    private String postId;
    private String content;

    private String author;

    public Post(String postId, String content, String author) {

        this.postId = postId;
        this.content = content;
        this.author = author;
    }

    public String getPostId() {
        return postId;
    }

    public void getPostInfo() {
        System.out.print(
                "Post ID: " + postId +
                        ", Content: " + content +
                        ", author: " + author + "\n");
    }
}
