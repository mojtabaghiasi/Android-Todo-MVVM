package com.mojtaba.todo.data.models

import androidx.compose.ui.graphics.Color
import com.mojtaba.todo.ui.theme.highPriorityColor
import com.mojtaba.todo.ui.theme.lowPriorityColor
import com.mojtaba.todo.ui.theme.mediumPriorityColor
import com.mojtaba.todo.ui.theme.nonePriorityColor

enum class Priority(val color: Color) {
    HIGH(highPriorityColor),
    MEDIUM(mediumPriorityColor),
    LOW(lowPriorityColor),
    NONE(nonePriorityColor)
}