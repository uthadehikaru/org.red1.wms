/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.wms.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for WM_EmptyStorageLine
 *  @author iDempiere (generated) 
 *  @version Release 4.1
 */
@SuppressWarnings("all")
public interface I_WM_EmptyStorageLine 
{

    /** TableName=WM_EmptyStorageLine */
    public static final String Table_Name = "WM_EmptyStorageLine";

    /** AD_Table_ID=1000015 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name C_UOM_ID */
    public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";

	/** Set UOM.
	  * Unit of Measure
	  */
	public void setC_UOM_ID (int C_UOM_ID);

	/** Get UOM.
	  * Unit of Measure
	  */
	public int getC_UOM_ID();

	public org.compiere.model.I_C_UOM getC_UOM() throws RuntimeException;

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name DateEnd */
    public static final String COLUMNNAME_DateEnd = "DateEnd";

	/** Set DateEnd	  */
	public void setDateEnd (Timestamp DateEnd);

	/** Get DateEnd	  */
	public Timestamp getDateEnd();

    /** Column name DateStart */
    public static final String COLUMNNAME_DateStart = "DateStart";

	/** Set Date Start.
	  * Date Start for this Order
	  */
	public void setDateStart (Timestamp DateStart);

	/** Get Date Start.
	  * Date Start for this Order
	  */
	public Timestamp getDateStart();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name IsSOTrx */
    public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";

	/** Set Sales Transaction.
	  * This is a Sales Transaction
	  */
	public void setIsSOTrx (boolean IsSOTrx);

	/** Get Sales Transaction.
	  * This is a Sales Transaction
	  */
	public boolean isSOTrx();

    /** Column name M_Product_ID */
    public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

	/** Set Product.
	  * Product, Service, Item
	  */
	public void setM_Product_ID (int M_Product_ID);

	/** Get Product.
	  * Product, Service, Item
	  */
	public int getM_Product_ID();

	public org.compiere.model.I_M_Product getM_Product() throws RuntimeException;

    /** Column name QtyMovement */
    public static final String COLUMNNAME_QtyMovement = "QtyMovement";

	/** Set QtyMovement	  */
	public void setQtyMovement (BigDecimal QtyMovement);

	/** Get QtyMovement	  */
	public BigDecimal getQtyMovement();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name WM_EmptyStorageLine_ID */
    public static final String COLUMNNAME_WM_EmptyStorageLine_ID = "WM_EmptyStorageLine_ID";

	/** Set EmptyStorageLine	  */
	public void setWM_EmptyStorageLine_ID (int WM_EmptyStorageLine_ID);

	/** Get EmptyStorageLine	  */
	public int getWM_EmptyStorageLine_ID();

    /** Column name WM_EmptyStorageLine_UU */
    public static final String COLUMNNAME_WM_EmptyStorageLine_UU = "WM_EmptyStorageLine_UU";

	/** Set WM_EmptyStorageLine_UU	  */
	public void setWM_EmptyStorageLine_UU (String WM_EmptyStorageLine_UU);

	/** Get WM_EmptyStorageLine_UU	  */
	public String getWM_EmptyStorageLine_UU();

    /** Column name WM_EmptyStorage_ID */
    public static final String COLUMNNAME_WM_EmptyStorage_ID = "WM_EmptyStorage_ID";

	/** Set EmptyStorage	  */
	public void setWM_EmptyStorage_ID (int WM_EmptyStorage_ID);

	/** Get EmptyStorage	  */
	public int getWM_EmptyStorage_ID();

	public I_WM_EmptyStorage getWM_EmptyStorage() throws RuntimeException;

    /** Column name WM_HandlingUnit_ID */
    public static final String COLUMNNAME_WM_HandlingUnit_ID = "WM_HandlingUnit_ID";

	/** Set WM_HandlingUnit_ID	  */
	public void setWM_HandlingUnit_ID (int WM_HandlingUnit_ID);

	/** Get WM_HandlingUnit_ID	  */
	public int getWM_HandlingUnit_ID();

	public I_WM_HandlingUnit getWM_HandlingUnit() throws RuntimeException;

    /** Column name WM_InOutLine_ID */
    public static final String COLUMNNAME_WM_InOutLine_ID = "WM_InOutLine_ID";

	/** Set WM_InOutLine_ID	  */
	public void setWM_InOutLine_ID (int WM_InOutLine_ID);

	/** Get WM_InOutLine_ID	  */
	public int getWM_InOutLine_ID();

	public I_WM_InOutLine getWM_InOutLine() throws RuntimeException;
}
