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
public class Letter extends BaseTime {

    @NonNull
    private Long letterId;

    @NonNull
    private Long treeId;

    @NonNull
    private String letterContext;

    @NonNull
    private LocalDateTime startTime;

    @NonNull
    private LocalDateTime endTime;

}
