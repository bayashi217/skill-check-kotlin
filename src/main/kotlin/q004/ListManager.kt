package q004

import java.lang.RuntimeException
import java.util.Random
import kotlin.math.sign

/**
 * リスト管理クラス
 * このクラスを変更してはいけません
 */
class ListManager {
    private val dataList: IntArray
    private var compareCount = 0
    private var exchangeCount = 0

    init {
        // データをランダムに作成する
        val random = Random()
        dataList = IntArray(10) { random.nextInt(10000) }
    }

    fun print() {
        dataList.forEach { println(it) }
    }

    /**
     * 2つのデータを比較する
     *
     * @param index1
     * @param index2
     * @return -1:index1のデータが小さい, 1:index2のデータが小さい, 0:同じデータ
     */
    fun compare(index1: Int, index2: Int): Int {
        compareCount++
        return sign((dataList[index1] - dataList[index2]).toDouble()).toInt()
    }

    /**
     * 2つのデータを入れ替える
     *
     * @param index1
     * @param index2
     */
    fun exchange(index1: Int, index2: Int) {
        exchangeCount++
        val tmp = dataList[index1]
        dataList[index1] = dataList[index2]
        dataList[index2] = tmp
    }

    /**
     * ソートが正しく行われたかをチェックする
     */
    fun checkResult() {
        var data = dataList[0]
        for (i in 1 until dataList.size) {
            if (data > dataList[i]) {
                throw RuntimeException("ソートされていない: [${i -1}]=${data}, [${i}=${dataList[i]}")
            }
            data = dataList[i]
        }
        println("ソートOK: 比較=${compareCount}, 入れ替え=${exchangeCount}")
    }

    /**
     * データのサイズを取得する
     *
     * @return
     */
    val size: Int by lazy {
        return@lazy dataList.size
    }
}