package com.app.notes.data_interface

import android.app.Application
import androidx.room.Room
import com.app.notes.notes_features.data.data_source.NoteDatabase
import com.app.notes.notes_features.data.repository.NoteRepositoryImpl
import com.app.notes.notes_features.domain.repository.NoteRepository
import com.app.notes.notes_features.domain.use_case.AddNote
import com.app.notes.notes_features.domain.use_case.DeleteNote
import com.app.notes.notes_features.domain.use_case.GetNotes
import com.app.notes.notes_features.domain.use_case.NotesUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideNoteDatabase(app:Application):NoteDatabase{
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository{
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NotesUseCases{
        return NotesUseCases(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository),
            addNote = AddNote(repository)
        )
    }
}