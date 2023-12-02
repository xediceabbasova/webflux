package com.company.webflux.model.metadata;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@SuperBuilder
public class SpringCourseMetadata extends CourseMetadata {

    private List<String> prerequisites;
    private String language;
    private String github;




}
