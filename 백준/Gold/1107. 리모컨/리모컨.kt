fun main() {
    val targetChannel = readLine()!!.toInt()
    val brokenButtonCount = readLine()!!.toInt()
    val brokenButtons = if (brokenButtonCount > 0) readLine()!!.split(" ").map { it.toInt() }.toSet() else emptySet()
    val availableButtons = (0..9).filterNot { it in brokenButtons }

    var minPresses = Math.abs(targetChannel - 100)

    for (channel in 0..999999) {
        val channelStr = channel.toString()
        val canPress = channelStr.all { it.toString().toInt() in availableButtons }

        if (canPress) {
            val presses = channelStr.length + Math.abs(channel - targetChannel)
            minPresses = minOf(minPresses, presses)
        }
    }

    println(minPresses)
}