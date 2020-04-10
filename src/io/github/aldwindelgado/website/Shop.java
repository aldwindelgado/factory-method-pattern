package io.github.aldwindelgado.website;

import io.github.aldwindelgado.page.shop.CartPage;
import io.github.aldwindelgado.page.shop.ItemPage;
import io.github.aldwindelgado.page.shop.SearchPage;

/**
 * @author Aldwin Delgado on Apr 10, 2020
 */
public class Shop extends Website {

    @Override
    public void createWebsite() {
        System.out.println("Creating SHOP pages");

        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
