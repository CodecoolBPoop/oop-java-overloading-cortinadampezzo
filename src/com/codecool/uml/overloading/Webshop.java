package com.codecool.uml.overloading;

import java.time.Instant;
import java.util.Currency;
import java.util.Date;

public class Webshop {

    public static void main(String[] args) {

        Currency eur = Currency.getInstance("EUR");
        Currency usd = Currency.getInstance("USD");

        Product infiniteJest = new Product("Infinite Jest by David Foster Wallace", 24.99f, eur);

        Product theCorrections = new Product("The Corrections by Jonathan Franzen", 19.99f, eur);

        Product kindle = new Product();
        kindle.setName("Kindle");
        kindle.setDefaultPrice(249.99f);
        kindle.setDefaultCurrency(usd);

        Product kindlePaperwhite = new Product();
        kindlePaperwhite.setName("Kindle Paperwhite");
        kindlePaperwhite.setDefaultPrice(299.99f);
        kindlePaperwhite.setDefaultCurrency(usd);

        ProductCategory americanPostmodern = new ProductCategory("American Postmodern Novels", "Books",
                "Novels from the best American authors!");

        ProductCategory ebookReaders = new ProductCategory();
        ebookReaders.setName("E-book-readers");
        ebookReaders.setDepartment("Electronics");
        ebookReaders.setDescription("Must use for reading e-books");

        Supplier bookdepository = new Supplier("Bookdepository", "Dispatched by bookdepository.com");

        Supplier amazon = new Supplier();
        amazon.setName("Amazon");
        amazon.setDescription("Dispatched by amazon.com");

        infiniteJest.setProductCategory(americanPostmodern);
        infiniteJest.setSupplier(bookdepository);

        theCorrections.setProductCategory(americanPostmodern);
        theCorrections.setSupplier(amazon);

        kindle.setProductCategory(ebookReaders);
        kindle.setSupplier(amazon);

        kindlePaperwhite.setProductCategory(ebookReaders);
        kindlePaperwhite.setSupplier(amazon);

        FeaturedProductCategory fpc = new FeaturedProductCategory();
        fpc.setName("Ebook-readers sale!");
        fpc.setDepartment(ebookReaders.getName());
        fpc.setDescription("-30% for all e-book readers!");
        fpc.schedule(Date.from(Instant.now().minusSeconds(360000)),Date.from(Instant.now().plusSeconds(360000)));

        System.out.println(infiniteJest);
        System.out.println(theCorrections);
        System.out.println(kindle);
        System.out.println(kindlePaperwhite + "\n");
        System.out.println(americanPostmodern);
        System.out.println(ebookReaders + "\n");
        System.out.println(bookdepository);
        System.out.println(amazon + "\n");
        System.out.println(americanPostmodern.getProducts());
        System.out.println(ebookReaders.getProducts() + "\n");
        System.out.println(bookdepository.getProducts());
        System.out.println(amazon.getProducts() + "\n");
        System.out.println(fpc);
    }

}
