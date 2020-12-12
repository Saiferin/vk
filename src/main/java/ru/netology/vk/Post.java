package ru.netology.vk;

public class Post {
    private int ownerId; //идентификатор пользователя или сообщества.
    private int contentPostID; //id поста
    private String domain; // короткий адрес пользователя или сообщества
    private String query; //поисковой запрос. Для точного результата запрос необходимо передавать в двойных кавычках.
    private int count = 20; //число записей
    private int postID;// ID поста

    private Like[] likes;

    public Like[] likes() {
        // TODO: add logic
        return null;
    }

    private CommentsInfo[] CommentsInfo;

    public CommentsInfo[] CommentsInfo() {
        // TODO: add logic
        return null;
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getContentPostID() {
        return contentPostID;
    }

    public void setContentPostID(int contentPostID) {
        this.contentPostID = contentPostID;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
