package com.library.soap;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.function.Consumer;


public class ClientRequests {

    public LibraryServices libraryServicesCreation () throws MalformedURLException {
        URL wsdlURL = new URL("http://localhost:8080/soap_war/library?wsdl");
        QName qname = new QName("http://soap.lucas.com/", "LibraryServicesService");
        Service service = Service.create(wsdlURL, qname);
        LibraryServices libraryServices = service.getPort(LibraryServices.class);

        return libraryServices;
    }

    public void listAllbooks () throws MalformedURLException {
        LibraryServices rq = libraryServicesCreation ();

        System.out.println ( ":::::: Module List of Books ::::::" );
        System.out.println (rq.listAllBooks () );

    }

    public void getBookInfo () throws MalformedURLException {
        LibraryServices rq = libraryServicesCreation ();
        Scanner sc = new Scanner ( System.in );

        System.out.println ( ":::::: Module Id search ::::::" );
        System.out.println ( "Please enter the id" );
        int response = Integer.valueOf ( sc.nextLine () );
        System.out.println ( rq.getBookInfo ( response ) );

    }

    public void getBookInfoByIsbn () throws MalformedURLException {
        LibraryServices rq = libraryServicesCreation ();
        Scanner sc = new Scanner ( System.in );


        System.out.println ( ":::::: Module ISBN search ::::::" );
        System.out.println ( "Please enter the ISBN" );
        String response = sc.nextLine ( );
        System.out.println ( rq.getBookInfoByISBN ( response ) );

    }

    public void addBook () throws MalformedURLException {
        LibraryServices rq = libraryServicesCreation ();
        Scanner sc = new Scanner ( System.in );
        Book book = new Book ();

        System.out.println ( ":::::: Module Add new Book ::::::" );
        System.out.println ( "Please enter the Id" );
        book.setId (Integer.valueOf (sc.nextLine ()  ) );
        System.out.println ( "Please enter the Isbn" );
        book.setIsbn ( sc.nextLine () );
        System.out.println ( "Please enter the Title" );
        book.setTitle ( sc.nextLine () );
        System.out.println ( "Please enter the Author" );
        book.setAuthor ( sc.nextLine () );
        System.out.println ( "Please enter the Publisher" );
        book.setPublisher ( sc.nextLine () );
        System.out.println ( "Please enter the Description" );
        book.setDescription ( sc.nextLine () );

        System.out.println ( rq.addBook ( book ) );
    }

}
