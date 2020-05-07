package q005;

/**
 * 作業時間管理クラス
 * 自由に修正してかまいません
 */
data class WorkData(
    /** 社員番号 */
    val number: String,

    /** 部署 */
    val department: String,

    /** 役職 */
    val position: String,

    /** Pコード */
    val pCode: String,

    /** 作業時間(分) */
    val workTime: Int
)
