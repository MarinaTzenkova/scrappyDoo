package rest;

import model.Book;
import model.Item;

import javax.swing.text.Document;
import java.util.ArrayList;
import java.util.List;

/**
 * Crawler for scraping data from a webpage
 * @version 0.1
 */
public class Crawler {
    /**
     * Domain to crawl
     */
    public String domain;

    /**
     * Array of previously visited links
     */
    public ArrayList<String> visitedLinks;

    /**
     * The depth of crawling the crawler reached
     */
    public Integer depth;

    /**
     * Object used to get the data from one web page
     */
    public Scraper scraper;

    /**
     * Get all data from one crawled webpage
     * @return a list of all scraped data
     */
    public List<Item> getAllData() {
        return new ArrayList<>();
    }

    /**
     * Get only certain data from one crawled webpage
     * @param type - type of data
     * @param keyword - filter by which to look for a specific item
     * @return single item of filtered scraped data
     */
    public Item getSpecificData(String type, String keyword) {
        return new Book();
    }
}