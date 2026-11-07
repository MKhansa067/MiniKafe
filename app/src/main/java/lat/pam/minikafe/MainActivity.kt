package lat.pam.minikafe

import android.content.res.ColorStateList
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton
import lat.pam.minikafe.adapter.MenuAdapter
import lat.pam.minikafe.data.DummyRepository
import lat.pam.minikafe.model.MenuItem
import java.text.NumberFormat
import java.util.Locale

class MainActivity : AppCompatActivity() {

    enum class Screen {
        SPLASH,
        SIGNUP_HUB,
        LOGIN,
        REGISTER,
        HOME_MENU,
        PROFILE,
        ORDER_ADDRESS,
        ORDER_CONFIRMATION
    }

    private var currentScreen: Screen = Screen.SPLASH
    private lateinit var contentContainer: android.widget.FrameLayout
    private lateinit var bottomNavView: View

    // Bottom nav views
    private lateinit var navTabHome: View
    private lateinit var navTabOrder: View
    private lateinit var navTabProfile: View
    private lateinit var ivNavHome: ImageView
    private lateinit var tvNavHome: TextView
    private lateinit var ivNavOrder: ImageView
    private lateinit var tvNavOrder: TextView
    private lateinit var ivNavProfile: ImageView
    private lateinit var tvNavProfile: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val mainLayout = findViewById<View>(R.id.main)
        contentContainer = findViewById(R.id.contentContainer)
        bottomNavView = findViewById(R.id.bottomNav)

        ViewCompat.setOnApplyWindowInsetsListener(mainLayout) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        setupBottomNavigation()
        navigateTo(Screen.SPLASH)
    }

    private fun setupBottomNavigation() {
        navTabHome = bottomNavView.findViewById(R.id.navTabHome)
        navTabOrder = bottomNavView.findViewById(R.id.navTabOrder)
        navTabProfile = bottomNavView.findViewById(R.id.navTabProfile)

        ivNavHome = bottomNavView.findViewById(R.id.ivNavHome)
        tvNavHome = bottomNavView.findViewById(R.id.tvNavHome)
        ivNavOrder = bottomNavView.findViewById(R.id.ivNavOrder)
        tvNavOrder = bottomNavView.findViewById(R.id.tvNavOrder)
        ivNavProfile = bottomNavView.findViewById(R.id.ivNavProfile)
        tvNavProfile = bottomNavView.findViewById(R.id.tvNavProfile)

        navTabHome.setOnClickListener { navigateTo(Screen.HOME_MENU) }
        navTabOrder.setOnClickListener { navigateTo(Screen.ORDER_ADDRESS) }
        navTabProfile.setOnClickListener { navigateTo(Screen.PROFILE) }
    }

    private fun updateBottomNavState(selectedTab: Screen) {
        val colorPrimary = ContextCompat.getColor(this, R.color.primary)
        val colorMuted = ContextCompat.getColor(this, R.color.text_muted)

        // Reset
        ivNavHome.imageTintList = ColorStateList.valueOf(colorMuted)
        tvNavHome.setTextColor(colorMuted)
        ivNavOrder.imageTintList = ColorStateList.valueOf(colorMuted)
        tvNavOrder.setTextColor(colorMuted)
        ivNavProfile.imageTintList = ColorStateList.valueOf(colorMuted)
        tvNavProfile.setTextColor(colorMuted)

        when (selectedTab) {
            Screen.HOME_MENU -> {
                ivNavHome.imageTintList = ColorStateList.valueOf(colorPrimary)
                tvNavHome.setTextColor(colorPrimary)
            }
            Screen.ORDER_ADDRESS -> {
                ivNavOrder.imageTintList = ColorStateList.valueOf(colorPrimary)
                tvNavOrder.setTextColor(colorPrimary)
            }
            Screen.PROFILE -> {
                ivNavProfile.imageTintList = ColorStateList.valueOf(colorPrimary)
                tvNavProfile.setTextColor(colorPrimary)
            }
            else -> {}
        }
    }

    fun navigateTo(screen: Screen) {
        currentScreen = screen
        contentContainer.removeAllViews()
        val inflater = LayoutInflater.from(this)

        when (screen) {
            Screen.SPLASH -> {
                bottomNavView.visibility = View.GONE
                val view = inflater.inflate(R.layout.view_splash, contentContainer, false)
                view.findViewById<MaterialButton>(R.id.btnStartNow).setOnClickListener {
                    navigateTo(Screen.SIGNUP_HUB)
                }
                contentContainer.addView(view)
            }

            Screen.SIGNUP_HUB -> {
                bottomNavView.visibility = View.GONE
                val view = inflater.inflate(R.layout.view_signup_hub, contentContainer, false)
                view.findViewById<MaterialButton>(R.id.btnHubRegister).setOnClickListener {
                    navigateTo(Screen.REGISTER)
                }
                view.findViewById<MaterialButton>(R.id.btnHubLogin).setOnClickListener {
                    navigateTo(Screen.LOGIN)
                }
                contentContainer.addView(view)
            }

            Screen.LOGIN -> {
                bottomNavView.visibility = View.GONE
                val view = inflater.inflate(R.layout.view_login, contentContainer, false)
                val etUsername = view.findViewById<EditText>(R.id.etLoginUsername)
                val etPassword = view.findViewById<EditText>(R.id.etLoginPassword)

                etUsername.setText(DummyRepository.currentUser.username)
                etPassword.setText("123456")

                view.findViewById<ImageButton>(R.id.btnLoginBack).setOnClickListener {
                    navigateTo(Screen.SIGNUP_HUB)
                }
                view.findViewById<TextView>(R.id.tvLoginForgot).setOnClickListener {
                    Toast.makeText(this, "Petunjuk reset password telah dikirim ke email!", Toast.LENGTH_SHORT).show()
                }
                view.findViewById<TextView>(R.id.tvLoginGoRegister).setOnClickListener {
                    navigateTo(Screen.REGISTER)
                }
                view.findViewById<MaterialButton>(R.id.btnLoginSubmit).setOnClickListener {
                    val inputUser = etUsername.text.toString().trim()
                    if (inputUser.isNotEmpty()) {
                        DummyRepository.currentUser.username = inputUser
                    }
                    Toast.makeText(this, "Selamat datang kembali, ${DummyRepository.currentUser.fullName.split(" ").first()}!", Toast.LENGTH_SHORT).show()
                    navigateTo(Screen.HOME_MENU)
                }
                contentContainer.addView(view)
            }

            Screen.REGISTER -> {
                bottomNavView.visibility = View.GONE
                val view = inflater.inflate(R.layout.view_register, contentContainer, false)
                val etFullName = view.findViewById<EditText>(R.id.etRegFullName)
                val etUsername = view.findViewById<EditText>(R.id.etRegUsername)
                val etPassword = view.findViewById<EditText>(R.id.etRegPassword)
                val cbTerms = view.findViewById<CheckBox>(R.id.cbRegTerms)

                etFullName.setText(DummyRepository.currentUser.fullName)
                etUsername.setText(DummyRepository.currentUser.username)
                etPassword.setText("123456")

                view.findViewById<ImageButton>(R.id.btnRegBack).setOnClickListener {
                    navigateTo(Screen.SIGNUP_HUB)
                }
                view.findViewById<TextView>(R.id.tvRegGoLogin).setOnClickListener {
                    navigateTo(Screen.LOGIN)
                }
                view.findViewById<MaterialButton>(R.id.btnRegSubmit).setOnClickListener {
                    if (!cbTerms.isChecked) {
                        Toast.makeText(this, "Harap setujui Syarat & Ketentuan terlebih dahulu", Toast.LENGTH_SHORT).show()
                        return@setOnClickListener
                    }
                    val name = etFullName.text.toString().trim()
                    val user = etUsername.text.toString().trim()
                    if (name.isNotEmpty()) DummyRepository.currentUser.fullName = name
                    if (user.isNotEmpty()) DummyRepository.currentUser.username = user

                    Toast.makeText(this, "Pendaftaran berhasil! Selamat bergabung di MiniKafe", Toast.LENGTH_SHORT).show()
                    navigateTo(Screen.HOME_MENU)
                }
                contentContainer.addView(view)
            }

            Screen.HOME_MENU -> {
                bottomNavView.visibility = View.VISIBLE
                updateBottomNavState(Screen.HOME_MENU)
                val view = inflater.inflate(R.layout.view_home_menu, contentContainer, false)

                val firstName = DummyRepository.currentUser.fullName.split(" ").firstOrNull() ?: "Pelanggan"
                view.findViewById<TextView>(R.id.tvHomeGreeting).text = "Halo $firstName,"
                view.findViewById<View>(R.id.btnHomeProfile).setOnClickListener {
                    navigateTo(Screen.PROFILE)
                }

                val rvMenu = view.findViewById<RecyclerView>(R.id.rvHomeMenuList)
                rvMenu.layoutManager = LinearLayoutManager(this)

                val adapter = MenuAdapter(
                    items = DummyRepository.menuList,
                    onItemClick = { item ->
                        selectMenuItemForOrder(item)
                    },
                    onAddClick = { item ->
                        selectMenuItemForOrder(item)
                    }
                )
                rvMenu.adapter = adapter

                // Setup Filter Chips
                val chipAll = view.findViewById<TextView>(R.id.chipAll)
                val chipCoffee = view.findViewById<TextView>(R.id.chipCoffee)
                val chipFood = view.findViewById<TextView>(R.id.chipFood)
                val chipDrinks = view.findViewById<TextView>(R.id.chipDrinks)
                val chips = listOf(chipAll, chipCoffee, chipFood, chipDrinks)

                fun selectChip(selected: TextView, category: String?) {
                    chips.forEach { chip ->
                        if (chip == selected) {
                            chip.setBackgroundResource(R.drawable.bg_chip_selected)
                            chip.setTextColor(ContextCompat.getColor(this, R.color.secondary))
                        } else {
                            chip.setBackgroundResource(R.drawable.bg_chip_normal)
                            chip.setTextColor(ContextCompat.getColor(this, R.color.text_secondary))
                        }
                    }
                    val filtered = if (category == null) {
                        DummyRepository.menuList
                    } else {
                        DummyRepository.menuList.filter { it.category == category }
                    }
                    adapter.updateList(filtered)
                }

                chipAll.setOnClickListener { selectChip(chipAll, null) }
                chipCoffee.setOnClickListener { selectChip(chipCoffee, "Kopi") }
                chipFood.setOnClickListener { selectChip(chipFood, "Makanan") }
                chipDrinks.setOnClickListener { selectChip(chipDrinks, "Minuman") }

                contentContainer.addView(view)
            }

            Screen.PROFILE -> {
                bottomNavView.visibility = View.VISIBLE
                updateBottomNavState(Screen.PROFILE)
                val view = inflater.inflate(R.layout.view_profile, contentContainer, false)

                val user = DummyRepository.currentUser
                val firstName = user.fullName.split(" ").firstOrNull() ?: "Pelanggan"

                view.findViewById<TextView>(R.id.tvProfileGreeting).text = "Halo $firstName,"
                view.findViewById<TextView>(R.id.tvProfileBadgeName).text = user.fullName
                view.findViewById<TextView>(R.id.tvProfileStatus).text = "⭐ Status: ${user.membershipStatus}"

                val etName = view.findViewById<EditText>(R.id.etProfileName)
                val etEmail = view.findViewById<EditText>(R.id.etProfileEmail)
                val etPhone = view.findViewById<EditText>(R.id.etProfilePhone)
                val etCoffee = view.findViewById<EditText>(R.id.etProfileCoffeePref)

                etName.setText(user.fullName)
                etEmail.setText(user.username)
                etPhone.setText(user.phone)
                etCoffee.setText(user.favoriteCoffee)

                view.findViewById<MaterialButton>(R.id.btnProfileSave).setOnClickListener {
                    user.fullName = etName.text.toString().trim()
                    user.username = etEmail.text.toString().trim()
                    user.phone = etPhone.text.toString().trim()
                    user.favoriteCoffee = etCoffee.text.toString().trim()

                    Toast.makeText(this, "Profil berhasil disimpan!", Toast.LENGTH_SHORT).show()
                    navigateTo(Screen.PROFILE)
                }

                view.findViewById<MaterialButton>(R.id.btnProfileLogout).setOnClickListener {
                    Toast.makeText(this, "Berhasil logout", Toast.LENGTH_SHORT).show()
                    navigateTo(Screen.SIGNUP_HUB)
                }

                contentContainer.addView(view)
            }

            Screen.ORDER_ADDRESS -> {
                bottomNavView.visibility = View.VISIBLE
                updateBottomNavState(Screen.ORDER_ADDRESS)
                val view = inflater.inflate(R.layout.view_order_address, contentContainer, false)

                val order = DummyRepository.activeOrder
                val user = DummyRepository.currentUser

                view.findViewById<TextView>(R.id.tvOrderSummaryText).text = order.summaryItems

                val formattedTotal = NumberFormat.getCurrencyInstance(Locale("id", "ID"))
                    .format(order.totalPrice)
                    .replace(",00", "")
                    .replace("Rp", "Rp ")
                view.findViewById<TextView>(R.id.tvOrderTotalPrice).text = formattedTotal

                val etRecipient = view.findViewById<EditText>(R.id.etOrderRecipient)
                val etAddress = view.findViewById<EditText>(R.id.etOrderAddress)
                val etNotes = view.findViewById<EditText>(R.id.etOrderNotes)

                etRecipient.setText(if (order.recipientName.isNotEmpty()) order.recipientName else user.fullName)
                etAddress.setText(order.fullAddress)
                etNotes.setText(order.notes)

                view.findViewById<MaterialButton>(R.id.btnOrderSubmit).setOnClickListener {
                    order.recipientName = etRecipient.text.toString().trim()
                    order.fullAddress = etAddress.text.toString().trim()
                    order.notes = etNotes.text.toString().trim()

                    Toast.makeText(this, "Pesanan berhasil diproses!", Toast.LENGTH_SHORT).show()
                    navigateTo(Screen.ORDER_CONFIRMATION)
                }

                contentContainer.addView(view)
            }

            Screen.ORDER_CONFIRMATION -> {
                bottomNavView.visibility = View.GONE
                val view = inflater.inflate(R.layout.view_order_confirmation, contentContainer, false)

                val firstName = DummyRepository.currentUser.fullName.split(" ").firstOrNull() ?: "Pelanggan"
                val order = DummyRepository.activeOrder

                view.findViewById<TextView>(R.id.tvConfirmGreeting).text = "Halo $firstName,"
                view.findViewById<TextView>(R.id.tvConfirmOrderId).text = order.orderId
                view.findViewById<TextView>(R.id.tvConfirmOrderTime).text = order.orderTime
                view.findViewById<TextView>(R.id.tvConfirmEstimate).text = order.estimatedTime
                view.findViewById<TextView>(R.id.tvConfirmStatusDesc).text = "Status: ${order.status}"

                view.findViewById<MaterialButton>(R.id.btnConfirmDone).setOnClickListener {
                    navigateTo(Screen.HOME_MENU)
                }

                contentContainer.addView(view)
            }
        }
    }

    private fun selectMenuItemForOrder(item: MenuItem) {
        val total = item.price + DummyRepository.activeOrder.deliveryFee
        DummyRepository.activeOrder.summaryItems = "1x ${item.name}"
        DummyRepository.activeOrder.totalPrice = total
        Toast.makeText(this, "${item.name} dipilih! Menuju pengiriman...", Toast.LENGTH_SHORT).show()
        navigateTo(Screen.ORDER_ADDRESS)
    }

    override fun onBackPressed() {
        when (currentScreen) {
            Screen.ORDER_CONFIRMATION -> navigateTo(Screen.HOME_MENU)
            Screen.ORDER_ADDRESS -> navigateTo(Screen.HOME_MENU)
            Screen.PROFILE -> navigateTo(Screen.HOME_MENU)
            Screen.HOME_MENU -> super.onBackPressed()
            Screen.LOGIN, Screen.REGISTER -> navigateTo(Screen.SIGNUP_HUB)
            Screen.SIGNUP_HUB -> navigateTo(Screen.SPLASH)
            Screen.SPLASH -> super.onBackPressed()
        }
    }
}
