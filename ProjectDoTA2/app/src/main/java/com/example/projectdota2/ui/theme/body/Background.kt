package com.example.projectdota2.ui.theme.body

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.projectdota2.R
import com.example.projectdota2.ui.theme.Blue00

@Composable
fun Background() {
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .background(color = Blue00)
            .size(
                dimensionResource(R.dimen.Background_width),
                dimensionResource(R.dimen.Background_height)
            )
    ) {
        Box {
            Image(
                painter = painterResource(id = R.drawable.image16),
                contentDescription = "image description",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .size(
                        dimensionResource(R.dimen.Background_image_width),
                        dimensionResource(R.dimen.Background_image_height)
                    )
            )
            Box(
                modifier = Modifier.padding(top = 290.dp)
            ) {
                Image(
                    modifier = Modifier
                        .size(
                            dimensionResource(R.dimen.Background_icon_width),
                            dimensionResource(R.dimen.Background_icon_height)

                        ),
                    painter = painterResource(id = R.drawable.group83),
                    contentDescription = "image description",
                    contentScale = ContentScale.FillBounds,
                )
            }
        }
    }
}