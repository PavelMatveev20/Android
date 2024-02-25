package com.example.projectdota2.ui.theme.body

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import com.example.projectdota2.ui.theme.Blue10
import com.example.projectdota2.ui.theme.Blue20
import com.example.projectdota2.ui.theme.White10

@Composable
fun Description() {
    Column(
        modifier = Modifier.padding(top = 31.dp)
    ) {
        Row {
            Box(
                modifier = Modifier
                    .padding(start = 24.dp)
                    .size(
                        dimensionResource(R.dimen.Description_cell1_width),
                        dimensionResource(R.dimen.Description_cell_height)
                    )
                    .background(
                        color = Blue10,
                        shape = RoundedCornerShape(size = 100.dp)
                    )
            ) {
                Text(
                    modifier = Modifier
                        .padding(10.dp, 5.dp, 10.dp, 5.dp),
                    text = "MOBA",
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontFamily = FontFamily(Font(R.font.montserrat)),
                        fontWeight = FontWeight(500),
                        color = Blue20,
                    )
                )
            }
            Box(
                modifier = Modifier
                    .padding(start = 10.dp)
                    .size(
                        dimensionResource(R.dimen.Description_cell2_width),
                        dimensionResource(R.dimen.Description_cell_height)
                    )
                    .background(
                        color = Blue10,
                        shape = RoundedCornerShape(size = 100.dp)
                    )
            ) {
                Text(
                    modifier = Modifier
                        .padding(10.dp, 5.dp, 10.dp, 5.dp),
                    text = "MULTIPLAYER",
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontFamily = FontFamily(Font(R.font.montserrat)),
                        fontWeight = FontWeight(500),
                        color = Blue20,
                    )
                )
            }
            Box(
                modifier = Modifier
                    .padding(start = 10.dp)
                    .size(
                        dimensionResource(R.dimen.Description_cell3_width),
                        dimensionResource(R.dimen.Description_cell_height)
                    )
                    .background(
                        color = Blue10,
                        shape = RoundedCornerShape(size = 100.dp)
                    )
            ) {
                Text(
                    modifier = Modifier
                        .padding(10.dp, 5.dp, 10.dp, 5.dp),
                    text = "STRATEGY",
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontFamily = FontFamily(Font(R.font.montserrat)),
                        fontWeight = FontWeight(500),
                        color = Blue20,
                    )
                )
            }
        }
        Box(
            modifier = Modifier
                .padding(start = 21.dp, top = 30.dp)
                .size(
                    dimensionResource(R.dimen.Description_describe_width),
                    dimensionResource(R.dimen.Description_describe_height)
                )
        ) {
            Text(
                text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 19.sp,
                    fontFamily = FontFamily(Font(R.font.sk_modernist)),
                    fontWeight = FontWeight(400),
                    color = White10,

                    )
            )
        }
    }
}