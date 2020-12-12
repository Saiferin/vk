package ru.netology.vk;

public class Like {
    private int count; //— лайки;
    private int userLikes; // наличие лайка 1 — есть, 0 — нет;
    private int canLike;  //может поставить лайк или нет(1 — может, 0 — не может);
    private int canPublish;  //может репост или не может (1 — может, 0 — не может).

    public Like(int count, int userLikes, int canLike, int canPublish) {
        this.count = count;
        this.userLikes = userLikes;
        this.canLike = canLike;
        this.canPublish = canPublish;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(int userLikes) {
        this.userLikes = userLikes;
    }

    public int getCanLike() {
        return canLike;
    }

    public void setCanLike(int canLike) {
        this.canLike = canLike;
    }

    public int getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(int canPublish) {
        this.canPublish = canPublish;
    }
}
