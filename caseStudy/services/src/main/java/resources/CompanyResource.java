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

// TODO - add your @Path here
@Path("services")
public class CompanyResource {

    @GET
    @Path("{company}")

        List<Company> mycompany = FileHelper.readCompanies("companyInfo.json") ;


            "symbol":"AKAM",
            "name":"Akamai Technologies Inc.",
            "headquartersCity":"Cambridge",
            "headquartersStateOrCountry":"MA",
            "numberOfEmployees":6200,
            "sector":"Technology",
            "industry":"IT Services & Consulting"




    /*
    @GET
    @Path("{country}/wins")
    public int getWins(@PathParam("country") String country) throws IOException {

        List<Event> events = FileHelper.readAllEvents("events.json");

        int numWins = 0;
        for (Event event: events) {
            if (event.getWinningCountry().name().equalsIgnoreCase(country)) {
                ++numWins;
            }

        }
        return numWins;
    }
}
*/

    // TODO - Add a @GET resource to get company data
    // Your service should return data for a given stock ticker


}
