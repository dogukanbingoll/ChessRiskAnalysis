package Satranc.Taslar;

//Genel bir obje sınıfı yaratarak tüm taşları bu objeden extend ediyoruz
//Name:Taşın türünün belirlenmesi için ayırt edici olacaktır
//Color:Seçilen taşın rengine göre hangi hamleleri yapacağını belirlemek için kullanılacaktır
//Currency:Bir taşın sadecetek bir sefer puanının yarılanmasını sağlayacaktır.
public class Obje {
    String name;
    String color;
    int currency;

    public Obje(String name, String color, int currency) {
        this.name = name;
        this.color = color;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCurrency() {
        return currency;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }
}
