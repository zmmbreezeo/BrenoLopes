package com.balladesh.helloworld

import javafx.application.Application
import javafx.application.Application.launch
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.layout.HBox
import javafx.stage.Stage

class HelloWorldApplication: Application()
{
  override fun start(stage: Stage?) {
    if (stage == null)
      throw NullPointerException("Could not create an application window.")

    val helloWorld = Label("Hello World")

    val panel = HBox()
    panel.children.add(helloWorld)
    panel.alignment = Pos.CENTER

    val scene = Scene(panel, 450.0, 450.0)

    stage.scene = scene
    stage.title = "Hello World"
    stage.isResizable = false
    stage.sizeToScene()
    stage.centerOnScreen()
    stage.show()
  }
}

//fun main(args: Array<String>) {
//  launch(HelloWorldApplication::class.java,*args)
//}
