
package com.library.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.library.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteBook_QNAME = new QName("http://soap.lucas.com/", "deleteBook");
    private final static QName _GetBookInfoResponse_QNAME = new QName("http://soap.lucas.com/", "getBookInfoResponse");
    private final static QName _DeleteBookResponse_QNAME = new QName("http://soap.lucas.com/", "deleteBookResponse");
    private final static QName _AddBookResponse_QNAME = new QName("http://soap.lucas.com/", "addBookResponse");
    private final static QName _UpdateBookInfo_QNAME = new QName("http://soap.lucas.com/", "updateBookInfo");
    private final static QName _GetBookInfoByISBN_QNAME = new QName("http://soap.lucas.com/", "getBookInfoByISBN");
    private final static QName _ListAllBooksResponse_QNAME = new QName("http://soap.lucas.com/", "listAllBooksResponse");
    private final static QName _GetBookInfoByISBNResponse_QNAME = new QName("http://soap.lucas.com/", "getBookInfoByISBNResponse");
    private final static QName _ListAllBooks_QNAME = new QName("http://soap.lucas.com/", "listAllBooks");
    private final static QName _UpdateBookInfoResponse_QNAME = new QName("http://soap.lucas.com/", "updateBookInfoResponse");
    private final static QName _AddBook_QNAME = new QName("http://soap.lucas.com/", "addBook");
    private final static QName _GetBookInfo_QNAME = new QName("http://soap.lucas.com/", "getBookInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.library.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBookInfoResponse }
     * 
     */
    public GetBookInfoResponse createGetBookInfoResponse() {
        return new GetBookInfoResponse();
    }

    /**
     * Create an instance of {@link DeleteBook }
     * 
     */
    public DeleteBook createDeleteBook() {
        return new DeleteBook();
    }

    /**
     * Create an instance of {@link DeleteBookResponse }
     * 
     */
    public DeleteBookResponse createDeleteBookResponse() {
        return new DeleteBookResponse();
    }

    /**
     * Create an instance of {@link AddBookResponse }
     * 
     */
    public AddBookResponse createAddBookResponse() {
        return new AddBookResponse();
    }

    /**
     * Create an instance of {@link UpdateBookInfo }
     * 
     */
    public UpdateBookInfo createUpdateBookInfo() {
        return new UpdateBookInfo();
    }

    /**
     * Create an instance of {@link GetBookInfoByISBN }
     * 
     */
    public GetBookInfoByISBN createGetBookInfoByISBN() {
        return new GetBookInfoByISBN();
    }

    /**
     * Create an instance of {@link ListAllBooksResponse }
     * 
     */
    public ListAllBooksResponse createListAllBooksResponse() {
        return new ListAllBooksResponse();
    }

    /**
     * Create an instance of {@link UpdateBookInfoResponse }
     * 
     */
    public UpdateBookInfoResponse createUpdateBookInfoResponse() {
        return new UpdateBookInfoResponse();
    }

    /**
     * Create an instance of {@link GetBookInfoByISBNResponse }
     * 
     */
    public GetBookInfoByISBNResponse createGetBookInfoByISBNResponse() {
        return new GetBookInfoByISBNResponse();
    }

    /**
     * Create an instance of {@link ListAllBooks }
     * 
     */
    public ListAllBooks createListAllBooks() {
        return new ListAllBooks();
    }

    /**
     * Create an instance of {@link AddBook }
     * 
     */
    public AddBook createAddBook() {
        return new AddBook();
    }

    /**
     * Create an instance of {@link GetBookInfo }
     * 
     */
    public GetBookInfo createGetBookInfo() {
        return new GetBookInfo();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.lucas.com/", name = "deleteBook")
    public JAXBElement<DeleteBook> createDeleteBook(DeleteBook value) {
        return new JAXBElement<DeleteBook>(_DeleteBook_QNAME, DeleteBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.lucas.com/", name = "getBookInfoResponse")
    public JAXBElement<GetBookInfoResponse> createGetBookInfoResponse(GetBookInfoResponse value) {
        return new JAXBElement<GetBookInfoResponse>(_GetBookInfoResponse_QNAME, GetBookInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.lucas.com/", name = "deleteBookResponse")
    public JAXBElement<DeleteBookResponse> createDeleteBookResponse(DeleteBookResponse value) {
        return new JAXBElement<DeleteBookResponse>(_DeleteBookResponse_QNAME, DeleteBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.lucas.com/", name = "addBookResponse")
    public JAXBElement<AddBookResponse> createAddBookResponse(AddBookResponse value) {
        return new JAXBElement<AddBookResponse>(_AddBookResponse_QNAME, AddBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBookInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.lucas.com/", name = "updateBookInfo")
    public JAXBElement<UpdateBookInfo> createUpdateBookInfo(UpdateBookInfo value) {
        return new JAXBElement<UpdateBookInfo>(_UpdateBookInfo_QNAME, UpdateBookInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookInfoByISBN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.lucas.com/", name = "getBookInfoByISBN")
    public JAXBElement<GetBookInfoByISBN> createGetBookInfoByISBN(GetBookInfoByISBN value) {
        return new JAXBElement<GetBookInfoByISBN>(_GetBookInfoByISBN_QNAME, GetBookInfoByISBN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.lucas.com/", name = "listAllBooksResponse")
    public JAXBElement<ListAllBooksResponse> createListAllBooksResponse(ListAllBooksResponse value) {
        return new JAXBElement<ListAllBooksResponse>(_ListAllBooksResponse_QNAME, ListAllBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookInfoByISBNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.lucas.com/", name = "getBookInfoByISBNResponse")
    public JAXBElement<GetBookInfoByISBNResponse> createGetBookInfoByISBNResponse(GetBookInfoByISBNResponse value) {
        return new JAXBElement<GetBookInfoByISBNResponse>(_GetBookInfoByISBNResponse_QNAME, GetBookInfoByISBNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.lucas.com/", name = "listAllBooks")
    public JAXBElement<ListAllBooks> createListAllBooks(ListAllBooks value) {
        return new JAXBElement<ListAllBooks>(_ListAllBooks_QNAME, ListAllBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBookInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.lucas.com/", name = "updateBookInfoResponse")
    public JAXBElement<UpdateBookInfoResponse> createUpdateBookInfoResponse(UpdateBookInfoResponse value) {
        return new JAXBElement<UpdateBookInfoResponse>(_UpdateBookInfoResponse_QNAME, UpdateBookInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.lucas.com/", name = "addBook")
    public JAXBElement<AddBook> createAddBook(AddBook value) {
        return new JAXBElement<AddBook>(_AddBook_QNAME, AddBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.lucas.com/", name = "getBookInfo")
    public JAXBElement<GetBookInfo> createGetBookInfo(GetBookInfo value) {
        return new JAXBElement<GetBookInfo>(_GetBookInfo_QNAME, GetBookInfo.class, null, value);
    }

}
