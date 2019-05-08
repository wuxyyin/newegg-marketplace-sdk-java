//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.06 at 09:55:14 AM CST 
//


package com.newegg.marketplace.sdk.datafeed.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DocumentVersion" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MessageType" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="Message">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Itemfeed" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Item" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="SellerPartNumber">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="40"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NeweggItemNumber" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="40"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="WarningType_ID">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="103"/>
 *                                             &lt;enumeration value="104"/>
 *                                             &lt;enumeration value="105"/>
 *                                             &lt;enumeration value="106"/>
 *                                             &lt;enumeration value="107"/>
 *                                             &lt;enumeration value="108"/>
 *                                             &lt;enumeration value="109"/>
 *                                             &lt;enumeration value="110"/>
 *                                             &lt;enumeration value="111"/>
 *                                             &lt;enumeration value="112"/>
 *                                             &lt;enumeration value="113"/>
 *                                             &lt;enumeration value="114"/>
 *                                             &lt;enumeration value="115"/>
 *                                             &lt;enumeration value="116"/>
 *                                             &lt;enumeration value="117"/>
 *                                             &lt;enumeration value="118"/>
 *                                             &lt;enumeration value="119"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="ChemicalName_Carcinogen" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="600"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="ChemicalName_ReproductiveToxicant" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="600"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="ChemicalName_Both" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="600"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "messageType",
    "message"
})
@XmlRootElement(name = "NeweggEnvelope")
public class ItemCAProp65FeedRequest {

    @XmlElement(name = "Header", required = true)
    protected ItemCAProp65FeedRequest.Header header=new ItemCAProp65FeedRequest.Header();
    @XmlElement(name = "MessageType", required = true)
    protected String messageType="AddingCAProp65";
    @XmlElement(name = "Message", required = true)
    protected ItemCAProp65FeedRequest.Message message;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link ItemCAProp65FeedRequest.Header }
     *     
     */
    public ItemCAProp65FeedRequest.Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemCAProp65FeedRequest.Header }
     *     
     */
    public void setHeader(ItemCAProp65FeedRequest.Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link ItemCAProp65FeedRequest.Message }
     *     
     */
    public ItemCAProp65FeedRequest.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemCAProp65FeedRequest.Message }
     *     
     */
    public void setMessage(ItemCAProp65FeedRequest.Message value) {
        this.message = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DocumentVersion" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "documentVersion"
    })
    public static class Header {

        @XmlElement(name = "DocumentVersion", required = true)
        protected BigDecimal documentVersion= new BigDecimal("4.0");

        /**
         * Gets the value of the documentVersion property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public BigDecimal getDocumentVersion() {
            return documentVersion;
        }

        /**
         * Sets the value of the documentVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDocumentVersion(BigDecimal value) {
            this.documentVersion = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Itemfeed" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Item" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SellerPartNumber">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="40"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="NeweggItemNumber" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="40"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="WarningType_ID">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="103"/>
     *                                   &lt;enumeration value="104"/>
     *                                   &lt;enumeration value="105"/>
     *                                   &lt;enumeration value="106"/>
     *                                   &lt;enumeration value="107"/>
     *                                   &lt;enumeration value="108"/>
     *                                   &lt;enumeration value="109"/>
     *                                   &lt;enumeration value="110"/>
     *                                   &lt;enumeration value="111"/>
     *                                   &lt;enumeration value="112"/>
     *                                   &lt;enumeration value="113"/>
     *                                   &lt;enumeration value="114"/>
     *                                   &lt;enumeration value="115"/>
     *                                   &lt;enumeration value="116"/>
     *                                   &lt;enumeration value="117"/>
     *                                   &lt;enumeration value="118"/>
     *                                   &lt;enumeration value="119"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="ChemicalName_Carcinogen" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="600"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="ChemicalName_ReproductiveToxicant" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="600"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="ChemicalName_Both" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="600"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "itemfeed"
    })
    public static class Message {

        @XmlElement(name = "Itemfeed", required = true)
        protected List<ItemCAProp65FeedRequest.Message.Itemfeed> itemfeed;

        /**
         * Gets the value of the itemfeed property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemfeed property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemfeed().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ItemCAProp65FeedRequest.Message.Itemfeed }
         * 
         * 
         */
        public List<ItemCAProp65FeedRequest.Message.Itemfeed> getItemfeed() {
            if (itemfeed == null) {
                itemfeed = new ArrayList<ItemCAProp65FeedRequest.Message.Itemfeed>();
            }
            return this.itemfeed;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Item" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SellerPartNumber">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="40"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="NeweggItemNumber" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="40"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="WarningType_ID">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="103"/>
         *                         &lt;enumeration value="104"/>
         *                         &lt;enumeration value="105"/>
         *                         &lt;enumeration value="106"/>
         *                         &lt;enumeration value="107"/>
         *                         &lt;enumeration value="108"/>
         *                         &lt;enumeration value="109"/>
         *                         &lt;enumeration value="110"/>
         *                         &lt;enumeration value="111"/>
         *                         &lt;enumeration value="112"/>
         *                         &lt;enumeration value="113"/>
         *                         &lt;enumeration value="114"/>
         *                         &lt;enumeration value="115"/>
         *                         &lt;enumeration value="116"/>
         *                         &lt;enumeration value="117"/>
         *                         &lt;enumeration value="118"/>
         *                         &lt;enumeration value="119"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="ChemicalName_Carcinogen" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="600"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="ChemicalName_ReproductiveToxicant" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="600"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="ChemicalName_Both" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="600"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "item"
        })
        public static class Itemfeed {

            @XmlElement(name = "Item", required = true)
            protected List<ItemCAProp65FeedRequest.Message.Itemfeed.Item> item;

            /**
             * Gets the value of the item property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the item property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ItemCAProp65FeedRequest.Message.Itemfeed.Item }
             * 
             * 
             */
            public List<ItemCAProp65FeedRequest.Message.Itemfeed.Item> getItem() {
                if (item == null) {
                    item = new ArrayList<ItemCAProp65FeedRequest.Message.Itemfeed.Item>();
                }
                return this.item;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="SellerPartNumber">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="40"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="NeweggItemNumber" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="40"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="WarningType_ID">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value="103"/>
             *               &lt;enumeration value="104"/>
             *               &lt;enumeration value="105"/>
             *               &lt;enumeration value="106"/>
             *               &lt;enumeration value="107"/>
             *               &lt;enumeration value="108"/>
             *               &lt;enumeration value="109"/>
             *               &lt;enumeration value="110"/>
             *               &lt;enumeration value="111"/>
             *               &lt;enumeration value="112"/>
             *               &lt;enumeration value="113"/>
             *               &lt;enumeration value="114"/>
             *               &lt;enumeration value="115"/>
             *               &lt;enumeration value="116"/>
             *               &lt;enumeration value="117"/>
             *               &lt;enumeration value="118"/>
             *               &lt;enumeration value="119"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="ChemicalName_Carcinogen" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="600"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="ChemicalName_ReproductiveToxicant" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="600"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="ChemicalName_Both" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="600"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "sellerPartNumber",
                "neweggItemNumber",
                "warningTypeID",
                "chemicalNameCarcinogen",
                "chemicalNameReproductiveToxicant",
                "chemicalNameBoth"
            })
            public static class Item {

                @XmlElement(name = "SellerPartNumber", required = true)
                protected String sellerPartNumber;
                @XmlElement(name = "NeweggItemNumber")
                protected String neweggItemNumber;
                @XmlElement(name = "WarningType_ID", required = true)
                protected String warningTypeID;
                @XmlElement(name = "ChemicalName_Carcinogen")
                protected String chemicalNameCarcinogen;
                @XmlElement(name = "ChemicalName_ReproductiveToxicant")
                protected String chemicalNameReproductiveToxicant;
                @XmlElement(name = "ChemicalName_Both")
                protected String chemicalNameBoth;

                /**
                 * Gets the value of the sellerPartNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSellerPartNumber() {
                    return sellerPartNumber;
                }

                /**
                 * Sets the value of the sellerPartNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSellerPartNumber(String value) {
                    this.sellerPartNumber = value;
                }

                /**
                 * Gets the value of the neweggItemNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNeweggItemNumber() {
                    return neweggItemNumber;
                }

                /**
                 * Sets the value of the neweggItemNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNeweggItemNumber(String value) {
                    this.neweggItemNumber = value;
                }

                /**
                 * Gets the value of the warningTypeID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getWarningTypeID() {
                    return warningTypeID;
                }

                /**
                 * Sets the value of the warningTypeID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setWarningTypeID(String value) {
                    this.warningTypeID = value;
                }

                /**
                 * Gets the value of the chemicalNameCarcinogen property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChemicalNameCarcinogen() {
                    return chemicalNameCarcinogen;
                }

                /**
                 * Sets the value of the chemicalNameCarcinogen property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChemicalNameCarcinogen(String value) {
                    this.chemicalNameCarcinogen = value;
                }

                /**
                 * Gets the value of the chemicalNameReproductiveToxicant property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChemicalNameReproductiveToxicant() {
                    return chemicalNameReproductiveToxicant;
                }

                /**
                 * Sets the value of the chemicalNameReproductiveToxicant property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChemicalNameReproductiveToxicant(String value) {
                    this.chemicalNameReproductiveToxicant = value;
                }

                /**
                 * Gets the value of the chemicalNameBoth property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChemicalNameBoth() {
                    return chemicalNameBoth;
                }

                /**
                 * Sets the value of the chemicalNameBoth property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChemicalNameBoth(String value) {
                    this.chemicalNameBoth = value;
                }

            }

        }

    }

}
