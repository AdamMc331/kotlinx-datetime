/*
 * Copyright 2019-2022 JetBrains s.r.o.
 * Use of this source code is governed by the Apache 2.0 License that can be found in the LICENSE.txt file.
 */

package kotlinx.datetime

import java.time.format.DateTimeFormatter

/**
 * Operates on a [LocalDateTime] by formatting it into a user friendly string.
 *
 * @param[format] A string defining the output of the expected date. For example,
 * passing MMM dd, yyyy will return "Jan 01, 2000".
 */
public fun LocalDateTime.format(
    format: String,
): String? {
    val formatter = DateTimeFormatter.ofPattern(format)
    return this.toJavaLocalDateTime().format(formatter)
}

/**
 * Operates on a [LocalDate] by formatting it into a user friendly string.
 *
 * @param[format] A string defining the output of the expected date. For example,
 * passing MMM dd, yyyy will return "Jan 01, 2000".
 */
public fun LocalDate.format(
    format: String,
): String? {
    val formatter = DateTimeFormatter.ofPattern(format)
    return this.toJavaLocalDate().format(formatter)
}
