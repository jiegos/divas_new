package ua.divas.view;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.RowIterator;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;

import ua.divas.model.FirmsImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Sep 15 13:04:54 EEST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class FirmsViewRowImpl extends ViewRowImpl {


    public static final int ENTITY_FIRMS = 0;

    @Override
    public boolean isAttributeUpdateable(int i) {
        BigDecimal editable = this.getEditable();
        if (editable.intValue()==0) {
            return false;
        } else { 
        return super.isAttributeUpdateable(i);
            }
    }

    @Override
    protected void create(AttributeList attributeList) {
        this.setEditable(new BigDecimal(1));
        super.create(attributeList);
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        Fullname,
        Printname,
        UrFiz,
        Inn,
        Okpo,
        Version,
        Deleted,
        Predefined,
        Editable,
        KassaView,
        OrdersView,
        UserSettingsView;
        static AttributesEnum[] vals = null;
        ;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int ID = AttributesEnum.Id.index();
    public static final int FULLNAME = AttributesEnum.Fullname.index();
    public static final int PRINTNAME = AttributesEnum.Printname.index();
    public static final int URFIZ = AttributesEnum.UrFiz.index();
    public static final int INN = AttributesEnum.Inn.index();
    public static final int OKPO = AttributesEnum.Okpo.index();
    public static final int VERSION = AttributesEnum.Version.index();
    public static final int DELETED = AttributesEnum.Deleted.index();
    public static final int PREDEFINED = AttributesEnum.Predefined.index();
    public static final int EDITABLE = AttributesEnum.Editable.index();
    public static final int KASSAVIEW = AttributesEnum.KassaView.index();
    public static final int ORDERSVIEW = AttributesEnum.OrdersView.index();
    public static final int USERSETTINGSVIEW = AttributesEnum.UserSettingsView.index();

    /**
     * This is the default constructor (do not remove).
     */
    public FirmsViewRowImpl() {
    }

    /**
     * Gets Firms entity object.
     * @return the Firms
     */
    public FirmsImpl getFirms() {
        return (FirmsImpl) getEntity(ENTITY_FIRMS);
    }

    /**
     * Gets the attribute value for ID using the alias name Id.
     * @return the ID
     */
    public String getId() {
        return (String) getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as attribute value for ID using the alias name Id.
     * @param value value to set the ID
     */
    public void setId(String value) {
        setAttributeInternal(ID, value);
    }


    /**
     * Gets the attribute value for the calculated attribute FName.
     * @return the FName
     */
    public String getFullname() {
        return (String) getAttributeInternal(FULLNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute FName.
     * @param value value to set the  FName
     */
    public void setFullname(String value) {
        setAttributeInternal(FULLNAME, value);
    }

    /**
     * Gets the attribute value for PRINTNAME using the alias name Printname.
     * @return the PRINTNAME
     */
    public String getPrintname() {
        return (String) getAttributeInternal(PRINTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for PRINTNAME using the alias name Printname.
     * @param value value to set the PRINTNAME
     */
    public void setPrintname(String value) {
        setAttributeInternal(PRINTNAME, value);
    }

    /**
     * Gets the attribute value for UR_FIZ using the alias name UrFiz.
     * @return the UR_FIZ
     */
    public Integer getUrFiz() {
        return (Integer) getAttributeInternal(URFIZ);
    }

    /**
     * Sets <code>value</code> as attribute value for UR_FIZ using the alias name UrFiz.
     * @param value value to set the UR_FIZ
     */
    public void setUrFiz(Integer value) {
        setAttributeInternal(URFIZ, value);
    }

    /**
     * Gets the attribute value for INN using the alias name Inn.
     * @return the INN
     */
    public String getInn() {
        return (String) getAttributeInternal(INN);
    }

    /**
     * Sets <code>value</code> as attribute value for INN using the alias name Inn.
     * @param value value to set the INN
     */
    public void setInn(String value) {
        setAttributeInternal(INN, value);
    }

    /**
     * Gets the attribute value for OKPO using the alias name Okpo.
     * @return the OKPO
     */
    public String getOkpo() {
        return (String) getAttributeInternal(OKPO);
    }

    /**
     * Sets <code>value</code> as attribute value for OKPO using the alias name Okpo.
     * @param value value to set the OKPO
     */
    public void setOkpo(String value) {
        setAttributeInternal(OKPO, value);
    }


    /**
     * Gets the attribute value for VERSION using the alias name FVersion.
     * @return the VERSION
     */
    public Timestamp getVersion() {
        return (Timestamp) getAttributeInternal(VERSION);
    }

    /**
     * Gets the attribute value for DELETED using the alias name FDeleted.
     * @return the DELETED
     */
    public Integer getDeleted() {
        return (Integer) getAttributeInternal(DELETED);
    }

    /**
     * Sets <code>value</code> as attribute value for DELETED using the alias name FDeleted.
     * @param value value to set the DELETED
     */
    public void setDeleted(Integer value) {
        setAttributeInternal(DELETED, value);
    }

    /**
     * Gets the attribute value for PREDEFINED using the alias name FPredefined.
     * @return the PREDEFINED
     */
    public Integer getPredefined() {
        return (Integer) getAttributeInternal(PREDEFINED);
    }

    /**
     * Sets <code>value</code> as attribute value for PREDEFINED using the alias name FPredefined.
     * @param value value to set the PREDEFINED
     */
    public void setPredefined(Integer value) {
        setAttributeInternal(PREDEFINED, value);
    }


    /**
     * Gets the attribute value for the calculated attribute Editable.
     * @return the Editable
     */
    public BigDecimal getEditable() {
        return (BigDecimal) getAttributeInternal(EDITABLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Editable.
     * @param value value to set the  Editable
     */
    public void setEditable(BigDecimal value) {
        setAttributeInternal(EDITABLE, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link KassaView.
     */
    public RowIterator getKassaView() {
        return (RowIterator) getAttributeInternal(KASSAVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link OrdersView.
     */
    public RowIterator getOrdersView() {
        return (RowIterator) getAttributeInternal(ORDERSVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link UserSettingsView.
     */
    public RowIterator getUserSettingsView() {
        return (RowIterator) getAttributeInternal(USERSETTINGSVIEW);
    }
}

