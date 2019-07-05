/**
 */
package acmm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Property ID</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see acmm.AcmmPackage#getPropertyID()
 * @model
 * @generated
 */
public enum PropertyID implements Enumerator {
	/**
	 * The '<em><b>Width</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIDTH_VALUE
	 * @generated
	 * @ordered
	 */
	WIDTH(0, "width", "width"),

	/**
	 * The '<em><b>Height</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	HEIGHT(1, "height", "height"),

	/**
	 * The '<em><b>Is Resizable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_RESIZABLE_VALUE
	 * @generated
	 * @ordered
	 */
	IS_RESIZABLE(2, "isResizable", "isResizable"),

	/**
	 * The '<em><b>Minum size</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUM_SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	MINUM_SIZE(4, "minum_size", "minum_size"),

	/**
	 * The '<em><b>Maximum size</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXIMUM_SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	MAXIMUM_SIZE(5, "maximum_size", "maximum_size"),

	/**
	 * The '<em><b></b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #__VALUE
	 * @generated
	 * @ordered
	 */
	_(3, "___", "___");

	/**
	 * The '<em><b>Width</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Width</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIDTH
	 * @model name="width"
	 * @generated
	 * @ordered
	 */
	public static final int WIDTH_VALUE = 0;

	/**
	 * The '<em><b>Height</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Height</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEIGHT
	 * @model name="height"
	 * @generated
	 * @ordered
	 */
	public static final int HEIGHT_VALUE = 1;

	/**
	 * The '<em><b>Is Resizable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Is Resizable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_RESIZABLE
	 * @model name="isResizable"
	 * @generated
	 * @ordered
	 */
	public static final int IS_RESIZABLE_VALUE = 2;

	/**
	 * The '<em><b>Minum size</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Minum size</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINUM_SIZE
	 * @model name="minum_size"
	 * @generated
	 * @ordered
	 */
	public static final int MINUM_SIZE_VALUE = 4;

	/**
	 * The '<em><b>Maximum size</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Maximum size</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAXIMUM_SIZE
	 * @model name="maximum_size"
	 * @generated
	 * @ordered
	 */
	public static final int MAXIMUM_SIZE_VALUE = 5;

	/**
	 * The '<em><b></b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b></b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_
	 * @model name="___"
	 * @generated
	 * @ordered
	 */
	public static final int __VALUE = 3;

	/**
	 * An array of all the '<em><b>Property ID</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PropertyID[] VALUES_ARRAY =
		new PropertyID[] {
			WIDTH,
			HEIGHT,
			IS_RESIZABLE,
			MINUM_SIZE,
			MAXIMUM_SIZE,
			_,
		};

	/**
	 * A public read-only list of all the '<em><b>Property ID</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PropertyID> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Property ID</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PropertyID get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PropertyID result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Property ID</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PropertyID getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PropertyID result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Property ID</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PropertyID get(int value) {
		switch (value) {
			case WIDTH_VALUE: return WIDTH;
			case HEIGHT_VALUE: return HEIGHT;
			case IS_RESIZABLE_VALUE: return IS_RESIZABLE;
			case MINUM_SIZE_VALUE: return MINUM_SIZE;
			case MAXIMUM_SIZE_VALUE: return MAXIMUM_SIZE;
			case __VALUE: return _;
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
	private PropertyID(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //PropertyID
