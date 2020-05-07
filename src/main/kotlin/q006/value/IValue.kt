package q006.value;

import java.math.BigDecimal
import java.util.Stack

/**
 * 値のインタフェース
 */
interface IValue {
    /**
     * 計算を実行する
     *
     * @param values 値の保存されたスタック
     */
    fun execute(values: Stack<BigDecimal>)
}
