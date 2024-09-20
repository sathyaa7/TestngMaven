package resources;

public class Review {
    private String nickname;
    private String summary;
    private String review_field;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getReview_field() {
        return review_field;
    }

    public void setReview_field(String review_field) {
        this.review_field = review_field;
    }
}
