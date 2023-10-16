package com.app.notes.notes_features.domain.use_case

import com.app.notes.notes_features.domain.model.Note
import com.app.notes.notes_features.domain.model.invalidNoteException
import com.app.notes.notes_features.domain.repository.NoteRepository
import kotlin.jvm.Throws

class AddNote(
    private val repository: NoteRepository
) {
    @Throws(invalidNoteException::class)
    suspend operator fun invoke(note: Note){
        if (note.title.isBlank()){
            throw invalidNoteException("The title of note cant be empty")
        }
        if (note.content!!.isBlank()){
            throw invalidNoteException("The title of note cant be empty")
        }
        repository.insertNote(note)
    }
}