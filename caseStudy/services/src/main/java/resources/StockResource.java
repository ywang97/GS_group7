///**
// * Copyright 2019 Goldman Sachs.
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *     http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing,
// * software distributed under the License is distributed on an
// * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// * KIND, either express or implied.  See the License for the
// * specific language governing permissions and limitations
// * under the License.
// */
//
<<<<<<< HEAD
//package resources;
//
//
//import jdk.internal.util.xml.impl.Input;
//import pojo.Company;
//import utility.*;
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//import java.io.IOException;
//import java.util.Collections;
//import java.util.List;
//import utility.InputValidator;
//import pojo.Company;
//import pojo.Stock;
//
//import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
//
//
//@Path("services")
//public class StockResource {
//    @GET
//    @Path("{stock}/{start_date}/{end_date}")
//    @Produces(APPLICATION_JSON)
//
//    public List<String> getStockInfo(@PathParam("stock") String Ticker,
//    @PathParam("start_date") String StartDate, @PathParam("end_date") String EndDate){
//        List<Stock> myStocks = null;
//
//        Stock OutputStock = null;
//        List<String> OutputList = Collections.emptyList();
//        try {
//            myStocks = FileHelper.readStocks("historicalStockData.json");
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//        InputValidator Iv = new InputValidator();
//
//        Boolean CheckInput = Iv.validateStock(Ticker, StartDate, EndDate);
//        //String CheckedInput = Ticker;
//
//        if (!CheckInput) {
//            OutputStock.setName("INVALID INPUT");
//            OutputList.add("00-00-0000");
//            OutputList.add("0.00");
//
//        }
//        for (Stock st: myStocks){
//            if (st.getName().equals(Ticker)){
//                OutputStock = st;
//                break;
//            }
//        }
//        for ()
//
//    }
//
//}
=======
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
import pojo.Stock;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;


@Path("services")
public class StockResource {
    @GET
    @Path("{stock}/{start_date}/{end_date}")
    @Produces(APPLICATION_JSON)

    public List<String> getStockInfo(@PathParam("stock") String Ticker,
    @PathParam("start_date") String StartDate, @PathParam("end_date") String EndDate){
        List<Company> myCompanies = null;
        List<Stock> myStocks = null;

        Stock output = null;
        try {
            myStocks = FileHelper.readStocks("stockInfo.json");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        InputValidator Iv = new InputValidator();

        String CheckInput = Iv.validateStock(Stock);
        //String CheckedInput = Ticker;

        if (CheckInput.equals("ERROR99")) {
            Company Morgan = new Company();
            Morgan.setHeadquartersCity("New York");
            Morgan.setHeadquartersStateOrCountry("NY");
            Morgan.setIndustry("Investment Banking");
            Morgan.setName("Morgan Stanley");
            Morgan.setSymbol("MS");
            Morgan.setNumberOfEmployees(57633);

        }

        for (Company aCompany : myCompanies) {
            if (aCompany.getSymbol().equals(CheckedInput)) {
                output = aCompany;
            }
        }


    }



}
>>>>>>> 97c0f394ad075e94c2df1608a8dd3f48eb54dd40
