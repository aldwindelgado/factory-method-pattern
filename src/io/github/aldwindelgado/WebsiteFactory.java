package io.github.aldwindelgado;

import io.github.aldwindelgado.website.Blog;
import io.github.aldwindelgado.website.Shop;
import io.github.aldwindelgado.website.Website;
import io.github.aldwindelgado.website.WebsiteType;

/**
 * @author Aldwin Delgado on Apr 10, 2020
 */
public class WebsiteFactory {

    public static Website getWebsite(WebsiteType websiteType) {
        System.out.println("Getting pages for: " + websiteType);
        switch (websiteType) {
            case SHOP:
                return new Shop();
            case BLOG:
                return new Blog();
            default:
                return null;
        }
    }
}
