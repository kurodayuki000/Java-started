## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).





------------------------------------------------------------------------------------------
### java 開発環境
#### JDKのインストール
- https://www.azul.com/downloads/?architecture=arm-64-bit&package=jdk  へアクセス
- インストール場所 =>  /Library/Java/JavaVirtualMachines 


### 実行環境の作成
1. vscode で「Extension Pack for Java」プラグインをインストール
2. 「command + shift  +  P」を押して検索窓に「Create java Project」と入力して実行
3. 続けて「No build tools」を実行
4. ワークスペースの場所を聞いてくるので指定（WorksSpaceなどとする）
5. プロジェクト名が聞かれるので入力

### プログラム実行方法
1. ターミナルでカレントディレクトリまで移動
2. Javaファイルからclassファイルにコンパイルするコマンド
    - javac [ファイル名(拡張子まで記述)]
3. コンパイルされたファイルを実行（.classファイル指定）
    - java [ファイル名(拡張子なし)]

### 型
- ini  => 整数
- double => 小数点数
- char  => 文字


### 変数名をつける時の注意点
 - 半角英数と半角_のみで記述すること
 - 先頭大文字に数字は使用できない  
 - 1文字目は必ず小文字
 - 大文字と小文字は区別されることに注意
 - 予約語（javaの中で特別な意味を持つ単語） は使えない。

### 予約語一覧
 - abstract, boolean, break, byte, case, catch, char, class, const,  
   continue, default, do, double, else, extends, final, finally, float,   
   for, goto, if, implements, import, instanceof, int, interface, long,  
   native, new, package, private, protected, public, return, short,   
   static, strictfp, super, switch, synchronized, this, throw, throws,   
   transient, try, void, volatile, while

## 変数名をつけるときはこのサイトが便利
 - https://codic.jp/engine

## 変数（定数）
 - 初期化された状態からデータを変更することのできない変数のことを定数といいます。  
 変数宣言の際に「final」 用いることで定数として扱えるようになります。  
 ※普通の変数と区別するために変数名（定数）は全て大文字にするのが一般的。大文字で単語を区別する場合はスネークケース（LIST_PRICEなど）  

 ``` 
 final int TAX = 1.08;  
 ```  
 
 - 代入を可能とする通常の変数と一目見て区別できるよう、  
 定数名は半角英数の大文字で記述することが一般的です。  
 全て大文字で書くため大文字区切り(キャメルケース)は使用できません。  
 そのため定数名は必ずアンダーバー区切り(スネークケース)で記述します。  

 ## 変数（型）
  - 型「整数」「少数点数」「文字」「論理値」の4種類に大別されます。

  - 同じ整数を扱う方でも4種類、少数点数を扱う方でも2種類用意されています。これらの違いはデータ容量(箱の大きさ)にあり、扱う値の大きさに応じて適切な形を選ぶことでメモリを節約することができます。
  ただし、現在はメモリに関する技術が飛躍的に向上し、メモリ節約の重要性が下がっているため、扱うデータの大きさにかかわらず整数ならint型、少数点数ならdouble型を 使用するのが一般的になっています。

  - 文字を扱う型は2種類あります。charは大文字/
  小文字区別せずに1文字のみを扱える型であり、Stringは0文字以上の文字列を扱うことのできる型です。

  - booleanは 論理値を扱える型で、格納できるのは  
  true（正しい）/false（正しくない）のどちらかのみです。

| 種類     | データ型 | 扱えるデータ                       |
| :---:    |   :---   |      :---                          |
| 整数     | byte     |  およそ+- 128                      |
| 整数     | short    | およそ+- 3万2千                    |
| 整数     | int      | およそ+- 21億                      |
| 整数     | long     | 900京                              |
| 小数点数 | float    | 少数（doubleよりも厳密さに欠ける） |
| 小数点数 | double   | 少数                               |
| 文字     | char     | 1文字(Unicode文字)                 |
| 文字     | String   | 文字列                             |
| 論理値   | boolean  | trueかfalse                        |


 ## 変数5(リテラル)
 - プログラム中に記述された具体的な値のことをリテラル
と呼びます

 - 整数リテラルは暗黙的にint型として扱われます。

 - 小数点数リテラルは暗黙的にdouble型として扱われます。

 - 文字リテラルはシングルコーテーション囲いだとchar型、 ダブルコーテーション囲いだとString型として扱われます。

 - 数値リテラルはただそれだけではどんな意味をもった数値 か分からずソースコードが難読化してしまうため、極力 変数として名前づけして管理することが望ましいです。 こうした背景から数値リテラルは「マジックナンバー(意 味はわからないがコードは動く、魔法の数字)とも呼ばれ、 プログラミングのアンチパターンとされています。
 
 ## 変数6(エスケープシーケンス)
  - エスケープシーケンス タブや改行といった文字として表現できない情報を表現 したいときや、Javaの仕様においてあらかじめ特殊な意味 づけのされている記号(シングルコーテーションなど)を 文字として表現したいときに、文字の先頭に『 ¥ 』(環境 によって『 』と表記されることもある) を付けます。 こうした特殊な記述の仕方をエスケープシーケンスと呼び、 『 ¥(または ) 』を使用して表現された特殊文字を エスケープ文字と呼びます。

 ## 関係演算子
| 演算子     | 記述例   | 意味                                           |
| :---:      |   :---   |      :---                                      |
| ==         | x == y   | 値が等しければtrue, そうでなければfalse        |
| !=         | x != y   | 値が等しくなければtrue, そうでなければfalse    |
| >          | x > y    | xの値がyより大きければtrue, そうでなければfalse|
| >=         | x >= y   | xの値がy以上であれあtrue, そうでなければfalse  |
| <          | x < y    | xの値がyより小さければtrue, そうでなければfalse|
| <=         | x <= y   | xの値がy以下であれあtrue, そうでなければfalse  |

 ## 論理演算子
| 演算子     | 記述例   | 意味                                                 |
| :---:      |   :---   |      :---                                            |
| &&         | x && y   | どちらもtrueであればtrue、そうでなければfalse        |
| ||         | x || y   | どちらか一方がtrueであればtrue、そうでなければfalse  |
| ^          | x ^ y    | xとyの値が違っていればtrue, そうでなければfalse      |
| !          | !x       | xがtrueならfalse、falseならtrue                      |