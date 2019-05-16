
package resources;

import junit.framework.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Assert;
import org.junit.Test;
import utility.FileHelper;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;




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


/**
 * Write your tests for the Company Resource here
 */
public class FakeCompanyResourceTest extends TestCase{

    protected String ticker1, ticker2;

    protected void setUp(){
        ticker1 = "ADBE";
        ticker2 = "ANDD";

    }



    public void testFakeCompany(){
        FakeCompanyResource fake = new FakeCompanyResource();
        String expected = ticker1;
        String tested = fake.getCompanyInfo(expected).getSymbol();
        System.out.println(tested);
        assertEquals(expected, tested);

    }

}
