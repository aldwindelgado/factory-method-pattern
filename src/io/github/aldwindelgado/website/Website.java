package io.github.aldwindelgado.website;

import io.github.aldwindelgado.page.Page;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Aldwin Delgado on Apr 10, 2020
 */
public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    public Website() {
        System.out.println("Initializing website class!");
        this.createWebsite();
    }

    public List<Page> getPages() {
        return pages;
    }

    public abstract void createWebsite();

}
