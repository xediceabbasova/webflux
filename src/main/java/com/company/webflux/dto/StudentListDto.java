package com.company.webflux.dto;

import java.util.List;

public record StudentListDto(
        List<StudentDto> students
) {
}
