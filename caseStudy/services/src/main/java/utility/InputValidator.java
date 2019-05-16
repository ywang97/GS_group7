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
package utility;
import org.apache.commons.lang3.StringUtils;

/**
 * Utility class to validate inputs
 */
public class InputValidator {

    // TODO - write a method that will validate your JSON input files
    // ignore for now :)

    // TODO - write a method that will validate the inputs to the Company Resource
    public String validateTicker(String ticker){
        System.out.println(ticker);
        if (ticker.length()!=4){
            System.out.println("Failed");
            return "ERROR99";
        }
        if (ticker == null){
            System.out.println("Failed");
            return "ERROR99";
        }
        if (StringUtils.isAlphanumeric(ticker)){
            System.out.println("success");
            return ticker.toUpperCase();

        }
        System.out.println("failed");
        return "ERROR99";

    }

    // TODO - write a method that will validate the inputs to the Stock Resource


}
