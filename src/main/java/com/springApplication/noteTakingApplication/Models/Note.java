package com.springApplication.noteTakingApplication.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Note {
    private String noteID;
    private String noteTitle;
    private String noteDescription;
}
