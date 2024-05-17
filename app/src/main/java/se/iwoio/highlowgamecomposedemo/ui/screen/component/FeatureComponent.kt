package se.iwoio.highlowgamecomposedemo.ui.screen.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FeaturesComponent(modifier: Modifier = Modifier) {
	Column(
		modifier = modifier
			.fillMaxSize(1f)
			.padding(32.dp, 0.dp)
			.verticalScroll(rememberScrollState()), verticalArrangement = Arrangement.spacedBy(8.dp)
	) {
		FeatureItem(icon = "#", text = "something new")
		FeatureItem(icon = "#", text = "something new")
		FeatureItem(icon = "#", text = "something new")
		FeatureItem(icon = "#", text = "something new")
		FeatureItem(icon = "#", text = "something new")
		FeatureItem(icon = "#", text = "something new")
	}
}
@Composable
fun FeatureItem(icon: String, text: String) {
	Row(verticalAlignment = Alignment.CenterVertically) {
		Text(
			text = icon,
			color = Color.White,
			fontSize = 16.sp,
			fontWeight = FontWeight.Normal,)
		Spacer(modifier = Modifier.width(8.dp))
		Text(text = text,  color = Color.White,
			fontSize = 16.sp,
			fontWeight = FontWeight.Normal,)
	}
}
