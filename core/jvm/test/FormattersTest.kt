/*
 * Copyright 2019-2022 JetBrains s.r.o.
 * Use of this source code is governed by the Apache 2.0 License that can be found in the LICENSE.txt file.
 */

package kotlinx.datetime.test

import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.Month
import kotlinx.datetime.format
import org.junit.Test
import kotlin.test.assertEquals

class FormattersTest {

    @Test
    fun formatLocalDateTime() {
        val localDateTime = LocalDateTime(
            year = 2022,
            month = Month.FEBRUARY,
            dayOfMonth = 22,
            hour = 10,
            minute = 0,
            second = 0,
            nanosecond = 0,
        )

        val formatString = "MMM dd, yyyy HH:mm a"
        val expectedOutput = "Feb 22, 2022 10:00 AM"

        val actualOutput = localDateTime.format(
            format = formatString,
        )
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun formatLocalDate() {
        val localDate = LocalDate(
            year = 2022,
            month = Month.FEBRUARY,
            dayOfMonth = 22,
        )

        val formatString = "MMM dd, yyyy"
        val expectedOutput = "Feb 22, 2022"

        val actualOutput = localDate.format(
            format = formatString,
        )
        assertEquals(expectedOutput, actualOutput)
    }
}