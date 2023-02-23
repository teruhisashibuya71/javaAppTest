よく使うRedisコマンド
```
//サーバー起動
redis-server

//クライアント起動
redis-cli

//監視 tail的な
monitor

//値の登録
set キー名 "値"
set test "hoge"

//値の取得
get キー名

//有効期限をつけて値を登録
setex キー名 時間 "値"

//有効期限の確認
ttl キー名
※有効期限切れの場合は 「-2」 を出力
```