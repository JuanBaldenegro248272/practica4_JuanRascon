package juan.rascon.practica4_juanrascon.model

import juan.rascon.practica4_juanrascon.R

data class Spieler(
    val id: Int,
    val nombre: String,
    val posicion: String,
    val numero: Int,
    val imageRes: Int = 0
)

val deutschland = listOf(
    Spieler(1, "Manuel Neuer", "Portero", 1, R.drawable.neuer),
    Spieler(2, "Mats Hummels", "Defensa", 5, R.drawable.hummels),
    Spieler(3, "Jerome Boateng", "Defensa", 20, R.drawable.boateng),
    Spieler(4, "Bastian Schweinsteiger", "Mediocampo", 7, R.drawable.schweinsteiger),
    Spieler(5, "Sami Khedira", "Mediocampo", 6, R.drawable.khedira),
    Spieler(6, "Toni Kroos", "Mediocampo", 18, R.drawable.kroos),
    Spieler(7, "Mesut Ozil", "Mediocampo Ofensivo", 8, R.drawable.ozil),
    Spieler(8, "Thomas Muller", "Delantero", 13, R.drawable.muller),
    Spieler(9, "Miroslav Klose", "Delantero", 11, R.drawable.klose)
)