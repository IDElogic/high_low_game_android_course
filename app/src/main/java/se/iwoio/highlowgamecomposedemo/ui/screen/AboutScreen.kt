package se.iwoio.highlowgamecomposedemo.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowDropDown
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import se.iwoio.highlowgamecomposedemo.R
import se.iwoio.highlowgamecomposedemo.ui.screen.component.FeaturesComponent
import se.iwoio.highlowgamecomposedemo.ui.theme.Pink40

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    aboutText: String = "Demo app for Jetpack Compose"
) {val context = LocalContext.current

    Scaffold( topBar = {
        TopAppBar(
            title = {
                Text(
                    text = "mainscreen",
                    fontSize = 12.sp,
                    color = Gray,
                    fontWeight = FontWeight.Normal,
                )
            },
            navigationIcon = {
                IconButton(onClick = {
                    navController.navigate("mainscreen")
                }) {
                    Icon(
                        imageVector = Icons.Rounded.ArrowDropDown,
                        tint = Gray,
                        contentDescription = null
                    )
                }
            },
        )
    }) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Pink40)
                .padding(innerPadding), verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(32.dp))
                Text(
                    text = "ABOUT",
                    color = MaterialTheme.colorScheme.onPrimary,
                    fontSize = 16.sp,
                )
                Spacer(modifier = Modifier.height(0.dp))
                Image(
                    painter = painterResource(R.drawable.ic_launcher_foreground),
                    contentDescription = null,
                    modifier = Modifier.size(130.dp),
                )
            }
            Divider(color = Gray, modifier = Modifier
                .width(100.dp)
                .padding(20.dp, 0.dp))
            Text(
                modifier = Modifier.padding(32.dp, 0.dp),
                text = "about",
                fontSize = 12.sp,
                color = Gray,
                fontWeight = FontWeight.Normal,
            )
            Text(
                modifier = Modifier.padding(32.dp, 0.dp),
                text = "description",
                color = MaterialTheme.colorScheme.onSecondary,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,

                )
            Divider(color = Gray,
                modifier = Modifier
                    .width(100.dp)
                    .padding(20.dp, 0.dp))
            Text(
                modifier = Modifier.padding(32.dp, 0.dp),
                text = "features",
                fontSize = 12.sp,
                color = Gray,
                fontWeight = FontWeight.Normal,
            )
            FeaturesComponent()
        }
    }
}