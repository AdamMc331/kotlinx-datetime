/*
 * Copyright 2019-2022 JetBrains s.r.o.
 * Use of this source code is governed by the Apache 2.0 License that can be found in the LICENSE.txt file.
 */

package kotlinx.datetime

import platform.Foundation.NSCalendar
import platform.Foundation.NSDate
import platform.Foundation.NSDateComponents
import platform.Foundation.NSDateFormatter

/**
 * Operates on a [LocalDateTime] by formatting it into a user friendly string.
 *
 * @param[format] A string defining the output of the expected date. For example,
 * passing MMM dd, yyyy will return "Jan 01, 2000".
 * @param[calendar] The [NSCalendar] used to convert this [LocalDateTime] into an [NSDate].
 */
public fun LocalDateTime.format(
    format: String,
    calendar: NSCalendar,
): String? {
    return this.toNSDateComponents().format(format, calendar)
}

/**
 * Operates on a [LocalDate] by formatting it into a user friendly string.
 *
 * @param[format] A string defining the output of the expected date. For example,
 * passing MMM dd, yyyy will return "Jan 01, 2000".
 * @param[calendar] The [NSCalendar] used to convert this [LocalDate] into an [NSDate].
 */
public fun LocalDate.format(
    format: String,
    calendar: NSCalendar,
): String? {
    return this.toNSDateComponents().format(format, calendar)
}

private fun NSDateComponents.format(
    format: String,
    calendar: NSCalendar,
): String? {
    val nsDate = calendar.dateFromComponents(this)

    val formatter = NSDateFormatter().apply {
        dateFormat = format
    }

    return nsDate?.let { date ->
        formatter.stringFromDate(date)
    }
}
