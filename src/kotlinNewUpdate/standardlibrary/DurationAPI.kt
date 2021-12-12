package kotlinNewUpdate.standardlibrary

import kotlin.time.Duration
import kotlin.time.Duration.Companion.days
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes

fun main() {
    val fortNight = 14.days
    val goneWithTheWind = 3.hours + 57.minutes
    println("A fortNight has ${fortNight.inWholeHours}h.")
    println(fortNight / goneWithTheWind)

    val iso = Duration.parseIsoString("P10DT2H30M")

    iso.toComponents { hours, minutes, seconds ->
        println("ISO Duration: $hours h $minutes m $seconds s")
    }
}