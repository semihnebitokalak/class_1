// Bu dersimizde class kavramını öğreneceğiz.
// Nedir, nasıl kullanılır her şeyden bahsedeceğiz ve örnekler ile pekiştireceğiz.
// Java'da bir class (sınıf), nesne tabanlı programlamanın temel yapı taşlarından biridir.
// Sınıflar, bir nesnenin özelliklerini (değişkenler) ve davranışlarını (metotlar) tanımlar.
// Sınıflar, gerçek dünyadaki varlıkları modellemek için kullanılır ve bu varlıkların özelliklerini
// ve eylemlerini kod içinde tanımlamamızı sağlar.
// src klasörümüze girip oradan yeni bir class oluşturalım.
public class Main {
    public static void main(String[] args){
        // Öncelikle CustemerManager sınıfında bir veri oluşturmamız gerekiyor.
        // sınıfı belirttikten sonra adını istediğimiz şeyi koyabiliriz.
        CustomerManager customerManager = new CustomerManager();
        // Bunu oluşturduktan sonra class ile bağlantı oluşturuyoruz ve class ı çağırabiliriz.
        // . uzantısı ile fonksiyonlara ulaşabiliyoruz.
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
    }
}