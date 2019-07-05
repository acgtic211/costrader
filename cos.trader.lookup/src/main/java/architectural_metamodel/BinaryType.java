/**
 */
package architectural_metamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Binary Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see architectural_metamodel.Architectural_metamodelPackage#getBinaryType()
 * @model
 * @generated
 */
public enum BinaryType implements Enumerator {
	/**
	 * The '<em><b>Association</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSOCIATION_VALUE
	 * @generated
	 * @ordered
	 */
	ASSOCIATION(0, "association", "association"),

	/**
	 * The '<em><b>Composition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOSITION_VALUE
	 * @generated
	 * @ordered
	 */
	COMPOSITION(2, "composition", "composition"),

	/**
	 * The '<em><b>Dependence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCE_VALUE
	 * @generated
	 * @ordered
	 */
	DEPENDENCE(4, "dependence", "dependence"),

	/**
	 * The '<em><b>Inheritance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INHERITANCE_VALUE
	 * @generated
	 * @ordered
	 */
	INHERITANCE(5, "inheritance", "inheritance"),

	/**
	 * The '<em><b>Producerconsumer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRODUCERCONSUMER_VALUE
	 * @generated
	 * @ordered
	 */
	PRODUCERCONSUMER(9, "producerconsumer", "producerconsumer"),

	/**
	 * The '<em><b></b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #__VALUE
	 * @generated
	 * @ordered
	 */
	_(10, "___", "___");

	/**
	 * The '<em><b>Association</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Association</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSOCIATION
	 * @model name="association"
	 * @generated
	 * @ordered
	 */
	public static final int ASSOCIATION_VALUE = 0;

	/**
	 * The '<em><b>Composition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Composition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPOSITION
	 * @model name="composition"
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITION_VALUE = 2;

	/**
	 * The '<em><b>Dependence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dependence</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCE
	 * @model name="dependence"
	 * @generated
	 * @ordered
	 */
	public static final int DEPENDENCE_VALUE = 4;

	/**
	 * The '<em><b>Inheritance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inheritance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INHERITANCE
	 * @model name="inheritance"
	 * @generated
	 * @ordered
	 */
	public static final int INHERITANCE_VALUE = 5;

	/**
	 * The '<em><b>Producerconsumer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Producerconsumer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRODUCERCONSUMER
	 * @model name="producerconsumer"
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCERCONSUMER_VALUE = 9;

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
	public static final int __VALUE = 10;

	/**
	 * An array of all the '<em><b>Binary Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BinaryType[] VALUES_ARRAY =
		new BinaryType[] {
			ASSOCIATION,
			COMPOSITION,
			DEPENDENCE,
			INHERITANCE,
			PRODUCERCONSUMER,
			_,
		};

	/**
	 * A public read-only list of all the '<em><b>Binary Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BinaryType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Binary Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BinaryType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BinaryType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binary Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BinaryType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BinaryType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binary Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BinaryType get(int value) {
		switch (value) {
			case ASSOCIATION_VALUE: return ASSOCIATION;
			case COMPOSITION_VALUE: return COMPOSITION;
			case DEPENDENCE_VALUE: return DEPENDENCE;
			case INHERITANCE_VALUE: return INHERITANCE;
			case PRODUCERCONSUMER_VALUE: return PRODUCERCONSUMER;
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
	private BinaryType(int value, String name, String literal) {
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
	
} //BinaryType
