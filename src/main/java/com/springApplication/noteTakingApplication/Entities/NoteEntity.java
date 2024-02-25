package com.springApplication.noteTakingApplication.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteEntity {
    @Id
    @Column(name = "ID")
    String noteId;
    @Column(name = "TITLE")
    String noteTitle;
    @Column(name = "DESCRIPTION")
    String noteDescription;
}
