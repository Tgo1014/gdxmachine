package com.disgraded.gdxmachine.sandbox.source

import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator
import com.disgraded.gdxmachine.core.api.graphics.utils.Color
import com.disgraded.gdxmachine.core.api.resource.AssetPackage
import com.disgraded.gdxmachine.core.api.resource.FontParams

class InitialAssets : AssetPackage("initial") {
    init {
        loadTexture("wall", "wall.png")
        loadTexture("wall_normal", "wall_normal.png")
        loadTexture("player", "texture.png")
        loadTexture("player_normal", "texture_normal.png")
        loadText("desc", "description.txt")
        loadFont("text", "imperfecta.ttf", FontParams().apply {
            size = 24
            color = Color.WHITE
            shadowColor = Color.BLACK
            shadowOffsetX = 1
            shadowOffsetY = 1
        })
    }
}