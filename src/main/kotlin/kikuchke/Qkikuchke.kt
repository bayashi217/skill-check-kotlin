package kikuchke;

/**
 * トランプを使用するブラックジャックを作ってください。
 *   ブラックジャックのルール
 *      プレイヤーとディーラーの2人対戦。プレイヤーが実行者、ディーラーは自動的に実行する。
 *      山札(ジョーカーを除いた52枚のトランプカード)からカードを引き、カードの合計値が21を超えないように
 *      カードの合計値を21に近づけるゲーム。合計値が21以下、かつ、21に近い方が勝利となる。
 *
 *   ブラックジャックの流れ
 *      1. プレイヤーとディーラーはそれぞれ山札からカードを2枚引く。
 *      2. 引いたカードは画面に表示する。ただし、ディーラーの2枚目のカードは分からないようにする。
 *      3. プレイヤーはカードを引くか選択する。カードを引く場合は、4.へ。カードを引かない場合は、5.へ。
 *      4. プレイヤーは山札からカード1枚引く。プレイヤーの手札の合計値が21を超えた場合は、6.へ。超えない場合は3.へ。
 *      5. ディーラーは、ディーラーの手札の合計値が17以上になるまで山札からカードを引き続ける。
 *      6. プレイヤーとディーラーの手札の合計値を比較。合計値が21以下で、かつ、21に近い方の勝利。
 *      7. ゲームを続行するかを選択する。ゲーム続行の場合は、1.へ。山札は継続して使用する。
 *
 *   条件
 *      - プレイヤーとディーラーの2人対戦。プレイヤーは実行者、ディーラーは自動的に実行する。
 *      - 山札はジョーカーを除いた52枚のトランプカード。カードの重複は無いようものとする。
 *      - カードがなくなった場合は、新しく52枚の重複のないカードを用意してゲームを続行する。
 *      - JとQとKは10として扱う
 *      - Aは1、もしくは、11として扱う。
 *      - それ以外はその数字として扱う。
 *      - ダブルダウンなし、スプリットなし、サレンダーなし、その他特殊なルールなし
 *
 * 完成までの目安: 1時間程度
 [出力例]
 ===== ゲーム開始 =====
 プレイヤーが引いた1枚目のカードはDiaのAです
 プレイヤーが引いた2枚目のカードはDiaのQです

 ディーラーが引いた1枚目のカードはSpadeの4です
 ディーラーが引いた2枚目のカードは分かりません

 カードを引きますか？(Y/N)
 > N

 ディーラーが引いた2枚目のカードはHeartの10でした
 ディーラーがカードを引きました
 ディーラーが引いた3枚目のカードはHeartの7です

 プレイヤーの合計得点は、21です
 ディーラーの合計得点は、21です

 ドローです
 ゲームを続けますか？(Y/N)
 > Y

 (省略)

 プレイヤーが引いた1枚目のカードはHeartの8です
 デッキが無くなりました
 新しいデッキにします
 プレイヤーが引いた2枚目のカードはCloverの10です

 ディーラーが引いた1枚目のカードはHeartの3です
 ディーラーが引いた2枚目のカードは分かりません

 カードを引きますか？(Y/N)
 > N

 ディーラーが引いた2枚目のカードはCloverの9でした
 ディーラーがカードを引きました
 ディーラーが引いた3枚目のカードはHeartのJです
 ディーラーの合計値が21を超えました

 プレイヤーの合計得点は、18です
 ディーラーの合計得点は、22です

 プレイヤーの勝利です
 ゲームを続けますか？(Y/N)
 > N
 ===== ゲーム終了 =====
 */

// 完成までの時間: xx時間 xx分

