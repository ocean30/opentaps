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
package org.opentaps.search.domain;

import org.opentaps.domain.search.AccountSearchServiceInterface;
import org.opentaps.domain.search.ContactSearchServiceInterface;
import org.opentaps.domain.search.LeadSearchServiceInterface;
import org.opentaps.domain.search.SalesOpportunitySearchServiceInterface;
import org.opentaps.domain.search.SalesOrderSearchRepositoryInterface;
import org.opentaps.domain.search.SearchDomainInterface;
import org.opentaps.domain.search.SearchRepositoryInterface;
import org.opentaps.domain.search.SupplierSearchServiceInterface;
import org.opentaps.foundation.domain.Domain;
import org.opentaps.foundation.repository.RepositoryException;
import org.opentaps.foundation.service.ServiceException;
/**
 * This is an hibernate implementation of the Search domain.
 */
public class SearchDomain extends Domain implements SearchDomainInterface {

    /** {@inheritDoc} */
    public AccountSearchServiceInterface getAccountSearchService() throws ServiceException {
        return instantiateService(AccountSearchService.class);
    }

    /** {@inheritDoc} */
    public ContactSearchServiceInterface getContactSearchService() throws ServiceException {
        return instantiateService(ContactSearchService.class);
    }

    /** {@inheritDoc} */
    public LeadSearchServiceInterface getLeadSearchService() throws ServiceException {
        return instantiateService(LeadSearchService.class);
    }

    /** {@inheritDoc} */
    public SalesOpportunitySearchServiceInterface getSalesOpportunitySearchService() throws ServiceException {
        return instantiateService(SalesOpportunitySearchService.class);
    }

    /** {@inheritDoc} */
    public SupplierSearchServiceInterface getSupplierSearchService() throws ServiceException {
        return instantiateService(SupplierSearchService.class);
    }

    /** {@inheritDoc} */
    public SalesOrderSearchRepositoryInterface getSalesOrderSearchRepository() throws RepositoryException {
        return instantiateRepository(SalesOrderSearchRepository.class);
    }

    /** {@inheritDoc} */
    public SearchRepositoryInterface getSearchRepository() throws RepositoryException {
        return instantiateRepository(SearchRepository.class);
    }


}
