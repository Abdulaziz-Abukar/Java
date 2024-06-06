package SocialMediaPlatform;
import java.util.ArrayList;

public class SocialMediaPlatform {
    ArrayList<User> users;
    private String platformName;


    public SocialMediaPlatform(String platformName) {
        users = new ArrayList<>();
        this.platformName = platformName;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println(user.getUserId() + " Has been added to: " + platformName);
    }

    public void removeUser(String userId) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserId().equals(userId)) {
                users.remove(i);
                System.out.println("User has been removed from: " + platformName);
            }
        }
    }

    public void listUsers() {
        System.out.println("Users in " + platformName + ":");
        for (User user : users) {
            user.getUserInfo();
        }
    }
}
