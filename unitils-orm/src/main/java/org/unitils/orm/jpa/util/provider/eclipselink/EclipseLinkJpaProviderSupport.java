/*
 * Copyright 2006-2009,  Unitils.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.unitils.orm.jpa.util.provider.eclipselink;

import org.springframework.instrument.classloading.InstrumentationLoadTimeWeaver;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter;
import org.unitils.orm.jpa.util.JpaProviderSupport;

import javax.persistence.EntityManager;
import javax.persistence.spi.PersistenceProvider;

/**
 * Implementation of {@link JpaProviderSupport} for Oracle EclipseLink JPA
 *
 * @author Jan Callewaert
 */
public class EclipseLinkJpaProviderSupport implements JpaProviderSupport {


    public void assertMappingWithDatabaseConsistent(EntityManager entityManager, Object configurationObject) {
        throw new UnsupportedOperationException("The method assertMappingWithDatabaseConsistent is not implemented for eclipselink");
    }


    public Object getProviderSpecificConfigurationObject(
            PersistenceProvider persistenceProvider) {
        return null;
    }


    public JpaVendorAdapter getSpringJpaVendorAdaptor() {
        return new EclipseLinkJpaVendorAdapter();
    }


    public LoadTimeWeaver getLoadTimeWeaver() {
        return new InstrumentationLoadTimeWeaver();
    }

}