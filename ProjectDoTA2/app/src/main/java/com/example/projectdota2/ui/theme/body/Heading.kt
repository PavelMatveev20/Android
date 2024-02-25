package com.example.projectdota2.ui.theme.body

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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
import com.example.projectdota2.ui.theme.Grey10
import com.example.projectdota2.ui.theme.White00

@Composable
fun Heading() {
    Column(
        modifier = Modifier
            .padding(start = 136.dp, top = 363.dp)
    ) {
        Text(
            text = "DoTA 2",
            style = TextStyle(
                fontSize = 20.sp,
                lineHeight = 26.sp,
                fontFamily = FontFamily(Font(R.font.sk_modernist)),
                fontWeight = FontWeight(700),
                color = White00,
                letterSpacing = 0.5.sp,
            )
        )
        Spacer(Modifier.height(6.dp))
        Row(horizontalArrangement = Arrangement.Center) {
            Image(
                painter = painterResource(id = R.drawable.group84),
                contentDescription = "image description",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .size(
                        dimensionResource(R.dimen.Heading_image_width),
                        dimensionResource(R.dimen.Heading_image_height)
                    )
            )
            Text(
                modifier = Modifier.padding(start = 10.dp),
                text = "70M",
                style = TextStyle(
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.sk_modernist)),
                    fontWeight = FontWeight(400),
                    color = Grey10,
                    letterSpacing = 0.5.sp,
                )
            )
        }
    }
}
