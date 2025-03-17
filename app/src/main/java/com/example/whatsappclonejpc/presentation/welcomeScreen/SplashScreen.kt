package com.example.whatsappclonejpc.presentation.welcomeScreen


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappclonejpc.R


@Preview(showSystemUi = true)
@Composable
fun SplashScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.whatsapp_icon),
            contentDescription = "Whatsapp Icon",
            modifier = Modifier
                .size(80.dp)
                .align(Alignment.Center)
        )
        Column(
            modifier = Modifier.align(Alignment.BottomCenter),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "From",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Row(
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.meta),
                    contentDescription = "Whatsapp Icon",
                    modifier = Modifier
                        .size(25.dp),
                    tint = colorResource(id = R.color.light_green)
                )
                Spacer(modifier = Modifier.padding(horizontal = 1.dp))
                Text(
                    text = "Meta",
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.light_green),
                    fontSize = 23.sp
                )


            }
        }

    }
}