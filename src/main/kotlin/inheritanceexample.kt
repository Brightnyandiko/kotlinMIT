open class MobileMoneyAccount(val accountnumber:String, var balance:Double){
    fun deposit(amount:Double){
        balance += amount

    }
    open fun withdraw(amount: Double){

        if (balance >= amount){
            balance -= amount
        }else{
            println("Insufficient balance")
        }
    }
    fun checkbalance():Double{

        return balance

    }

}
class MpesaAccount(accountnumber: String,
    balance: Double,
    val phoneNumber:String
):MobileMoneyAccount(accountnumber,balance){

    fun sendmoney(recipient:MpesaAccount, amount: Double){

        if (balance >= amount){
            balance -= amount
            recipient.deposit(amount)
            println("send $amount KES to ${recipient.phoneNumber}")
        }else{
            println("Insufficient amount")
        }
    }

    override fun withdraw(amount: Double) {
        if (balance >= amount + 10.0){
            balance -= amount +10.0
            println("Withdrew $amount KES(charges 10 KES fee)")
        }else{
            println("Insufficient balance")
        }
    }

}

fun main(args: Array<String>) {
    val bright=MpesaAccount("54321",1000.0,"254742345678")
    val kim=MpesaAccount("54678",700.0,"254786549082")
    bright.sendmoney(kim,200.0)

    println("Bright balance: ${bright.checkbalance()} KES")
    println("Kim balance: ${kim.checkbalance()} KES")

    bright.withdraw(amount = 300.0)
    println("Bright's balance: ${bright.checkbalance()} KES")
}