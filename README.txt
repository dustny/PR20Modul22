Tugas 19 Modul 21
Languages and Frameworks
The project uses the following languages and frameworks:

Java 8 as the programming language
JUnit as the test framework
Cucumber for behavior-driven testing
Selenium WebDriver as the web browser automation framework
WebDriverManager as the Selenium binaries management
Author
Ryan	

Dalam Code ini terdapat 3 rangkaian pengujian otomatis yang mencakup 
-Uji Positif
-Uji Negatif
-Uji Batas

Pengujian ini sendiri dilakukan pada website swaglabs dengan Junit sebagai testnya dengan bantuan cucumber library untuk mendukung pengujian Gherkin, dan menggunakan selenium.

Uji Positif
pada pengujian positif ini kita mencoba untuk login pada website https://www.saucedemo.com/ dengan code yang terdapat pada loginpage dan loginstepdef. Disini kita mencoba login dengan valid username beserta password dan setelah itu di cek apakah berhasil login atau tidak ke halaman homepage.

Uji Negatif
Berlawanan dengan uji positif, pada uji negatif ini kita login pada website https://www.saucedemo.com/ dengan code lalu kita menggunakan invalid password dengan tujuan mendapati error code pada website dan tidak masuk ke halaman homepage

Uji Batas
pada pengujian batas ini kita mencoba untuk memasukan ZipCode yang hanya berisikan 5 digit character, yang tertera pada zipStepDef, pada pengujian ini ketika kita memasukan 5 digit zipcode maka kita akan lanjut ke halaman overviewPage sedangkan ketika kita memasukan lebih dari 5 digit maka akan timbul error. tetapi pada pengujian ini website tidak menampilkan error sehingga uji batas ini gagal.