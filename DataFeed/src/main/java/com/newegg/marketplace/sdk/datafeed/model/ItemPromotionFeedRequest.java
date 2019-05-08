//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.06 at 04:10:00 PM CST 
//


package com.newegg.marketplace.sdk.datafeed.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

import com.newegg.marketplace.sdk.common.DateAdapter;


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
 *                   &lt;element name="Item" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TabID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PromoMSRP" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;fractionDigits value="2"/>
 *                                   &lt;minInclusive value="0.00"/>
 *                                   &lt;maxInclusive value="99999.00"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="PromoSellingPrice">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;fractionDigits value="2"/>
 *                                   &lt;minInclusive value="0.00"/>
 *                                   &lt;maxInclusive value="99999.00"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="PromoShipping">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="Default"/>
 *                                   &lt;enumeration value="Free"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="PromoStartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="PromoEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="LimitQty" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="MaxQty" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="MinInventory" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="InventoryLocked">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="Yes"/>
 *                                   &lt;enumeration value="No"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
public class ItemPromotionFeedRequest {

    @XmlElement(name = "Header", required = true)
    protected ItemPromotionFeedRequest.Header header=new ItemPromotionFeedRequest.Header();
    @XmlElement(name = "MessageType", required = true)
    protected String messageType="ItemPromotion";
    @XmlElement(name = "Message", required = true)
    protected ItemPromotionFeedRequest.Message message;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link ItemPromotionFeedRequest.Header }
     *     
     */
    public ItemPromotionFeedRequest.Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPromotionFeedRequest.Header }
     *     
     */
    public void setHeader(ItemPromotionFeedRequest.Header value) {
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
     *     {@link ItemPromotionFeedRequest.Message }
     *     
     */
    public ItemPromotionFeedRequest.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPromotionFeedRequest.Message }
     *     
     */
    public void setMessage(ItemPromotionFeedRequest.Message value) {
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
        protected BigDecimal documentVersion=new BigDecimal("1.0");

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
     *         &lt;element name="Item" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TabID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PromoMSRP" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;fractionDigits value="2"/>
     *                         &lt;minInclusive value="0.00"/>
     *                         &lt;maxInclusive value="99999.00"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PromoSellingPrice">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;fractionDigits value="2"/>
     *                         &lt;minInclusive value="0.00"/>
     *                         &lt;maxInclusive value="99999.00"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PromoShipping">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="Default"/>
     *                         &lt;enumeration value="Free"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PromoStartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="PromoEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="LimitQty" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="MaxQty" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="MinInventory" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="InventoryLocked">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="Yes"/>
     *                         &lt;enumeration value="No"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class Message {

        @XmlElement(name = "Item", required = true)
        protected List<ItemPromotionFeedRequest.Message.Item> item;

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
         * {@link ItemPromotionFeedRequest.Message.Item }
         * 
         * 
         */
        public List<ItemPromotionFeedRequest.Message.Item> getItem() {
            if (item == null) {
                item = new ArrayList<ItemPromotionFeedRequest.Message.Item>();
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
         *         &lt;element name="TabID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PromoMSRP" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;fractionDigits value="2"/>
         *               &lt;minInclusive value="0.00"/>
         *               &lt;maxInclusive value="99999.00"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PromoSellingPrice">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;fractionDigits value="2"/>
         *               &lt;minInclusive value="0.00"/>
         *               &lt;maxInclusive value="99999.00"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PromoShipping">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="Default"/>
         *               &lt;enumeration value="Free"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PromoStartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="PromoEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="LimitQty" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="MaxQty" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="MinInventory" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="InventoryLocked">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="Yes"/>
         *               &lt;enumeration value="No"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "tabID",
            "sellerPartNumber",
            "neweggItemNumber",
            "promoMSRP",
            "promoSellingPrice",
            "promoShipping",
            "promoStartDate",
            "promoEndDate",
            "limitQty",
            "maxQty",
            "minInventory",
            "inventoryLocked",
            "note"
        })
        public static class Item {

            @XmlElement(name = "TabID")
            protected String tabID;
            @XmlElement(name = "SellerPartNumber", required = true)
            protected String sellerPartNumber;
            @XmlElement(name = "NeweggItemNumber")
            protected String neweggItemNumber;
            @XmlElement(name = "PromoMSRP")
            protected BigDecimal promoMSRP;
            @XmlElement(name = "PromoSellingPrice", required = true)
            protected BigDecimal promoSellingPrice;
            @XmlElement(name = "PromoShipping", required = true)
            protected String promoShipping;
            @XmlElement(name = "PromoStartDate", required = true)
            //@XmlSchemaType(name = "date")
            @XmlJavaTypeAdapter(DateAdapter.class)
            protected Date promoStartDate;
            @XmlElement(name = "PromoEndDate", required = true)
            //@XmlSchemaType(name = "date")
            @XmlJavaTypeAdapter(DateAdapter.class)
            protected Date promoEndDate;
            @XmlElement(name = "LimitQty")
            protected BigInteger limitQty;
            @XmlElement(name = "MaxQty")
            protected BigInteger maxQty;
            @XmlElement(name = "MinInventory")
            protected BigInteger minInventory;
            @XmlElement(name = "InventoryLocked", required = true)
            protected String inventoryLocked;
            @XmlElement(name = "Note")
            protected String note;

            /**
             * Gets the value of the tabID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTabID() {
                return tabID;
            }

            /**
             * Sets the value of the tabID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTabID(String value) {
                this.tabID = value;
            }

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
             * Gets the value of the promoMSRP property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPromoMSRP() {
                return promoMSRP;
            }

            /**
             * Sets the value of the promoMSRP property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPromoMSRP(BigDecimal value) {
                this.promoMSRP = value;
            }

            /**
             * Gets the value of the promoSellingPrice property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPromoSellingPrice() {
                return promoSellingPrice;
            }

            /**
             * Sets the value of the promoSellingPrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPromoSellingPrice(BigDecimal value) {
                this.promoSellingPrice = value;
            }

            /**
             * Gets the value of the promoShipping property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPromoShipping() {
                return promoShipping;
            }

            /**
             * Sets the value of the promoShipping property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPromoShipping(String value) {
                this.promoShipping = value;
            }

            /**
             * Gets the value of the promoStartDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public Date getPromoStartDate() {
                return promoStartDate;
            }

            /**
             * Sets the value of the promoStartDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setPromoStartDate(Date value) {
                this.promoStartDate = value;
            }

            /**
             * Gets the value of the promoEndDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public Date getPromoEndDate() {
                return promoEndDate;
            }

            /**
             * Sets the value of the promoEndDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setPromoEndDate(Date value) {
                this.promoEndDate = value;
            }

            /**
             * Gets the value of the limitQty property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getLimitQty() {
                return limitQty;
            }

            /**
             * Sets the value of the limitQty property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setLimitQty(BigInteger value) {
                this.limitQty = value;
            }

            /**
             * Gets the value of the maxQty property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMaxQty() {
                return maxQty;
            }

            /**
             * Sets the value of the maxQty property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMaxQty(BigInteger value) {
                this.maxQty = value;
            }

            /**
             * Gets the value of the minInventory property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMinInventory() {
                return minInventory;
            }

            /**
             * Sets the value of the minInventory property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMinInventory(BigInteger value) {
                this.minInventory = value;
            }

            /**
             * Gets the value of the inventoryLocked property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInventoryLocked() {
                return inventoryLocked;
            }

            /**
             * Sets the value of the inventoryLocked property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInventoryLocked(String value) {
                this.inventoryLocked = value;
            }

            /**
             * Gets the value of the note property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNote() {
                return note;
            }

            /**
             * Sets the value of the note property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNote(String value) {
                this.note = value;
            }

        }

    }

}
