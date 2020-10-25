package com.example.ExampleRecyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayList = ArrayList<ExampleItem>()

        arrayList.add(ExampleItem(R.drawable.cpp, "C++", "a cross-platform language that can be used to create high-performance applications"))
        arrayList.add(ExampleItem(R.drawable.csharp, "C#", "a programming language developed and launched by Microsoft in 2001"))
        arrayList.add(ExampleItem(R.drawable.java, "Java", "a high-level programming language developed by Sun Microsystems"))
        arrayList.add(ExampleItem(R.drawable.javascript, "Javascript", "a programming Language for the Web"))
        arrayList.add(ExampleItem(R.drawable.kotlin, "Kotlin", "an open-source statically typed programming language that targets the JVM, Android, JavaScript and Native"))
        arrayList.add(ExampleItem(R.drawable.python, "Python", "an interpreted, high-level and general-purpose programming language"))
        arrayList.add(ExampleItem(R.drawable.ruby, "Ruby", "a dynamic, open source programming language with a focus on simplicity and productivity"))
        arrayList.add(ExampleItem(R.drawable.swift, "Swift", "a vast messaging network used by banks and other financial institutions to quickly, accurately, and securely send and receive information, such as money transfer instructions"))
        arrayList.add(ExampleItem(R.drawable.typescript, "Typescript", "a strict syntactical superset of JavaScript and adds optional static typing to the language"))
        arrayList.add(ExampleItem(R.drawable.visualstudio, "Visual Studio", "an integrated development environment (IDE) from Microsoft"))

        val exampleAdapter = ExampleAdapter(arrayList, this)

        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = exampleAdapter
    }



}