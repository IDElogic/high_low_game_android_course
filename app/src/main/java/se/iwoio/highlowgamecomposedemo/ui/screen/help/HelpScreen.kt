package se.iwoio.highlowgamecomposedemo.ui.screen.help

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HelpScreen(
    modifier: Modifier = Modifier,
    helpText: String = "Use the app well"
) {
    Text(modifier=Modifier
        .padding(40.dp),
        text = "$helpText",
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal,
        color = Color.DarkGray
    )
}