package domain;

public class Post {
    private int id;
    private String text;
    private String imageURL;
    private int looks;
    private int likes;
    private int repost;
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public int getLooks() {
        return looks;
    }

    public int getLikes() {
        return likes;
    }

    public int getRepost() {
        return repost;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getText() {
        return text;
    }

    public void setId(int id) {
        this.id = id;

    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setLooks(int looks) {
        this.looks = looks;
    }

    public void setRepost(int repost) {
        this.repost = repost;
    }

    public void setText(String text) {
        this.text = text;
    }
}
