package com.app.notes.notes_features.data.repository

import com.app.notes.notes_features.data.data_source.NoteDao
import com.app.notes.notes_features.domain.model.Note
import com.app.notes.notes_features.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val dao: NoteDao
) : NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNotesById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.insertNote(note)
    }
}