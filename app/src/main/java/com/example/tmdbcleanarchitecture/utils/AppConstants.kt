package com.example.tmdbcleanarchitecture.utils

import com.example.tmdbcleanarchitecture.BuildConfig

object AppConstants {

    const val PREF_NAME = BuildConfig.APPLICATION_ID + "_pref"
    const val SELECTED_THEME = "selected_theme"
    const val DARK_THEME = "dark_theme"
    const val LIGHT_THEME = "light_theme"
    const val DEFAULT_THEME = "default_theme"
    
    const val NOW_PLAYING = "now_playing"
    const val POPULAR = "popular"
    const val TOP_RATED = "top_rated"
    const val UPCOMING = "upcoming"
    const val FAVORITE = "favorite"

    const val DATABASE_NAME = "FavoriteMovies"

    const val SELECTED_CATEGORY = "category"
    const val SELECTED_MOVIE = "SelectedMovie"

    const val YOUTUBE_WEB_LINK = "http://www.youtube.com/watch?v="
    const val YOUTUBE_APP_LINK = "vnd.youtube:"

    const val VIEW_TYPE_EMPTY = 0
    const val VIEW_TYPE_NORMAL = 1
}