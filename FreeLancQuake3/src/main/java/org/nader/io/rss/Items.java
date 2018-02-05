//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 11:42:36 AM IRST 
//


package org.nader.io.rss;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="item" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="reg1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="dis1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="reg2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="dis2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="reg3" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="dis3" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="mag" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="dep" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="long" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "item"
})
@XmlRootElement(name = "items")
public class Items {

    @XmlElement(required = true)
    protected List<Items.Item> item;

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
     * {@link Items.Item }
     * 
     * 
     */
    public List<Items.Item> getItem() {
        if (item == null) {
            item = new ArrayList<Items.Item>();
        }
        return this.item;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="reg1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="dis1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="reg2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="dis2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="reg3" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="dis3" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="mag" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="dep" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="long" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "reg1",
        "dis1",
        "reg2",
        "dis2",
        "reg3",
        "dis3",
        "mag",
        "dep",
        "_long",
        "lat",
        "date"
    })
    public static class Item {

        protected int id;
        @XmlElement(required = true)
        protected String reg1;
        protected int dis1;
        @XmlElement(required = true)
        protected String reg2;
        protected int dis2;
        @XmlElement(required = true)
        protected String reg3;
        protected int dis3;
        protected float mag;
        protected int dep;
        @XmlElement(name = "long", required = true)
        protected String _long;
        @XmlElement(required = true)
        protected String lat;
        @XmlElement(required = true)
        protected String date;

        /**
         * Gets the value of the id property.
         * 
         */
        public int getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         */
        public void setId(int value) {
            this.id = value;
        }

        /**
         * Gets the value of the reg1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReg1() {
            return reg1;
        }

        /**
         * Sets the value of the reg1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReg1(String value) {
            this.reg1 = value;
        }

        /**
         * Gets the value of the dis1 property.
         * 
         */
        public int getDis1() {
            return dis1;
        }

        /**
         * Sets the value of the dis1 property.
         * 
         */
        public void setDis1(int value) {
            this.dis1 = value;
        }

        /**
         * Gets the value of the reg2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReg2() {
            return reg2;
        }

        /**
         * Sets the value of the reg2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReg2(String value) {
            this.reg2 = value;
        }

        /**
         * Gets the value of the dis2 property.
         * 
         */
        public int getDis2() {
            return dis2;
        }

        /**
         * Sets the value of the dis2 property.
         * 
         */
        public void setDis2(int value) {
            this.dis2 = value;
        }

        /**
         * Gets the value of the reg3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReg3() {
            return reg3;
        }

        /**
         * Sets the value of the reg3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReg3(String value) {
            this.reg3 = value;
        }

        /**
         * Gets the value of the dis3 property.
         * 
         */
        public int getDis3() {
            return dis3;
        }

        /**
         * Sets the value of the dis3 property.
         * 
         */
        public void setDis3(int value) {
            this.dis3 = value;
        }

        /**
         * Gets the value of the mag property.
         * 
         */
        public float getMag() {
            return mag;
        }

        /**
         * Sets the value of the mag property.
         * 
         */
        public void setMag(float value) {
            this.mag = value;
        }

        /**
         * Gets the value of the dep property.
         * 
         */
        public int getDep() {
            return dep;
        }

        /**
         * Sets the value of the dep property.
         * 
         */
        public void setDep(int value) {
            this.dep = value;
        }

        /**
         * Gets the value of the long property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLong() {
            return _long;
        }

        /**
         * Sets the value of the long property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLong(String value) {
            this._long = value;
        }

        /**
         * Gets the value of the lat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLat() {
            return lat;
        }

        /**
         * Sets the value of the lat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLat(String value) {
            this.lat = value;
        }

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDate(String value) {
            this.date = value;
        }

    }

}
