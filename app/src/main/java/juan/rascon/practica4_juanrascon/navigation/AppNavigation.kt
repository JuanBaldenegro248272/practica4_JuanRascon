package juan.rascon.practica4_juanrascon.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import juan.rascon.practica4_juanrascon.ui.screens.LineupScreen
import juan.rascon.practica4_juanrascon.ui.screens.LoginScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.LOGIN_SCREEN){
        composable(Routes.LOGIN_SCREEN) {
            LoginScreen(onLoggingSucess = {navController.navigate(Routes.LINEUP_SCREEN)})
        }
        composable (Routes.LINEUP_SCREEN){
            LineupScreen()
        }
    }
}

object Routes{
    const val LOGIN_SCREEN = "Login"
    const val LINEUP_SCREEN = "lineup"
}