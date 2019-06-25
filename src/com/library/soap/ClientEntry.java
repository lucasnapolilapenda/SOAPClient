package com.library.soap;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class ClientEntry {
  public static void main(String[] argv) throws MalformedURLException {

       new ClientRequests ().listAllbooks ();
       new ClientRequests ().getBookInfo ();
      new ClientRequests ().getBookInfoByIsbn ();

    }

  }
    // Please, do not remove this line from file template, here invocation of web service will be inserted
