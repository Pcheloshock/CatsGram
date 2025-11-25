package ru.yandex.practicum.catsgram.model;

import java.time.Instant;
import lombok.Data;


@Data
public class Post {
    private Long id;
    private Long authorId;
    private String description;
    private Instant postDate;

    public Post(Instant postDate, String description, Long authorId, Long id) {
        this.postDate = postDate;
        this.description = description;
        this.authorId = authorId;
        this.id = id;
    }

    public Post(Long id, Long authorId, String description, Instant postDate) {
        this.authorId = authorId;
        this.description = description;
        this.postDate = postDate;
    }
}