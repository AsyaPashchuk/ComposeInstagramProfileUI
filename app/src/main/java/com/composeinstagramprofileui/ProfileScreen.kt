package com.composeinstagramprofileui

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.composeinstagramprofileui.compose_views.ProfileSection
import com.composeinstagramprofileui.compose_views.TopBar

@Composable
fun ProfileScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        TopBar(
            name = "Asya_insta",
            modifier = Modifier.padding(10.dp)
        )
        Spacer(modifier = Modifier.height(4.dp))
        ProfileSection()
    }
}

