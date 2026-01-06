package com.yeditepe.finalexam.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TaskItemScreen() {
    var isCompleted by rememberSaveable { mutableStateOf(false) }
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Submit Final Project",
            style = MaterialTheme.typography.titleLarge
        )
        Text(
            text = if (isCompleted) "tamamlandi" else "tamamlanmamis",
        style = MaterialTheme.typography.bodyLarge,
             modifier = Modifier.padding(top = 8.dp)
        )

Button
    (
            onClick = {
                isCompleted = !isCompleted
            },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text("Change Status")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TaskItemPreview() {TaskItemScreen() }
