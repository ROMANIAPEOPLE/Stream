package max_min_count;

import java.util.List;

public class User {
    public User(Long id, String name, String email, List<Long> friendIds) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.friendIds = friendIds;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", friendIds=" + friendIds +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Long> getFriendIds() {
        return friendIds;
    }

    private Long id;
    private String name;
    private String email;
    private List<Long> friendIds;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFriendIds(List<Long> friendIds) {
        this.friendIds = friendIds;
    }

}
