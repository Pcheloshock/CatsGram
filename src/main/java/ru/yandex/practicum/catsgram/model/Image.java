package ru.yandex.practicum.catsgram.model;

import lombok.Data;


@Data
public class Image {
    private Long id;
    private long postId;
    String originalFileName;
    String filePath;

    public Image() {

    }

    public Image(Long id, long postId, String originalFileName, String filePath) {
        this.postId = postId;
        this.originalFileName = originalFileName;
        this.filePath = filePath;
    }



}