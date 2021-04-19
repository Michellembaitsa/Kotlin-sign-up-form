fun main(){
    createAccount()
}
fun createAccount(){
    println("Enter your Username")
    var userName=readLine()
    println("Enter your email address")
    var mailAddress= readLine()
    println("Enter your Password")
    var password=readLine()!!
    var pass=password.toLowerCase()
    if (password.length<=8){
        println("Password should be more than 8 characters!")
    }
    else{
        println("Account successfully created.")
    }
}

