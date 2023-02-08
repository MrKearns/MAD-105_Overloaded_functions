

// ---------- BUSINESS CONTACT ----------
fun addContact(business: String, contact: String, phone: String  ): String {

    var confirmation = ("$business\n$contact\n$phone")
    println(confirmation)

    return confirmation


}

// ---------- RESIDENTIAL CONTACT ----------
fun addContact(name: String, phone: String): String {

//    var name = readln().toString()
//
//    var phone = readln().toString()

    var confirmation = ("$name\n$phone")
    println(confirmation)

    return confirmation

}


// ---------- MAIN ----------
fun main(args: Array<String>?) {
    println("Choose type of contact: ")
    println("1: Business")
    println("2: Residential")

    var choice = readln().toInt()

    when (choice){
        1 -> {
            println("Enter buisness name: ")
            var business = readln().toString()
            println("Enter Contact Name: ")
            var contact = readln().toString()
            println("Enter Phone Number: ")
            var phone = readln().toString()

            addContact(business, contact, phone)
        }

        2 -> {
            println("Enter Your Name: ")
            var name = readln().toString()
            println("Enter Phone Number: ")
            var phone = readln().toString()
            addContact(name, phone)
        }

        else -> {
            println("Invalid Choice")
            main(null)
        }
    }

}