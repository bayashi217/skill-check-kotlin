package q006

import q006.value.DecimalValue
import q006.value.IValue
import q006.value.PlusValue
import java.math.BigDecimal
import java.util.*

/**
 * Q006 空気を読んで改修
 *
 * 標準入力から「逆ポーランド記法」で記載された1行の入力を受け取り、その計算結果を出力する処理を実装してください。
 * 実装するのは四則演算（+ - * /）です。
 *
 * https://ja.wikipedia.org/wiki/%E9%80%86%E3%83%9D%E3%83%BC%E3%83%A9%E3%83%B3%E3%83%89%E8%A8%98%E6%B3%95
 *
 * ただし、現状は以下の実装が終わっています。
 * - 逆ポーランド記法を分解して、計算しやすい値リストに変換する処理の一部（Q006.parseLine）
 * - 計算しやすい値として管理するためのクラス群の一部（IValue,DecimalValue,PlusValue）
 *
 * 途中まで終わっている実装を上手く流用しながら、残りの処理を実装してください。
 * エラー入力のチェックは不要です。
 *
 * 実行例：
 *
 * 入力） 3 1.1 0.9 + 2.0 * -
 * 出力） -1
 * （または -1.00 など、小数点に0がついてもよい）
 */

/**
 * 逆ポーランドで記載された1行のテキストを分解する
 * @param lineText 1行テキスト
 * @return 分解された値リスト
 */
fun parseLine(lineText: String): List<IValue> {
    val resultList: MutableList<IValue> = ArrayList()
    // 空白文字で区切ってループする
    lineText.split("[\\s]+".toRegex()).forEach { text ->
        // TODO 一部処理だけ実装
        println("[input] $text")
        when (text) {
            "+" -> resultList.add(PlusValue())
            else -> resultList.add(DecimalValue(text))
        }
    }
    return resultList
}

// 完成までの時間: xx時間 xx分