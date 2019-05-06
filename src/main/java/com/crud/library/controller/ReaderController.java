package com.crud.kodillalibrary.controller;

import com.crud.library.domain.ReaderDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/readers")
public class ReaderController {

    @RequestMapping(method = RequestMethod.GET, value = "getReaders")
    public List<ReaderDto> getReaders(){
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.GET, value = "getReader")
    public ReaderDto getReader(Long id){
        return new ReaderDto(1L, "Jan", "Kowalski", LocalDate.of(2019, 1, 2) );
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteReader")
    public void deleteReader(Long id){

    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateReader")
    public ReaderDto updateReader(ReaderDto readerDto){
        return new ReaderDto(1L, "Jan", "Nowak", LocalDate.of(2019, 2, 3) );
    }

    @RequestMapping(method = RequestMethod.POST, value = "createReader")
    public void createReader(ReaderDto readerDto){

    }

}
