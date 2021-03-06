package ru.yoomoney.tech.grafana.dsl.panels

import org.json.JSONObject
import ru.yoomoney.tech.grafana.dsl.json.Json
import ru.yoomoney.tech.grafana.dsl.json.jsonObject
import ru.yoomoney.tech.grafana.dsl.time.Duration

/**
 * Time range tab in panel.
 * @author Aleksey Antufev
 * @since 24.09.2019
 */
class Timerange(
    private val lastTime: Duration? = null,
    private val timeShift: Duration? = null,
    private val hideTimeOverrideInfo: Boolean = false
) : Json<JSONObject> {

    override fun toJson() = jsonObject {
        "timeFrom" to lastTime
        "timeShift" to timeShift
        "hideTimeOverride" to hideTimeOverrideInfo
    }
}
