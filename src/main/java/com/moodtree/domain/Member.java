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
public class Member extends BaseTime {

    @NonNull
    private Long memberId;

    @NonNull
    private String email;

    @NonNull
    private String name;

    @NonNull
    private String phone;

    @NonNull
    private String nickname;

    @NonNull
    private String password;

    @NonNull
    private LocalDateTime startTime;

    @NonNull
    private LocalDateTime endTime;

}
