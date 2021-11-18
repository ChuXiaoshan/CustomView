package com.cxsplay.wheelpicker

import android.content.Context
import android.graphics.*
import android.os.Handler
import android.os.Looper
import android.util.AttributeSet
import android.view.VelocityTracker
import android.view.View
import android.widget.Scroller

/**
 * Created by chuxiaoshan on 2021/11/18 16:15
 *
 * Description:
 */
class WheelPicker : View, IDebug, IWheelPicker, Runnable {

    companion object {

        const val SCROLL_STATE_IDLE = 0
        const val SCROLL_STATE_DRAGGING = 1
        const val SCROLL_STATE_SCROLLING = 2

        const val ALIGN_CENTER = 0
        const val ALIGN_LEFT = 1
        const val ALIGN_RIGHT = 2

        val TAG: String = WheelPicker::class.java.simpleName
    }

    private val mHandler = Handler(Looper.getMainLooper())

    private lateinit var mPaint: Paint

    private lateinit var mScroller: Scroller

    private lateinit var mTracker: VelocityTracker

    private var isTouchTriggered: Boolean = false

    private var mOnItemSelectedListener: ((picker: WheelPicker, data: Any, position: Int) -> Unit)? =
        null

    private var mOnWheelChangeListener: OnWheelChangeListener? = null

    private lateinit var mRectDraw: Rect

    private lateinit var mRectIndicatorHead: Rect

    private lateinit var mRectIndicatorFoot: Rect

    private lateinit var mRectCurrentItem: Rect

    private lateinit var mCamera: Camera

    private lateinit var mMatrixRotate: Matrix

    private lateinit var mMatrixDepth: Matrix

    private var mData: List<Any>? = null

    private lateinit var mMaxWithText: String

    private var mVisibleItemCount: Int = 7

    private var mDrawnItemCount: Int = 7

    private var mHalfDrawnItemCount: Int = 7

    private var mTextMaxWidth: Int = 7

    private var mTextMaxHeight: Int = 7

    private var mItemTextColor: Int = 0

    private var mSelectedItemTextColor: Int = 0

    private var mItemTextSize: Int = 0

    private var mIndicatorSize: Int = 0

    private var mIndicatorColor: Int = 0

    private var mCurtainColor: Int = 0

    private var mItemSpace: Int = 0

    private var mItemAlign: Int = 0

    private var mItemHeight: Int = 0

    private var mHalfItemHeight: Int = 0

    private var mHalfWheelHeight: Int = 0

    private var mSelectedItemPosition: Int = 0

    private var mCurrentItemPosition: Int = 0

    private var mMinFlingY: Int = 0

    private var mMaxFlingY: Int = 0

    private var mMinimumVelocity: Int = 50

    private var mMaximumVelocity: Int = 8000

    private var mWheelCenterX: Int = 0

    private var mWheelCenterY: Int = 0

    private var mDrawnCenterX: Int = 0

    private var mDrawnCenterY: Int = 0

    private var mScrollOffsetY: Int = 0

    private var mTextMaxWidthPosition: Int = 0

    private var mLastPointY: Int = 0

    private var mDownPointY: Int = 0

    private var mTouchSlop: Int = 0

    private var hasSameWith: Boolean = true

    private var hasIndicator: Boolean = true

    private var hasCurtain: Boolean = true

    private var hasAtmospheric: Boolean = true

    private var isCyclic: Boolean = true

    private var isCurved: Boolean = true

    private var isClick: Boolean = true

    private var isForceFinishScroll: Boolean = true

    private lateinit var fontPath: String

    private var isDebug: Boolean = true

    constructor(context: Context) : super(context) {
        WheelPicker(context, null)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        val a = context.obtainStyledAttributes(attrs, R.styleable.ActionBar)//todo
//        val idData = a.getResourceId(R.styleable.)
//        mData = resources.getStringArray()
    }

    override fun setDebug(isDebug: Boolean) {
    }

    override fun getVisibleItemCount(): Int {
    }

    override fun setVisibleItemCount() {
    }

    override fun isCyclic(): Boolean {
    }

    override fun setCyclic(isCyclic: Boolean) {
    }

    override fun setOnItemSelectedListener(listener: (picker: WheelPicker, data: Any, position: Int) -> Unit) {
    }

    override fun getSelectedItemPosition(): Int {
    }

    override fun setSelectedItemPosition(position: Int) {
    }

    override fun getCurrentItemPosition(): Int {
    }

    override fun getData(): List<Any> {
    }

    override fun setData(data: List<Any>) {
    }

    override fun setSameWith(hasSameSize: Boolean) {
    }

    override fun hasSameWith(): Boolean {
    }

    override fun setOnWheelChangeListener(listener: OnWheelChangeListener) {
    }

    override fun getMaximumWithText() {
    }

    override fun setMaximumWithText(text: String) {
    }

    override fun getMaximumWithTextPosition() {
    }

    override fun setMaximumWithTextPosition(position: Int) {
    }

    override fun getSelectedItemTextColor(): Int {
    }

    override fun setSelectedItemTextColor(color: Int) {
    }

    override fun getItemTextColor(): Int {
    }

    override fun setItemTextColor(color: Int) {
    }

    override fun getItemTextSize(): Int {
    }

    override fun setItemTextSize(size: Int) {
    }

    override fun getItemSpace(): Int {
    }

    override fun setItemSpace(space: Int) {
    }

    override fun setIndicator(hasIndicator: Boolean) {
    }

    override fun hasIndicator(): Boolean {
    }

    override fun getIndicatorSize(): Int {
    }

    override fun setIndicatorSize(size: Int) {
    }

    override fun getIndicatorColor(): Int {
    }

    override fun setIndicatorColor(color: Int) {
    }

    override fun setCurtain(hasCurtain: Boolean) {
    }

    override fun hasCurtain(): Boolean {
    }

    override fun getCurtainColor(): Int {
    }

    override fun setCurtainColor(color: Int) {
    }

    override fun setAtmospheric(hasAtmospheric: Boolean) {
    }

    override fun hasAtmospheric(): Boolean {
    }

    override fun isCurved(): Boolean {
    }

    override fun setCurved(isCurved: Boolean) {
    }

    override fun getItemAlign(): Int {
    }

    override fun setItemAlign(align: Int) {
    }

    override fun getTypeface(): Typeface {
    }

    override fun setTypeface(tf: Typeface) {
    }

    override fun run() {

    }

    interface OnWheelChangeListener {

        fun onWheelScroll(offset: Int)

        fun onWheelSelected(position: Int)

        fun onWheelScrollStateChanged(state: Int)
    }
}