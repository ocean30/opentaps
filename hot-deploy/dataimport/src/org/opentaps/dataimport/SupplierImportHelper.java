/*
 * Copyright (c) 2009 - 2010 Open Source Strategies, Inc.
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

package org.opentaps.dataimport;

import java.util.Map;

import javolution.util.FastMap;

import org.ofbiz.base.util.Debug;
import org.ofbiz.base.util.UtilMisc;
import org.ofbiz.entity.GenericDelegator;
import org.ofbiz.entity.GenericEntityException;
import org.ofbiz.entity.GenericValue;

/**
 * Helper methods for Supplier importation.
 */
public final class SupplierImportHelper {

    private SupplierImportHelper() { }

    private static final String MODULE = SupplierImportHelper.class.getName();

    /**
     * Checks if the supplier already exists in the database.
     *
     * @param supplierId a <code>String</code> value
     * @param delegator a <code>GenericDelegator</code> value
     * @return a <code>boolean</code> value
     */
    public static boolean checkSupplierExists(String supplierId, GenericDelegator delegator) {
        boolean supplierExists = false;
        try {
            GenericValue tmpSupplierGV = delegator.findByPrimaryKey("DataImportSupplier", UtilMisc.toMap("supplierId", supplierId));
            if (tmpSupplierGV != null) {
                supplierExists = true;
            }
        } catch (GenericEntityException e) {
            Debug.logError(e, "Problem in reading data of supplier", MODULE);
        }
        return supplierExists;
    }

}
