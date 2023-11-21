package com.bedev.myfavpoke.presentation.dex_screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bedev.myfavpoke.ui.theme.Yellow

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DexScreen() {
    Scaffold(content = {
        PokeCard()
    })
}

@Composable
fun PokeCard() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(160.dp)
            .padding(10.dp),
        color = Yellow,
        shape = RoundedCornerShape(16.dp),
        tonalElevation = 5.dp,
        shadowElevation = 5.dp
    ) {

    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewDexScreen() {
    DexScreen()
}