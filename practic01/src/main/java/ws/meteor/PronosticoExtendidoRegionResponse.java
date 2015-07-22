
package ws.meteor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pronosticoExtendidoRegionResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "pronosticoExtendidoRegionResult"
})
@XmlRootElement(name = "pronosticoExtendidoRegionResponse")
public class PronosticoExtendidoRegionResponse {

    protected String pronosticoExtendidoRegionResult;

    /**
     * Obtiene el valor de la propiedad pronosticoExtendidoRegionResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPronosticoExtendidoRegionResult() {
        return pronosticoExtendidoRegionResult;
    }

    /**
     * Define el valor de la propiedad pronosticoExtendidoRegionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPronosticoExtendidoRegionResult(String value) {
        this.pronosticoExtendidoRegionResult = value;
    }

}
