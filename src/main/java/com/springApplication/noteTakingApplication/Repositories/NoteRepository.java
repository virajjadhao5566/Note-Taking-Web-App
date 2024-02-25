package com.springApplication.noteTakingApplication.Repositories;

import com.springApplication.noteTakingApplication.Entities.NoteEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends CrudRepository<NoteEntity,Long> {
}
