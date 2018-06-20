/**
 * generated by Xtext 2.12.0
 */
package uk.ac.kcl.inf.modelling.xdsml.henshinXDsmlSpecification.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.henshin.model.HenshinPackage;

import uk.ac.kcl.inf.modelling.xdsml.henshinXDsmlSpecification.HenshinXDsmlSpecification;
import uk.ac.kcl.inf.modelling.xdsml.henshinXDsmlSpecification.HenshinXDsmlSpecificationFactory;
import uk.ac.kcl.inf.modelling.xdsml.henshinXDsmlSpecification.HenshinXDsmlSpecificationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HenshinXDsmlSpecificationPackageImpl extends EPackageImpl implements HenshinXDsmlSpecificationPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass henshinXDsmlSpecificationEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see uk.ac.kcl.inf.modelling.xdsml.henshinXDsmlSpecification.HenshinXDsmlSpecificationPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private HenshinXDsmlSpecificationPackageImpl()
  {
    super(eNS_URI, HenshinXDsmlSpecificationFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link HenshinXDsmlSpecificationPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static HenshinXDsmlSpecificationPackage init()
  {
    if (isInited) return (HenshinXDsmlSpecificationPackage)EPackage.Registry.INSTANCE.getEPackage(HenshinXDsmlSpecificationPackage.eNS_URI);

    // Obtain or create and register package
    HenshinXDsmlSpecificationPackageImpl theHenshinXDsmlSpecificationPackage = (HenshinXDsmlSpecificationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HenshinXDsmlSpecificationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HenshinXDsmlSpecificationPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    HenshinPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theHenshinXDsmlSpecificationPackage.createPackageContents();

    // Initialize created meta-data
    theHenshinXDsmlSpecificationPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theHenshinXDsmlSpecificationPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(HenshinXDsmlSpecificationPackage.eNS_URI, theHenshinXDsmlSpecificationPackage);
    return theHenshinXDsmlSpecificationPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHenshinXDsmlSpecification()
  {
    return henshinXDsmlSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHenshinXDsmlSpecification_Metamodel()
  {
    return (EReference)henshinXDsmlSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHenshinXDsmlSpecification_Units()
  {
    return (EReference)henshinXDsmlSpecificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HenshinXDsmlSpecificationFactory getHenshinXDsmlSpecificationFactory()
  {
    return (HenshinXDsmlSpecificationFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    henshinXDsmlSpecificationEClass = createEClass(HENSHIN_XDSML_SPECIFICATION);
    createEReference(henshinXDsmlSpecificationEClass, HENSHIN_XDSML_SPECIFICATION__METAMODEL);
    createEReference(henshinXDsmlSpecificationEClass, HENSHIN_XDSML_SPECIFICATION__UNITS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    HenshinPackage theHenshinPackage = (HenshinPackage)EPackage.Registry.INSTANCE.getEPackage(HenshinPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(henshinXDsmlSpecificationEClass, HenshinXDsmlSpecification.class, "HenshinXDsmlSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHenshinXDsmlSpecification_Metamodel(), ecorePackage.getEPackage(), null, "metamodel", null, 0, 1, HenshinXDsmlSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHenshinXDsmlSpecification_Units(), theHenshinPackage.getUnit(), null, "units", null, 0, -1, HenshinXDsmlSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //HenshinXDsmlSpecificationPackageImpl