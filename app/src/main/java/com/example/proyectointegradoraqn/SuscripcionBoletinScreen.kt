package com.example.proyectointegradoraqn

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.ui.graphics.Color
import com.example.proyectointegradoraqn.ui.theme.ProyectoIntegradoraqnTheme

@Composable
fun SuscripcionBoletinScreen(onBackClick: () -> Unit) {
    var correo by remember { mutableStateOf("") }
    var suscrito by remember { mutableStateOf(false) }  // Estado para mostrar mensaje de éxito

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Botón de "Regresar" en la parte superior
        IconButton(onClick = onBackClick, modifier = Modifier.align(Alignment.Start)) {
            Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "Volver", tint = Color.Black)
        }

        if (suscrito) {
            // Mostrar mensaje de éxito cuando el usuario se haya suscrito
            Text(text = "¡Te has suscrito con éxito al boletín!", style = MaterialTheme.typography.headlineLarge)
        } else {
            // Formulario de suscripción al boletín
            Text(text = "Suscríbete al Boletín", style = MaterialTheme.typography.headlineLarge)

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = correo,
                onValueChange = { correo = it },
                label = { Text("Correo Electrónico") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {
                    // Simula la suscripción
                    suscrito = true
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Suscribirse")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SuscripcionBoletinPreview() {
    ProyectoIntegradoraqnTheme {
        SuscripcionBoletinScreen(onBackClick = {})
    }
}
