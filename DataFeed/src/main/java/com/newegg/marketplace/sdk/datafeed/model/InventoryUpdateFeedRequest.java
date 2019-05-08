//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.07 at 09:00:14 AM CST 
//


package com.newegg.marketplace.sdk.datafeed.model;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 *         &lt;element name="MessageType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Message">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Inventory">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Item" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="WarehouseLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FulfillmentOption" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="Seller"/>
 *                                             &lt;enumeration value="Newegg"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="Inventory" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
public class InventoryUpdateFeedRequest {

    @XmlElement(name = "Header", required = true)
    protected InventoryUpdateFeedRequest.Header header=new InventoryUpdateFeedRequest.Header();
    @XmlElement(name = "MessageType", required = true)
    protected String messageType="Inventory";
    @XmlElement(name = "Message", required = true)
    protected InventoryUpdateFeedRequest.Message message;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryUpdateFeedRequest.Header }
     *     
     */
    public InventoryUpdateFeedRequest.Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryUpdateFeedRequest.Header }
     *     
     */
    public void setHeader(InventoryUpdateFeedRequest.Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
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
     *     {@link InventoryUpdateFeedRequest.Message }
     *     
     */
    public InventoryUpdateFeedRequest.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryUpdateFeedRequest.Message }
     *     
     */
    public void setMessage(InventoryUpdateFeedRequest.Message value) {
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
        protected BigDecimal documentVersion=new BigDecimal("2.0");

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
     *         &lt;element name="Inventory">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Item" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="WarehouseLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FulfillmentOption" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="Seller"/>
     *                                   &lt;enumeration value="Newegg"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="Inventory" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
        "inventory"
    })
    public static class Message {

        @XmlElement(name = "Inventory", required = true)
        protected InventoryUpdateFeedRequest.Message.Inventory inventory;

        /**
         * Gets the value of the inventory property.
         * 
         * @return
         *     possible object is
         *     {@link InventoryUpdateFeedRequest.Message.Inventory }
         *     
         */
        public InventoryUpdateFeedRequest.Message.Inventory getInventory() {
            return inventory;
        }

        /**
         * Sets the value of the inventory property.
         * 
         * @param value
         *     allowed object is
         *     {@link InventoryUpdateFeedRequest.Message.Inventory }
         *     
         */
        public void setInventory(InventoryUpdateFeedRequest.Message.Inventory value) {
            this.inventory = value;
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
         *                   &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="WarehouseLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FulfillmentOption" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="Seller"/>
         *                         &lt;enumeration value="Newegg"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="Inventory" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
        public static class Inventory {

            @XmlElement(name = "Item", required = true)
            protected List<InventoryUpdateFeedRequest.Message.Inventory.Item> item;

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
             * {@link InventoryUpdateFeedRequest.Message.Inventory.Item }
             * 
             * 
             */
            public List<InventoryUpdateFeedRequest.Message.Inventory.Item> getItem() {
                if (item == null) {
                    item = new ArrayList<InventoryUpdateFeedRequest.Message.Inventory.Item>();
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
             *         &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="WarehouseLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FulfillmentOption" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value="Seller"/>
             *               &lt;enumeration value="Newegg"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="Inventory" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
                "warehouseLocation",
                "fulfillmentOption",
                "inventory"
            })
            public static class Item {

                @XmlElement(name = "SellerPartNumber", required = true)
                protected String sellerPartNumber;
                @XmlElement(name = "NeweggItemNumber")
                protected String neweggItemNumber;
                @XmlElement(name = "WarehouseLocation", required = true)
                protected String warehouseLocation;
                @XmlElement(name = "FulfillmentOption", defaultValue = "Seller")
                protected String fulfillmentOption;
                @XmlElement(name = "Inventory", required = true)
                protected BigInteger inventory;

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
                 * Gets the value of the warehouseLocation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getWarehouseLocation() {
                    return warehouseLocation;
                }

                /**
                 * Sets the value of the warehouseLocation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setWarehouseLocation(String value) {
                    this.warehouseLocation = value;
                }

                /**
                 * Gets the value of the fulfillmentOption property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFulfillmentOption() {
                    return fulfillmentOption;
                }

                /**
                 * Sets the value of the fulfillmentOption property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFulfillmentOption(String value) {
                    this.fulfillmentOption = value;
                }

                /**
                 * Gets the value of the inventory property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getInventory() {
                    return inventory;
                }

                /**
                 * Sets the value of the inventory property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setInventory(BigInteger value) {
                    this.inventory = value;
                }

            }

        }

    }

}
