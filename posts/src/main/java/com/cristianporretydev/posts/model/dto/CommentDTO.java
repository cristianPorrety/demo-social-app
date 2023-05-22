package com.cristianporretydev.posts.model.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommentDTO {
    
    private UUID id;
    private String text;
    private String image;
    private UUID idPost;
    private LocalDateTime creationDate;

}
