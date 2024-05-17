package se.iwoio.highlowgamecomposedemo.ui.screen.mainmenu

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import se.iwoio.highlowgamecomposedemo.ui.screen.navigation.MainNavigation
import se.iwoio.highlowgamecomposedemo.ui.theme.PurpleGrey40

@Composable
fun MainMenuScreen(
    onNavigateToGame: () -> Unit,
    onNavigateToHelp: () -> Unit,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(PurpleGrey40),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            modifier = Modifier
                .requiredWidth(200.dp),
            onClick = onNavigateToGame
        ) {
            Text("Start")
        }
        Button(
            modifier = Modifier
                .requiredWidth(200.dp),
            onClick = {
                navController.navigate(MainNavigation.AboutScreen.route) }
        ) {
            Text("About")
        }
        OutlinedButton(
            modifier = Modifier.requiredWidth(200.dp),
            onClick = {
                onNavigateToHelp()
            }
        ) {
            Text("Help")
        }
    }
}
