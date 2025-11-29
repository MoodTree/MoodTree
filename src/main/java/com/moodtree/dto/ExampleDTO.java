package com.moodtree.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class ExampleDTO {

    @NotNull
    private Long email;

    @NotNull
    private String name;

    @NotNull
    @Min(1)
    private Long age;
}
