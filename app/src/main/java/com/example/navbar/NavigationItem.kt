package com.example.navbar

sealed class NavigationItem(var route: String, var icon: Int, var title: String)
{
    object Home : NavigationItem("Home", R.drawable.ic_home, "Home")
    object Schedule : NavigationItem("Schedule", R.drawable.schedule, "Schedule")
    object Results : NavigationItem("Results", R.drawable.results, "Results")
    object Sponcers : NavigationItem("Sponcers", R.drawable.sponcers, "Sponcers")
    object Team : NavigationItem("Team", R.drawable.team, "Team")
    object Developer : NavigationItem("Developer", R.drawable.developer, "Developer")
    object Aboutus : NavigationItem("Aboutus", R.drawable.aboutus, "About us")
}
