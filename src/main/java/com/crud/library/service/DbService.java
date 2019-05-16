package com.crud.library.service;

import com.crud.library.domain.Reader;
import com.crud.library.repository.ReaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DbService {

    @Autowired
    private ReaderRepository readerRepository;

    public List<Reader>  getAllReaders(){
        return readerRepository.findAll();
    }

    public Optional<Reader> getReader(final Long id){
        return readerRepository.findById(id);

    }
    public Reader saveReader(final Reader reader){
        return readerRepository.save(reader);
    }

    public void deleteReader(final Long id){readerRepository.delete(id);}


}
