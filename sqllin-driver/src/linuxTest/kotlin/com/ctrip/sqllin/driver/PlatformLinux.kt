/*
 * Copyright (C) 2022 Ctrip.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ctrip.sqllin.driver

import kotlinx.cinterop.toKString
import platform.posix.getcwd
import platform.posix.remove

/**
 * Linux platform-related functions
 * @author yaqiao
 */

actual fun getPlatformStringPath(): String =
    getcwd(null, 0)?.toKString() ?: throw IllegalStateException("The temp path created error")

actual fun deleteFile(file: String): Boolean = remove(file) == 0
