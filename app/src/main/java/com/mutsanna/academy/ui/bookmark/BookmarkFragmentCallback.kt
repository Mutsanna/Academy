package com.mutsanna.academy.ui.bookmark

import com.mutsanna.academy.data.source.local.entity.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}
