package com.composeinstagramprofileui

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.composeinstagramprofileui.compose_views.*
import com.composeinstagramprofileui.data.ImageWithText

@Composable
fun ProfileScreen() {
    var selectedTabIndex by remember {
        mutableStateOf(0)
    }

    Column(modifier = Modifier.fillMaxSize()) {
        TopBar(name = "Asya_insta", modifier = Modifier.padding(vertical = 10.dp))
        Spacer(modifier = Modifier.height(4.dp))
        ProfileSection()
        Spacer(modifier = Modifier.height(25.dp))
        ButtonSection(modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(25.dp))
        HighlightSection(highlights = listOf(
                ImageWithText(image = painterResource(id = R.drawable.youtube), text = "YouTube"),
                ImageWithText(image = painterResource(id = R.drawable.qa), text = "Q&A"),
                ImageWithText(image = painterResource(id = R.drawable.discord), text = "Discord"),
                ImageWithText(image = painterResource(id = R.drawable.telegram), text = "Telegram")
            ), modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 14.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        PostTabView(
            imageWithTexts = listOf(
                ImageWithText(image = painterResource(id = R.drawable.ic_grid), text = "Posts"),
                ImageWithText(image = painterResource(id = R.drawable.ic_reels), text = "Reels"),
                ImageWithText(image = painterResource(id = R.drawable.ic_igtv), text = "IGTV"),
                ImageWithText(image = painterResource(id = R.drawable.profile), text = "Profile")
            )
        ) {
            selectedTabIndex = it
        }
        when(selectedTabIndex) {
            0 -> PostSection(
                posts = listOf(
                    painterResource(id = R.drawable.kmm),
                    painterResource(id = R.drawable.intermediate_dev),
                    painterResource(id = R.drawable.master_logical_thinking),
                    painterResource(id = R.drawable.bad_habits),
                    painterResource(id = R.drawable.multiple_languages),
                    painterResource(id = R.drawable.learn_coding_fast)
                ),
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

