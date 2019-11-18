/*
 * XML Type:  room
 * Namespace: http://hotel.com/rooms
 * Java type: com.hotel.rooms.Room
 *
 * Automatically generated - do not modify.
 */
package com.hotel.rooms;


/**
 * An XML room(@http://hotel.com/rooms).
 *
 * This is a complex type.
 */
public interface Room extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Room.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE0EB994A4E4E5EB1DE2B69CC4AF1040A").resolveHandle("roomf5datype");
    
    /**
     * Gets the "numeroCuarto" element
     */
    int getNumeroCuarto();
    
    /**
     * Gets (as xml) the "numeroCuarto" element
     */
    org.apache.xmlbeans.XmlInt xgetNumeroCuarto();
    
    /**
     * Sets the "numeroCuarto" element
     */
    void setNumeroCuarto(int numeroCuarto);
    
    /**
     * Sets (as xml) the "numeroCuarto" element
     */
    void xsetNumeroCuarto(org.apache.xmlbeans.XmlInt numeroCuarto);
    
    /**
     * Gets the "tipoCuarto" element
     */
    java.lang.String getTipoCuarto();
    
    /**
     * Gets (as xml) the "tipoCuarto" element
     */
    org.apache.xmlbeans.XmlString xgetTipoCuarto();
    
    /**
     * Sets the "tipoCuarto" element
     */
    void setTipoCuarto(java.lang.String tipoCuarto);
    
    /**
     * Sets (as xml) the "tipoCuarto" element
     */
    void xsetTipoCuarto(org.apache.xmlbeans.XmlString tipoCuarto);
    
    /**
     * Gets the "precioNoche" element
     */
    double getPrecioNoche();
    
    /**
     * Gets (as xml) the "precioNoche" element
     */
    org.apache.xmlbeans.XmlDouble xgetPrecioNoche();
    
    /**
     * Sets the "precioNoche" element
     */
    void setPrecioNoche(double precioNoche);
    
    /**
     * Sets (as xml) the "precioNoche" element
     */
    void xsetPrecioNoche(org.apache.xmlbeans.XmlDouble precioNoche);
    
    /**
     * Gets the "nombre" element
     */
    java.lang.String getNombre();
    
    /**
     * Gets (as xml) the "nombre" element
     */
    org.apache.xmlbeans.XmlString xgetNombre();
    
    /**
     * Sets the "nombre" element
     */
    void setNombre(java.lang.String nombre);
    
    /**
     * Sets (as xml) the "nombre" element
     */
    void xsetNombre(org.apache.xmlbeans.XmlString nombre);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.hotel.rooms.Room newInstance() {
          return (com.hotel.rooms.Room) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.hotel.rooms.Room newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.hotel.rooms.Room) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.hotel.rooms.Room parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.hotel.rooms.Room) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.hotel.rooms.Room parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.hotel.rooms.Room) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.hotel.rooms.Room parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hotel.rooms.Room) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.hotel.rooms.Room parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hotel.rooms.Room) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.hotel.rooms.Room parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hotel.rooms.Room) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.hotel.rooms.Room parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hotel.rooms.Room) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.hotel.rooms.Room parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hotel.rooms.Room) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.hotel.rooms.Room parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hotel.rooms.Room) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.hotel.rooms.Room parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hotel.rooms.Room) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.hotel.rooms.Room parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hotel.rooms.Room) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.hotel.rooms.Room parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.hotel.rooms.Room) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.hotel.rooms.Room parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.hotel.rooms.Room) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.hotel.rooms.Room parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.hotel.rooms.Room) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.hotel.rooms.Room parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.hotel.rooms.Room) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.hotel.rooms.Room parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.hotel.rooms.Room) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.hotel.rooms.Room parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.hotel.rooms.Room) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
