package com.example.projectdota2


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.Modifier
import com.example.projectdota2.ui.theme.body.Background
import com.example.projectdota2.ui.theme.body.Description
import com.example.projectdota2.ui.theme.body.Heading
import com.example.projectdota2.ui.theme.body.PictureFeed
import com.example.projectdota2.ui.theme.body.Ratings
import com.example.projectdota2.ui.theme.body.Review
import com.example.projectdota2.ui.theme.body.InstallationButton


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(
                modifier = Modifier
                    .verticalScroll(rememberScrollState(0))
            ) {
                Background()
                Column {
                    Heading()
                    Description()
                    PictureFeed()
                    Ratings()
                    Review()
                    InstallationButton()
                }
            }
        }
    }
}












