package com.bedev.myfavpoke.presentation.dex_screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bedev.myfavpoke.R
import com.bedev.myfavpoke.ui.theme.Yellow

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DexScreen() {
    Scaffold(content = {
        PokeCard(pokeId = "001", pokeName = "Bulbasaur")
    })
}

@Composable
fun PokeCard(
    pokeId: String,
    pokeName: String
) {
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
        Box(modifier = Modifier) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 20.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.pokeball),
                    contentDescription = "Pokeball"
                )
                Column(
                    modifier = Modifier.padding(start = 16.dp)
                ) {
                    Text(text = pokeId)
                    Text(text = pokeName)
                }
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewDexScreen() {
    DexScreen()
}