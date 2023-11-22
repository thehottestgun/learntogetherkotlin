package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                    Article()
                }
            }
        }
    }
}

@Composable
fun Article(modifier: Modifier = Modifier) {
    Column {
        HeaderImage(modifier)
        ArticleTitle(modifier)
        ArticleIntro(modifier)
        ArticleBody(modifier)
    }
}

@Composable
fun HeaderImage(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Image(painter = image, contentDescription = null)
}

@Composable
fun ArticleTitle(modifier: Modifier = Modifier){
    Text(
        text = stringResource(id = R.string.article_name),
        fontSize = 24.sp,
        modifier = Modifier.padding(16.dp)
    )
}

@Composable
fun ArticleIntro(modifier: Modifier = Modifier){
    Text(
        text = stringResource(id = R.string.article_intro),
        modifier = Modifier.padding(horizontal = 16.dp),
        textAlign = TextAlign.Justify
    )
}

@Composable
fun ArticleBody(modifier: Modifier = Modifier){
    Text(
        text = stringResource(id = R.string.article_body),
        modifier = Modifier.padding(16.dp),
        textAlign = TextAlign.Justify
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnTogetherTheme {
        Article()
    }
}