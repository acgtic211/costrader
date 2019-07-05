/**
 */
package architectural_metamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Nary Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see architectural_metamodel.Architectural_metamodelPackage#getNaryType()
 * @model
 * @generated
 */
public enum NaryType implements Enumerator {
	/**
	 * The '<em><b>Sequence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUENCE_VALUE
	 * @generated
	 * @ordered
	 */
	SEQUENCE(1, "sequence", "sequence"),

	/**
	 * The '<em><b>Hierarchy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIERARCHY_VALUE
	 * @generated
	 * @ordered
	 */
	HIERARCHY(2, "hierarchy", "hierarchy"),

	/**
	 * The '<em><b>Trading</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRADING_VALUE
	 * @generated
	 * @ordered
	 */
	TRADING(3, "trading", "trading"),

	/**
	 * The '<em><b>Observer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVER_VALUE
	 * @generated
	 * @ordered
	 */
	OBSERVER(4, "observer", "observer"),

	/**
	 * The '<em><b>Controller</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLLER_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROLLER(5, "controller", "controller"),

	/**
	 * The '<em><b></b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #__VALUE
	 * @generated
	 * @ordered
	 */
	_(6, "___", "___");

	/**
	 * The '<em><b>Sequence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sequence</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEQUENCE
	 * @model name="sequence"
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENCE_VALUE = 1;

	/**
	 * The '<em><b>Hierarchy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hierarchy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIERARCHY
	 * @model name="hierarchy"
	 * @generated
	 * @ordered
	 */
	public static final int HIERARCHY_VALUE = 2;

	/**
	 * The '<em><b>Trading</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Trading</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRADING
	 * @model name="trading"
	 * @generated
	 * @ordered
	 */
	public static final int TRADING_VALUE = 3;

	/**
	 * The '<em><b>Observer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Observer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBSERVER
	 * @model name="observer"
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVER_VALUE = 4;

	/**
	 * The '<em><b>Controller</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Controller</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTROLLER
	 * @model name="controller"
	 * @generated
	 * @ordered
	 */
	public static final int CONTROLLER_VALUE = 5;

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
	public static final int __VALUE = 6;

	/**
	 * An array of all the '<em><b>Nary Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NaryType[] VALUES_ARRAY =
		new NaryType[] {
			SEQUENCE,
			HIERARCHY,
			TRADING,
			OBSERVER,
			CONTROLLER,
			_,
		};

	/**
	 * A public read-only list of all the '<em><b>Nary Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NaryType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Nary Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NaryType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NaryType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nary Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NaryType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NaryType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nary Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NaryType get(int value) {
		switch (value) {
			case SEQUENCE_VALUE: return SEQUENCE;
			case HIERARCHY_VALUE: return HIERARCHY;
			case TRADING_VALUE: return TRADING;
			case OBSERVER_VALUE: return OBSERVER;
			case CONTROLLER_VALUE: return CONTROLLER;
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
	private NaryType(int value, String name, String literal) {
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
	
} //NaryType
