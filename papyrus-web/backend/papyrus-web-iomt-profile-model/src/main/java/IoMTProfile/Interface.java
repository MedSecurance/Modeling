/**
 */
package IoMTProfile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Interface</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IoMTProfile.IoMTProfilePackage#getInterface()
 * @model
 * @generated
 */
public enum Interface implements Enumerator {
	/**
	 * The '<em><b>RFID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFID_VALUE
	 * @generated
	 * @ordered
	 */
	RFID(0, "RFID", "RFID"),

	/**
	 * The '<em><b>BLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLE_VALUE
	 * @generated
	 * @ordered
	 */
	BLE(1, "BLE", "BLE"),

	/**
	 * The '<em><b>Blue Tooth</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUE_TOOTH_VALUE
	 * @generated
	 * @ordered
	 */
	BLUE_TOOTH(2, "BlueTooth", "BlueTooth"),

	/**
	 * The '<em><b>WIFI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIFI_VALUE
	 * @generated
	 * @ordered
	 */
	WIFI(3, "WIFI", "WIFI"),

	/**
	 * The '<em><b>4G</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_4G_VALUE
	 * @generated
	 * @ordered
	 */
	_4G(4, "_4G", "_4G"),

	/**
	 * The '<em><b>Ethernet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETHERNET_VALUE
	 * @generated
	 * @ordered
	 */
	ETHERNET(5, "Ethernet", "Ethernet"),

	/**
	 * The '<em><b>Lo Ra</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LO_RA_VALUE
	 * @generated
	 * @ordered
	 */
	LO_RA(6, "LoRa", "LoRa"),

	/**
	 * The '<em><b>ZWave</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZWAVE_VALUE
	 * @generated
	 * @ordered
	 */
	ZWAVE(7, "ZWave", "ZWave"),

	/**
	 * The '<em><b>Zigbee</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZIGBEE_VALUE
	 * @generated
	 * @ordered
	 */
	ZIGBEE(8, "Zigbee", "Zigbee"),

	/**
	 * The '<em><b>Serial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERIAL_VALUE
	 * @generated
	 * @ordered
	 */
	SERIAL(9, "Serial", "Serial"),

	/**
	 * The '<em><b>Six Lo WPAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIX_LO_WPAN_VALUE
	 * @generated
	 * @ordered
	 */
	SIX_LO_WPAN(10, "SixLoWPAN", "SixLoWPAN");

	/**
	 * The '<em><b>RFID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RFID_VALUE = 0;

	/**
	 * The '<em><b>BLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BLE_VALUE = 1;

	/**
	 * The '<em><b>Blue Tooth</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUE_TOOTH
	 * @model name="BlueTooth"
	 * @generated
	 * @ordered
	 */
	public static final int BLUE_TOOTH_VALUE = 2;

	/**
	 * The '<em><b>WIFI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIFI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WIFI_VALUE = 3;

	/**
	 * The '<em><b>4G</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_4G
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _4G_VALUE = 4;

	/**
	 * The '<em><b>Ethernet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETHERNET
	 * @model name="Ethernet"
	 * @generated
	 * @ordered
	 */
	public static final int ETHERNET_VALUE = 5;

	/**
	 * The '<em><b>Lo Ra</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LO_RA
	 * @model name="LoRa"
	 * @generated
	 * @ordered
	 */
	public static final int LO_RA_VALUE = 6;

	/**
	 * The '<em><b>ZWave</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZWAVE
	 * @model name="ZWave"
	 * @generated
	 * @ordered
	 */
	public static final int ZWAVE_VALUE = 7;

	/**
	 * The '<em><b>Zigbee</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZIGBEE
	 * @model name="Zigbee"
	 * @generated
	 * @ordered
	 */
	public static final int ZIGBEE_VALUE = 8;

	/**
	 * The '<em><b>Serial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERIAL
	 * @model name="Serial"
	 * @generated
	 * @ordered
	 */
	public static final int SERIAL_VALUE = 9;

	/**
	 * The '<em><b>Six Lo WPAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIX_LO_WPAN
	 * @model name="SixLoWPAN"
	 * @generated
	 * @ordered
	 */
	public static final int SIX_LO_WPAN_VALUE = 10;

	/**
	 * An array of all the '<em><b>Interface</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Interface[] VALUES_ARRAY =
		new Interface[] {
			RFID,
			BLE,
			BLUE_TOOTH,
			WIFI,
			_4G,
			ETHERNET,
			LO_RA,
			ZWAVE,
			ZIGBEE,
			SERIAL,
			SIX_LO_WPAN,
		};

	/**
	 * A public read-only list of all the '<em><b>Interface</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Interface> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Interface</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Interface get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Interface result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interface</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Interface getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Interface result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interface</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Interface get(int value) {
		switch (value) {
			case RFID_VALUE: return RFID;
			case BLE_VALUE: return BLE;
			case BLUE_TOOTH_VALUE: return BLUE_TOOTH;
			case WIFI_VALUE: return WIFI;
			case _4G_VALUE: return _4G;
			case ETHERNET_VALUE: return ETHERNET;
			case LO_RA_VALUE: return LO_RA;
			case ZWAVE_VALUE: return ZWAVE;
			case ZIGBEE_VALUE: return ZIGBEE;
			case SERIAL_VALUE: return SERIAL;
			case SIX_LO_WPAN_VALUE: return SIX_LO_WPAN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Interface(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Interface
