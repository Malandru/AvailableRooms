/*
 * An XML document type.
 * Localname: request
 * Namespace: http://hotel.com/rooms
 * Java type: com.hotel.rooms.RequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.hotel.rooms.impl;
/**
 * A document containing one request(@http://hotel.com/rooms) element.
 *
 * This is a complex type.
 */
public class RequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.hotel.rooms.RequestDocument
{
    
    public RequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUEST$0 = 
        new javax.xml.namespace.QName("http://hotel.com/rooms", "request");
    
    
    /**
     * Gets the "request" element
     */
    public com.hotel.rooms.RequestDocument.Request getRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.hotel.rooms.RequestDocument.Request target = null;
            target = (com.hotel.rooms.RequestDocument.Request)get_store().find_element_user(REQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "request" element
     */
    public void setRequest(com.hotel.rooms.RequestDocument.Request request)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.hotel.rooms.RequestDocument.Request target = null;
            target = (com.hotel.rooms.RequestDocument.Request)get_store().find_element_user(REQUEST$0, 0);
            if (target == null)
            {
                target = (com.hotel.rooms.RequestDocument.Request)get_store().add_element_user(REQUEST$0);
            }
            target.set(request);
        }
    }
    
    /**
     * Appends and returns a new empty "request" element
     */
    public com.hotel.rooms.RequestDocument.Request addNewRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.hotel.rooms.RequestDocument.Request target = null;
            target = (com.hotel.rooms.RequestDocument.Request)get_store().add_element_user(REQUEST$0);
            return target;
        }
    }
    /**
     * An XML request(@http://hotel.com/rooms).
     *
     * This is a complex type.
     */
    public static class RequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.hotel.rooms.RequestDocument.Request
    {
        
        public RequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CHECKIN$0 = 
            new javax.xml.namespace.QName("", "checkin");
        private static final javax.xml.namespace.QName CHECKOUT$2 = 
            new javax.xml.namespace.QName("", "checkout");
        
        
        /**
         * Gets the "checkin" element
         */
        public java.util.Calendar getCheckin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHECKIN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "checkin" element
         */
        public org.apache.xmlbeans.XmlDate xgetCheckin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(CHECKIN$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "checkin" element
         */
        public void setCheckin(java.util.Calendar checkin)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHECKIN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHECKIN$0);
                }
                target.setCalendarValue(checkin);
            }
        }
        
        /**
         * Sets (as xml) the "checkin" element
         */
        public void xsetCheckin(org.apache.xmlbeans.XmlDate checkin)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(CHECKIN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(CHECKIN$0);
                }
                target.set(checkin);
            }
        }
        
        /**
         * Gets the "checkout" element
         */
        public java.util.Calendar getCheckout()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHECKOUT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "checkout" element
         */
        public org.apache.xmlbeans.XmlDate xgetCheckout()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(CHECKOUT$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "checkout" element
         */
        public void setCheckout(java.util.Calendar checkout)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHECKOUT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHECKOUT$2);
                }
                target.setCalendarValue(checkout);
            }
        }
        
        /**
         * Sets (as xml) the "checkout" element
         */
        public void xsetCheckout(org.apache.xmlbeans.XmlDate checkout)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(CHECKOUT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(CHECKOUT$2);
                }
                target.set(checkout);
            }
        }
    }
}
