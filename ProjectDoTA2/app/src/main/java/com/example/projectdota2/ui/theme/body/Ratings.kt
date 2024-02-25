package com.example.projectdota2.ui.theme.body

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projectdota2.R
import com.example.projectdota2.ui.theme.Grey00
import com.example.projectdota2.ui.theme.White00
import com.example.projectdota2.ui.theme.White20

@Composable
fun Ratings() {
    Column(modifier = Modifier.padding(start = 24.dp, top = 20.dp)) {
        Text(
            text = "Review & Ratings",
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.sk_modernist)),
                fontWeight = FontWeight(700),
                color = White20,
                letterSpacing = 0.6.sp,
            )
        )
        Row(modifier = Modifier.padding(top = 12.dp)) {
            Text(
                text = "4.9",
                style = TextStyle(
                    fontSize = 48.sp,
                    fontFamily = FontFamily(Font(R.font.sk_modernist)),
                    fontWeight = FontWeight(700),
                    color = White00,
                )
            )
            Column(modifier = Modifier.padding(start = 16.dp, top = 17.dp)) {

                Image(
                    modifier = Modifier
                        .size(
                            dimensionResource(R.dimen.Ratings_image_width),
                            dimensionResource(R.dimen.Ratings_image_height)
                        ),
                    painter = painterResource(id = R.drawable.group98),
                    contentDescription = "image description",
                    contentScale = ContentScale.FillBounds
                )
                Spacer(Modifier.height(8.dp))
                Text(

                    text = "70M Reviews",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.sk_modernist)),
                        fontWeight = FontWeight(400),
                        color = Grey00,
                        letterSpacing = 0.5.sp,
                    )
                )
            }
        }
    }
}
