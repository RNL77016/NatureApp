package com.example.natureapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.natureapp.R

@Composable
fun CardImage(image : String, title : String, description : String){
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp)
    ){
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .placeholder(R.drawable.grutas)
                .data(image)
                .build(),
            contentDescription = "CardImage",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentScale = ContentScale.Crop
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(110.dp)
        ){
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ){
                Text(
                    text = title,
                    color = MaterialTheme.colorScheme.contentColorFor(MaterialTheme.colorScheme.background), // Use contentColorFor
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = description,
                    color = MaterialTheme.colorScheme.contentColorFor(MaterialTheme.colorScheme.background), // Use contentColorFor
                    fontSize = 14.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun CardImagePreview(){
    CardImage(image = "https://www.dgcs.unam.mx/boletin/bdboletin/multimedia/WAV211218/1101(2).jpg", title = "Arrecife Veracruzano, Veracruz", description = "Ecosistema marino que protege una gran variedad de especies de coral y vida marina en las aguas del Golfo de México.")
}