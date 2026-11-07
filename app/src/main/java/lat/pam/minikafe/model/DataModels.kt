package lat.pam.minikafe.model

data class MenuItem(
    val id: String,
    val name: String,
    val description: String,
    val price: Int,
    val category: String,
    val imageResId: Int
)

data class UserProfile(
    var fullName: String,
    var username: String,
    var phone: String,
    var favoriteCoffee: String,
    var membershipStatus: String
)

data class OrderDetails(
    var recipientName: String,
    var fullAddress: String,
    var notes: String,
    var summaryItems: String,
    var totalPrice: Int,
    var deliveryMethod: String,
    var deliveryFee: Int,
    var orderId: String,
    var orderTime: String,
    var estimatedTime: String,
    var status: String
)

