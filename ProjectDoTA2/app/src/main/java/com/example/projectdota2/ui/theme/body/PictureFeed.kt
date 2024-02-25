package com.example.projectdota2.ui.theme.body

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.projectdota2.R
import com.example.projectdota2.ui.theme.Grey20
import com.example.projectdota2.ui.theme.Transporant00

@Composable
fun PictureFeed() {
    Row(
        modifier = Modifier
            .padding(start = 24.dp, top = 15.dp)
            .horizontalScroll(rememberScrollState(0))
    ) {
        Box {
            Image(
                painter = painterResource(id = R.drawable.image18),
                contentDescription = "image description",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(10.dp))
                    .size(
                        dimensionResource(R.dimen.PictureFeed_image_width),
                        dimensionResource(R.dimen.PictureFeed_image_height)
                    )
            )
            Box(
                modifier = Modifier
                    .padding(start = 96.dp, top = 43.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ellipse8),
                    contentDescription = "image description",
                    contentScale = ContentScale.None,
                    modifier = Modifier
                        .border(width = 0.7.dp, color = Transporant00)
                        .clip(shape = CircleShape)
                        .padding(0.7.dp)
                        .size(
                            dimensionResource(R.dimen.PictureFeed_play_button_width),
                            dimensionResource(R.dimen.PictureFeed_play_button_height)
                        )
                        .background(color = Grey20)
                )
                Image(
                    painter = painterResource(id = R.drawable.arrowright),
                    contentDescription = "image description",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .size(
                            dimensionResource(R.dimen.PictureFeed_play_icon_width),
                            dimensionResource(R.dimen.PictureFeed_play_icon_height)
                        )
                )
            }
        }
        Image(
            painter = painterResource(id = R.drawable.image19),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .alpha(0.6f)
                .padding(start = 15.dp)
                .size(
                    dimensionResource(R.dimen.PictureFeed_image_width),
                    dimensionResource(R.dimen.PictureFeed_image_height)
                )
                .clip(shape = RoundedCornerShape(10.dp))
        )
    }
}
