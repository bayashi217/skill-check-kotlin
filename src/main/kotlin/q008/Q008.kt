package q008;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Q008 埋め込み文字列の抽出
 *
 * 一般に、定数定義の場合を除いて、プログラム中に埋め込み文字列を記述するのは良くないとされています。
 * そのような埋め込み文字列を見つけるために、埋め込み文字列や埋め込み文字（"test"や'a'など）が
 * 記述された行を出力するプログラムを作成してください。
 *
 * - 実行ディレクトリ配下（再帰的にチェック）に存在するすべてのjavaファイルをチェックする
 * - ファイル名はディレクトリ付きでも無しでも良い
 * - 行の内容を出力する際は、先頭のインデントは削除しても残しても良い

[出力イメージ]
Q001.kt(12): return "test";  // テストデータ
Q002.kt(10): private static final DATA = "test"
Q002.kt(11): + "aaa";
Q002.kt(20): if (test == 'x') {
Q004.kt(13): Pattern pattern = Pattern.compile("(\".*\")|(\'.*\')");

 */

/**
 * JavaファイルのStreamを作成する
 *
 * @return
 * @throws IOException
 */
fun listKotlinFiles(): Stream<File> {
    return Files.walk(Paths.get(".")).map(Path::toFile).filter{ f -> f.name.endsWith(".kt") }
}

// 完成までの時間: xx時間 xx分
