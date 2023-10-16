package com.app.notes.notes_features.presentation.notes.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.notes.notes_features.domain.model.Note
import com.app.notes.ui.theme.cardColor
import com.app.notes.ui.theme.primary
import com.app.notes.ui.theme.themeGrey
import com.app.notes.ui.theme.white

@Composable
fun NoteItem(
    note: Note,
    modifier: Modifier = Modifier
){
    Card(
        shape = RoundedCornerShape(10.dp),
        modifier = modifier
            .fillMaxWidth()
            .height(50.dp),
        colors = CardDefaults.cardColors(
            containerColor = cardColor
        )
    ) {
        Text(
            text = note.title,
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp),
            fontWeight = FontWeight.Bold,
            color = white,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            text = note.content,
            fontSize = 10.sp,
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 3.dp),
            color = themeGrey,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}
