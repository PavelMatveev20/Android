package com.example.projectdota2.ui.theme.body

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projectdota2.R
import com.example.projectdota2.ui.theme.Grey00
import com.example.projectdota2.ui.theme.Grey30
import com.example.projectdota2.ui.theme.White00

@Composable
fun Commentation(
    @DrawableRes avatar: Int,
    name: String,
    date: String,
    @StringRes commentation: Int
) {
    Row {
        Image(
            painter = painterResource(id = avatar),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .size(
                    dimensionResource(R.dimen.Commentation_icon_width),
                    dimensionResource(R.dimen.Commentation_icon_height),
                )
                .clip(shape = CircleShape)
        )
        Column(
            modifier = Modifier.padding(start = 16.dp)
        ) {
            Text(
                text = name,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.sk_modernist)),
                    fontWeight = FontWeight(400),
                    color = White00,
                    letterSpacing = 0.5.sp,
                )
            )
            Spacer(Modifier.height(7.dp))
            Text(
                text = date,
                style = TextStyle(
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.sk_modernist)),
                    fontWeight = FontWeight(400),
                    color = Grey30,
                    letterSpacing = 0.5.sp,
                )
            )
        }
    }
    Text(
        modifier = Modifier
            .padding(top = 18.dp)
            .size(
                dimensionResource(R.dimen.Commentation_text_width),
                dimensionResource(R.dimen.Commentation_text_height)
            ),
        text = stringResource(id = commentation),
        style = TextStyle(
            fontSize = 12.sp,
            lineHeight = 20.sp,
            fontFamily = FontFamily(Font(R.font.sk_modernist)),
            fontWeight = FontWeight(400),
            color = Grey00,
            letterSpacing = 0.5.sp,
        )
    )
}