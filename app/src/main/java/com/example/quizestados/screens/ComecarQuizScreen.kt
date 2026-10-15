package com.example.quizestados.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quizestados.R

@Composable
fun ComecarQuizScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.background(Color(0xff62DBFB))
            .fillMaxSize()
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.quiz),
            contentDescription = "Icone da palavra QUIZ",
            modifier = Modifier.height(150.dp)
        )

        Spacer(modifier = Modifier.height(60.dp))

        Text(
            text = "QUIZATRON 3000",
            fontSize = 40.sp,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(40.dp))

        Button(
            onClick = {

            },
            colors = ButtonDefaults.buttonColors(
                Color.Yellow
            ),
            modifier = Modifier.width(250.dp)
                .height(50.dp)
        ) {
            Text(
                text = "COMECAR!",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}