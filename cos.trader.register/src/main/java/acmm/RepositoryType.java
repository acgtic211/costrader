/**
 */
package acmm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Repository Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see acmm.AcmmPackage#getRepositoryType()
 * @model
 * @generated
 */
public enum RepositoryType implements Enumerator {
	/**
	 * The '<em><b>Apache Wookie 013 1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APACHE_WOOKIE_013_1_VALUE
	 * @generated
	 * @ordered
	 */
	APACHE_WOOKIE_013_1(0, "ApacheWookie_0_13_1", "ApacheWookie_0_13_1"),

	/**
	 * The '<em><b>Apache Wookie 014 0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APACHE_WOOKIE_014_0_VALUE
	 * @generated
	 * @ordered
	 */
	APACHE_WOOKIE_014_0(1, "ApacheWookie_0_14_0", "ApacheWookie_0_14_0"),

	/**
	 * The '<em><b>Apache Wookie 015 0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APACHE_WOOKIE_015_0_VALUE
	 * @generated
	 * @ordered
	 */
	APACHE_WOOKIE_015_0(2, "ApacheWookie_0_15_0", "ApacheWookie_0_15_0"),

	/**
	 * The '<em><b>Apache Wookie 100</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APACHE_WOOKIE_100_VALUE
	 * @generated
	 * @ordered
	 */
	APACHE_WOOKIE_100(3, "ApacheWookie_1_0_0", "ApacheWookie_1_0_0"),

	/**
	 * The '<em><b></b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #__VALUE
	 * @generated
	 * @ordered
	 */
	_(4, "___", "___");

	/**
	 * The '<em><b>Apache Wookie 013 1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Apache Wookie 013 1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APACHE_WOOKIE_013_1
	 * @model name="ApacheWookie_0_13_1"
	 * @generated
	 * @ordered
	 */
	public static final int APACHE_WOOKIE_013_1_VALUE = 0;

	/**
	 * The '<em><b>Apache Wookie 014 0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Apache Wookie 014 0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APACHE_WOOKIE_014_0
	 * @model name="ApacheWookie_0_14_0"
	 * @generated
	 * @ordered
	 */
	public static final int APACHE_WOOKIE_014_0_VALUE = 1;

	/**
	 * The '<em><b>Apache Wookie 015 0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Apache Wookie 015 0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APACHE_WOOKIE_015_0
	 * @model name="ApacheWookie_0_15_0"
	 * @generated
	 * @ordered
	 */
	public static final int APACHE_WOOKIE_015_0_VALUE = 2;

	/**
	 * The '<em><b>Apache Wookie 100</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Apache Wookie 100</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APACHE_WOOKIE_100
	 * @model name="ApacheWookie_1_0_0"
	 * @generated
	 * @ordered
	 */
	public static final int APACHE_WOOKIE_100_VALUE = 3;

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
	public static final int __VALUE = 4;

	/**
	 * An array of all the '<em><b>Repository Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RepositoryType[] VALUES_ARRAY =
		new RepositoryType[] {
			APACHE_WOOKIE_013_1,
			APACHE_WOOKIE_014_0,
			APACHE_WOOKIE_015_0,
			APACHE_WOOKIE_100,
			_,
		};

	/**
	 * A public read-only list of all the '<em><b>Repository Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RepositoryType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Repository Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RepositoryType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RepositoryType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Repository Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RepositoryType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RepositoryType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Repository Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RepositoryType get(int value) {
		switch (value) {
			case APACHE_WOOKIE_013_1_VALUE: return APACHE_WOOKIE_013_1;
			case APACHE_WOOKIE_014_0_VALUE: return APACHE_WOOKIE_014_0;
			case APACHE_WOOKIE_015_0_VALUE: return APACHE_WOOKIE_015_0;
			case APACHE_WOOKIE_100_VALUE: return APACHE_WOOKIE_100;
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
	private RepositoryType(int value, String name, String literal) {
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
	
} //RepositoryType
