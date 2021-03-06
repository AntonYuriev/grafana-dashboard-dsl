package ru.yoomoney.tech.grafana.dsl.panels

import ru.yoomoney.tech.grafana.dsl.time.Duration

/**
 * Builder for Timerange.
 * @author Aleksey Antufev
 * @since 24.09.2019
 */
class TimerangeBuilder {

    var lastTime: Duration? = null
    var timeShift: Duration? = null
    var hideTimeOverrideInfo: Boolean = false

    fun createTimerange(): Timerange {
        return Timerange(
            lastTime = lastTime,
            timeShift = timeShift,
            hideTimeOverrideInfo = hideTimeOverrideInfo
        )
    }
}
