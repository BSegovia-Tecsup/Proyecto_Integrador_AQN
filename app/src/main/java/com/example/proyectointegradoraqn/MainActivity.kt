package com.example.proyectointegradoraqn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyectointegradoraqn.ui.theme.ProyectoIntegradoraqnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProyectoIntegradoraqnTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    IndexScreen()  // Llamamos a la pantalla principal
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class) // Se añade aquí para TopAppBar
@Composable
fun IndexScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Inicio - Filtros de Agua", fontSize = 20.sp) },
                actions = {
                    IconButton(onClick = { /* Navegar al perfil del usuario */ }) {
                        Icon(imageVector = Icons.Default.Person, contentDescription = "Perfil")
                    }
                }
            )
        }
    ) { innerPadding ->
        // Contenido principal
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Botón para ver productos
            Button(
                onClick = { /* Navegar a la lista de productos */ },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(text = "Visualización de Productos", fontSize = 18.sp)
            }

            // Botón para suscribirse al boletín
            Button(
                onClick = { /* Navegar a la suscripción de boletín */ },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(text = "Suscribirse al Boletín", fontSize = 18.sp)
            }

            // Botón para añadir al carrito
            Button(
                onClick = { /* Navegar al carrito */ },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(text = "Añadir al Carrito", fontSize = 18.sp)
            }

            // Botón para acceder al soporte al cliente
            Button(
                onClick = { /* Navegar al soporte al cliente */ },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(text = "Soporte al Cliente", fontSize = 18.sp)
            }

            // Texto para iniciar sesión o registrarse
            ClickableText(
                text = AnnotatedString("¿Ya tienes cuenta? Inicia sesión o regístrate"),
                onClick = { /* Navegar a inicio de sesión o registro */ },
                modifier = Modifier.padding(top = 16.dp),
                style = LocalTextStyle.current.copy(color = Color.Blue, fontSize = 14.sp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun IndexScreenPreview() {
    ProyectoIntegradoraqnTheme {
        IndexScreen()
    }
}
