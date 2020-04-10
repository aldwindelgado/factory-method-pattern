package io.github.aldwindelgado.website;

import io.github.aldwindelgado.page.blog.AboutPage;
import io.github.aldwindelgado.page.blog.CommentPage;
import io.github.aldwindelgado.page.blog.ContactPage;
import io.github.aldwindelgado.page.blog.PostPage;

/**
 * @author Aldwin Delgado on Apr 10, 2020
 */
public class Blog extends Website {

    @Override
    public void createWebsite() {
        System.out.println("Creating BLOG pages");

        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
        pages.add(new PostPage());
    }
}
