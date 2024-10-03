package com.example.natureapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.natureapp.ui.components.CardImage
import com.example.natureapp.ui.theme.NatureAppTheme

@Composable
fun HomeScreen(innerPadding: PaddingValues){
    val images = listOf(
        "https://cloudfront-us-east-1.images.arcpublishing.com/infobae/YLE3DO4RXZELBDXCP5MTTQBFIQ.jpg",
        "https://www.cenote.org/fotos/Gran-Cenote-Tulum.jpg",
        "https://visitchiapas.com/v1/admin/archivos/Turismo/multimedia/b9aaba8c_16062020_0033.jpg",
        "https://www.mexicodesconocido.com.mx/wp-content/uploads/2020/02/IMG7712_COAH_CUATRO-CIENEGAS_POZA-AZUL_AMmd-1.jpg",
        "https://www.dgcs.unam.mx/boletin/bdboletin/multimedia/WAV211218/1101(2).jpg"
    )

    val titles = listOf(
        "Grutas de Tolantongo, Hidalgo",
        "Gran Cenote, Tulum",
        "Cañon del Sumidero, Chiapas",
        "Cuatrocienegas, Coahuila",
        "Arrecife Veracruzano, Veracruz"
    )

    val descriptions = listOf(
        "Aguas termales y grutas en un entorno montañoso.",
        "Sistema subterráneo de agua cristalina rodeado de vegetación.",
        "Impresionante desfiladero fluvial con acantilados altos.",
        "Oasis en medio del desierto con una biodiversidad única.",
        "Ecosistema marino que protege una gran variedad de especies de coral y vida marina en las aguas del Golfo de México."
    )

    Box (
        modifier = Modifier.fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(top = 30.dp)
    ){
        Column (
            modifier = Modifier.padding(15.dp)
        ){
            LazyColumn(){
                items(images.size){
                    CardImage(
                        image = images[it],
                        title = titles[it],
                        description = descriptions[it]
                    )
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun HomeScreenPreview(){
    NatureAppTheme {
        HomeScreen(innerPadding = PaddingValues(0.dp))
    }
}