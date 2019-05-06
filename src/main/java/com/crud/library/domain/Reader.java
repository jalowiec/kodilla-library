package com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.time.LocalDate;


@Getter
@AllArgsConstructor
public class Reader {
    private Long id;
    private String name;
    private String surname;
    private LocalDate creatingAccountDate;
}
