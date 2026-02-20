package me.gabrielacastro.tallergitgithubapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.gabrielacastro.tallergitgithubapp.ui.theme.TallerGitGithubAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}




@Preview(showBackground = true, showSystemUi = true)
@Composable
fun parte1(){
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        val painter = painterResource(R.drawable.florbonita)
        Image(
            painter = painter,
            contentDescription = "Gabriela Castro",
            modifier = Modifier.padding(top = 50.dp).width(150.dp).clip(CircleShape)
        )
        Text(
            text = "Gabriela Castro",
            fontSize = 30.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    top = 30.dp,
                    bottom = 10.dp,
                    start = 30.dp,
                    end = 30.dp
                ),
            textAlign = TextAlign.Center
        )
        Text(
            text = "Estudiante de Ing. de Sistemas",
            fontSize = 20.sp,
            color = Color.Blue,
            textAlign = TextAlign.Center
        )
        HorizontalDivider(
            color = Color.Gray,
            modifier = Modifier.padding(15.dp)
        )
        Text(
            text = "Edad",
            fontSize = 20.sp,
            color = Color.Gray,
            textAlign = TextAlign.Left,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .padding(
                    top = 20.dp,
                    start = 15.dp,
                )
                .fillMaxWidth(),
        )
        Text(
            text = "18 Años",
            fontSize = 20.sp,
            color = Color.Black,
            textAlign = TextAlign.Left,
            modifier = Modifier
                .padding(
                    top = 5.dp,
                    start = 15.dp,
                )
                .fillMaxWidth(),
        )
        Text(
            text = "Correo",
            fontSize = 20.sp,
            color = Color.Gray,
            textAlign = TextAlign.Left,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .padding(
                    top = 20.dp,
                    start = 15.dp,
                )
                .fillMaxWidth(),
        )
        Text(
            text = "gcastro218@unab.edu.co",
            fontSize = 20.sp,
            color = Color.Blue,
            textAlign = TextAlign.Left,
            modifier = Modifier
                .padding(
                    top = 5.dp,
                    start = 15.dp,
                )
                .fillMaxWidth(),
        )
        Text(
            text = "Ciudad",
            fontSize = 20.sp,
            color = Color.Gray,
            textAlign = TextAlign.Left,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .padding(
                    top = 20.dp,
                    start = 15.dp,
                )
                .fillMaxWidth(),
        )
        Text(
            text = "Bucaramanga",
            fontSize = 20.sp,
            color = Color.Black,
            textAlign = TextAlign.Left,
            modifier = Modifier
                .padding(
                    top = 5.dp,
                    start = 15.dp,
                )
                .fillMaxWidth(),
        )
        HorizontalDivider(
            color = Color.Gray,
            modifier = Modifier.padding(15.dp)
        )
        Text(
            text = "Sobre mi",
            fontSize = 20.sp,
            color = Color.Gray,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .padding(
                    top = 5.dp,
                    start = 10.dp,
                )
                .fillMaxWidth(),
        )
        Text(
            text = "Estudio ingenieri de sistemas en la unab, me gusta el squash y el voley, mi perro es un rottweiler y se llama zeus y lo amo mucho.",
            fontSize = 20.sp,
            color = Color.Black,
            textAlign = TextAlign.Left,
            modifier = Modifier
                .padding(
                    top = 5.dp,
                    start = 15.dp,
                )
                .fillMaxWidth(),
        )


    }
}
