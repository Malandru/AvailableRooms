/*
 * An XML document type.
 * Localname: response
 * Namespace: http://hotel.com/rooms
 * Java type: com.hotel.rooms.ResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.hotel.rooms.impl;
/**
 * A document containing one response(@http://hotel.com/rooms) element.
 *
 * This is a complex type.
 */
public class ResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.hotel.rooms.ResponseDocument
{
    
    public ResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSE$0 = 
        new javax.xml.namespace.QName("http://hotel.com/rooms", "response");
    
    
    /**
     * Gets the "response" element
     */
    public com.hotel.rooms.ResponseDocument.Response getResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.hotel.rooms.ResponseDocument.Response target = null;
            target = (com.hotel.rooms.ResponseDocument.Response)get_store().find_element_user(RESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "response" element
     */
    public void setResponse(com.hotel.rooms.ResponseDocument.Response response)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.hotel.rooms.ResponseDocument.Response target = null;
            target = (com.hotel.rooms.ResponseDocument.Response)get_store().find_element_user(RESPONSE$0, 0);
            if (target == null)
            {
                target = (com.hotel.rooms.ResponseDocument.Response)get_store().add_element_user(RESPONSE$0);
            }
            target.set(response);
        }
    }
    
    /**
     * Appends and returns a new empty "response" element
     */
    public com.hotel.rooms.ResponseDocument.Response addNewResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.hotel.rooms.ResponseDocument.Response target = null;
            target = (com.hotel.rooms.ResponseDocument.Response)get_store().add_element_user(RESPONSE$0);
            return target;
        }
    }
    /**
     * An XML response(@http://hotel.com/rooms).
     *
     * This is a complex type.
     */
    public static class ResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.hotel.rooms.ResponseDocument.Response
    {
        
        public ResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CUARTO$0 = 
            new javax.xml.namespace.QName("", "cuarto");
        
        
        /**
         * Gets the "cuarto" element
         */
        public com.hotel.rooms.Room getCuarto()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.hotel.rooms.Room target = null;
                target = (com.hotel.rooms.Room)get_store().find_element_user(CUARTO$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "cuarto" element
         */
        public void setCuarto(com.hotel.rooms.Room cuarto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.hotel.rooms.Room target = null;
                target = (com.hotel.rooms.Room)get_store().find_element_user(CUARTO$0, 0);
                if (target == null)
                {
                    target = (com.hotel.rooms.Room)get_store().add_element_user(CUARTO$0);
                }
                target.set(cuarto);
            }
        }
        
        /**
         * Appends and returns a new empty "cuarto" element
         */
        public com.hotel.rooms.Room addNewCuarto()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.hotel.rooms.Room target = null;
                target = (com.hotel.rooms.Room)get_store().add_element_user(CUARTO$0);
                return target;
            }
        }
    }
}
