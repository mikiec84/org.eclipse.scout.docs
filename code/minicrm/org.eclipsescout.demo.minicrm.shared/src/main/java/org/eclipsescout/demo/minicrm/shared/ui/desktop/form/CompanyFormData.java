/*******************************************************************************
 * Copyright (c) 2015 BSI Business Systems Integration AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Distribution License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/org/documents/edl-v10.html
 * 
 * Contributors:
 *     BSI Business Systems Integration AG - initial API and implementation
 ******************************************************************************/
package org.eclipsescout.demo.minicrm.shared.ui.desktop.form;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.form.AbstractFormData;
import org.eclipse.scout.rt.shared.data.form.fields.AbstractValueFieldData;
import org.eclipse.scout.rt.shared.data.form.properties.AbstractPropertyData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Generated(value = "org.eclipsescout.demo.minicrm.client.ui.desktop.form.CompanyForm", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class CompanyFormData extends AbstractFormData {

  private static final long serialVersionUID = 1L;

  public CompanyFormData() {
  }

  /**
   * access method for property CompanyNr.
   */
  public Long getCompanyNr() {
    return getCompanyNrProperty().getValue();
  }

  /**
   * access method for property CompanyNr.
   */
  public void setCompanyNr(Long companyNr) {
    getCompanyNrProperty().setValue(companyNr);
  }

  public CompanyNrProperty getCompanyNrProperty() {
    return getPropertyByClass(CompanyNrProperty.class);
  }

  public CompanyRating getCompanyRating() {
    return getFieldByClass(CompanyRating.class);
  }

  public CompanyTypeGroup getCompanyTypeGroup() {
    return getFieldByClass(CompanyTypeGroup.class);
  }

  public Name getName() {
    return getFieldByClass(Name.class);
  }

  public ShortName getShortName() {
    return getFieldByClass(ShortName.class);
  }

  public static class CompanyNrProperty extends AbstractPropertyData<Long> {

    private static final long serialVersionUID = 1L;

    public CompanyNrProperty() {
    }
  }

  public static class CompanyRating extends AbstractValueFieldData<Long> {

    private static final long serialVersionUID = 1L;

    public CompanyRating() {
    }
  }

  public static class CompanyTypeGroup extends AbstractValueFieldData<Long> {

    private static final long serialVersionUID = 1L;

    public CompanyTypeGroup() {
    }
  }

  public static class Name extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public Name() {
    }
  }

  public static class ShortName extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public ShortName() {
    }
  }
}
