package com.app.notes.notes_features.domain.use_case

import com.app.notes.notes_features.domain.model.Note
import com.app.notes.notes_features.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note){
        repository.deleteNote(note)
    }
}