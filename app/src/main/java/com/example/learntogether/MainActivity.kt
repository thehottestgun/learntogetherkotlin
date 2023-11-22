package com.example.learntogether

import android.os.Bundle
import android.preference.PreferenceActivity.Header
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Article("Android")
                }
            }
        }
    }
}

@Composable
fun Article(name: String, modifier: Modifier = Modifier) {
    HeaderImage()
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun HeaderImage(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Image(painter = image, contentDescription = null)
}

@Composable
fun ArticleIntro(modifier: Modifier = Modifier){

}

@Composable
fun ArticleBody(modifier: Modifier = Modifier){

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnTogetherTheme {
        Article("Android")
    }
}