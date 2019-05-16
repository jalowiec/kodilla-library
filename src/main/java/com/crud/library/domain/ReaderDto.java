package com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.time.LocalDate;
import java.util.Date;


@Getter
@AllArgsConstructor
public class ReaderDto {

    private Long id;
    private String name;
    private String surname;
    private Date creatingAccountDate;

}