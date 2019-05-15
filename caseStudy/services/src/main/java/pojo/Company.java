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

package pojo;

/**
 * This class will define a company and its attributes
 * Look at resources/data/companyInfo.json
 */
public class Company {

    // TODO - Think back to your modelling session
    // Define the attributes of a Company based on the
    // provided data in resources/data

    private String symbol;
    private String name;
    private String headquartersCity;
    private String headquartersStateOrCountry;
    private int numberOfEmployees;
    private String sector;
    private String industry;

    // TODO - add getter and setter methods for your attributes
    //get
    public String getSymbol(){return this.symbol; }
    public String getName() {return this.name; }
    public String getHeadquartersCity() {return this.headquartersCity; }
    public String getHeadquartersStateOrCountry() {return this.headquartersStateOrCountry; }
    public int getNumberOfEmployees() {return this.numberOfEmployees; }
    public String getSector() {return this.sector; }
    public String getIndustry() {return this.industry; }

    //set
    public void setSymbol(String symbol) {this.symbol = symbol;}
    public void setName(String name) {this.name = name;}
    public void setHeadquartersCity(String headquartersCity) {this.headquartersCity = headquartersCity;}
    public void setHeadquartersStateOrCountry(String headquartersStateOrCountry) {this.headquartersStateOrCountry = headquartersStateOrCountry;}
    public void setNumberOfEmployees(int num) {this.numberOfEmployees = num;}
    public void setSector(String sector) {this.sector = sector;}
    public void setIndustry(String industry) {this.industry = industry;}

    // comparator

    @Override
    public boolean equals(Object obj){
        if (obj == this) return true;
        if (!(obj instanceof Company)) return false;

        Company company = (Company) obj;

        if (!(company.getSymbol().equals(getSymbol()))) return false;
        if (!(company.getName().equals(getName()))) return false;
        if (!(company.getHeadquartersCity().equals(getHeadquartersCity()))) return false;
        if (!(company.getHeadquartersStateOrCountry().equals(getHeadquartersStateOrCountry()))) return false;
        if (!(company.getSector().equals(getSector()))) return false;
        if (!(company.getIndustry().equals(getIndustry()))) return false;
        return company.getNumberOfEmployees() == getNumberOfEmployees();

    }


}
