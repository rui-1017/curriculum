・User.java
package study;

/**
* User.java
*/
class User {

   // フィールド変数
   private String userName;
   private int id;
   private String password;

   // コンストラクタ
   public User(String userName, int id, String password) {
       this.userName = userName;
       this.id = id;
       this.password = password;
   }

   // ① 以下のルールに従いアカウント情報（名前、ID、パスワード）を出力するメソッドを作成してください。
   // アクセス修飾子:「protected」
   // メソッド名:「printAccountInfo」
   
   public static void main(String[] args) {
   
   protected String printAccountInfo() {
       System.out.println(userName);
   }
   protected String printAccountInfo() {
       System.out.println(id);
   }
   protected String printAccountInfo() {
       System.out.println(password);
   }
   }
}