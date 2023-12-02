package com.company.webflux.dto;

import com.company.webflux.model.metadata.CourseMetadata;

public record CourseDto(
        String name,
        String description,
        Integer duration,
        String teacher,
        CourseMetadata courseMetadata
) {
}
