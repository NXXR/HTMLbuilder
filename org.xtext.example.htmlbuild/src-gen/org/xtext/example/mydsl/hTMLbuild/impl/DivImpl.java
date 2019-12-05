/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.hTMLbuild.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.hTMLbuild.Content;
import org.xtext.example.mydsl.hTMLbuild.Div;
import org.xtext.example.mydsl.hTMLbuild.Element;
import org.xtext.example.mydsl.hTMLbuild.HTMLbuildPackage;
import org.xtext.example.mydsl.hTMLbuild.Separator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Div</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.hTMLbuild.impl.DivImpl#getElem <em>Elem</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.hTMLbuild.impl.DivImpl#getDiv_id <em>Div id</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.hTMLbuild.impl.DivImpl#getDivelements <em>Divelements</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.hTMLbuild.impl.DivImpl#getSeparators <em>Separators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DivImpl extends TypeImpl implements Div
{
  /**
   * The cached value of the '{@link #getElem() <em>Elem</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElem()
   * @generated
   * @ordered
   */
  protected Content elem;

  /**
   * The default value of the '{@link #getDiv_id() <em>Div id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiv_id()
   * @generated
   * @ordered
   */
  protected static final String DIV_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDiv_id() <em>Div id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiv_id()
   * @generated
   * @ordered
   */
  protected String div_id = DIV_ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getDivelements() <em>Divelements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDivelements()
   * @generated
   * @ordered
   */
  protected EList<Element> divelements;

  /**
   * The cached value of the '{@link #getSeparators() <em>Separators</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeparators()
   * @generated
   * @ordered
   */
  protected EList<Separator> separators;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DivImpl()
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
    return HTMLbuildPackage.Literals.DIV;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Content getElem()
  {
    if (elem != null && elem.eIsProxy())
    {
      InternalEObject oldElem = (InternalEObject)elem;
      elem = (Content)eResolveProxy(oldElem);
      if (elem != oldElem)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HTMLbuildPackage.DIV__ELEM, oldElem, elem));
      }
    }
    return elem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Content basicGetElem()
  {
    return elem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setElem(Content newElem)
  {
    Content oldElem = elem;
    elem = newElem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HTMLbuildPackage.DIV__ELEM, oldElem, elem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDiv_id()
  {
    return div_id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDiv_id(String newDiv_id)
  {
    String oldDiv_id = div_id;
    div_id = newDiv_id;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HTMLbuildPackage.DIV__DIV_ID, oldDiv_id, div_id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Element> getDivelements()
  {
    if (divelements == null)
    {
      divelements = new EObjectContainmentEList<Element>(Element.class, this, HTMLbuildPackage.DIV__DIVELEMENTS);
    }
    return divelements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Separator> getSeparators()
  {
    if (separators == null)
    {
      separators = new EObjectContainmentEList<Separator>(Separator.class, this, HTMLbuildPackage.DIV__SEPARATORS);
    }
    return separators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case HTMLbuildPackage.DIV__DIVELEMENTS:
        return ((InternalEList<?>)getDivelements()).basicRemove(otherEnd, msgs);
      case HTMLbuildPackage.DIV__SEPARATORS:
        return ((InternalEList<?>)getSeparators()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case HTMLbuildPackage.DIV__ELEM:
        if (resolve) return getElem();
        return basicGetElem();
      case HTMLbuildPackage.DIV__DIV_ID:
        return getDiv_id();
      case HTMLbuildPackage.DIV__DIVELEMENTS:
        return getDivelements();
      case HTMLbuildPackage.DIV__SEPARATORS:
        return getSeparators();
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
      case HTMLbuildPackage.DIV__ELEM:
        setElem((Content)newValue);
        return;
      case HTMLbuildPackage.DIV__DIV_ID:
        setDiv_id((String)newValue);
        return;
      case HTMLbuildPackage.DIV__DIVELEMENTS:
        getDivelements().clear();
        getDivelements().addAll((Collection<? extends Element>)newValue);
        return;
      case HTMLbuildPackage.DIV__SEPARATORS:
        getSeparators().clear();
        getSeparators().addAll((Collection<? extends Separator>)newValue);
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
      case HTMLbuildPackage.DIV__ELEM:
        setElem((Content)null);
        return;
      case HTMLbuildPackage.DIV__DIV_ID:
        setDiv_id(DIV_ID_EDEFAULT);
        return;
      case HTMLbuildPackage.DIV__DIVELEMENTS:
        getDivelements().clear();
        return;
      case HTMLbuildPackage.DIV__SEPARATORS:
        getSeparators().clear();
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
      case HTMLbuildPackage.DIV__ELEM:
        return elem != null;
      case HTMLbuildPackage.DIV__DIV_ID:
        return DIV_ID_EDEFAULT == null ? div_id != null : !DIV_ID_EDEFAULT.equals(div_id);
      case HTMLbuildPackage.DIV__DIVELEMENTS:
        return divelements != null && !divelements.isEmpty();
      case HTMLbuildPackage.DIV__SEPARATORS:
        return separators != null && !separators.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Element.class)
    {
      switch (derivedFeatureID)
      {
        case HTMLbuildPackage.DIV__ELEM: return HTMLbuildPackage.ELEMENT__ELEM;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Element.class)
    {
      switch (baseFeatureID)
      {
        case HTMLbuildPackage.ELEMENT__ELEM: return HTMLbuildPackage.DIV__ELEM;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (div_id: ");
    result.append(div_id);
    result.append(')');
    return result.toString();
  }

} //DivImpl
