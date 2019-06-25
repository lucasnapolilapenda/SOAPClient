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
        System.out.println (rq.listAllBooks () );

    }

    public void getBookInfo () throws MalformedURLException {
        LibraryServices rq = libraryServicesCreation ();
        Scanner sc = new Scanner ( System.in );
        int response = Integer.valueOf ( sc.nextLine () );
        System.out.println ( rq.getBookInfo ( response ) );

    }

    public void getBookInfoByIsbn () throws MalformedURLException {
        LibraryServices rq = libraryServicesCreation ();
        Scanner sc = new Scanner ( System.in );
        String response = sc.nextLine ( );
        System.out.println ( rq.getBookInfoByISBN ( response ) );

    }

    public void addBook () throws MalformedURLException {
        LibraryServices rq = libraryServicesCreation ();
        Scanner sc = new Scanner ( System.in );
        String response = sc.nextLine ( );
        System.out.println ( rq.getBookInfoByISBN ( response ) );

    }

}
