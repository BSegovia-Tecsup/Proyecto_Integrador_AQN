package com.example.proyectointegradoraqn

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import com.example.proyectointegradoraqn.ui.theme.ProyectoIntegradoraqnTheme

@Composable
fun RecuperacionContrasenaScreen(onBackClick: () -> Unit) {
    var correo by remember { mutableStateOf("") }
    var enviado by remember { mutableStateOf(false) }  // Estado para mostrar mensaje de éxito

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

        if (enviado) {
            // Mostrar mensaje de éxito cuando el correo haya sido enviado
            Text(text = "¡Enlace de recuperación enviado con éxito!", style = MaterialTheme.typography.headlineLarge)
        } else {
            // Formulario de recuperación de contraseña
            Text(text = "Recuperación de Contraseña", style = MaterialTheme.typography.headlineLarge)

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
                    // Simula el envío del correo
                    enviado = true
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Enviar enlace de recuperación")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RecuperacionContrasenaPreview() {
    ProyectoIntegradoraqnTheme {
        RecuperacionContrasenaScreen(onBackClick = {})
    }
}
