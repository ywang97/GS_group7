/**
 * Copyright 2019 Goldman Sachs.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package resources;

import jdk.internal.util.xml.impl.Input;
import pojo.Company;
import utility.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.List;
import utility.InputValidator;
import pojo.Company;

// TODO - add your @Path here
@Path("services")
public class CompanyResource {

    @GET
    @Path("{company}")
    @Produces(MediaType.APPLICATION_JSON)
    public Company getCompanyInfo(@PathParam("company") String Ticker) {


        List<Company> myCompanies = null;
        try {
            myCompanies = FileHelper.readCompanies("companyInfo.json");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("BREAK1");
        InputValidator Iv = new InputValidator();
        System.out.println("BREAK2");

        String CheckedInput = Iv.validateTicker(Ticker);
        //String CheckedInput = Ticker;
        System.out.println(CheckedInput+"FLAG");

        if (CheckedInput.equals("ERROR99")) {
            Company Morgan = new Company();
            Morgan.setHeadquartersCity("New York");
            Morgan.setHeadquartersStateOrCountry("NY");
            Morgan.setIndustry("Investment Banking");
            Morgan.setName("Morgan Stanley");
            Morgan.setSymbol("MS");
            Morgan.setNumberOfEmployees(57633);
            return Morgan;
        }

        for (Company aCompany : myCompanies) {
            if (aCompany.getSymbol().equals(CheckedInput)) {
                return aCompany;
            }
        }
        return null;
    }
}
