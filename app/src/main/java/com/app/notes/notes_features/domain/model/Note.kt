package com.app.notes.notes_features.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.app.notes.ui.theme.themeGrey

@Entity
data class Note(
    val title: String,
    val content: String,
    val timeStamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
){
    companion object{
        val noteColor = themeGrey
    }
}

class invalidNoteException(message:String):Exception(message)
