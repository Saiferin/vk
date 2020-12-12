package ru.netology.vk;

public class CommentsInfo {
    private String headerPost;// название поста
    private String textContentPost;// текст поста
    private String contentIMG; // картинка поста
    private boolean popUp; // выпадающий спикос справа от headerPost
    private boolean friend; // пост добавил друг или нет
    private int like = 0;// счетчик лайков
    private int look = 0; // счетчик просмотров
    private int repost = 0;// счетчик репостов

    public String getHeaderPost() {
        return headerPost;
    }

    public void setHeaderPost(String headerPost) {
        this.headerPost = headerPost;
    }

    public String getTextContentPost() {
        return textContentPost;
    }

    public void setTextContentPost(String textContentPost) {
        this.textContentPost = textContentPost;
    }

    public String getContentIMG() {
        return contentIMG;
    }

    public void setContentIMG(String contentIMG) {
        this.contentIMG = contentIMG;
    }

    public boolean isPopUp() {
        return popUp;
    }

    public void setPopUp(boolean popUp) {
        this.popUp = popUp;
    }

    public boolean isFriend() {
        return friend;
    }

    public void setFriend(boolean friend) {
        this.friend = friend;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getLook() {
        return look;
    }

    public void setLook(int look) {
        this.look = look;
    }

    public int getRepost() {
        return repost;
    }

    public void setRepost(int repost) {
        this.repost = repost;
    }
}
