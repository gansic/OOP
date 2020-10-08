public class Post {
    String id;
    String avatarUrl;
    String authorName;
    String authorUrl;
    Long created; // общепринято если вы время храните целым числом unixtime
    // device
    String deviceType; // "unknown",  "android", "ios"
    String content;
    String photoUrl; // null - если фото нет
    int likes;
    int views;
    boolean isliked; // true - залайкал, false - не залайкалю

}
