/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.hTMLbuild.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.example.mydsl.hTMLbuild.HTMLbuildPackage;
import org.xtext.example.mydsl.hTMLbuild.Separator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Separator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.hTMLbuild.impl.SeparatorImpl#isHasratio <em>Hasratio</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.hTMLbuild.impl.SeparatorImpl#getRatios <em>Ratios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeparatorImpl extends MinimalEObjectImpl.Container implements Separator
{
  /**
   * The default value of the '{@link #isHasratio() <em>Hasratio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasratio()
   * @generated
   * @ordered
   */
  protected static final boolean HASRATIO_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasratio() <em>Hasratio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasratio()
   * @generated
   * @ordered
   */
  protected boolean hasratio = HASRATIO_EDEFAULT;

  /**
   * The cached value of the '{@link #getRatios() <em>Ratios</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRatios()
   * @generated
   * @ordered
   */
  protected EList<Integer> ratios;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SeparatorImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return HTMLbuildPackage.Literals.SEPARATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isHasratio()
  {
    return hasratio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHasratio(boolean newHasratio)
  {
    boolean oldHasratio = hasratio;
    hasratio = newHasratio;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HTMLbuildPackage.SEPARATOR__HASRATIO, oldHasratio, hasratio));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Integer> getRatios()
  {
    if (ratios == null)
    {
      ratios = new EDataTypeEList<Integer>(Integer.class, this, HTMLbuildPackage.SEPARATOR__RATIOS);
    }
    return ratios;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case HTMLbuildPackage.SEPARATOR__HASRATIO:
        return isHasratio();
      case HTMLbuildPackage.SEPARATOR__RATIOS:
        return getRatios();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HTMLbuildPackage.SEPARATOR__HASRATIO:
        setHasratio((Boolean)newValue);
        return;
      case HTMLbuildPackage.SEPARATOR__RATIOS:
        getRatios().clear();
        getRatios().addAll((Collection<? extends Integer>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case HTMLbuildPackage.SEPARATOR__HASRATIO:
        setHasratio(HASRATIO_EDEFAULT);
        return;
      case HTMLbuildPackage.SEPARATOR__RATIOS:
        getRatios().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case HTMLbuildPackage.SEPARATOR__HASRATIO:
        return hasratio != HASRATIO_EDEFAULT;
      case HTMLbuildPackage.SEPARATOR__RATIOS:
        return ratios != null && !ratios.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (hasratio: ");
    result.append(hasratio);
    result.append(", ratios: ");
    result.append(ratios);
    result.append(')');
    return result.toString();
  }

} //SeparatorImpl
