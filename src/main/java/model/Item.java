package model;

import java.util.Objects;

/** Abstract class with common properties
 * for the items the scraper generates.
 * Used for parsing the json data, extracted from the website.
 * Contains properties for genre, format and year of item.
 * @version 0.1
 */
public abstract class Item {
    public Item(String genre, String format, int year, String title){
        if(genre == null || format == null || year < 1 || title == null) throw new IllegalArgumentException("Arguments are not correct!");
        this.Genre = genre;
        this.Format = format;
        this.Year = year;
        this.Title = title;
    }
    /**
     * Field containing information about
     * the title of the item.
     */
    public String Title;
    /**
     * Field containing information about
     * the genre of the item.
     */
    public String Genre;
    /**
     * Field containing information about the
     * format of the item.
     */
    public String Format;
    /**
     * Field containing information about
     * the year of creation of the item.
     */
    public int Year;


    protected Item() {
    }

    public String getGenre() {
        return Genre;
    }

    public String getFormat() {
        return Format;
    }

    public int getYear() {
        return Year;
    }

    public String getTitle() {
        return Title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return getYear() == item.getYear() &&
                getGenre().equals(item.getGenre()) &&
                getFormat().equals(item.getFormat()) &&
                getTitle().equals(item.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGenre(), getFormat(), getYear(), getTitle());
    }
}
