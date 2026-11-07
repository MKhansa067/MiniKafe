# MiniKafe (Kopi dan Nyemil) - Mobile App

Aplikasi antarmuka pemesanan makanan dan minuman kafe modern berbasis web/mobile, diimplementasikan dari wireframe alur 8 layar tanpa database eksternal (menggunakan data statis / dummy data).

---

## 📱 Daftar Halaman & Fitur Aplikasi

Sesuai spesifikasi wireframe, aplikasi mencakup 8 tampilan layar utama:

1. **1. Splash / Welcome (`Splash & Welcome`)**
   - Tampilan pembuka dengan branding **Kopi dan Nyemil (MiniKafe)**.
   - Tagline: *"Get a taste of your wish"*.
   - Tombol interaktif **"Start now"** untuk mengarahkan pengguna ke alur registrasi/login.

2. **2. Sign Up Hub (`Sign Up Hub`)**
   - Halaman gerbang keanggotaan MiniKafe.
   - Teks panduan: *"Join as a member & experience more fun from various meal at mesen_gube marketing app"*.
   - Pilihan navigasi cepat: tombol **Register** dan tombol **Login**.

3. **3. Login User (`Login User`)**
   - Form autentikasi bagi pengguna terdaftar.
   - Input fields: `username` dan `password` (dengan toggle intip sandi).
   - Fitur pelengkap: opsi *Ingat saya*, tombol bantuan *Lupa password*, dan tombol aksi utama **Login**.

4. **4. Register (`Register`)**
   - Form pendaftaran akun anggota baru.
   - Input fields terstruktur: `nama lengkap`, `username`, dan `password`.
   - Checkbox persetujuan syarat & ketentuan serta banner selamat datang.
   - Tombol aksi **Register** menuju halaman utama.

5. **Home / Daftar Menu (`Home Menu`)**
   - Header sapaan personal: *"Halo Nama, mau ngopi apa hari ini?"*.
   - Kategori filter: *Semua*, *Kopi*, *Makanan*, *Minuman*.
   - **Menampilkan lebih dari 5 item menu lezat (dummy data)**:
     1. **Cappuccino** — *Espresso, susu steam, foam tebal & taburan kakao* (Rp 22.000)
     2. **Matcha Latte** — *Matcha Jepang otentik, susu segar* (Rp 27.000)
     3. **Kafe-Latte** — *Double espresso, foam susu lembut & latte art* (Rp 25.000)
     4. **Donat Cokelat** — *Donat empuk, glaze cokelat lumer* (Rp 12.000)
     5. **Sourdough Loaf** — *Roti fermentasi alami, renyah di luar* (Rp 35.000)
   - Tombol tambah cepat (+) pada tiap kartu menu.
   - Bottom navigation bar: *Home*, *Order*, dan *Profile*.

6. **6. Profile (`Profile Screen`)**
   - Header sapaan *"Halo Nama,"*.
   - Modul pengaturan akun (*Profile Saya* & *Profile Setting*).
   - Input field penggantian `nama`.
   - Tombol **Save** untuk menyimpan preferensi profil pengguna.

7. **7. Alamat Pengiriman / Order (`Alamat Pengiriman`)**
   - Header *"Alamat"* dan ringkasan pesanan.
   - Form kelengkapan data pengiriman:
     - `Nama Lengkap` (nama penerima)
     - `Alamat` (jalan, RT/RW, nomor rumah)
     - `Patokan atau detail lengkap` (catatan kurir)
   - Tombol aksi pemesanan: **"Order dan Kirim"**.

8. **8. Konfirmasi Pesanan (`Konfirmasi Pesanan`)**
   - Header sapaan *"Halo Nama,"*.
   - Badge status sukses berukuran besar dengan lambang **OK** / centang hijau segar.
   - Pesan kepuasan pelanggan: *"Terima kasih sudah memesan, tunggu aja sebentar kurir kami segera mengantarkan pesananmu!"*.
   - Kartu estimasi waktu antar (15–25 Menit).
   - Tombol **"Oke"** untuk menyelesaikan alur dan kembali ke menu utama.

---

## 🎨 Desain & UI/UX

- **Konsep:** *Warm Artisanal Coffee & Bakery*.
- **Warna Utama:** Roasted espresso brown (`#1F1610`, `#2B1D12`), Warm amber caramel (`#C87D32`), Creamy beige surface (`#FBF9F5`), serta Fresh mint green (`#10B981`) untuk status sukses.
- **Tipografi:** Plus Jakarta Sans & Inter yang modern, bersih, dan mudah dibaca pada perangkat mobile.
- **Komponen:** Menggunakan Card berbayang lembut (*soft elevation*), rounded pill buttons, serta Bottom Navigation Bar yang ergonomis untuk navigasi satu tangan.

---

## 🛠️ Teknologi yang Digunakan

- **HTML5:** Struktur semantik untuk aplikasi mobile.
- **CSS3 / Tailwind CSS:** Utility-first styling untuk tata letak responsif, sistem grid, dan fleksibilitas komponen.
- **JavaScript (Vanilla JS):** Pengelolaan state statis, perpindahan alur, dan interaktivitas dummy data tanpa database backend.
- **Google Material Symbols / Lucide Icons:** Ikonografi konsisten untuk tombol aksi dan navigasi.

---

## 🚀 Cara Menjalankan Aplikasi

Aplikasi ini tidak memerlukan instalasi backend maupun database:

1. **Clone repository ini ke komputer Anda:**
   ```bash
   git clone https://github.com/username/minikafe-app.git
   ```
2. **Masuk ke direktori proyek:**
   ```bash
   cd minikafe-app
   ```
3. **Buka aplikasi:**
   - Cukup buka file `index.html` langsung di browser favorit Anda (Google Chrome, Firefox, Safari, atau Edge), ATAU
   - Gunakan extension **Live Server** di VS Code untuk preview langsung:
     - Klik kanan pada `index.html` -> Pilih *Open with Live Server*.
4. **Mode Tampilan:**
   - Untuk pengalaman terbaik, buka Developer Tools di browser (`F12` atau `Ctrl + Shift + I` / `Cmd + Option + I`) dan aktifkan **Device Toolbar** (pilih ukuran layar ponsel seperti iPhone 14/15 atau Android).

---