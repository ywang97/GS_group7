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

import React from 'react';
import './style/App.css';

/**
 * TODO:
 * Import your components
 */
 import StockTicker from './components/StockTicker';
 import Date from './components/Date';
 import Charts from './components/Charts';
 import LineChart from './components/charts/LineChart';
 var dataone;
 dataone = [245.97, 237.4, 237.4, 220.55, 220.55, 205.43, 192, 235.07, 207.68, 207.68, 207.68, 226.71, 244.82,
    225.34, 225.34, 218.15, 236.29, 253.35, 242.83, 254.15, 225.34, 235.84, 224.29, 210.08, 210.08, 199.43, 199.43,
    213.77, 187.99, 203.95, 187.26, 199.5, 218.32, 218.32, 235.45, 235.45, 196.94, 222.98, 242.38, 216.7, 235.57, 235.57,
    222.94, 235.08, 215.31, 233.41, 213.72, 213.72, 230.46, 219.9, 237.9, 226.41, 243.61, 253.94, 264.28, 251.53, 264.61,
    248.97, 242.38, 231.23, 247.33, 235.08, 235.08, 238.49, 250.39, 232.79, 243.86, 262.78];

class App extends React.Component{
    constructor(props) {
        super(props);
        this.state = {
            /**
             * TODO
             * Add state objects for the user inputs and anything else you may need to render the highchart.
             */
            stockticker: '',
            startdate: '',
            enddate: ''
        };

     this.handleChange = this.handleChange.bind(this);
    }


    handleChange(stockticker, startdate, enddate) {
        this.setState({stockticker: stockticker,
                       startdate: startdate,
                       enddate: enddate});
    }

    render () {
      return (
      <div>
          <div className="page-display">
              <div className="input">
              {/**
               * TODO
               * Render the StockTicker and Date components. You can use the date component twice
               * for both the start and end dates.
               * Add onChange props to the StockTicker and both Date components.
               * These props methods should set state and help determine if the
               * highchart should be displayed by changing the state of that boolean.
               * Don't forget to bind these methods!
               */}

                <div className="date-range">

                </div>
              </div>


                 {/**
                   *  TODO
                   *  Create a div element that shows a highchart when the ticker, start date, end date
                   *  states ALL have values and nothing (null) otherwise. You will need to use a conditional here
                   *  to help control rendering and pass these states as props to the component. This conditional can
                   *  be maintained as a state object.
                   *  http://reactpatterns.com/#conditional-rendering
                   */}

                   <div className = "h1"> Cloud 7 Stock Price Viewer</div>

                        <StockTicker handleChange={this.stockticker} />
                        <Date handleChange={this.startdate, this.enddate} />
                      <section>
                      <div className = "chart">
                      <LineChart dataOne={dataone}/>
                      </div>
                      </section>
                   </div>
          </div>
      );
    }
}

export default App;
