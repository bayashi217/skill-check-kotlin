package q006.value;

import java.math.BigDecimal
import java.util.Stack

/**
 * 足し算を行うクラス
 */
class PlusValue: IValue {
    override fun execute(values: Stack<BigDecimal>) {
        // スタックから2つの値を抜き出し、足し算した結果をスタックに積む
        val right = values.pop()
        val left = values.pop()
        values.push(left.add(right))
    }
}
