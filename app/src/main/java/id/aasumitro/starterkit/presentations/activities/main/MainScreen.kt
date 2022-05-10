package id.aasumitro.starterkit.presentations.activities.main

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import id.aasumitro.starterkit.ui.theme.KotlinStarterKitTheme

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    KotlinStarterKitTheme {
        Greeting("Android")
    }
}