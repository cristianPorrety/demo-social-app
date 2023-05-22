package com.cristianporretydev.posts.model.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostDTO {
    
    private UUID id;
    private String text;
    private String image;
    private List<CommentDTO> comments;
    private LocalDateTime creationDate;
    private LocalDateTime updateDate;
    
}
