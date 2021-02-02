package com.seenit.server.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class UserPostDTO {
    @NotNull
    final private String userId;

    @NotNull
    final private String postId;

    final private boolean isUp;

    final private boolean isDown;

    final private boolean isUndoUp;

}
