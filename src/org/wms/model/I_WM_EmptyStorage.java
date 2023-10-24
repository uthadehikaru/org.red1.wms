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

/** Generated Interface for WM_EmptyStorage
 *  @author iDempiere (generated) 
 *  @version Release 4.1
 */
@SuppressWarnings("all")
public interface I_WM_EmptyStorage 
{

    /** TableName=WM_EmptyStorage */
    public static final String Table_Name = "WM_EmptyStorage";

    /** AD_Table_ID=1000014 */
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

    /** Column name AvailableCapacity */
    public static final String COLUMNNAME_AvailableCapacity = "AvailableCapacity";

	/** Set AvailableCapacity	  */
	public void setAvailableCapacity (BigDecimal AvailableCapacity);

	/** Get AvailableCapacity	  */
	public BigDecimal getAvailableCapacity();

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

    /** Column name IsBlocked */
    public static final String COLUMNNAME_IsBlocked = "IsBlocked";

	/** Set IsBlocked	  */
	public void setIsBlocked (boolean IsBlocked);

	/** Get IsBlocked	  */
	public boolean isBlocked();

    /** Column name IsFull */
    public static final String COLUMNNAME_IsFull = "IsFull";

	/** Set IsFull	  */
	public void setIsFull (boolean IsFull);

	/** Get IsFull	  */
	public boolean isFull();

    /** Column name M_Locator_ID */
    public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";

	/** Set Locator.
	  * Warehouse Locator
	  */
	public void setM_Locator_ID (int M_Locator_ID);

	/** Get Locator.
	  * Warehouse Locator
	  */
	public int getM_Locator_ID();

	public I_M_Locator getM_Locator() throws RuntimeException;

    /** Column name Percentage */
    public static final String COLUMNNAME_Percentage = "Percentage";

	/** Set Percentage.
	  * Percent of the entire amount
	  */
	public void setPercentage (BigDecimal Percentage);

	/** Get Percentage.
	  * Percent of the entire amount
	  */
	public BigDecimal getPercentage();

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

    /** Column name VacantCapacity */
    public static final String COLUMNNAME_VacantCapacity = "VacantCapacity";

	/** Set VacantCapacity	  */
	public void setVacantCapacity (BigDecimal VacantCapacity);

	/** Get VacantCapacity	  */
	public BigDecimal getVacantCapacity();

    /** Column name WM_EmptyStorage_ID */
    public static final String COLUMNNAME_WM_EmptyStorage_ID = "WM_EmptyStorage_ID";

	/** Set EmptyStorage	  */
	public void setWM_EmptyStorage_ID (int WM_EmptyStorage_ID);

	/** Get EmptyStorage	  */
	public int getWM_EmptyStorage_ID();

    /** Column name WM_EmptyStorage_UU */
    public static final String COLUMNNAME_WM_EmptyStorage_UU = "WM_EmptyStorage_UU";

	/** Set WM_EmptyStorage_UU	  */
	public void setWM_EmptyStorage_UU (String WM_EmptyStorage_UU);

	/** Get WM_EmptyStorage_UU	  */
	public String getWM_EmptyStorage_UU();
}
