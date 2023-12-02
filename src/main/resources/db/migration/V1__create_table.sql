CREATE TABLE course
(
    course_id       UUID         NOT NULL,
    name            VARCHAR(255) NOT NULL,
    description     VARCHAR(255) NOT NULL,
    duration        int4         NOT NULL,
    teacher         VARCHAR(255) NOT NULL,
    course_metadata jsonb        NOT NULL,
    PRIMARY KEY (course_id)
);

CREATE TABLE student
(
    id            UUID         NOT NULL,
    name          VARCHAR(255) NOT NULL,
    email         VARCHAR(255) NOT NULL,
    date_of_birth DATE         NOT NULL,
    course_id     VARCHAR[] NOT NULL,
    PRIMARY KEY (id)
);