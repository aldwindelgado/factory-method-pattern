package io.github.aldwindelgado;

import io.github.aldwindelgado.website.Website;
import io.github.aldwindelgado.website.WebsiteType;

public class FactoryMethodPatternDemo {

    public static void main(String[] args) {
        Website shopWebsite = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println("Shop: " + shopWebsite.getPages());

        System.out.println("------------------------------------------------------");
        Website blogWebsite = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println("Blog: " + blogWebsite.getPages());
    }
}
