package resources;

import com.google.gson.annotations.SerializedName;

public class Review {

    @SerializedName("nickname")
    private String nick_name;

    private String summary;
    private String review_field;

    public String getNickname() {
        return nick_name;
    }

    public void setNickname(String nickname) {
        this.nick_name = nickname;
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
