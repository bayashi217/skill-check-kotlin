package q006.value;

import java.math.BigDecimal
import java.util.Stack

/**
 * 数値を保持するクラス
 */
class DecimalValue(text: String): IValue {
    /**
     * 保持する値
     */
    private val value: BigDecimal = BigDecimal(text)

    override fun execute(values: Stack<BigDecimal>) {
        // スタックに値を積む
        values.push(value)
    }
}
