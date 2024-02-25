package com.example.projectdota2.ui.theme.body

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projectdota2.R
import com.example.projectdota2.ui.theme.Black00
import com.example.projectdota2.ui.theme.Elow00

@Composable
fun InstallationButton() {
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 24.dp, top = 40.dp, end = 24.dp)
            .size(
                dimensionResource(R.dimen.InstallationButton_image_width),
                dimensionResource(R.dimen.InstallationButton_image_height)
            )
            .background(
                color = Elow00,
                shape = RoundedCornerShape(size = 12.dp)
            )

    ) {
        Text(
            modifier = Modifier
                .padding(20.dp),
            text = "Install",
            style = TextStyle(
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.sk_modernist)),
                fontWeight = FontWeight(700),
                color = Black00,
                letterSpacing = 0.6.sp
            )
        )
    }
}

