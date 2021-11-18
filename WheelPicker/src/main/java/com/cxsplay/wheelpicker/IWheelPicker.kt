package com.cxsplay.wheelpicker

import android.graphics.Typeface

/**
 * Created by chuxiaoshan on 2021/11/18 16:12
 *
 * Description:
 */
interface IWheelPicker {

    fun getVisibleItemCount(): Int

    fun setVisibleItemCount()

    fun isCyclic(): Boolean

    fun setCyclic(isCyclic: Boolean)

    fun setOnItemSelectedListener(listener: (picker: WheelPicker, data: Any, position: Int) -> Unit)

    fun getSelectedItemPosition(): Int

    fun setSelectedItemPosition(position: Int)

    fun getCurrentItemPosition(): Int

    fun getData(): List<Any>

    fun setData(data: List<Any>)

    fun setSameWith(hasSameSize: Boolean)

    fun hasSameWith(): Boolean

    fun setOnWheelChangeListener(listener: WheelPicker.OnWheelChangeListener)

    fun getMaximumWithText()

    fun setMaximumWithText(text: String)

    fun getMaximumWithTextPosition()

    fun setMaximumWithTextPosition(position: Int)

    fun getSelectedItemTextColor(): Int

    fun setSelectedItemTextColor(color: Int)

    fun getItemTextColor(): Int

    fun setItemTextColor(color: Int)

    fun getItemTextSize(): Int

    fun setItemTextSize(size: Int)

    fun getItemSpace(): Int

    fun setItemSpace(space: Int)

    fun setIndicator(hasIndicator: Boolean)

    fun hasIndicator(): Boolean

    fun getIndicatorSize(): Int

    fun setIndicatorSize(size: Int)

    fun getIndicatorColor(): Int

    fun setIndicatorColor(color: Int)

    fun setCurtain(hasCurtain: Boolean)

    fun hasCurtain(): Boolean

    fun getCurtainColor(): Int

    fun setCurtainColor(color: Int)

    fun setAtmospheric(hasAtmospheric: Boolean)

    fun hasAtmospheric(): Boolean

    fun isCurved(): Boolean

    fun setCurved(isCurved: Boolean)

    fun getItemAlign(): Int

    fun setItemAlign(align: Int)

    fun getTypeface(): Typeface

    fun setTypeface(tf: Typeface)
}