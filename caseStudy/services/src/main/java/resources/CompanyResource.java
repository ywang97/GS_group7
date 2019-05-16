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
    public Response getCompanyInfo(@PathParam("company") String Ticker) {

        Company Output = null;
        List<Company> myCompanies = null;
        try {
            myCompanies = FileHelper.readCompanies("companyInfo.json");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(myCompanies);
        System.out.println("BREAK1");
        InputValidator Iv = new InputValidator();
        System.out.println("BREAK2");

        String CheckedInput = Iv.validateTicker(Ticker);
        //String CheckedInput = Ticker;
        Company Morgan = new Company();
        Morgan.setHeadquartersCity("Moon");
        Morgan.setHeadquartersStateOrCountry("Milkyway Galaxy");
        Morgan.setIndustry("Cookies");
        Morgan.setName("Invalid Morgan Stanley");
        Morgan.setSymbol("IMS");
        Morgan.setNumberOfEmployees(-2);

        if (CheckedInput.equals("ERROR99")) {

            Output = Morgan;
        }
        System.out.println(CheckedInput+"FLAG1");

        for (Company aCompany : myCompanies) {
            if (aCompany.getSymbol().equals(CheckedInput)) {
                Output = aCompany;
                break;
            }
        }
        if (Output == null){
            Output = Morgan;
        }

        return Response.ok().entity(Output).header("Access-Control-Allow-Origin", "*").build();
    }
}
