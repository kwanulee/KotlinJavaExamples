package week6

class Account(_id: String?, _balance: Int) {
    var id:String? = _id
        private set

    var balance:Int = _balance
        private set

    constructor() : this(null,0)

    init {
        id = id ?: "0"+System.currentTimeMillis()
        if (balance <0)
            balance = 0
    }

    fun deposit(amount: Int) {
        if (amount > 0) {
            balance += amount
            println("$amount 원 입금되었습니다. 총 잔액: $balance 원")
        }
    }

    fun withdraw(amount: Int) {
        if (amount > 0 && balance >= amount) {
            balance -= amount
            println("$amount 원 출금되었습니다. 총 잔액: $balance 원")
        } else {
            println("잔액이 부족하거나 유효하지 않은 출금액입니다.")
        }
    }
}

fun main() {
    val account = Account(null, 1000)

    // 정보은닉을 통해 직접 접근하지 않고 메서드를 사용하여 입금과 출금을 수행합니다.
    account.deposit(500)
    account.withdraw(200)

    // 정보은닉을 통해 메서드를 사용하여 잔액과 계좌번호를 조회합니다.
    val balance = account.balance
    val accountNumber = account.id

    println("잔액: ${account.balance} 원")
    println("계좌번호: ${account.id}")
}