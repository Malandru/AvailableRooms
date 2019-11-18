/*
 * XML Type:  room
 * Namespace: http://hotel.com/rooms
 * Java type: com.hotel.rooms.Room
 *
 * Automatically generated - do not modify.
 */
package com.hotel.rooms.impl;
/**
 * An XML room(@http://hotel.com/rooms).
 *
 * This is a complex type.
 */
public class RoomImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.hotel.rooms.Room
{
    
    public RoomImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMEROCUARTO$0 = 
        new javax.xml.namespace.QName("", "numeroCuarto");
    private static final javax.xml.namespace.QName TIPOCUARTO$2 = 
        new javax.xml.namespace.QName("", "tipoCuarto");
    private static final javax.xml.namespace.QName PRECIONOCHE$4 = 
        new javax.xml.namespace.QName("", "precioNoche");
    private static final javax.xml.namespace.QName NOMBRE$6 = 
        new javax.xml.namespace.QName("", "nombre");
    
    
    /**
     * Gets the "numeroCuarto" element
     */
    public int getNumeroCuarto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROCUARTO$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "numeroCuarto" element
     */
    public org.apache.xmlbeans.XmlInt xgetNumeroCuarto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMEROCUARTO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "numeroCuarto" element
     */
    public void setNumeroCuarto(int numeroCuarto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROCUARTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMEROCUARTO$0);
            }
            target.setIntValue(numeroCuarto);
        }
    }
    
    /**
     * Sets (as xml) the "numeroCuarto" element
     */
    public void xsetNumeroCuarto(org.apache.xmlbeans.XmlInt numeroCuarto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMEROCUARTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMEROCUARTO$0);
            }
            target.set(numeroCuarto);
        }
    }
    
    /**
     * Gets the "tipoCuarto" element
     */
    public java.lang.String getTipoCuarto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOCUARTO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tipoCuarto" element
     */
    public org.apache.xmlbeans.XmlString xgetTipoCuarto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPOCUARTO$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "tipoCuarto" element
     */
    public void setTipoCuarto(java.lang.String tipoCuarto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOCUARTO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPOCUARTO$2);
            }
            target.setStringValue(tipoCuarto);
        }
    }
    
    /**
     * Sets (as xml) the "tipoCuarto" element
     */
    public void xsetTipoCuarto(org.apache.xmlbeans.XmlString tipoCuarto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPOCUARTO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPOCUARTO$2);
            }
            target.set(tipoCuarto);
        }
    }
    
    /**
     * Gets the "precioNoche" element
     */
    public double getPrecioNoche()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECIONOCHE$4, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "precioNoche" element
     */
    public org.apache.xmlbeans.XmlDouble xgetPrecioNoche()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(PRECIONOCHE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "precioNoche" element
     */
    public void setPrecioNoche(double precioNoche)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECIONOCHE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRECIONOCHE$4);
            }
            target.setDoubleValue(precioNoche);
        }
    }
    
    /**
     * Sets (as xml) the "precioNoche" element
     */
    public void xsetPrecioNoche(org.apache.xmlbeans.XmlDouble precioNoche)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(PRECIONOCHE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(PRECIONOCHE$4);
            }
            target.set(precioNoche);
        }
    }
    
    /**
     * Gets the "nombre" element
     */
    public java.lang.String getNombre()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nombre" element
     */
    public org.apache.xmlbeans.XmlString xgetNombre()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "nombre" element
     */
    public void setNombre(java.lang.String nombre)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBRE$6);
            }
            target.setStringValue(nombre);
        }
    }
    
    /**
     * Sets (as xml) the "nombre" element
     */
    public void xsetNombre(org.apache.xmlbeans.XmlString nombre)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBRE$6);
            }
            target.set(nombre);
        }
    }
}
