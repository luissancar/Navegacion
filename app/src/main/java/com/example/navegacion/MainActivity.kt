package com.example.navegacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.navegacion.model.Routes
import com.example.navegacion.ui.theme.NavegacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavegacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navigationController = rememberNavController()
                    NavHost(
                        navController = navigationController,
                        startDestination = Routes.Pantalla01.route
                    ) {
                        composable(Routes.Pantalla01.route) { Screen01(navigationController) }
                        composable(Routes.Pantalla02.route) { Screen02(navigationController) }
                        composable(Routes.Pantalla03.route) { Screen03(navigationController) }
                        composable("pantalla04/{name}", arguments = listOf(
                            navArgument("name") {
                                type = NavType.IntType
                            }
                        )
                        ) { backStackEntry ->
                            Screen04(
                                navigationController = navigationController,
                                name = backStackEntry.arguments?.getInt("name") ?: 0
                            )

                        }
                    }

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NavegacionTheme {
        Greeting("Android")
    }
}