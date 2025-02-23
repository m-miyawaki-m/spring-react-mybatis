
### Maven のキャッシュをクリア
```console
mvn clean
mvn dependency:purge-local-repository
mvn compile
```

Postman で従業員データを取得するためのリクエストを作成します。以下のエンドポイントを使用し、それぞれ **GET リクエスト** を作成してください。

---

## **1️⃣ 全従業員一覧を取得**
- **メソッド**: `GET`
- **URL**: `http://localhost:8080/employees`
- **説明**: すべての従業員の情報を取得する。

### **Postman 設定**
1. **Postman を開く**
2. **新しいリクエストを作成**
3. **メソッドを `GET` に設定**
4. **URL を `http://localhost:8080/employees` に設定**
5. **`Send` をクリックして送信**

---

## **2️⃣ ID を指定して従業員を取得**
- **メソッド**: `GET`
- **URL**: `http://localhost:8080/employees/{employeeId}`
- **説明**: 特定の従業員の情報を取得する。
- **パラメータ**: `{employeeId}` → 取得したい従業員の ID を指定

### **Postman 設定**
1. **新しいリクエストを作成**
2. **メソッドを `GET` に設定**
3. **URL を `http://localhost:8080/employees/101`（例: ID=101 の場合）**
4. **`Send` をクリックして送信**

---

## **3️⃣ 部署 ID を指定して従業員を取得**
- **メソッド**: `GET`
- **URL**: `http://localhost:8080/employees/department/{departmentId}`
- **説明**: 指定した部署 ID に属する従業員を取得する。
- **パラメータ**: `{departmentId}` → 部署 ID を指定

### **Postman 設定**
1. **新しいリクエストを作成**
2. **メソッドを `GET` に設定**
3. **URL を `http://localhost:8080/employees/department/10`（例: 部署ID=10）**
4. **`Send` をクリックして送信**

---

## **4️⃣ メールアドレスを指定して従業員を検索**
- **メソッド**: `GET`
- **URL**: `http://localhost:8080/employees/email/{email}`
- **説明**: 指定したメールアドレスに対応する従業員を取得する。
- **パラメータ**: `{email}` → 検索したいメールアドレスを指定

### **Postman 設定**
1. **新しいリクエストを作成**
2. **メソッドを `GET` に設定**
3. **URL を `http://localhost:8080/employees/email/john.doe@example.com`（例）**
4. **`Send` をクリックして送信**

---

## **📌 追加の設定**
- **レスポンス形式**: `JSON`
- **ヘッダーに追加（必要に応じて）**
  - `Content-Type: application/json`
  - `Accept: application/json`

---

🚀 **Postman でリクエストを作成し、動作を確認してください！** 🎯