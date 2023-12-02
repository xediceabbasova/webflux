package com.company.webflux.model.metadata;

import com.company.webflux.model.Student;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = "course_metadata")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes(
        {
                @JsonSubTypes.Type(value = SpringCourseMetadata.class, name = CourseConstants.SPRING_COURSE_TYPE),
                @JsonSubTypes.Type(value = EnglishCourseMetadata.class, name = CourseConstants.ENGLISH_COURSE_TYPE)
        }
)
public class CourseMetadata {

        @JsonIgnore
        private String type;
}
