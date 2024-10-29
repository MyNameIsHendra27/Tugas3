# FootballApp

FootballApp adalah aplikasi sederhana yang memodelkan sebuah tim sepak bola, terdiri dari beberapa pemain dengan atribut name dan goals. Aplikasi ini menghitung total gol dari semua pemain dalam tim dan menampilkan informasi pemain.

## Struktur Kelas

### PlayerInfo
- Menyimpan informasi pemain berupa name dan goals.
- *Atribut:*
    - String name - Nama pemain.
    - int goals - Jumlah gol yang dicetak oleh pemain.
- *Metode:*
    - getName() - Mengembalikan nama pemain.
    - getGoals() - Mengembalikan jumlah gol.

### Player
- Menyimpan objek PlayerInfo dan menyediakan metode untuk mendapatkan informasi pemain.
- *Atribut:*
    - PlayerInfo playerInfo - Objek informasi pemain.
- *Metode:*
    - getName() - Mengembalikan nama pemain.
    - getGoals() - Mengembalikan jumlah gol.
    - displayPlayerInfo() - Menampilkan informasi pemain.

### Team
- Menyimpan nama tim dan array players yang berisi pemain dalam tim.
- *Atribut:*
    - String teamName - Nama tim.
    - Player[] players - Array pemain.
- *Metode:*
    - displayTeamInfo() - Menampilkan informasi tim dan setiap pemain.
    - displayPlayer(Player player) - Metode pribadi untuk menampilkan info pemain tertentu.

### FootballApp (Main Class)
- *Metode:*
    - main(String[] args) - Metode utama untuk menjalankan aplikasi.

## Cara Menjalankan Aplikasi

1. Clone repository ini.
2. Buka proyek di IntelliJ IDEA.
3. Jalankan aplikasi melalui kelas FootballApp.

## Contoh Output

```plaintext
Team: Dream Team
Lionel Messi: 30
Cristiano Ronaldo: 28
Neymar Jr: 25
Total Goals: 83