package com.app.notes.notes_features.presentation.notes

import com.app.notes.notes_features.domain.model.Note
import com.app.notes.notes_features.domain.utils.NoteOrder
import com.app.notes.notes_features.domain.utils.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
