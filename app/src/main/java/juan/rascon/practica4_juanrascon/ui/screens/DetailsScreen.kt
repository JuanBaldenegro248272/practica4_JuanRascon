package juan.rascon.practica4_juanrascon.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import juan.rascon.practica4_juanrascon.model.deutschland

@Composable
fun DetailScreen(
    spielerId: Int,
    onBack: () -> Unit
) {

    val spieler = deutschland.find { it.id == spielerId }

    if (spieler == null) {
        Text("Jugador no encontrado")
        return
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(
            painter = painterResource(id = spieler.imageRes),
            contentDescription = spieler.nombre,
            modifier = Modifier
                .size(180.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = spieler.nombre,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Posición: ${spieler.posicion}",
            fontSize = 18.sp
        )

        Text(
            text = "Número: ${spieler.numero}",
            fontSize = 18.sp
        )

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = onBack) {
            Text("Regresar")
        }
    }
}