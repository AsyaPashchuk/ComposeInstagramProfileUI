package com.composeinstagramprofileui.compose_views

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.composeinstagramprofileui.R

@Composable
fun ProfileSection(
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier.fillMaxWidth()) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {
            RoundImage(
                image = painterResource(id = R.drawable.yoshi_img_png),
                modifier = Modifier
                    .size(100.dp)
                    .weight(3f)
                    .padding(end = 10.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            StatSection(modifier = Modifier.weight(7f))
        }
        ProfileDescription(
            displayName = "Android Deva",
            description = "3+ years of coding experoence\n" +
                    "Want to create an excellent app? Send me email!\n" +
                    "Subscribe to my Youtube channel!",
            url = "https://youtube.com/",
            followedBy = listOf("codingflow", "miakhalifa"),
            otherCount = 23
        )
    }
}