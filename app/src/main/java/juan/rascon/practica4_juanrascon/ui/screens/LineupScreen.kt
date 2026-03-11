package juan.rascon.practica4_juanrascon.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import juan.rascon.practica4_juanrascon.model.deutschland
import juan.rascon.practica4_juanrascon.ui.components.SpielerCard

@Composable
fun LineupScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text="Listado de jugadores",
            style = MaterialTheme.typography.headlineLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth())
        LazyColumn() {
        items(items= deutschland){
            spieler ->
            SpielerCard(spieler)
        }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LineupScreenPreview(){
    LineupScreen()
}