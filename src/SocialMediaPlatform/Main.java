/*
Exercise 4: Social Media Platform
Create a SocialMediaPlatform class that manages a list of users and their posts.

Post Class:
Fields: postId, content, author
Constructor: Initialize all fields

User Class:
Fields: userId, username, posts (an ArrayList of Post objects)
Constructor: Initialize userId, username, and an empty posts list
Methods:
addPost(Post post): Adds a post to the user's posts.
removePost(String postId): Removes a post by its ID.
listPosts(): Prints the details of all posts by the user.

SocialMediaPlatform Class:
Fields: users (an ArrayList of User objects)
Constructor: Initialize an empty users list
Methods:
addUser(User user): Adds a user to the platform.
removeUser(String userId): Removes a user by their ID.
listUsers(): Prints the details of all users on the platform.
 */

package SocialMediaPlatform;

public class Main {
    public static void main(String[] args) {

        Post post1 = new Post("POS1", "Photo", "Abdul");
        Post post2 = new Post("POS2", "Sadness", "Abdul");
        Post post3 = new Post("POS3", "Happiness", "Abdul");

        User user1 = new User("DatBoiBushido", "Bushido");

        SocialMediaPlatform platform1 = new SocialMediaPlatform("Facebook");

        user1.addPost(post1);
        user1.addPost(post2);
        user1.addPost(post3);

        platform1.addUser(user1);

        platform1.listUsers();
    }
}
