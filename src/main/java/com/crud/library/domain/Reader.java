package com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "readers")
public class Reader {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "creating_account_date")
    @Temporal(TemporalType.DATE)
    private Date creatingAccountDate;
}
