package com.library.soap;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class Client {
  public static void main(String[] argv) throws MalformedURLException {
      URL wsdlURL = new URL("http://localhost:8080/soap_war/library?wsdl");
      //check above URL in browser, you should see WSDL file

      //creating QName using targetNamespace and name
      QName qname = new QName("http://soap.lucas.com/", "LibraryServicesService");

      Service service = Service.create(wsdlURL, qname);

      //We need to pass interface and model beans to client
      LibraryServices ps = service.getPort(LibraryServices.class);

      Book p1 = new Book(); p1.setAuthor ("Pankaj"); p1.setId(1); p1.setDescription ("kkllkkjkl"); p1.setIsbn("10"); p1.setPublisher ( "veronica" ); p1.setTitle ( "la mas bella" );
      Book p2 = new Book(); p2.setAuthor ("Pachamama"); p2.setId(2); p2.setDescription ("Berro maS FINO"); p2.setIsbn("11"); p2.setPublisher ( "veronica LA BELLA" ); p2.setTitle ( "la mas HERMPSA" );

      //add Book
      System.out.println("Add Person Status="+ps.addBook (p1));
      System.out.println("Add Person Status="+ps.addBook (p2));
    }

  }
    // Please, do not remove this line from file template, here invocation of web service will be inserted
