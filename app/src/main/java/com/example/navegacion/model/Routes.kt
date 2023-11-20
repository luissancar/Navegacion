package com.example.navegacion.model

sealed class Routes(val route: String) {  //sealed agrupa clases u objetos
    object Pantalla01 : Routes("pantalla1")
    object Pantalla02 : Routes("pantalla2")
    object Pantalla03 : Routes("pantalla3")
    object Pantalla04 : Routes("pantalla4")
}