package com.crud.library.mapper;

import com.crud.library.domain.Reader;
import com.crud.library.domain.ReaderDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ReaderMapper {

    public Reader mapToReader(final ReaderDto readerDto){

        return new Reader(
                readerDto.getId(),
                readerDto.getName(),
                readerDto.getSurname(),
                readerDto.getCreatingAccountDate());

    }

    public ReaderDto mapToReaderDto(final Reader reader){

        return new ReaderDto(
                reader.getId(),
                reader.getName(),
                reader.getSurname(),
                reader.getCreatingAccountDate());

    }

    public List<ReaderDto> mapToReaderDtoList(final List<Reader> readers){
        return readers.stream()
                .map(e -> new ReaderDto(e.getId(), e.getName(), e.getSurname(), e.getCreatingAccountDate()))
                .collect(Collectors.toList());
    }

}
