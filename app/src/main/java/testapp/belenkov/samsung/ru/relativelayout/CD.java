package testapp.belenkov.samsung.ru.relativelayout;

public class CD {
    private String artist;
    private String price;
    private String country;
    private String genre;

    public CD() {
    }

    public CD(String artist, String price, String country, String genre) {
        this.artist = artist;
        this.price = price;
        this.country = country;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "CD{" +
                "artist='" + artist + '\'' +
                ", price='" + price + '\'' +
                ", country='" + country + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
