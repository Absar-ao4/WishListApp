package com.absar.mywishlistapp

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp


@Composable
fun AppBarView(
    title: String,
    onBackNavClicked:()->Unit={}
){
        val navigationIcon:(@Composable () -> Unit)?={
           if(!title.contains("WishList")){
               IconButton(onClick = {onBackNavClicked()}) {
                   Icon(
                       imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                       tint = Color.White,
                       contentDescription = null
                   )
               }
           }else{
               null
           }
        }

        TopAppBar(title={Text(
            text=title,
            color= colorResource(id=R.color.white))
        },
            elevation = 3.dp,
            backgroundColor = colorResource(id=R.color.app_bar_color),
            modifier = Modifier
                .padding(top = WindowInsets.statusBars.asPaddingValues().calculateTopPadding()),
            navigationIcon = navigationIcon
            )
}