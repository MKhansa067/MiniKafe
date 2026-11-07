package lat.pam.minikafe.data

import lat.pam.minikafe.R
import lat.pam.minikafe.model.MenuItem
import lat.pam.minikafe.model.OrderDetails
import lat.pam.minikafe.model.UserProfile

object DummyRepository {

    // 1. Data User Profil
    var currentUser = UserProfile(
        fullName = "Muhamad Khansa Khalifaturohman",
        username = "1247050115@gmail.com",
        phone = "+62 812-3456-7890",
        favoriteCoffee = "Less sweet, oat milk",
        membershipStatus = "Gold Barista"
    )

    // 2. Daftar Menu Kopi dan Nyemil (> 5 item)
    val menuList: List<MenuItem> = listOf(
        MenuItem(
            id = "m1",
            name = "Cappuccino",
            description = "Espresso, susu steam, foam tebal & taburan kakao",
            price = 22000,
            category = "Kopi",
            imageResId = R.drawable.cappuccino
        ),
        MenuItem(
            id = "m2",
            name = "Matcha Latte",
            description = "Matcha Jepang otentik, susu segar",
            price = 27000,
            category = "Minuman",
            imageResId = R.drawable.matcha_latte
        ),
        MenuItem(
            id = "m3",
            name = "Kafe-Latte",
            description = "Double espresso, foam susu lembut & latte art",
            price = 25000,
            category = "Kopi",
            imageResId = R.drawable.coffee_latte
        ),
        MenuItem(
            id = "m4",
            name = "Donat Cokelat",
            description = "Donat empuk, glaze cokelat lumer",
            price = 12000,
            category = "Makanan",
            imageResId = R.drawable.chocolate_donut
        ),
        MenuItem(
            id = "m5",
            name = "Sourdough Loaf",
            description = "Roti fermentasi alami, renyah di luar",
            price = 35000,
            category = "Makanan",
            imageResId = R.drawable.sourdough
        )
    )

    // 3. Data Order Aktif / Terakhir
    var activeOrder = OrderDetails(
        recipientName = currentUser.fullName,
        fullAddress = "Jl. Ace Tabrani No. 42B, RT 02 / RW 02, Bogor",
        notes = "Pagar hitam kayu, seberang minimarket. Titip ke security lobby bila di luar.",
        summaryItems = "1x Kopi Susu Gula Aren & 1x Donat Cokelat",
        totalPrice = 49000,
        deliveryMethod = "Kurir Khusus MiniKafe (Instan)",
        deliveryFee = 8000,
        orderId = "#MK-84920F",
        orderTime = "Hari ini, 09:20",
        estimatedTime = "15 – 20 Menit",
        status = "Diproses (Barista sedang menyeduh kopi & menghangatkan pastry pesananmu)."
    )
}

