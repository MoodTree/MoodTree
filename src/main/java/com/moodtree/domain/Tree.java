package com.moodtree.domain;

import com.moodtree.base.BaseTime;
import lombok.*;
import org.springframework.lang.NonNull;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tree extends BaseTime {

    @NonNull
    private Long treeId;

    @NonNull
    private Long memberId;

    @NonNull
    private String treePassword;

    @NonNull
    private String treeUrl;

    @NonNull
    private LocalDateTime startTime;

    @NonNull
    private LocalDateTime endTime;


}
