package com.example.unittestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson
import java.io.FileReader

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recipeList: List<Recipe> = getRecipeObjectFromJson()

        print(recipeList)
    }

    fun getRecipeObjectFromJson(): List<Recipe> {

//        var stringReader: StringReader = StringReader(jsonStr)
//        var jsonReader: JsonReader = JsonReader(stringReader)
//
//        val gsonBuilder = GsonBuilder().serializeNulls()
//        gsonBuilder.registerTypeAdapter(Recipe::class.java, WeatherDeserializer())

//        val gson = gsonBuilder.create()

        var gson = Gson()
        val recipeList: List<Recipe> = gson.fromJson(FileReader("data_recipe.json"), Array<Recipe>::class.java).toList()

        return recipeList
    }
}
