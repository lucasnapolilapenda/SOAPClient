package com.library.soap;


import java.net.MalformedURLException;


public class ClientEntry {
  public static void main(String[] argv) throws MalformedURLException {

       new ClientRequests ().listAllbooks ();
       new ClientRequests ().getBookInfo ();
        new ClientRequests ().getBookInfoByIsbn ();
        new ClientRequests ().addBook ();

    }

  }
    // Please, do not remove this line from file template, here invocation of web service will be inserted
