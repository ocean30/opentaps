package org.opentaps.base.services;

/*
 * Copyright (c) 2009 - 2009 Open Source Strategies, Inc.
 *
 * Opentaps is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Opentaps is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Opentaps.  If not, see <http://www.gnu.org/licenses/>.
 */

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE SERVICE MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import org.opentaps.foundation.service.ServiceWrapper;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import javolution.util.FastMap;
import javolution.util.FastSet;
import org.ofbiz.entity.GenericValue;
import org.opentaps.foundation.infrastructure.User;

/**
 * Update a AcctgTrans record.
 * Auto generated base service entity updateAcctgTrans.
 *
 * Engine: simple
 * Location: component://accounting/script/org/ofbiz/accounting/ledger/AcctgTransServices.xml
 * Invoke: updateAcctgTrans
 * Defined in: applications/accounting/servicedef/services_ledger.xml
 */
public class UpdateAcctgTransService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "updateAcctgTrans";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        acctgTransId("acctgTransId"),
        acctgTransTypeId("acctgTransTypeId"),
        createdByUserLogin("createdByUserLogin"),
        description("description"),
        finAccountTransId("finAccountTransId"),
        fixedAssetId("fixedAssetId"),
        glFiscalTypeId("glFiscalTypeId"),
        glJournalId("glJournalId"),
        groupStatusId("groupStatusId"),
        inventoryItemId("inventoryItemId"),
        invoiceAdjustmentId("invoiceAdjustmentId"),
        invoiceId("invoiceId"),
        isPosted("isPosted"),
        lastModifiedByUserLogin("lastModifiedByUserLogin"),
        locale("locale"),
        partyId("partyId"),
        paymentApplicationId("paymentApplicationId"),
        paymentId("paymentId"),
        physicalInventoryId("physicalInventoryId"),
        postedAmount("postedAmount"),
        postedDate("postedDate"),
        receiptId("receiptId"),
        roleTypeId("roleTypeId"),
        scheduledPostingDate("scheduledPostingDate"),
        shipmentId("shipmentId"),
        theirAcctgTransId("theirAcctgTransId"),
        timeZone("timeZone"),
        transactionDate("transactionDate"),
        userLogin("userLogin"),
        voucherDate("voucherDate"),
        voucherRef("voucherRef"),
        workEffortId("workEffortId");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        responseMessage("responseMessage"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>UpdateAcctgTransService</code> instance.
     */
    public UpdateAcctgTransService() {
        super();
    }

    /**
     * Creates a new <code>UpdateAcctgTransService</code> instance.
     * @param user an <code>User</code> value
     */
    public UpdateAcctgTransService(User user) {
        super(user);
    }

    private String inAcctgTransId;
    private String inAcctgTransTypeId;
    private String inCreatedByUserLogin;
    private String inDescription;
    private String inFinAccountTransId;
    private String inFixedAssetId;
    private String inGlFiscalTypeId;
    private String inGlJournalId;
    private String inGroupStatusId;
    private String inInventoryItemId;
    private String inInvoiceAdjustmentId;
    private String inInvoiceId;
    private String inIsPosted;
    private String inLastModifiedByUserLogin;
    private Locale inLocale;
    private String inPartyId;
    private String inPaymentApplicationId;
    private String inPaymentId;
    private String inPhysicalInventoryId;
    private BigDecimal inPostedAmount;
    private Timestamp inPostedDate;
    private String inReceiptId;
    private String inRoleTypeId;
    private Timestamp inScheduledPostingDate;
    private String inShipmentId;
    private String inTheirAcctgTransId;
    private TimeZone inTimeZone;
    private Timestamp inTransactionDate;
    private GenericValue inUserLogin;
    private Timestamp inVoucherDate;
    private String inVoucherRef;
    private String inWorkEffortId;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outResponseMessage;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private TimeZone outTimeZone;
    private GenericValue outUserLogin;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInAcctgTransId() {
        return this.inAcctgTransId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAcctgTransTypeId() {
        return this.inAcctgTransTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCreatedByUserLogin() {
        return this.inCreatedByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDescription() {
        return this.inDescription;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFinAccountTransId() {
        return this.inFinAccountTransId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFixedAssetId() {
        return this.inFixedAssetId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGlFiscalTypeId() {
        return this.inGlFiscalTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGlJournalId() {
        return this.inGlJournalId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGroupStatusId() {
        return this.inGroupStatusId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInInventoryItemId() {
        return this.inInventoryItemId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInInvoiceAdjustmentId() {
        return this.inInvoiceAdjustmentId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInInvoiceId() {
        return this.inInvoiceId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInIsPosted() {
        return this.inIsPosted;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInLastModifiedByUserLogin() {
        return this.inLastModifiedByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Locale</code>
     */
    public Locale getInLocale() {
        return this.inLocale;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPartyId() {
        return this.inPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPaymentApplicationId() {
        return this.inPaymentApplicationId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPaymentId() {
        return this.inPaymentId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPhysicalInventoryId() {
        return this.inPhysicalInventoryId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInPostedAmount() {
        return this.inPostedAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInPostedDate() {
        return this.inPostedDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInReceiptId() {
        return this.inReceiptId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRoleTypeId() {
        return this.inRoleTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInScheduledPostingDate() {
        return this.inScheduledPostingDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInShipmentId() {
        return this.inShipmentId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTheirAcctgTransId() {
        return this.inTheirAcctgTransId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>TimeZone</code>
     */
    public TimeZone getInTimeZone() {
        return this.inTimeZone;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInTransactionDate() {
        return this.inTransactionDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>GenericValue</code>
     */
    public GenericValue getInUserLogin() {
        return this.inUserLogin;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInVoucherDate() {
        return this.inVoucherDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInVoucherRef() {
        return this.inVoucherRef;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInWorkEffortId() {
        return this.inWorkEffortId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutErrorMessage() {
        return this.outErrorMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getOutErrorMessageList() {
        return this.outErrorMessageList;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Locale</code>
     */
    public Locale getOutLocale() {
        return this.outLocale;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutResponseMessage() {
        return this.outResponseMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutSuccessMessage() {
        return this.outSuccessMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getOutSuccessMessageList() {
        return this.outSuccessMessageList;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>TimeZone</code>
     */
    public TimeZone getOutTimeZone() {
        return this.outTimeZone;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>GenericValue</code>
     */
    public GenericValue getOutUserLogin() {
        return this.outUserLogin;
    }

    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inAcctgTransId the inAcctgTransId to set
    */
    public void setInAcctgTransId(String inAcctgTransId) {
        this.inParameters.add("acctgTransId");
        this.inAcctgTransId = inAcctgTransId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAcctgTransTypeId the inAcctgTransTypeId to set
    */
    public void setInAcctgTransTypeId(String inAcctgTransTypeId) {
        this.inParameters.add("acctgTransTypeId");
        this.inAcctgTransTypeId = inAcctgTransTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCreatedByUserLogin the inCreatedByUserLogin to set
    */
    public void setInCreatedByUserLogin(String inCreatedByUserLogin) {
        this.inParameters.add("createdByUserLogin");
        this.inCreatedByUserLogin = inCreatedByUserLogin;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDescription the inDescription to set
    */
    public void setInDescription(String inDescription) {
        this.inParameters.add("description");
        this.inDescription = inDescription;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFinAccountTransId the inFinAccountTransId to set
    */
    public void setInFinAccountTransId(String inFinAccountTransId) {
        this.inParameters.add("finAccountTransId");
        this.inFinAccountTransId = inFinAccountTransId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFixedAssetId the inFixedAssetId to set
    */
    public void setInFixedAssetId(String inFixedAssetId) {
        this.inParameters.add("fixedAssetId");
        this.inFixedAssetId = inFixedAssetId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGlFiscalTypeId the inGlFiscalTypeId to set
    */
    public void setInGlFiscalTypeId(String inGlFiscalTypeId) {
        this.inParameters.add("glFiscalTypeId");
        this.inGlFiscalTypeId = inGlFiscalTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGlJournalId the inGlJournalId to set
    */
    public void setInGlJournalId(String inGlJournalId) {
        this.inParameters.add("glJournalId");
        this.inGlJournalId = inGlJournalId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGroupStatusId the inGroupStatusId to set
    */
    public void setInGroupStatusId(String inGroupStatusId) {
        this.inParameters.add("groupStatusId");
        this.inGroupStatusId = inGroupStatusId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inInventoryItemId the inInventoryItemId to set
    */
    public void setInInventoryItemId(String inInventoryItemId) {
        this.inParameters.add("inventoryItemId");
        this.inInventoryItemId = inInventoryItemId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inInvoiceAdjustmentId the inInvoiceAdjustmentId to set
    */
    public void setInInvoiceAdjustmentId(String inInvoiceAdjustmentId) {
        this.inParameters.add("invoiceAdjustmentId");
        this.inInvoiceAdjustmentId = inInvoiceAdjustmentId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inInvoiceId the inInvoiceId to set
    */
    public void setInInvoiceId(String inInvoiceId) {
        this.inParameters.add("invoiceId");
        this.inInvoiceId = inInvoiceId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inIsPosted the inIsPosted to set
    */
    public void setInIsPosted(String inIsPosted) {
        this.inParameters.add("isPosted");
        this.inIsPosted = inIsPosted;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLastModifiedByUserLogin the inLastModifiedByUserLogin to set
    */
    public void setInLastModifiedByUserLogin(String inLastModifiedByUserLogin) {
        this.inParameters.add("lastModifiedByUserLogin");
        this.inLastModifiedByUserLogin = inLastModifiedByUserLogin;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLocale the inLocale to set
    */
    public void setInLocale(Locale inLocale) {
        this.inParameters.add("locale");
        this.inLocale = inLocale;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPartyId the inPartyId to set
    */
    public void setInPartyId(String inPartyId) {
        this.inParameters.add("partyId");
        this.inPartyId = inPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPaymentApplicationId the inPaymentApplicationId to set
    */
    public void setInPaymentApplicationId(String inPaymentApplicationId) {
        this.inParameters.add("paymentApplicationId");
        this.inPaymentApplicationId = inPaymentApplicationId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPaymentId the inPaymentId to set
    */
    public void setInPaymentId(String inPaymentId) {
        this.inParameters.add("paymentId");
        this.inPaymentId = inPaymentId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPhysicalInventoryId the inPhysicalInventoryId to set
    */
    public void setInPhysicalInventoryId(String inPhysicalInventoryId) {
        this.inParameters.add("physicalInventoryId");
        this.inPhysicalInventoryId = inPhysicalInventoryId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPostedAmount the inPostedAmount to set
    */
    public void setInPostedAmount(BigDecimal inPostedAmount) {
        this.inParameters.add("postedAmount");
        this.inPostedAmount = inPostedAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPostedDate the inPostedDate to set
    */
    public void setInPostedDate(Timestamp inPostedDate) {
        this.inParameters.add("postedDate");
        this.inPostedDate = inPostedDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inReceiptId the inReceiptId to set
    */
    public void setInReceiptId(String inReceiptId) {
        this.inParameters.add("receiptId");
        this.inReceiptId = inReceiptId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRoleTypeId the inRoleTypeId to set
    */
    public void setInRoleTypeId(String inRoleTypeId) {
        this.inParameters.add("roleTypeId");
        this.inRoleTypeId = inRoleTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inScheduledPostingDate the inScheduledPostingDate to set
    */
    public void setInScheduledPostingDate(Timestamp inScheduledPostingDate) {
        this.inParameters.add("scheduledPostingDate");
        this.inScheduledPostingDate = inScheduledPostingDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inShipmentId the inShipmentId to set
    */
    public void setInShipmentId(String inShipmentId) {
        this.inParameters.add("shipmentId");
        this.inShipmentId = inShipmentId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTheirAcctgTransId the inTheirAcctgTransId to set
    */
    public void setInTheirAcctgTransId(String inTheirAcctgTransId) {
        this.inParameters.add("theirAcctgTransId");
        this.inTheirAcctgTransId = inTheirAcctgTransId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTimeZone the inTimeZone to set
    */
    public void setInTimeZone(TimeZone inTimeZone) {
        this.inParameters.add("timeZone");
        this.inTimeZone = inTimeZone;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTransactionDate the inTransactionDate to set
    */
    public void setInTransactionDate(Timestamp inTransactionDate) {
        this.inParameters.add("transactionDate");
        this.inTransactionDate = inTransactionDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUserLogin the inUserLogin to set
    */
    public void setInUserLogin(GenericValue inUserLogin) {
        this.inParameters.add("userLogin");
        this.inUserLogin = inUserLogin;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inVoucherDate the inVoucherDate to set
    */
    public void setInVoucherDate(Timestamp inVoucherDate) {
        this.inParameters.add("voucherDate");
        this.inVoucherDate = inVoucherDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inVoucherRef the inVoucherRef to set
    */
    public void setInVoucherRef(String inVoucherRef) {
        this.inParameters.add("voucherRef");
        this.inVoucherRef = inVoucherRef;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inWorkEffortId the inWorkEffortId to set
    */
    public void setInWorkEffortId(String inWorkEffortId) {
        this.inParameters.add("workEffortId");
        this.inWorkEffortId = inWorkEffortId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outErrorMessage the outErrorMessage to set
    */
    public void setOutErrorMessage(String outErrorMessage) {
        this.outParameters.add("errorMessage");
        this.outErrorMessage = outErrorMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outErrorMessageList the outErrorMessageList to set
    */
    public void setOutErrorMessageList(List outErrorMessageList) {
        this.outParameters.add("errorMessageList");
        this.outErrorMessageList = outErrorMessageList;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outLocale the outLocale to set
    */
    public void setOutLocale(Locale outLocale) {
        this.outParameters.add("locale");
        this.outLocale = outLocale;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outResponseMessage the outResponseMessage to set
    */
    public void setOutResponseMessage(String outResponseMessage) {
        this.outParameters.add("responseMessage");
        this.outResponseMessage = outResponseMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outSuccessMessage the outSuccessMessage to set
    */
    public void setOutSuccessMessage(String outSuccessMessage) {
        this.outParameters.add("successMessage");
        this.outSuccessMessage = outSuccessMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outSuccessMessageList the outSuccessMessageList to set
    */
    public void setOutSuccessMessageList(List outSuccessMessageList) {
        this.outParameters.add("successMessageList");
        this.outSuccessMessageList = outSuccessMessageList;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outTimeZone the outTimeZone to set
    */
    public void setOutTimeZone(TimeZone outTimeZone) {
        this.outParameters.add("timeZone");
        this.outTimeZone = outTimeZone;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outUserLogin the outUserLogin to set
    */
    public void setOutUserLogin(GenericValue outUserLogin) {
        this.outParameters.add("userLogin");
        this.outUserLogin = outUserLogin;
    }

    /** {@inheritDoc} */
    public String name() {
        return NAME;
    }

    /** {@inheritDoc} */
    public Boolean requiresAuthentication() {
        return REQUIRES_AUTHENTICATION;
    }

    /** {@inheritDoc} */
    public Boolean requiresNewTransaction() {
        return REQUIRES_NEW_TRANSACTION;
    }

    /** {@inheritDoc} */
    public Boolean usesTransaction() {
        return USES_TRANSACTION;
    }

    /** {@inheritDoc} */
    public Map<String, Object> inputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (inParameters.contains("acctgTransId")) mapValue.put("acctgTransId", getInAcctgTransId());
        if (inParameters.contains("acctgTransTypeId")) mapValue.put("acctgTransTypeId", getInAcctgTransTypeId());
        if (inParameters.contains("createdByUserLogin")) mapValue.put("createdByUserLogin", getInCreatedByUserLogin());
        if (inParameters.contains("description")) mapValue.put("description", getInDescription());
        if (inParameters.contains("finAccountTransId")) mapValue.put("finAccountTransId", getInFinAccountTransId());
        if (inParameters.contains("fixedAssetId")) mapValue.put("fixedAssetId", getInFixedAssetId());
        if (inParameters.contains("glFiscalTypeId")) mapValue.put("glFiscalTypeId", getInGlFiscalTypeId());
        if (inParameters.contains("glJournalId")) mapValue.put("glJournalId", getInGlJournalId());
        if (inParameters.contains("groupStatusId")) mapValue.put("groupStatusId", getInGroupStatusId());
        if (inParameters.contains("inventoryItemId")) mapValue.put("inventoryItemId", getInInventoryItemId());
        if (inParameters.contains("invoiceAdjustmentId")) mapValue.put("invoiceAdjustmentId", getInInvoiceAdjustmentId());
        if (inParameters.contains("invoiceId")) mapValue.put("invoiceId", getInInvoiceId());
        if (inParameters.contains("isPosted")) mapValue.put("isPosted", getInIsPosted());
        if (inParameters.contains("lastModifiedByUserLogin")) mapValue.put("lastModifiedByUserLogin", getInLastModifiedByUserLogin());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("partyId")) mapValue.put("partyId", getInPartyId());
        if (inParameters.contains("paymentApplicationId")) mapValue.put("paymentApplicationId", getInPaymentApplicationId());
        if (inParameters.contains("paymentId")) mapValue.put("paymentId", getInPaymentId());
        if (inParameters.contains("physicalInventoryId")) mapValue.put("physicalInventoryId", getInPhysicalInventoryId());
        if (inParameters.contains("postedAmount")) mapValue.put("postedAmount", getInPostedAmount());
        if (inParameters.contains("postedDate")) mapValue.put("postedDate", getInPostedDate());
        if (inParameters.contains("receiptId")) mapValue.put("receiptId", getInReceiptId());
        if (inParameters.contains("roleTypeId")) mapValue.put("roleTypeId", getInRoleTypeId());
        if (inParameters.contains("scheduledPostingDate")) mapValue.put("scheduledPostingDate", getInScheduledPostingDate());
        if (inParameters.contains("shipmentId")) mapValue.put("shipmentId", getInShipmentId());
        if (inParameters.contains("theirAcctgTransId")) mapValue.put("theirAcctgTransId", getInTheirAcctgTransId());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("transactionDate")) mapValue.put("transactionDate", getInTransactionDate());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        if (inParameters.contains("voucherDate")) mapValue.put("voucherDate", getInVoucherDate());
        if (inParameters.contains("voucherRef")) mapValue.put("voucherRef", getInVoucherRef());
        if (inParameters.contains("workEffortId")) mapValue.put("workEffortId", getInWorkEffortId());
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("acctgTransId")) setInAcctgTransId((String) mapValue.get("acctgTransId"));
        if (mapValue.containsKey("acctgTransTypeId")) setInAcctgTransTypeId((String) mapValue.get("acctgTransTypeId"));
        if (mapValue.containsKey("createdByUserLogin")) setInCreatedByUserLogin((String) mapValue.get("createdByUserLogin"));
        if (mapValue.containsKey("description")) setInDescription((String) mapValue.get("description"));
        if (mapValue.containsKey("finAccountTransId")) setInFinAccountTransId((String) mapValue.get("finAccountTransId"));
        if (mapValue.containsKey("fixedAssetId")) setInFixedAssetId((String) mapValue.get("fixedAssetId"));
        if (mapValue.containsKey("glFiscalTypeId")) setInGlFiscalTypeId((String) mapValue.get("glFiscalTypeId"));
        if (mapValue.containsKey("glJournalId")) setInGlJournalId((String) mapValue.get("glJournalId"));
        if (mapValue.containsKey("groupStatusId")) setInGroupStatusId((String) mapValue.get("groupStatusId"));
        if (mapValue.containsKey("inventoryItemId")) setInInventoryItemId((String) mapValue.get("inventoryItemId"));
        if (mapValue.containsKey("invoiceAdjustmentId")) setInInvoiceAdjustmentId((String) mapValue.get("invoiceAdjustmentId"));
        if (mapValue.containsKey("invoiceId")) setInInvoiceId((String) mapValue.get("invoiceId"));
        if (mapValue.containsKey("isPosted")) setInIsPosted((String) mapValue.get("isPosted"));
        if (mapValue.containsKey("lastModifiedByUserLogin")) setInLastModifiedByUserLogin((String) mapValue.get("lastModifiedByUserLogin"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("partyId")) setInPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("paymentApplicationId")) setInPaymentApplicationId((String) mapValue.get("paymentApplicationId"));
        if (mapValue.containsKey("paymentId")) setInPaymentId((String) mapValue.get("paymentId"));
        if (mapValue.containsKey("physicalInventoryId")) setInPhysicalInventoryId((String) mapValue.get("physicalInventoryId"));
        if (mapValue.containsKey("postedAmount")) setInPostedAmount((BigDecimal) mapValue.get("postedAmount"));
        if (mapValue.containsKey("postedDate")) setInPostedDate((Timestamp) mapValue.get("postedDate"));
        if (mapValue.containsKey("receiptId")) setInReceiptId((String) mapValue.get("receiptId"));
        if (mapValue.containsKey("roleTypeId")) setInRoleTypeId((String) mapValue.get("roleTypeId"));
        if (mapValue.containsKey("scheduledPostingDate")) setInScheduledPostingDate((Timestamp) mapValue.get("scheduledPostingDate"));
        if (mapValue.containsKey("shipmentId")) setInShipmentId((String) mapValue.get("shipmentId"));
        if (mapValue.containsKey("theirAcctgTransId")) setInTheirAcctgTransId((String) mapValue.get("theirAcctgTransId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("transactionDate")) setInTransactionDate((Timestamp) mapValue.get("transactionDate"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("voucherDate")) setInVoucherDate((Timestamp) mapValue.get("voucherDate"));
        if (mapValue.containsKey("voucherRef")) setInVoucherRef((String) mapValue.get("voucherRef"));
        if (mapValue.containsKey("workEffortId")) setInWorkEffortId((String) mapValue.get("workEffortId"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>UpdateAcctgTransService</code> from the input values of the given <code>UpdateAcctgTransService</code>.
     * @param input a <code>UpdateAcctgTransService</code>
     */
    public static UpdateAcctgTransService fromInput(UpdateAcctgTransService input) {
        UpdateAcctgTransService service = new UpdateAcctgTransService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>UpdateAcctgTransService</code> from the output values of the given <code>UpdateAcctgTransService</code>.
     * @param output a <code>UpdateAcctgTransService</code>
     */
    public static UpdateAcctgTransService fromOutput(UpdateAcctgTransService output) {
        UpdateAcctgTransService service = new UpdateAcctgTransService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>UpdateAcctgTransService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static UpdateAcctgTransService fromInput(Map<String, Object> mapValue) {
        UpdateAcctgTransService service = new UpdateAcctgTransService();
        service.putAllInput(mapValue);
        if (mapValue.containsKey("userLogin")) {
            GenericValue userGv = (GenericValue) mapValue.get("userLogin");
            if (userGv != null) {
                service.setUser(new User(userGv, userGv.getDelegator()));
            }
        }
        return service;
    }

    /**
     * Construct a <code>UpdateAcctgTransService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static UpdateAcctgTransService fromOutput(Map<String, Object> mapValue) {
        UpdateAcctgTransService service = new UpdateAcctgTransService();
        service.putAllOutput(mapValue);
        return service;
    }
}
