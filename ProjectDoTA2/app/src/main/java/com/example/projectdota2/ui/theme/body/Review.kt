package com.example.projectdota2.ui.theme.body

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
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
import com.example.projectdota2.ui.theme.Grey40


@Composable
fun Review() {
    Column(
        modifier = Modifier.padding(start = 24.dp, top = 32.dp)
    ) {
        Commentation(
            avatar = R.drawable.ellipse10,
            name = "Auguste Conte",
            date = "February 14, 2019",
            commentation = R.string.Comment
        )
        Box(
            modifier = Modifier.padding(start = 14.dp, top = 24.dp)
        ) {
            Image(
                modifier = Modifier
                    .border(width = 1.dp, color = Grey40)
                    .padding(1.dp)
                    .size(
                        dimensionResource(R.dimen.Review_vector_width),
                        dimensionResource(R.dimen.Review_vector_height)
                    ),
                painter = painterResource(id = R.drawable.vector3),
                contentDescription = "image description",
                contentScale = ContentScale.FillBounds
            )
        }
        Column(
            modifier = Modifier.padding(top = 24.dp)
        ) {
            Commentation(
                avatar = R.drawable.ellipse9,
                name = "Jang Marcelino",
                date = "February 14, 2019",
                commentation = R.string.Comment
            )
        }
    }
}
