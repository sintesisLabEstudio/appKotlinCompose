package com.example.appcompose

// Importaciones necesarias del SDK de Android y bibliotecas de Jetpack Compose
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.appcompose.ui.theme.AppComposeTheme
/**
 * Actividad principal de la aplicación.
 * Hereda de ComponentActivity, base para las actividades que utilizan Jetpack Compose.
 */
class MainActivity : ComponentActivity() {
    /**
     * Método del ciclo de vida que se ejecuta al iniciar la actividad.
     * Aquí se inicializa la vista y la configuración básica de la pantalla.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Habilita el modo de pantalla completa de borde a borde (Edge-to-Edge)
        enableEdgeToEdge()

        // Establece el contenido visual de la pantalla mediante componentes Compose
        setContent {
            vista()
        }
    }
    /**
     * Componente Composable que agrupa elementos de texto y un botón
     * dispuestos de manera horizontal.
     */
    @Composable
    fun textos() {
        // Row organiza a sus elementos hijos en una fila horizontal
        Row {
            //Text("LLegue aqui")
            Text("Este es otro texto")
            //ButtonExample()
        }
    }
    /**
     * Componente Composable que renderiza una imagen en pantalla.
     */
    @Composable
    fun imagenes() {
        // Image permite mostrar un recurso gráfico
        Image(
            painter = painterResource(R.drawable.ic_launcher_foreground), // Carga la imagen desde la carpeta drawable
            contentDescription = "Esto es una imagen"                       // Texto descriptivo para accesibilidad
        )
    }
    /**
     * Componente Composable que define un botón con un evento de clic.
     */
    @Composable
    fun ButtonExample() {
        // Componente de botón de Material Design con un listener en onClick
        Button(onClick = {
            // Al hacer clic, muestra una notificación emergente breve (Toast)
            Toast.makeText(
                this,
                "Clickeado",
                Toast.LENGTH_SHORT
            ).show()
        }) {
            // Etiqueta de texto que se muestra dentro del botón
            Text(text = "Click")
        }
    }
    /**
     * Componente Composable principal de la interfaz de usuario.
     * La anotación @Preview permite previsualizar la interfaz dentro de Android Studio.
     */
    @Preview
    @Composable
    fun vista() {
        // Row organiza sus componentes hijos de forma horizontal (uno al lado de otro)
        Row {
            textos()
            imagenes()
            ButtonExample()
        }
        //Column {
        //    textos()
        //    imagenes()
        //}
    }
}