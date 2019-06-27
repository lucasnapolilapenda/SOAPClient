package com.library.soap;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;


public class ClientRequests {

    public void listAllbooks () throws MalformedURLException {
        LibraryServices rq = libraryServicesCreation ();

        System.out.println ( ":::::: Module List of Books ::::::" );
        System.out.println (rq.listAllBooks () );
        ClientEntry.showMenu ( );
    }

    public void getBookInfo () throws MalformedURLException {
        LibraryServices rq = libraryServicesCreation ();

        int response = idRequest ( false );
        System.out.println ( rq.getBookInfo ( response ) );
        ClientEntry.showMenu ( );
    }

    public void getBookInfoByIsbn () throws MalformedURLException {
        LibraryServices rq = libraryServicesCreation ();
        Scanner sc = new Scanner ( System.in );

        System.out.println ( ":::::: Module ISBN search ::::::" );
        System.out.println ( "Please enter the ISBN" );
        String response = sc.nextLine ( );
        System.out.println ( rq.getBookInfoByISBN ( response ) );
        ClientEntry.showMenu ( );
    }

    public void addBook () throws MalformedURLException {
        LibraryServices rq = libraryServicesCreation ();
        Book book = preparationBook ( false );

        System.out.println ( rq.addBook ( book ) );
        ClientEntry.showMenu ( );
    }

    public void updateBook () throws MalformedURLException {
        LibraryServices rq = libraryServicesCreation ();
        Book book = preparationBook ( true );

        System.out.println ( rq.updateBookInfo ( book ) );
        ClientEntry.showMenu ( );
    }

    public void deleteBook () throws MalformedURLException {
        LibraryServices rq = libraryServicesCreation ();

        int response = idRequest ( true );
        System.out.println ( rq.deleteBook ( response ) );
        ClientEntry.showMenu ( );
    }

    public Book preparationBook (boolean update) {

        Scanner sc = new Scanner ( System.in );
        Book book = new Book ();

        if (update) { System.out.println ( ":::::: Module Update new Book ::::::" ); }
        else { System.out.println ( ":::::: Module Add new Book ::::::" ); }

        System.out.println ( "Please enter the Id - Int Required" );
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

        return book;
    }

    public void displaySelector () throws MalformedURLException {
        Scanner sc = new Scanner (System.in);
        System.out.println ( "Press. 1 + Enter to search by Id or Press. 2 + Enter to search by ISBN - Int Required from 1 to 2 " );
        int option = Integer.valueOf ( sc.nextLine () );


        while (!(option == 1 ||  option ==2)) {
            System.out.println ( "Press. 1 + Enter to search by Id or Press. 2 + Enter to search by ISBN - Int Required from 1 to 2" );
            option = Integer.valueOf ( sc.nextLine () );
        }
        if (option == 1) {
            getBookInfo ();
        }

        else {
            getBookInfoByIsbn ();
        }

    }

    public void help() throws MalformedURLException {
        System.out.println ( "***** Welcome to Solo's Library System Version SOAP *****" );
        System.out.println (    "\n In this System you can search, add and delete books. " +
                "\n Additionally, you can work remotely with SOAP services, you " +
                "\n Thanks for using Lucas Software and enjoy it" );

        System.out.println ( "Please, type any KEY to come back to the Menu" );
        Scanner sc = new Scanner ( System.in );
        sc.next ( );
        ClientEntry.showMenu ( );
    }

    public int idRequest (boolean delete) {
        Scanner sc = new Scanner ( System.in );
        if (delete) {System.out.println ( "::::::  Module Id Delete ::::::" ); }
        else {System.out.println ( ":::::: Module Id Search ::::::" );}

        System.out.println ( "Please enter the id - Int Required " );
        int response = Integer.valueOf ( sc.nextLine () );
        return response;
    }

    public LibraryServices libraryServicesCreation () throws MalformedURLException {
        URL wsdlURL = new URL("http://localhost:8080/soap_war/library?wsdl");
        QName qname = new QName("http://soap.lucas.com/", "LibraryServicesService");
        Service service = Service.create(wsdlURL, qname);
        LibraryServices libraryServices = service.getPort(LibraryServices.class);

        return libraryServices;
    }

}
