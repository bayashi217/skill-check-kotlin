package q007

import java.io.ByteArrayInputStream
import java.util.Random
import java.util.Arrays
import kotlin.math.abs

/**
 * 迷路用の InputStream
 */
object MazeInputStream {
    /**
     * 迷路文字列を作成する
     * @return
     */
     fun makeMaze(): ByteArrayInputStream {
        val random = Random()
        val width = random.nextInt(5) + 5
        val height = random.nextInt(5) + 5
        val data = Array(height * 2 + 3) { CharArray(width * 2 + 3) }

        Arrays.fill(data[0], 'X')
        Arrays.fill(data[data.size - 1], 'X')
        for (y in 1 until data.size - 1) {
            data[y][0] = 'X'
            data[y][data[y].size - 1] = 'X'
            Arrays.fill(data[y], 1, data[y].size - 1, ' ')
        }
        val startX = random.nextInt(width + 1) * 2 + 1
        val startY = random.nextInt(height + 1) * 2 + 1
        data[startY][startX] = 'S'
        while (true) {
            val endX = random.nextInt(width + 1) * 2 + 1
            val endY = random.nextInt(height + 1) * 2 + 1
            if (abs(startX - endX) + abs(startY - endY) > 10) {
                data[endY][endX] = 'E'
                break
            }
        }
        for (y in 0 until height) {
            for (x in 0 until width) {
                val xx = x * 2 + 2
                val yy = y * 2 + 2
                data[yy][xx] = 'X'
                when (random.nextInt(4)) {
                    0 -> data[yy - 1][xx] = 'X'
                    1 -> data[yy + 1][xx] = 'X'
                    2 -> data[yy][xx - 1] = 'X'
                    3 -> data[yy][xx + 1] = 'X'
                }
            }
        }
        val result = StringBuilder()
        for (strs in data) {
            result.append(String(strs)).append(System.lineSeparator())
        }
        result.append(System.lineSeparator())
        return result.toString().byteInputStream()
    }
}