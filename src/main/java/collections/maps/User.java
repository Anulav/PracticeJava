package collections.maps;

import java.util.Objects;

public class User {
    private String username;
    private int userId;
    private Department department;
    private int reviewScore;
    private Comic comic;

    public User(String username, int userId, Department department, int reviewScore, Comic comic) {
        this.username = username;
        this.userId = userId;
        this.department = department;
        this.reviewScore = reviewScore;
        this.comic = comic;
    }

    public Comic getComic() {
        return comic;
    }

    public void setComic(Comic comic) {
        this.comic = comic;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    enum Department{
        IT,ADMIN
    }

    enum Comic{
        DC,MARVEL
    }

    public String getUsername() {
        return username;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", userId=" + userId +
                ", department=" + department +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
