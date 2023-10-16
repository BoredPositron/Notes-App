package com.app.notes.notes_features.presentation.notes

import com.app.notes.notes_features.domain.model.Note
import com.app.notes.notes_features.domain.utils.NoteOrder

sealed class NotesEvent{
    data class Order(val notesOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
